/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.common.LoggerFactory;
import evonyproxy.connectors.EvonyPolicy;
import evonyproxy.connectors.EvonyConnectorFactory;
import evonyproxy.connectors.EvonyServer;
import evonyproxy.connectors.EvonyClient;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Initialises Efony. Appears to be hard coded.
 *
 * @author HP_Administrator
 */
public class Main {

    static final Logger log = LoggerFactory.newLogger(Main.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verbose = false;

        /* IO is used to allow the EvonyConnectors to communicate */
        IO io = new IO(verbose);
        /* Datas is a context containing the Flash Policy and Evony Login info */
        Datas dat = new Datas(io);
        io.setDat(dat);

//        EvonyServer server = new EvonyServer(io,true, 443, "64.156.195.60");
//        server.connectToServer();
//        while(!server.getSocket().isConnected()) {}
//
//        Thread serverThread = new Thread(server);

        /* Starts a connection to an Evony Server */
        Thread server = null;
        if (args[0] != null) {
            try {
                server = new Thread(new EvonyServer(io, verbose, 443, args[0]), "EvonyServer");
                server.start();
            } catch (Exception ioe) {
                log.log(Level.SEVERE, "{0}is not a valid IP for an Evony server.", args[0]);
            }
        } else {
            /* If you want to hard code an Evony server, do it here */
            server = new Thread(new EvonyServer(io, verbose, 443, "64.156.195.60"), "EvonyServer");
            server.start();
        }

        /* Starts a policy listener that listens for the policy that all 
         * flash programs transmit before they start up.
         */
        Thread policyConnector = new Thread(new EvonyConnectorFactory(io, verbose, EvonyPolicy.class.getName()), "policyConnector");
        /* Listens for Evony Clients. Their configurations need to be modified
         * to point to a local port.
         */
        Thread clientConnector = new Thread(new EvonyConnectorFactory(io, verbose, EvonyClient.class.getName()), "clientConnector");


//        serverThread.start();
        policyConnector.start();
        clientConnector.start();
    }
}
