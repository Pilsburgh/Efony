/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.floatfrog.asjava.exception;

/**
 * @version .01
 * @author Michael Archibald
 */
public abstract class AbstractEAEException extends Exception {
    protected String causeClass = "Undefined";
    protected String causeFunction = "Undefined";

    public AbstractEAEException(String msg, String causeClass, String causeFunction) {
        super(msg);
        this.causeClass = causeClass;
        this.causeFunction = causeFunction;
    }

    public AbstractEAEException(String msg) {
        super(msg);
    }

    public String getCauseClass() {
        return causeClass;
    }

    public String getCauseFunction() {
        return causeFunction;
    }
}
