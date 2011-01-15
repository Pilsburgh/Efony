/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.command;

import evonyproxy.Sender;
import evonyproxy.Serializer;

/**
 * @version .01
 * @author Michael Archibald
 * Is implemented by all command classes in evonyproxy.command
 */
public class AbstractCommand {
    Sender sender;
    Serializer serializer;

    public AbstractCommand() {
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setSerializer(Serializer serializer) {
        this.serializer = serializer;
    }
}
