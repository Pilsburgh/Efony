/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.console.event;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface ConsoleListener {
    public void onConsoleRequestEvent(ConsoleRequestEvent event);
    public void onConsoleResponseEvent(ConsoleResponseEvent event);
}
