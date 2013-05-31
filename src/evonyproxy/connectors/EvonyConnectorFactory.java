/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.connectors;

import evonyproxy.common.LoggerFactory;
import evonyproxy.common.Sender;
import java.net.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;

/**
 * Listens for clients attempting to connect to the server and hooks them into IO
 * so that they will be able to recieve incoming data. A legitimate client needs
 * to be the first to connect because it is treated special. After that, as many
 * arbatrary clients can connect as desired.
 * @author Michael Archibald
 */
public class EvonyConnectorFactory implements Runnable {

    public static final int PORT_CEILING = 65535;
    protected Logger log;
    protected Sender io;
    protected int port;
    protected ServerSocket ss;
    protected Socket socket;
    protected boolean verbose;
    protected int clientCount;
    protected boolean primaryConnection;
    protected String instanceType;

    public EvonyConnectorFactory(Sender io, String instanceType) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.io = io;
        this.instanceType = instanceType;
        verbose = false;
        constructerConstants();
    }

    /**
     *
     * @param io IO instance to connect the client to
     * @param verbose
     * @param instanceType can be the name of an EvonyClient instance, EvonyPolicy
     * instance, or a number representing what port you want to listen for
     * clients on.
     */
    public EvonyConnectorFactory(Sender io, boolean verbose, String instanceType) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.io = io;
        this.verbose = verbose;
        this.instanceType = instanceType;
        constructerConstants();
    }

    protected void constructerConstants() {
        primaryConnection = true;

        if (instanceType.equals(EvonyPolicy.class.getName())) {
            port = EvonyPolicy.getPORT();
        } else {
            if (instanceType.equals(EvonyClient.class.getName())) {
                port = EvonyClient.getPORT();
            } else {
                try {
                    if (Integer.valueOf(instanceType) > 0 && Integer.valueOf(instanceType) <= PORT_CEILING) {
                        port = Integer.valueOf(instanceType);
                    } else {
                        throw new Error("Invalid instanceType");
                    }
                } catch (NumberFormatException e) {
                    throw new Error("Invalid instanceType");
                }
            }
        }
    }

    public void run() {
        clientCount = 0;
        log.info(Thread.currentThread().getName() + "\nListening for a client on port " + port);
        try {
            ss = new ServerSocket(port);
            while (true) {
                socket = ss.accept();
                log.info(Thread.currentThread().getName() + "\nConnected to ip: " + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());

                Thread evony = null;
                String instanceTypeName = "IfThisThenFailure";
                if (instanceType.equals(EvonyPolicy.class.getName())) {
                    instanceTypeName = EvonyPolicy.class.getName() + "-" + ++clientCount;
                    evony = new Thread(new EvonyPolicy(primaryConnection, io, socket, verbose), instanceTypeName);
                } else {
                    if (instanceType.equals(EvonyClient.class.getName())) {
                        instanceTypeName = EvonyClient.class.getName() + "-" + ++clientCount;
                        evony = new Thread(new EvonyClient(primaryConnection, io, socket, verbose), instanceTypeName);
                    } else {
                        int instanceTypeInt = Integer.valueOf(instanceType);
                        if (instanceTypeInt > 0 && instanceTypeInt <= PORT_CEILING) {
                            instanceTypeName = instanceTypeInt + "<-PortClient-" + ++clientCount;
                            evony = new Thread(new EvonyClient(primaryConnection, io, socket, verbose), instanceTypeName);
                        } else {
                            throw new Error("instanceType must be an AbstractEvony or 0 > instnaceType <= 65535");
                        }
                    }
                }
                evony.start();
                primaryConnection = false;
            }
        } catch (IOException e) {
            log.log(Level.WARNING, "Failed to listen on port " + port, e);
        }
    }
}
