/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.console;

import evonyproxy.AMF;
import evonyproxy.IO;
import evonyproxy.console.event.ConsoleAdapter;
import evonyproxy.console.event.ConsoleRequestEvent;
import evonyproxy.console.event.ConsoleListener;
import evonyproxy.console.event.ConsoleResponseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @version .01
 * @author Michael Archibald
 */
public class Console implements ConsoleConstants {
    protected boolean debug = false, verbose = false;
    protected String name = DEFAULT_NAME;
    protected List<ConsoleListener> listeners = new ArrayList();
    protected boolean supressConsoleWhisper = true;
    protected boolean supressBuildComplete = false;
    protected boolean supressInfo = false;
    protected boolean supressAllClientMsg = false;
    protected String[] splitSpace, splEq;

    public Console() {
    }

    public Console(AMF amf) {
        observeAmf(amf);
    }

    public Console(boolean verbose) {
        this.verbose = verbose;
    }

    public Console(AMF amf, boolean verbose) {
        this.verbose = verbose;
        observeAmf(amf);
    }

    public void observeAmf(AMF amf) {
        amf.addConsoleListener(
                new ConsoleAdapter() {
                    @Override
                    public void onConsoleRequestEvent(ConsoleRequestEvent event) {
                        read(event.msg());
                    }
                });
    }

    protected void read(String msg) {
        splitSpace = msg.split(" ");
        for(int i = 0; i < splitSpace.length; i++) {
            splEq = splitSpace[i].split("=");
            if(splEq[0].equals(SUPRESS_WHISPER)) {
                handleSupressWhisperCmd();
            }
            else {
                if(splEq[0].equals(ECHO)) {
                    handleEchoCmd(i);
                    break;
                }
            }
        }
    }

    private void handleEchoCmd(int i) {
        String str = "";
        for(i += 1; i < splitSpace.length; i++) {
            str += splitSpace[i] + " ";
        }
        str.trim();
        fireConsoleResponseEvent(formatResponse(str));
    }

    private void handleSupressWhisperCmd() {
        if(splEq.length <= 1) {
            fireConsoleResponseEvent(formatResponse("Error: Syntax: " + SUPRESS_WHISPER + "=(true/false)"));
        }
        else {
            if(!splEq[1].toLowerCase().equals("true") && !splEq[1].toLowerCase().equals("false")) {
                fireConsoleResponseEvent(formatResponse("Error: Syntax: " + SUPRESS_WHISPER + "=(true/false)"));
            }
            else {
                if(splEq[1].toLowerCase().equals("true")) {
                    supressConsoleWhisper = true;
                }
                else {
                    supressConsoleWhisper = false;
                }
            }
        }
    }

    protected String formatResponse(String msg) {
        return "[" + "<font color='#FF0000'><b><u>" + name + "]: " + "</u></b></font>"
                + "<font color='#00A2FF'>" + msg + "</font>";
    }

    public void bldCompleteMsg(String msg) {
        if(!supressBuildComplete) {
            fireConsoleResponseEvent(formatResponse(msg));
        }
    }

    public synchronized void addConsoleListener(ConsoleListener cl) {
        listeners.add(cl);
    }

    public synchronized void removeConsoleListener(ConsoleListener cl) {
        listeners.remove(cl);
    }

    protected synchronized void fireConsoleResponseEvent(String msg) {
        ConsoleResponseEvent event = new ConsoleResponseEvent(this, msg);
        for(ConsoleListener cl : listeners) {
            cl.onConsoleResponseEvent(event);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSupressAllClientMsg() {
        return supressAllClientMsg;
    }

    public void setSupressAllClientMsg(boolean supressAllClientMsg) {
        this.supressAllClientMsg = supressAllClientMsg;
    }

    public boolean isSupressBuildComplete() {
        return supressBuildComplete;
    }

    public void setSupressBuildComplete(boolean supressBuildComplete) {
        this.supressBuildComplete = supressBuildComplete;
    }

    public boolean isSupressConsoleWhisper() {
        return supressConsoleWhisper;
    }

    public void setSupressConsoleWhisper(boolean supressConsoleWhisper) {
        this.supressConsoleWhisper = supressConsoleWhisper;
    }

    public boolean isSupressInfo() {
        return supressInfo;
    }

    public void setSupressInfo(boolean supressInfo) {
        this.supressInfo = supressInfo;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }
}
