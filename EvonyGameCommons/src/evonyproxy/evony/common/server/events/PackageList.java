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
public class PackageList implements EvonyPacket {

    public PackageList(ASObject aso) {
    }

    public PackageList() {
    }

    @Override
    public PackageList clone() {
        PackageList clone = new PackageList();

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        return aso;
    }
}
