/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.event;

import java.util.EventObject;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class PolicyRequestEvent extends EventObject {
    byte[] policyResponse;

    public PolicyRequestEvent(Object source, byte[] policyResponse) {
        super(source);
        this.policyResponse = policyResponse;
    }

    public byte[] getPolicyRequest() {
        return policyResponse;
    }

    public void setPolicyRequest(byte[] policyResponse) {
        this.policyResponse = policyResponse;
    }
}
