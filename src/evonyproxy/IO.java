/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.common.custom.LoginRequest;
import evonyproxy.common.server.events.LoginResponse;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.*;
import sun.jkernel.ByteArrayToFromHexDigits;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 * Handles communcations between clients and server.
 */
public class IO implements Sender {
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

    /**
     * @return dat.getLoginResponse()
     */
    public LoginResponse getLoginResponse() {
        return dat.getLoginResponse();
    }

    /**
     * dat.setLoginResponse
     * @param loginResponse
     */
    public void setLoginResponse(LoginResponse loginResponse) {
        dat.setLoginResponse(loginResponse);
    }

    /**
     * dat.setLoginRequest
     * @param loginRequest
     */
    public void setLoginRequest(LoginRequest loginRequest) {
        dat.setLoginRequest(loginRequest);
    }

    /**
     * @return dat.getLoginRequest()
     */
    public LoginRequest getLoginRequest() {
        return dat.getLoginRequest();
    }
}
