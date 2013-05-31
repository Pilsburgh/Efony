/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.common;

import flex.messaging.io.amf.ASObject;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public interface ASObjectable {
    public ASObject toASObject();
}
