/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy;

/**
 * @version .01
 * @author Michael Archibald
 * Made this so that the client command senders know what can serialize an ASObject
 */
public interface Serializer {
    byte[] serialize(String cmd, Object data);
}
