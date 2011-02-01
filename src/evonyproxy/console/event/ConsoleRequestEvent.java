/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.console.event;

import java.util.EventObject;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class ConsoleRequestEvent extends EventObject {
    protected String msg = "";

    public ConsoleRequestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String msg() {
        return msg;
    }
}
