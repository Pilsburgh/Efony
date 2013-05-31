package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class ItemBuff implements EvonyPacket {

    public ItemBuff(ASObject aso) {
    }

    public ItemBuff() {
    }

    @Override
    public ItemBuff clone() {
        ItemBuff clone = new ItemBuff();

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        return aso;
    }
}
