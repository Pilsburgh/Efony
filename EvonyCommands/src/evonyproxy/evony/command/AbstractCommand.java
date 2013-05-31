/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.evony.command;

import evonyproxy.common.Sender;
import evonyproxy.common.Serializer;

/**
 * @version .01
 * @author Michael Archibald
 * Is implemented by all command classes in evonyproxy.command
 */
public class AbstractCommand {
    Serializer serializer;
    Sender sender;

    public AbstractCommand() {
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }
}
