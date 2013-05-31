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
public interface Serializer {
    byte[] serialize(ASObject aso) throws IOException;
}
