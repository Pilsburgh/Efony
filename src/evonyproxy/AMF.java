/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.common.Serializer;
import evonyproxy.common.EvpUtil;
import evonyproxy.common.custom.LoginRequest;
import evonyproxy.connectors.EvonyPolicy;
import evonyproxy.connectors.AbstractEvony;
import evonyproxy.connectors.EvonyServer;
import evonyproxy.connectors.EvonyClient;
import evonyproxy.evony.command.CommandFactory;
import evonyproxy.evony.command.QuestCommands;
import evonyproxy.evony.command.CastleCommands;
import evonyproxy.evony.command.TechCommand;
import evonyproxy.evony.common.server.events.BuildComplate;
import evonyproxy.evony.common.server.events.LoginResponse;
import evonyproxy.console.Console;
import evonyproxy.console.event.ConsoleAdapter;
import evonyproxy.console.event.ConsoleRequestEvent;
import evonyproxy.console.event.ConsoleListener;
import evonyproxy.console.event.ConsoleResponseEvent;
import evonyproxy.evony.common.constants.EConst;
import evonyproxy.connectors.event.AmfDataEvent;
import evonyproxy.connectors.event.AmfListener;
import evonyproxy.console.event.ConsoleObserver;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.UnknownTypeException;
import flex.messaging.io.amf.ASObject;
import flex.messaging.io.amf.Amf3Input;
import flex.messaging.io.amf.Amf3Output;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sun.jkernel.ByteArrayToFromHexDigits;

/**
 * @version .01
 * @author Michael Archibald (archibald@choomogo.com)
 * Serializes and deserializes Java Beans to Action Message Format.
 * AMF is the standard serialisation format for Flash and ActionScript.
 * 
 * After looking back at the code I wrote a long time ago, this needs to be
 * refactored into smaller classes.
 */
public class AMF implements AmfListener, Serializer, ConsoleObserver {
    public static final String VERSION_REQUEST = "gameClient.version";
    public static final String LOGIN_REQUEST = "login";
    public static final String COMMON_PRIVATE_CHAT = "common.privateChat";
    public static final String LOGIN_RESPONSE = "";
    protected boolean verbose, debug;
    protected IO io;
    protected SerializationContext context;
    protected Amf3Input amfi;
    protected Amf3Output amfo;
    protected AmfDataEvent event;
    protected ASObject asObject = null;
    protected String versionRequest = null;
    protected Console console;
    protected String consoleName = Console.DEFAULT_NAME;
    protected List<ConsoleListener> listeners = new ArrayList();
    protected Dispatch dispatch;
    protected int asoLength;
    protected CommandFactory command = CommandFactory.getInstance();
    protected Map<Integer, String> castleNames = new HashMap<Integer, String>();
    protected Map<Integer, String> bldTypes = new HashMap<Integer, String>();
    protected Map<Integer, String> techTypes = new HashMap<Integer, String>();

    public AMF(IO io, boolean verbose) {
        this.io = io;
        this.verbose = verbose;
        commonConstruction();
    }

    public AMF(IO io) {
        this.io = io;
        verbose = true;
        commonConstruction();
    }

    protected void commonConstruction() {
        context = new SerializationContext();
        context.createASObjectForMissingType = true;
        context.instantiateTypes = true;
        context.enableSmallMessages = true;
        context.supportRemoteClass = false;
        context.legacyCollection = false;
        context.legacyMap = false;
        context.legacyThrowable = false;
        context.legacyBigNumbers = false;
        context.restoreReferences = false;
        context.logPropertyErrors = false;
        context.ignorePropertyErrors = true;

        amfi = new Amf3Input(context);
        amfo = new Amf3Output(context);

        console = new Console();
        makeConsoleObserveThis();
        observeConsole();

        event = null;

        dispatch = new Dispatch(this);
        debug = false; //hardcoded

        command.setSender(io);
        command.setSerializer(this);

        populateBldType();
        populateTechType();
    }

    private void makeConsoleObserveThis() {
        this.addConsoleListener(
                new ConsoleAdapter() {
                    @Override
                    public void onConsoleRequestEvent(ConsoleRequestEvent event) {
                        console.read(event.msg());
                    }
                });
    }

    private void populateBldType() {
        bldTypes.put(EConst.Building.TYPE_ACADEMY, "Academy");
        bldTypes.put(EConst.Building.TYPE_BARRACK, "Barrack");
        bldTypes.put(EConst.Building.TYPE_BLACKSMITH, "Blacksmith");
        bldTypes.put(EConst.Building.TYPE_EMBASSY, "Embassy");
        bldTypes.put(EConst.Building.TYPE_FARM_LAND, "Farm");
        bldTypes.put(EConst.Building.TYPE_HEROS_MANSION, "Feasting Hall");
        bldTypes.put(EConst.Building.TYPE_HOUSE, "Cottage");
        bldTypes.put(EConst.Building.TYPE_IRON_MINE, "Iron Mine");
        bldTypes.put(EConst.Building.TYPE_LUMBER_MILL, "Lumber Mill");
        bldTypes.put(EConst.Building.TYPE_MARKET, "Market");
        bldTypes.put(EConst.Building.TYPE_SENTRY_BUILDING, "Tower");
        bldTypes.put(EConst.Building.TYPE_STABLE, "Stable");
        bldTypes.put(EConst.Building.TYPE_STONE_MINE, "Quarry");
        bldTypes.put(EConst.Building.TYPE_TAVERN, "Tavern");
        bldTypes.put(EConst.Building.TYPE_TOWN_HALL, "Town Hall");
        bldTypes.put(EConst.Building.TYPE_TRAINNING_FEILD, "Rally Spot");
        bldTypes.put(EConst.Building.TYPE_TRANSPORT_STATION, "Relief Station");
        bldTypes.put(EConst.Building.TYPE_WALL, "Wall");
        bldTypes.put(EConst.Building.TYPE_WAREHOUSE, "Warehouse");
        bldTypes.put(EConst.Building.TYPE_WORKSHOP, "Workshop");
    }

    private void populateTechType() {
        techTypes.put(EConst.Tech.BUILD_TECH, "Build Tech");
        techTypes.put(EConst.Tech.COMBAT_SKILL, "Combat Skill");
        techTypes.put(EConst.Tech.CROP_TECH, "Crop Tech");
        techTypes.put(EConst.Tech.DEFEND_SKILL, "Defend Skill");
        techTypes.put(EConst.Tech.DRIVE_SKILL, "Drive Skill");
        techTypes.put(EConst.Tech.EXCAVATION_TECH, "Excavation Tech");
        techTypes.put(EConst.Tech.FORTIFICATION_TECH, "Fortification Tech");
        techTypes.put(EConst.Tech.HARRY_SKILL, "Harry Skill");
        techTypes.put(EConst.Tech.HEW_TECH, "Hew Tech");
        techTypes.put(EConst.Tech.LOAD_TECH, "Load Tech");
        techTypes.put(EConst.Tech.MAKE_TECH, "Make Tech");
        techTypes.put(EConst.Tech.MARCH_SKILL, "March Skill");
        techTypes.put(EConst.Tech.MAX_LEVEL, "Max Level");
        techTypes.put(EConst.Tech.REPAIR_TECH, "Repair Tech");
        techTypes.put(EConst.Tech.SCOUT_SKILL, "Scout Skill");
        techTypes.put(EConst.Tech.SMELT_TECH, "Smelt Tech");
        techTypes.put(EConst.Tech.STORE_TECH, "Store Tech");
        techTypes.put(EConst.Tech.SUPPLY_SKILL, "Supply Skill");
        techTypes.put(EConst.Tech.THROW_SKILL, "Throw Skill");
        techTypes.put(EConst.Tech.TRAIN_SKILL, "Train Skill");
    }

    protected void observeConsole() {
        console.addConsoleListener(new ConsoleAdapter() {
            @Override
            public void onConsoleResponseEvent(ConsoleResponseEvent event) {
                ASObject SystemInfoMessage = new ASObject();
                SystemInfoMessage.put("alliance", false);
                SystemInfoMessage.put("tV", false);
                SystemInfoMessage.put("msg", event.msg());
                SystemInfoMessage.put("noSenderSystemInfo", true);

                io.passDataToClients(serialize(EConst.Response.SERVER_SYSTEM_INFO_MSG, SystemInfoMessage));
            }
        });
    }

    public void onAmfDataEvent(AmfDataEvent event) {
        this.event = event;
        parse(event.data());
    }

    private void onMalformedPacketException() {
            if(event.getSource().getClass().getName().equals("EvonyServer")) {
                io.passDataToClients(event.data());
            }
            else {
//                if(event.getSource().getClass().getName().equals("EvonyClient")) {
                    io.passDataToServer(event.data());
//                }
            }
    }

    protected void parse(byte[] data) {
        try {
            asObject = null;
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            amfi.setInputStream(bais);
            while(amfi.available() > 0) {
                asoLength = amfi.readInt();
                if(asoLength > amfi.available()) {
//                    System.out.println("asoLength: " + asoLength + "  amfi.availible: " + amfi.available());
                    amfi.reset();
                    throw new MalformedPacketException((AbstractEvony) event.getSource(), event.data());
                }
                else {
                    asObject = (ASObject) amfi.readObject();
//                    ((ASObject)asObject.get("data")).setType(asObject.get("cmd").toString());
                    if(verbose) {
                        if(asObject != null) {
                            if(!asObject.get("cmd").equals(QuestCommands.GET_QUEST_TYPE)
                                    && !asObject.get("cmd").equals(QuestCommands.GET_QUEST_LIST)
                                    && !asObject.get("cmd").equals(CastleCommands.CHECK_OUT_UPGRADE)
                                    && !asObject.get("cmd").equals(TechCommand.GET_RESEARCH_LIST)
                                    && !asObject.get("cmd").equals(EConst.Response.SERVER_RESOURCE_UPDATE)
                                    && !asObject.get("cmd").equals(EConst.Response.SERVER_ALLIANCE_CHAT_MSG)
                                    && !asObject.get("cmd").equals(EConst.Response.SERVER_PRIVATE_CHAT_MESSAGE)
                                    && !asObject.get("cmd").equals(EConst.Response.SERVER_WORLD_CHAT_MSG)
                                    && !asObject.get("cmd").equals(EConst.Response.SERVER_SYSTEM_INFO_MSG)
                                    && !asObject.get("cmd").equals(EConst.Response.SERVER_CHANNEL_CHAT_MSG)
                                    && !asObject.get("cmd").equals("common.getPackageNumber")) {
                                String output = "From " + ((AbstractEvony) event.getSource()).currentThread().getName() + "\n";
//                                output += "AMFlength: " + asoLength + "\n";
                                for(Object key : asObject.keySet()) {
                                    output += (String) key + ":" + asObject.get(key) + "\n";
                                }
//                                if(debug) {
//                                    output += ByteArrayToFromHexDigits.bytesToHexString(data) + "\n";
//                                    output += EvpUtil.byteArrayToChars(data);
//                                }
                                System.out.println(output);
                            }
                        }
                    }

                    analyze(asObject);
                }
            }
            amfi.reset();
        } catch(MalformedPacketException mpe) {
//            String tmpStr = mpe.getMessage() + "\n"
//                    + ByteArrayToFromHexDigits.bytesToHexString(mpe.getData())
//                    + EvpUtil.byteArrayToChars(mpe.getData());
//            System.out.println(tmpStr);
            System.out.println(mpe.getMessage());
            onMalformedPacketException();
        } catch(IOException e) {
        } catch(ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
            cnfe.printStackTrace();
        } catch(UnknownTypeException e) {
            amfi.reset();
            System.out.println(event.getSource().getClass().getName());
            System.out.println(e.getMessage() + "\n" + e.getStackTrace().toString() + "\n");
            /* use onMalformedPacketException because its also needed in this case */
            onMalformedPacketException();
        } catch(ClassCastException e) {
            System.out.println(e.getMessage()
                    + "\nThis was probably caused by a bean using the wrong type for"
                    + "AcionScript's Number Class." + "\nNumber can be equivelent to"
                    + "Float, Double, Long." + "\nExiting program.");
            e.printStackTrace();
            System.exit(1);
        }
    }

    protected void analyze(ASObject aso) {
        String sourceName = event.getSource().getClass().getName();
        /* Analyze from Client */
        if(sourceName.equals(EvonyClient.class.getName())) {
//            dispatch.setDefaultMeth(Dispatch.getMethod("AMF", "onUnknownRequest"));
            dispatch.setDefaultMeth(Dispatch.getMethod(this.getClass().getName(), "onUnknownRequest"));
            try {
                if(aso.get("cmd") == null) {
                    throw new MalformedPacketException((AbstractEvony) event.getSource(), event.data());
                }

                if(((String) aso.get("cmd")).equals(EConst.Response.COMMON_PRIVATE_CHAT)) {
                    onPrivateChat((ASObject) aso.get("data"));
                }
                else {
                    if(((String) aso.get("cmd")).equals(VERSION_REQUEST)) {
                        onVersionRequest((String) aso.get("data"));
                    }
                    else {
                        if(((String) aso.get("cmd")).equals(EConst.Common.LOGIN_CMD)) {
                            onLoginRequest((ASObject) aso.get("data"));
                        }
                        else {
                            onUnknownRequest(aso);
                        }
                    }
                }
            } catch(MalformedPacketException mpe) {
                System.out.println(mpe.getMessage());
                onMalformedPacketException();
//                mpe.printStackTrace();
            } catch(NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
        }
        else {
            /* Analyze from Server */
            if(sourceName.equals(EvonyServer.class.getName())) {
                dispatch.setDefaultMeth(Dispatch.getMethod(this.getClass().getName(), "onUnknownResponse"));
                try {
                    if(aso.get("cmd") == null) {
                        throw new MalformedPacketException((AbstractEvony) event.getSource(), event.data());
                    }

                    if(((String) aso.get("cmd")).equals(EConst.Response.SERVER_LOGIN_RESPONSE)) {
                        onLoginResponse((ASObject) aso.get("data"));
                    }
                    else {
                        if(((String) aso.get("cmd")).equals(EConst.Response.SERVER_BUILD_COMPLATE)) {
                            onBuildComplate((ASObject) aso.get("data"));
                        }
                        else {
//                        if(((String) aso.get("cmd")).equals(EConst.Response.TECH_GET_RESEARCH_LIST)) {
//                            onGetResearchList((ASObject) aso.get("data"));
//                        }
//                        else {
                            onUnknownResponse(aso);
//                        }
                        }
                    }
                } catch(MalformedPacketException mpe) {
                    System.out.println(mpe.getMessage());
                    onMalformedPacketException();
//                    mpe.printStackTrace();
                }
            }
            else {
                if(sourceName.equals(EvonyPolicy.class.getName())) {
                    /* TODO: Handle EvonyPolicy instance */
                }
                else {
                    throw new Error("Invalid event source");
                }
            }
        }
    }

    protected void onLoginResponse(ASObject aso) {
        io.getDat().onLoginResponse(new LoginResponse(aso));
        io.passDataToClients(serialize(EConst.Response.SERVER_LOGIN_RESPONSE, aso));

    }

    protected void onBuildComplate(ASObject aso) {
        BuildComplate complate = new BuildComplate(aso);
        io.passDataToClients(serialize(EConst.Response.SERVER_BUILD_COMPLATE, aso));

        if(complate.buildingBean.getEndTime() == 0.0) {
            String bldMsg = "Finished building <b>lvl";
            bldMsg += complate.getBuildingBean().getLevel() + " ";
            bldMsg += getBuildingType(complate.getBuildingBean().getTypeId())
                    + "</b> at <b>";
            bldMsg += io.getDat().getCastleNames().get(complate.getCastleId()) + "</b>.";

            console.bldCompleteMsg(bldMsg);
        }
    }

    private String getBuildingType(int typeId) {
        String ret = bldTypes.get(typeId);
        if(ret != null) {
            return ret;
        }
        else {
            return "BldNameError";
        }
    }

//    protected void onGetResearchList(ASObject aso) {
//        AvailableResearchListResponse rsrchLst = new AvailableResearchListResponse(aso);
//        if(rsrchLst.getOk() == 1) {
//            io.passDataToClients(serialize(EConst.Response.TECH_GET_RESEARCH_LIST, aso));
//        }
//        else {
//            System.out.println("!!! Arbitrary AvailableResearchListResponse !!!"
//                    + "\nSupressing arbitrary data.");
//        }
//    }
    protected void onPrivateChat(ASObject aso) {
        String targetName = (String) aso.get("targetName");
        String msg = (String) aso.get("msg");
        if(targetName.toLowerCase().equals(console.getName())) {
            fireConsoleClientEvent(msg);
            if(!console.isSupressConsoleWhisper()) {
                io.passDataToServer(serialize(EConst.Response.COMMON_PRIVATE_CHAT, aso));
            }
        }
        else {
            io.passDataToServer(serialize(EConst.Response.COMMON_PRIVATE_CHAT, aso));
        }
    }

    protected void onVersionRequest(String version) {
        if(((EvonyClient) event.getSource()).isPrimaryConnection()) {
            io.getDat().setVersionRequest(version);
            io.passDataToServer(serialize(VERSION_REQUEST, version));
        }
        else {
            if(!version.equals(io.getDat().getVersionRequest())) {
                /* debuger line */
//                System.out.println("Arbatrary client's version compared to primary's version and !true");
                ((EvonyClient) event.getSource()).setTerminated(true);
            }
        }
    }

    protected void onLoginRequest(ASObject aso) {
        if(((EvonyClient) event.getSource()).isPrimaryConnection()) {
            io.getDat().onLoginRequest(new LoginRequest(aso));
            io.passDataToServer(serialize(EConst.Common.LOGIN_CMD, aso));
        }
        else {
            if((new LoginRequest(aso)).equals(io.getDat().getLoginRequest())) {
                /* debugger line */
                System.out.println("Arbatrary client's LoginRequest equals Primary's LoginRequest");
                ((EvonyClient) event.getSource()).sendData(serialize(EConst.Response.SERVER_LOGIN_RESPONSE, io.getDat().getLoginResponse().toASObject()));
            }
            else {
                ((EvonyClient) event.getSource()).setTerminated(true);
                System.out.println("Arbatrary client attempted to connect but supplied erroneus credentials.");
            }
        }
    }

    public void onUnknownRequest(ASObject aso) {
        io.passDataToServer(serialize((String) aso.get("cmd"), aso.get("data")));
    }

    public void onUnknownResponse(ASObject aso) {
        try {
            io.passDataToClients(serialize((String) aso.get("cmd"), aso.get("data")));
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @deprecated
     * Primitive and possibly not working method to clone ASObjects.
     * @param aso
     * @return clone
     */
    public ASObject cloneASObject(ASObject aso) {
        ASObject nAso = new ASObject();
        Object value;
        for(Object key : aso.keySet()) {
            value = aso.get(key);
            if(value instanceof ASObject) {
                value = cloneASObject((ASObject) value);
            }
            nAso.put(key, value);
        }
        return nAso;
    }

    public byte[] serialize(String cmd, Object data) {
        ASObject aso = new ASObject();
        aso.put("cmd", cmd);
        aso.put("data",/*(ASObject)*/ data);
        byte[] serialized;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
            amfo.setOutputStream(baos);
            amfo.writeObject(aso);
//            amfo.writeObjectProperty("cmd", cmd);
//            amfo.writeObjectProperty("data", data);
//            amfo.writeObjectEnd();
            amfo.flush();
            amfo.reset();

            serialized = baos.toByteArray();
            baos = new ByteArrayOutputStream(serialized.length + 4);

            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeInt(serialized.length);
            dos.write(serialized);
            dos.flush();
            dos.close();

            serialized = baos.toByteArray();

            if(debug) {
                String str = "AMF.serialize length: " + (serialized.length - 4) + "\n";
                str += ByteArrayToFromHexDigits.bytesToHexString(serialized);
                str += "\n" + EvpUtil.byteArrayToChars(serialized);
                System.out.println(str);
            }

            return serialized;
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public synchronized void addConsoleListener(ConsoleListener cl) {
        listeners.add(cl);
    }

    public synchronized void removeConsoleListener(ConsoleListener cl) {
        listeners.remove(cl);
    }

    protected synchronized void fireConsoleClientEvent(String msg) {
        ConsoleRequestEvent ccEvent = new ConsoleRequestEvent(this, msg);
        for(ConsoleListener cl : listeners) {
            cl.onConsoleRequestEvent(ccEvent);
        }
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public SerializationContext getContext() {
        return context;
    }

    public void setContext(SerializationContext context) {
        this.context = context;
    }
}


