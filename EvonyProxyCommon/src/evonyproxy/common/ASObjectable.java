/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.common;

import flex.messaging.io.amf.ASObject;

/**
 * Represents an object that can be serialized into AMF (Action Message Format)
 * @version .01
 * @author Michael Archibald
 */
public interface ASObjectable {
    public ASObject toASObject();
}
