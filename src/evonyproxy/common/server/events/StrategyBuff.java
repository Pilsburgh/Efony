package evonyproxy.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class StrategyBuff implements ASObjectable {

public StrategyBuff(ASObject aso) {
}

public StrategyBuff() {
}

@Override
public StrategyBuff clone() {
StrategyBuff clone = new StrategyBuff();

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

return aso;
}
}
