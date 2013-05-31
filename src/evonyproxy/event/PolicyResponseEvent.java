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
public class PolicyResponseEvent extends EventObject {
    byte[] policyResponse;

    public PolicyResponseEvent(Object source, byte[] policyRequest) {
        super(source);
        this.policyResponse = policyRequest;
    }

    public byte[] getPolicyResponse() {
        return policyResponse;
    }

    public void setPolicyResponse(byte[] policyResponse) {
        this.policyResponse = policyResponse;
    }
}
