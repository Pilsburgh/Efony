package evonyproxy.evony.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class BettleResultBean implements EvonyPacket {

    public BettleResultBean(ASObject aso) {
    }

    public BettleResultBean() {
    }

    @Override
    public BettleResultBean clone() {
        BettleResultBean clone = new BettleResultBean();

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        return aso;
    }
}
