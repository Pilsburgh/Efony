/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.evony.common.beans;

import java.io.Serializable;
import java.util.Set;
import flex.messaging.io.amf.ASObject;

/**
 * @version .01
 * @author Michael Archibald
 */
public abstract class AbstractBean implements Cloneable, Comparable<Object> {

    public AbstractBean() {
    }

    abstract Set<String> getFields();

    public abstract ASObject toObject();

    @Override
    public abstract AbstractBean clone();
}
