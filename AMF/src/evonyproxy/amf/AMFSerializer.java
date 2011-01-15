/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.amf;

import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.ASObject;
import flex.messaging.io.amf.Amf3Output;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @version .01
 * @author Michael Archibald
 */
public class AMFSerializer implements Serializer {
    Amf3Output amfo;
    ByteArrayOutputStream baos;

    public AMFSerializer() {
        SerializationContext context = new SerializationContext();
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

        amfo = new Amf3Output(context);
        baos = new ByteArrayOutputStream();
        amfo.setOutputStream(baos);
    }

    public byte[] serialize(ASObject aso) throws IOException {
            amfo.writeObject(aso);
            return baos.toByteArray();
    }

    public Amf3Output getAmfo() {
        return amfo;
    }

    public void setAmfo(Amf3Output amfo) {
        this.amfo = amfo;
    }

    public ByteArrayOutputStream getBaos() {
        return baos;
    }

    public void setBaos(ByteArrayOutputStream baos) {
        this.baos = baos;
    }
}
