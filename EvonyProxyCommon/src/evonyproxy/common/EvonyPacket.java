/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.common;

import flex.messaging.io.amf.ASObject;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface EvonyPacket {
    public ASObject toASObject();
}
