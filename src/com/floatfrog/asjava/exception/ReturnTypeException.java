/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floatfrog.asjava.exception;

import com.floatfrog.asjava.exception.AbstractEAEException;

/**
 * @version .01
 * @author Michael Archibald
 */
public class ReturnTypeException extends AbstractEAEException {
    private static final String MSG = "Failed to find the callback method";

    public ReturnTypeException(String causeClass, String causeFunction) {
        super(MSG, causeClass, causeFunction);
    }

    public ReturnTypeException() {
        super(MSG);
    }


}
