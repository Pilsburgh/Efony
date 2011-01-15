/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.amf;

import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.ASObject;
import flex.messaging.io.amf.Amf3Input;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @version .01
 * @author Michael Archibald
 */
public class AMFDeserializer implements Deserializer {
    Amf3Input amfi;
    ByteArrayInputStream bais;
    ASObject aso;

    public AMFDeserializer() {
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

        amfi = new Amf3Input(context);
    }



    public ASObject deserialize(byte[] data) throws IOException {
        bais = new ByteArrayInputStream(data);
        amfi.setInputStream(bais);

        try {
            aso = (ASObject) amfi.readObject();
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return aso;
    }

}
