/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.event.PolicyAdapter;
import evonyproxy.event.PolicyListener;
import evonyproxy.event.PolicyRequestEvent;
import evonyproxy.event.PolicyResponseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import sun.jkernel.ByteArrayToFromHexDigits;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class EvonyPolicy extends EvonyClient implements PolicyListener {
    private static int PORT = 843;
    List<PolicyListener> policyRequestListeners;

    public EvonyPolicy(boolean primaryConnection, IO io, Socket s, boolean verbose) {
        super(primaryConnection, io, s, verbose);
        policyRequestListeners = new ArrayList<PolicyListener>();
//        PolicyResponseObserver();
    }

    public EvonyPolicy(IO io, boolean verbose) {
        super(io, verbose);
        policyRequestListeners = new ArrayList<PolicyListener>();
//        PolicyResponseObserver();
    }

    public EvonyPolicy(IO io) {
        super(io);
        verbose = false;
        policyRequestListeners = new ArrayList<PolicyListener>();
//        PolicyResponseObserver();
    }

    public EvonyPolicy() {
        verbose = false;
        initializeVars();
        policyRequestListeners = new ArrayList<PolicyListener>();
//        PolicyResponseObserver();
    }

    @Override
    protected void initializeVars() {
        super.initializeVars();
//        this.socket = new Socket();
    }

//    protected void PolicyResponseObserver() {
//        io.getDat().addPolicyResponseListener(new PolicyAdapter() {
//            @Override
//            public void onPolicyResponse(PolicyResponseEvent event) {
//                sendData(event.getPolicyResponse());
//                ((Datas) event.getSource()).removePolicyResponseListener(this);
//            }
//        });
//    }

    public void onPolicyResponse(PolicyResponseEvent event) {
        sendData(event.getPolicyResponse());
        ((Datas) event.getSource()).removePolicyResponseListener(this);
    }

    public void onPolicyRequest(PolicyRequestEvent event) {

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

    /** @deprecated by AbstractEvonyFactory */
    protected void listenForClient() {
        try {
            ServerSocket ss;
            log.info("Listening for a client");
            ss = new ServerSocket(getPORT());
            socket = ss.accept();
            log.info("Connected to ip: " + socket.getInetAddress().getHostAddress());
        } catch(IOException e) {
            log.log(Level.WARNING, "Failed to connect to client", e);
        }
    }

    @Override
    public void run() {
//        initializeVars();
        this.addPolicyRequestListener(io.getDat());
//        io.getDat().addPolicyResponseListener(this);
        try {
            buffer = new byte[bufferSize];

            in = new BufferedInputStream(socket.getInputStream());
            out = new BufferedOutputStream(socket.getOutputStream());

            io.setPolicyServer(this);

            while(socket.isConnected()) {
                if(terminated) {
                    return;
                }

                buffer = getInput();

                if(primaryConnection || initialDataHandled) {
                    if(buffer != null) {
                        if(verbose) {
                            log.info("Recieved policyRequest");
                        }
//                        io.getDat().setPolicyRequest(buffer);
//                        io.passDataToServer(io.getDat().getPolicyResponseBytes());
                        firePolicyRequestEvent(buffer);
                    }
                }
                if(!initialDataHandled) {
                    if(recievedCount == 1) {
                        if(verbose) {
                            log.info("Sending persisted policyResponse to client");
                        }
                        sendData(io.getDat().getPolicyResponseBytes());
                        initialDataHandled = true;
                    }
                }
            }
            terminated = true;
        } catch(IOException e) {
            log.log(Level.SEVERE, "I/O error. Terminating thread", e);
            terminated = true;
        }
    }

    @Override
    protected void sendData(byte[] b) {
        if(b != null) {
            if(verbose) {
                log.info("Sending data to policy client on port " + socket.getLocalPort());
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

                if(verbose) {
                    log.info("Policy server has served its purpose. Setting terminate flag");
                }
                terminated = true;
            } catch(IOException e) {
                log.log(Level.WARNING, "Failed to send data to client on port " + socket.getPort(), e);
                terminated = true;
            }
        }
    }

    public static int getPORT() {
        return PORT;
    }
}
