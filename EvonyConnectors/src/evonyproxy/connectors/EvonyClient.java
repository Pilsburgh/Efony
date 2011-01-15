/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.connectors;

import evonyproxy.common.Sender;
import java.net.*;
import java.io.*;
import java.util.logging.*;
import sun.jkernel.ByteArrayToFromHexDigits;

/**
 * @version .02
 * @author HP_Administrator
 */
public class EvonyClient extends AbstractEvony {
    private static int PORT = 443;
    protected boolean primaryConnection, initialDataHandled;

    EvonyClient(Sender io, Socket s, boolean verbose) {
        super(io, s, verbose);
        primaryConnection = false;
    }

    EvonyClient(boolean primaryConnection, Sender io, Socket s, boolean verbose) {
        super(io, s, verbose);
        this.primaryConnection = primaryConnection;
        initializeVars();
    }

    EvonyClient(Sender io, Socket socket) {
        super(io, socket);
        primaryConnection = false;
    }

    EvonyClient(boolean primaryConnection, Sender io, Socket s) {
        super(io, s);
        this.primaryConnection = primaryConnection;
    }

    EvonyClient(Sender io) {
        super(io);
        primaryConnection = false;
    }

    EvonyClient(Sender io, boolean verbose) {
        super(io, verbose);
        primaryConnection = false;
    }

    EvonyClient() {
        primaryConnection = false;
    }

    @Override
    protected void initializeVars() {
        super.initializeVars();
        bufferSize = 4096;
//        initialDataHandled = Boolean.valueOf(primaryConnection);
        if(primaryConnection) {
            initialDataHandled = true;
        }
        else {
            initialDataHandled = false;
        }
    }

    @Override
    public void run() {
        initializeVars();
        try {
            buffer = new byte[bufferSize];
            in = new BufferedInputStream(socket.getInputStream());
            out = new BufferedOutputStream(socket.getOutputStream());
            io.addClient(this);

//            while(socket.isConnected()) {
            while(!terminated) {
                if(terminated) {
                    return;
                }

                buffer = getInput();
                if(buffer != null) {
                    /* TODO: This whole business with if(primaryData ||
                    initialDataHandled needs to be removed as it is now
                    handled in AMF. Has been modified so that the setup
                    in AMF works properly. */
                    if(primaryConnection || initialDataHandled) {
                        if(verbose) {
                            log.info("Passing data to IO");
                        }
                        fireAmfDataEvent(buffer); //Amf attempt
                    }
                    else {
                        if(!initialDataHandled) {
                            if(recievedCount == 1) {
                                if(verbose) {
                                    log.info("!primaryConnection && !initialDataHandled. passing LoginRequest");
                                }
                                fireAmfDataEvent(buffer);
                                initialDataHandled = true;
                            }
                            else {
                                if(recievedCount > 1 && !initialDataHandled) {
                                    log.log(Level.SEVERE, "Client !primaryConnection and persisted loginResponse !sent");
                                    terminated = true;
                                }
                            }
                        }
                    }
                }
            }
            terminated = true;
        } catch(IOException e) {
            log.log(Level.SEVERE, "I/O error. Terminating thread", e);
            terminated = true;
        }
    }

    public void sendData(byte[] b) {
        if(b != null) {
            if(verbose) {
                log.info("Sending data to client on port " + socket.getLocalPort());
            }
            try {
                out.write(b);
                out.flush();
                sentCount++;

                if(debug) {
                    System.out.println("\nsentCount: " + sentCount + "   bytes: " + b.length + "\n" + ByteArrayToFromHexDigits.bytesToHexString(b));
                    String str = "";
                    for(byte eightBits : b) {
                        str += (((char) eightBits) + " ");
                    }
                    System.out.println(str);
                }

            } catch(SocketException se) {
                String errMsg = "Killing inactive thread ";
                errMsg += currentThread().getName() + " on port: "
                        + getSocket().getPort();
                log.log(Level.WARNING, errMsg);
                terminated = true;
            } catch(IOException e) {
                log.log(Level.WARNING, "Failed to send data to client on port " + socket.getPort(), e);
                io.removeClient(this);
                terminated = true;
            }
        }
    }

    public boolean isPrimaryConnection() {
        return primaryConnection;
    }

    public static int getPORT() {
        return PORT;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nprimaryConnection: " + primaryConnection
                + "\ninitialDataHandled: " + initialDataHandled;
    }
/*
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(EvonyClient.getPORT());
            Sender io = new IO(false);
            Datas dat = new Datas(io);
            io.setDat(dat);

            System.out.println("Waiting for a client to connect.");
            while(1 == 1) {
                Socket s = ss.accept();
                System.out.println("Connected to: " + s.getInetAddress());
                System.out.println("Thread count: " + Thread.activeCount());
                Thread t = new Thread(new EvonyClient(io, s, false));
                t.start();

            }
        } catch(IOException e) {
            System.out.println("\nFailed to connect to a client.");
            System.out.println(e.getMessage());
        }
    }
*/
}

