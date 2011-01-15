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
public class NewFinishedQuest implements EvonyPacket {

public NewFinishedQuest(ASObject aso) {
}

public NewFinishedQuest() {
}

@Override
public NewFinishedQuest clone() {
NewFinishedQuest clone = new NewFinishedQuest();

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

return aso;
}
}
