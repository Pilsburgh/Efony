/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.connectors.event;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface PolicyListener {
    void onPolicyResponse(PolicyResponseEvent event);
    void onPolicyRequest(PolicyRequestEvent event);
}
