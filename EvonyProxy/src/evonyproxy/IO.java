/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.evony.common.server.events.LoginResponse;
import evonyproxy.common.Sender;
import evonyproxy.common.LoggerFactory;
import evonyproxy.common.custom.LoginRequest;
import evonyproxy.connectors.EvonyPolicy;
import evonyproxy.connectors.EvonyServer;
import evonyproxy.connectors.EvonyClient;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.*;
import sun.jkernel.ByteArrayToFromHexDigits;
import evonyproxy.AMF;

/**
 * Handles communcations between clients and server.
 * Looking back on this, it needs to be reprogrammed so that it is loosley
 * coupled. Instead of having how the server and client connections communicate,
 * I would rather use an observer pattern so that whatever client can listen
 * to whatever server it wants.
 * @version .01
 * @author Michael Archibald
 */
public class IO implements Sender  {
    protected Logger log;
    protected Datas dat;
    protected EvonyServer server;
    protected List<EvonyClient> clients;
    protected EvonyPolicy policyServer;
    protected boolean verbose;
    protected AMF amf;

    public IO(Datas dat) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.dat = dat;
        server = null;
        this.verbose = false;
        initializeVars();
    }

    public IO(Datas dat, boolean verbose) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.dat = dat;
        server = null;
        this.verbose = verbose;
        initializeVars();
    }

    public IO(boolean verbose) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        server = null;
        this.verbose = verbose;
        initializeVars();
    }

    public IO(Datas dat, EvonyServer server) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.dat = dat;
        this.server = server;
        this.verbose = false;
        initializeVars();
    }

    public IO(EvonyServer server) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.server = server;
        this.verbose = false;
        initializeVars();
    }

    protected void initializeVars() {
        clients = new CopyOnWriteArrayList<EvonyClient>();
        policyServer = null;
//        policyServer = new EvonyPolicy();
        amf = new AMF(this);
//        setPolicyServer(new EvonyPolicy());
    }

    public void addClient(EvonyClient c) {
        if(verbose) {
            log.info("Adding a client to clients list");
        }
        c.addAmfListener(amf);
        clients.add(c);
    }

    public void removeClient(EvonyClient c) {
        if(verbose) {
            log.info("Removing a client to clients list");
        }
        clients.remove(c);
    }

    /**
     * Only used in passDataToClients()
     * Sends data to each client in the clients list.
     * @param data to be sent
     */
    protected void enumerateClientsList(byte[] data) {
        //TODO: Remove the deletion of classes from here and rely on remove client
        for(EvonyClient client : clients) {
            if(!client.equals(null)) {
                if(client.isTerminated()) {
                    removeClient(client);
                }
                else {
                        client.sendData(data);
                }
            }
            else {    // if(client == null
                removeClient(client);
            }
        }
    }

    public void passDataToClients(byte[] data) {
        if(verbose) {
            log.info("Passing data to ClientWrapper(s).");
        }
        //TODO Is the hash method of data empty set == over different instances?
        enumerateClientsList(data);
    }

    public void passDataToServer(byte[] data) {
        if(data != null) {
            while(!server.getSocket().isConnected()) {
            }

            if(server.getSocket().isConnected()) {
                if(verbose) {
                    log.info("Passing data from a client to EvonyServer.");
                }

                server.sendData(data);
            }
            else {
                log.warning("Server connection lost.");
                server = null;
            }
        }
    }

    public void setServer(EvonyServer server) {
        if(verbose) {
            log.config("server: " + server.toString());
        }
        server.addAmfListener(amf);
        this.server = server;
    }

    public EvonyServer getServer() {
        return server;
    }

    public EvonyPolicy getPolicyServer() {
        return policyServer;
    }

    public void setPolicyServer(EvonyPolicy policyServer) {
        this.policyServer = policyServer;
    }

    public Datas getDat() {
        return dat;
    }

    public void setDat(Datas dat) {
        this.dat = dat;
    }

    public void setVersionRequest(String versionRequest) {
        dat.setVersionRequest(versionRequest);
    }

    public void setPolicyResponse(String policyResponse) {
        dat.setPolicyResponse(policyResponse);
    }

    public void setPolicyResponse(byte[] policyResponse) {
        dat.setPolicyResponse(policyResponse);
    }

    public void setPolicyRequest(byte[] policyRequest) {
        dat.setPolicyRequest(policyRequest);
    }

    public void setPolicyRequest(String policyRequest) {
        dat.setPolicyRequest(policyRequest);
    }

    public void setLoginResponse(LoginResponse lr) {
        dat.setLoginResponse(lr);
    }

    public void setLoginRequest(LoginRequest loginRequest) {
        dat.setLoginRequest(loginRequest);
    }

    public void setHasPolicyResponse(boolean policyFileRecieved) {
        dat.setHasPolicyResponse(policyFileRecieved);
    }

    public void setHasPolicyRequest(boolean recievedPolicyRequest) {
        dat.setHasPolicyRequest(recievedPolicyRequest);
    }

    public boolean hasPolicyResponse() {
        return dat.hasPolicyResponse();
    }

    public boolean hasPolicyRequest() {
        return dat.hasPolicyRequest();
    }

    public boolean hasLoginResponse() {
        return dat.hasLoginResponse();
    }

    public boolean hasLoginRequest() {
        return dat.hasLoginRequest();
    }

    public String getVersionRequest() {
        return dat.getVersionRequest();
    }

    public byte[] getPolicyResponseBytes() {
        return dat.getPolicyResponseBytes();
    }

    public String getPolicyResponse() {
        return dat.getPolicyResponse();
    }

    public byte[] getPolicyRequestBytes() {
        return dat.getPolicyRequestBytes();
    }

    public String getPolicyRequest() {
        return dat.getPolicyRequest();
    }

    public LoginResponse getLoginResponse() {
        return dat.getLoginResponse();
    }

    public LoginRequest getLoginRequest() {
        return dat.getLoginRequest();
    }


}
