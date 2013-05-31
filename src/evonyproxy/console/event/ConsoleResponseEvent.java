/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.console.event;

import java.util.EventObject;

/**
 * @version .01
 * @author Michael Archibald
 */
public class ConsoleResponseEvent extends EventObject {
    protected String msg;

    public ConsoleResponseEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String msg() {
        return msg;
    }
}
