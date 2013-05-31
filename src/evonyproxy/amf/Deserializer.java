/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.amf;

import flex.messaging.io.amf.ASObject;
import java.io.IOException;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface Deserializer {
    ASObject deserialize(byte[] data) throws IOException;
}
