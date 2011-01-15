/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.connectors.EvonyPolicy;
import evonyproxy.connectors.EvonyConnector;
import evonyproxy.connectors.EvonyServer;
import evonyproxy.connectors.EvonyClient;
import java.net.*;
import java.io.*;

/**
 *
 * @author HP_Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verbose = false;

        IO io = new IO(verbose);
        Datas dat = new Datas(io);
        io.setDat(dat);
        
//        EvonyServer server = new EvonyServer(io,true, 443, "64.156.195.60");
//        server.connectToServer();
//        while(!server.getSocket().isConnected()) {}
//
//        Thread serverThread = new Thread(server);

        Thread server = new Thread(new EvonyServer(io,verbose,443,"64.156.195.60"),"EvonyServer");
        server.start();

        Thread policyConnector = new Thread(new EvonyConnector(io,verbose, EvonyPolicy.class.getName()), "policyConnector");
        Thread clientConnector = new Thread(new EvonyConnector(io,verbose, EvonyClient.class.getName()), "clientConnector");


//        serverThread.start();
        policyConnector.start();
        clientConnector.start();
    }
}
