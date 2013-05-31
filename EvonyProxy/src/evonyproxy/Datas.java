/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.common.custom.LoginRequest;
import evonyproxy.connectors.EvonyServer;
import evonyproxy.evony.common.beans.CastleBean;
import evonyproxy.evony.common.server.events.LoginResponse;
import evonyproxy.connectors.event.PolicyListener;
import evonyproxy.connectors.event.PolicyObserver;
import evonyproxy.connectors.event.PolicyRequestEvent;
import evonyproxy.connectors.event.PolicyResponseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @version .01
 * @author Michael Archibald
 * I appear to have used this class to encapsulate the methods that listen for
 * the Flash policy that is transmitted whenever you start a Flash program, as
 * well as the Evony login response. I think I did this to allow for the
 * program to operate under several Evony user contexts at once. The context
 * being a particular Evony account on a particular server.
 */
public class Datas implements PolicyListener, PolicyObserver {
    protected IO io;
    boolean debug;
    protected String policyRequest, policyResponse;
    protected boolean hasPolicyResponse = false, hasPolicyRequest = false;
    protected List<PolicyListener> policyRequestListeners;
    protected List<PolicyListener> policyResponseListeners;
    protected LoginRequest loginRequest;
    protected LoginResponse loginResponse;
    protected boolean hasLoginResponse = false, hasLoginRequest = false;
    protected String versionRequest;
    protected Map<Integer, String> castleNames = new HashMap<Integer, String>();
    /* For Debugging */
//    protected LoginResponse loginResponseTest;
//    protected ASObject loginResponseASO;
//    protected byte[] loginResponseSerialized;
//    protected Amf3Input amfi = null;
//    protected ByteArrayInputStream bais = null;
    //TODO: I think I should move bldTypes and tchTypes from AMF to here. Just as i did with castleNames

    public Datas(IO io) {
        this.io = io;
        initialize();
    }

    public Datas() {
    }

    private void initialize() {
        debug = false;
        policyResponse = "";
        policyRequest = "";
        policyRequestListeners = new CopyOnWriteArrayList<PolicyListener>();
        policyResponseListeners = new CopyOnWriteArrayList<PolicyListener>();
    }

    public void onPolicyRequest(PolicyRequestEvent event) {
        if(!hasPolicyRequest) {
            policyRequest = new String(event.getPolicyRequest());
            hasPolicyRequest = true;
            addPolicyResponseListener((PolicyListener) event.getSource());
            firePolicyRequestEvent(event.getPolicyRequest());
        }
        else {
            byte[] tmpRequest = event.getPolicyRequest();
            boolean areEqual = true;
            if(tmpRequest.length == policyRequest.getBytes().length) {

                for(int i = 0; i < policyRequest.getBytes().length; i++) {
                    if(tmpRequest[i] != (policyRequest.getBytes()[i])) {
                        areEqual = false;
                        break;
                    }
                }
            }
            else {
                areEqual = false;
            }
            if(areEqual) {
                addPolicyResponseListener((PolicyListener) event.getSource());
            }
            if(!hasPolicyResponse && hasPolicyRequest) {
                firePolicyRequestEvent(policyRequest.getBytes());
            }
        }
    }

    public void onPolicyResponse(PolicyResponseEvent event) {
        policyResponse = new String(event.getPolicyResponse());
        hasPolicyResponse = true;
        ((EvonyServer) event.getSource()).removePolicyListener(this);
        firePolicyResponseEvent(policyResponse.getBytes());
    }

    public void onLoginResponse(LoginResponse lr) {
        try {
            if(lr.ok != 1) {
                throw new Exception(lr.errorMsg);
            }
            setLoginResponse(lr);

            /* FOR DEBUGGING */
//            loginResponseSerialized = io.amf.serialize(EConst.Response.SERVER_LOGIN_RESPONSE, loginResponse.toASObject());
//            bais = new ByteArrayInputStream(loginResponseSerialized);
//            amfi = new Amf3Input(io.amf.getContext());
//            amfi.setInputStream(bais);
//            amfi.readInt();
//            loginResponseASO = (ASObject) amfi.readObject();
//            System.out.println(loginResponseASO.get("data").toString());
//            loginResponseTest = new LoginResponse(loginResponseASO);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public void onLoginRequest(LoginRequest lr) {
        setLoginRequest(lr);
    }

    public void onVersionRequest(String version) {
        setVersionRequest(version);
    }

    public synchronized void addPolicyRequestListener(PolicyListener listener) {
        policyRequestListeners.add(listener);
    }

    public synchronized void removePolicyRequestListener(PolicyListener listener) {
        policyRequestListeners.remove(listener);
    }

    protected synchronized void firePolicyRequestEvent(byte[] buffer) {
        if(debug) {
            System.out.println("Server firing PolicyResponseEvent.");
        }
        PolicyRequestEvent pre = new PolicyRequestEvent(this, buffer);
        for(PolicyListener listener : policyRequestListeners) {
            listener.onPolicyRequest(pre);
        }
    }

    public synchronized void addPolicyResponseListener(PolicyListener listener) {
        policyResponseListeners.add(listener);
    }

    public synchronized void removePolicyResponseListener(PolicyListener listener) {
        policyResponseListeners.remove(listener);
    }

    protected synchronized void firePolicyResponseEvent(byte[] buffer) {
        if(debug) {
            System.out.println("Server firing PolicyResponseEvent.");
        }
        PolicyResponseEvent pre = new PolicyResponseEvent(this, buffer);
        for(PolicyListener listener : policyResponseListeners) {
            listener.onPolicyResponse(pre);
        }
        policyResponseListeners = new CopyOnWriteArrayList<PolicyListener>();
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getPolicyRequest() {
        return policyRequest;
    }

    public byte[] getPolicyRequestBytes() {
        return policyRequest.getBytes();
    }

    public void setPolicyRequest(String policyRequest) {
        this.policyRequest = policyRequest;
        setHasPolicyRequest(true);
    }

    public void setPolicyRequest(byte[] policyRequest) {
        this.policyRequest = new String(policyRequest);
        setHasPolicyRequest(true);
    }

    public String getPolicyResponse() {
        return policyResponse;
    }

    public byte[] getPolicyResponseBytes() {
        return policyResponse.getBytes();
    }

    public void setPolicyResponse(byte[] policyResponse) {
        this.policyResponse = new String(policyResponse);
        hasPolicyResponse = true;
    }

    public void setPolicyResponse(String policyResponse) {
        this.policyResponse = policyResponse;
        hasPolicyResponse = true;
    }

    public boolean hasPolicyResponse() {
        return hasPolicyResponse;
    }

    public void setHasPolicyResponse(boolean policyFileRecieved) {
        this.hasPolicyResponse = policyFileRecieved;
    }

    public boolean hasPolicyRequest() {
        return hasPolicyRequest;
    }

    public void setHasPolicyRequest(boolean recievedPolicyRequest) {
        this.hasPolicyRequest = recievedPolicyRequest;
    }

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

    public void setLoginRequest(LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
        hasLoginRequest = true;
    }

    public LoginResponse getLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(LoginResponse lr) {
        this.loginResponse = lr;
        hasLoginResponse = true;
        for(Object obj : loginResponse.getPlayer().getCastles()) {
            CastleBean castle = (CastleBean) obj;
            castleNames.put(castle.getId(), castle.getName());
        }
    }

    public boolean hasLoginRequest() {
        return hasLoginRequest;
    }

    public boolean hasLoginResponse() {
        return hasLoginResponse;
    }

    public String getVersionRequest() {
        return versionRequest;
    }

    public void setVersionRequest(String versionRequest) {
        this.versionRequest = versionRequest;
    }

    public Map<Integer, String> getCastleNames() {
        return castleNames;
    }

    public IO getIo() {
        return io;
    }

    public void setIo(IO io) {
        this.io = io;
    }
}
