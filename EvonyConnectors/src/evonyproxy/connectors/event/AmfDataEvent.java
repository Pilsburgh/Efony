/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.connectors.event;

import evonyproxy.connectors.AbstractEvony;
import java.util.EventObject;

/**
 *@version .01
 * @author Michael Archibald
 */
public class AmfDataEvent extends EventObject {
    protected byte[] data;

    public AmfDataEvent(AbstractEvony source, byte[] data) {
        super(source);
        this.data = data;
    }

    public byte[] data() {
        return data;
    }
}
