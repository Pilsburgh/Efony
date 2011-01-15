/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.newevonycommands;

import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.ASObject;
import flex.messaging.io.amf.Amf3Input;
import flex.messaging.io.amf.Amf3Output;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.EventObject;

/**
 * @version .01
 * @author Michael Archibald
 */
public abstract class BaseBean extends EventObject {
    protected String cmd;
    protected ASObject data;
    protected Amf3Output amfo;
    protected Amf3Input amfi;
    protected SerializationContext context;

    public BaseBean(Object source, String cmd, ASObject data) {
        super(source);
        this.cmd = cmd;
        this.data = data;
    }

    protected void makeContextDefualt() {
        context = new SerializationContext();
        context.createASObjectForMissingType = true;
        context.instantiateTypes = true;
        context.enableSmallMessages = true;
        context.supportRemoteClass = false;
        context.legacyCollection = false;
        context.legacyMap = false;
        context.legacyThrowable = false;
        context.legacyBigNumbers = false;
        context.restoreReferences = false;
        context.logPropertyErrors = false;
        context.ignorePropertyErrors = true;
    }

    public void serialize(OutputStream out) {
        try {
            amfo = new Amf3Output(context);
            amfo.setOutputStream(out);
            amfo.writeObject(toASObject());
            amfo.flush();
            amfo.reset();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void readObject(InputStream in) {
//        ASObject
        try{
            amfi = new Amf3Input(context);
            amfi.setInputStream(in);
        } catch(AbstractMethodError e) {
            e.printStackTrace();
        }

    }

     public abstract ASObject toASObject();

}
