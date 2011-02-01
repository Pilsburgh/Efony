/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy;

import evonyproxy.event.AmfDataEvent;
import evonyproxy.event.AmfListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @version .01
 * @author HP_Administrator
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public abstract class AbstractEvony implements Runnable {
    protected int bufferSize;
    protected Logger log;
    protected IO io;
    protected Socket socket;
    protected BufferedInputStream in;
    protected BufferedOutputStream out;
    protected boolean verbose, debug;
    protected byte[] buffer;
    protected boolean terminated;
    protected int recievedCount, sentCount;
    protected List<AmfListener> amfListeners;

    AbstractEvony() {
        log = LoggerFactory.newLogger(this.getClass().getName());
        verbose = false;
    }

    AbstractEvony(IO io) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.io = io;
        verbose = false;
    }

    AbstractEvony(IO io, boolean verbose) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.io = io;
        this.verbose = verbose;
    }

    AbstractEvony(IO io, Socket socket) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.socket = socket;
        this.io = io;
        this.verbose = false;
    }

    AbstractEvony(IO io, Socket socket, boolean verbose) {
        log = LoggerFactory.newLogger(this.getClass().getName());
        this.socket = socket;
        this.io = io;
        this.verbose = verbose;
    }

    protected void initializeVars() {
        terminated = false;
        debug = false;
        recievedCount = 0;
        sentCount = 0;
        amfListeners = new ArrayList<AmfListener>();
    }

    abstract void sendData(byte[] data);

    protected byte[] getInput() {
        try {
            buffer = new byte[bufferSize];
            int bytesReaded;
            bytesReaded = in.read(buffer);
            if (bytesReaded > 0) {
                if (verbose) {
                    log.info("Incoming data");
                    log.config("bytesReaded: " + bytesReaded);
                }
                recievedCount++;
                return Arrays.copyOfRange(buffer, 0, bytesReaded);
            } else {
                return null;
            }
        } catch (IOException e) {
            log.log(Level.WARNING, "Failed to recieve data, terminating connection", e);
            terminated = true;
        }
        return null;
    }

    protected synchronized void addAmfListener(AmfListener al) {
        amfListeners.add(al);
    }

    protected synchronized void removeAmfListener(AmfListener al) {
        amfListeners.remove(al);
    }

    protected synchronized void fireAmfDataEvent(byte[] data) {
        if(debug) {
            System.out.println(Thread.currentThread() + " Dispatching AmfDataEvent");
        }
        AmfDataEvent event = new AmfDataEvent(this, data);
        for (AmfListener amfListener : amfListeners) {
            amfListener.onAmfDataEvent(event);
        }
    }

    public boolean isConnected() {
        return socket.isConnected();
    }

    public String getIP() {
        return socket.getInetAddress().getHostAddress();
    }

    public boolean isTerminated() {
        return terminated;
    }

    public void setTerminated(boolean terminated) {
        this.terminated = terminated;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public int getRecievedCount() {
        return recievedCount;
    }

    public void setRecievedCount(int recievedCount) {
        this.recievedCount = recievedCount;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }



    public String toString() {
        return Thread.currentThread()
                + "\nsocket: " + socket.toString()
                + "\nin: " + in.toString()
                + "\nout: " + out.toString()
                + "\nio: " + io.toString()
                + "\nterminate: " + terminated
                + "\nverbose: " + verbose;
    }

    public Thread currentThread() {
       return Thread.currentThread();
    }

}
