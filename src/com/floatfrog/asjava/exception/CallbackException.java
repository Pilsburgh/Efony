/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.floatfrog.asjava.exception;

/**
 * @version .01
 * @author Michael Archibald
 */
public class CallbackException extends AbstractEAEException {
    private static final String MSG = "Failed to determine callback";

    public CallbackException() {
        super(MSG);
    }

    public CallbackException(String causeClass, String causeFunction) {
        super(MSG, causeClass, causeFunction);
    }


}
