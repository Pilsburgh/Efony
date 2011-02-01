/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public interface Sender {
    void passDataToServer(byte[] data);
}
