package evonyproxy.connectors;

import evonyproxy.common.EvpUtil;
import evonyproxy.common.Sender;
import evonyproxy.connectors.event.PolicyAdapter;
import evonyproxy.connectors.event.PolicyListener;
import evonyproxy.connectors.event.PolicyRequestEvent;
import evonyproxy.connectors.event.PolicyResponseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import sun.jkernel.ByteArrayToFromHexDigits;

/**
 * Represents a connection to an Evony server.
 * @version .02
 * @author HP_Administrator
 */
public class EvonyServer extends AbstractEvony {
    public static int BUFFER_SIZE = 12288;
    protected String ip;
    protected int port;
    boolean incomingPolicyResponse;
    List<PolicyListener> policyResponseListeners;

   public EvonyServer(Sender io, boolean verbose, int port, String ip) {
        super(io, verbose);
        this.port = port;
        this.ip = ip;
        bufferSize = BUFFER_SIZE;
        incomingPolicyResponse = false;
//        policyResponseListeners = new ArrayList<PolicyListener>();
        policyResponseListeners = new CopyOnWriteArrayList<PolicyListener>();
        PolicyRequestObserver();
        initializeVars();
    }

   public EvonyServer(Sender io, String ip, int port) {
        super(io, false);
        this.port = port;
        this.ip = ip;
        bufferSize = BUFFER_SIZE;
        incomingPolicyResponse = false;
//        policyResponseListeners = new ArrayList<PolicyListener>();
        policyResponseListeners = new CopyOnWriteArrayList<PolicyListener>();
        PolicyRequestObserver();
        initializeVars();
    }

    protected void PolicyRequestObserver() {
        io.getDat().addPolicyRequestListener(new PolicyAdapter() {
            @Override
            public void onPolicyRequest(PolicyRequestEvent event) {
                addPolicyListener((PolicyListener) event.getSource());
                incomingPolicyResponse = true;
                sendData(event.getPolicyRequest());
            }
        });
    }

    public void sendData(byte[] b) {
        if(verbose) {
            log.info("Sending data to server.");
            log.config("bytes: " + b.toString());
            log.config("bytes.size: " + b.length);
        }
        try {
            out.write(b);
            out.flush();
        } catch(SocketException se) {
            String errMsg = "Killing inactive thread ";
            errMsg += currentThread().getName() + " on port: "
                    + getSocket().getPort();
            log.log(Level.WARNING, errMsg);
            terminated = true;
        } catch(IOException e) {
            log.log(Level.WARNING, "Failed to send data to server.", e);
            terminated = true;
        }
    }

    @Override
    public void run() {
        try {
            while(socket == null) {
                connectToServer();
            }

            in = new BufferedInputStream(socket.getInputStream());
            out = new BufferedOutputStream(socket.getOutputStream());
            io.setServer(this);
            buffer = new byte[bufferSize];

            while(!terminated) {
                if(terminated) {
                    log.info("Cloasing server thread");
                    return;
                }

                buffer = getInput();

                if(buffer != null) {
                    if(debug) {
                        System.out.println(EvpUtil.byteArrayToChars(buffer));
                    }

                    if(!incomingPolicyResponse) {
                        if(buffer != null)
                            fireAmfDataEvent(buffer);
                    }
                    else {
                        firePolicyResponse(buffer);
//                        policyResponseListeners = new ArrayList<PolicyListener>();
                        incomingPolicyResponse = false;
                    }

                }
            }
            terminated = true;
        } catch(IOException e) {
            log.log(Level.SEVERE, "Failed to read data from server. Terminating thread", e);
            terminated = true;
        }
        log.info("Server thread ending");
        return;
    }

    public void connectToServer() {
        try {
            Inet4Address eS = (Inet4Address) InetAddress.getByName(ip);
            socket = new Socket(eS, port);
            log.info("Connected to server " + ip + ":" + port);
        } catch(UnknownHostException e) {
            log.log(Level.SEVERE, "Exception thrown, unknown host.", e);


        } catch(IOException e) {
            log.log(Level.SEVERE, "IOException in EvonyServer", e);

        }
    }

    public synchronized void addPolicyListener(PolicyListener listener) {
        policyResponseListeners.add(listener);
    }

    public synchronized void removePolicyListener(PolicyListener listener) {
        policyResponseListeners.remove(listener);
    }

    protected synchronized void firePolicyResponse(byte[] buffer) {
        if(debug) {
            System.out.println("Server firing PolicyResponseEvent.");
        }
        PolicyResponseEvent pre = new PolicyResponseEvent(this, buffer);
        for(PolicyListener listener : policyResponseListeners) {
            listener.onPolicyResponse(pre);
        }
    }

    public boolean isIncomingPolicyResponse() {
        return incomingPolicyResponse;
    }
}


