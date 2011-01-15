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
public class ConnectionLost implements EvonyPacket {
public static final int SERVER_SHUTDOWN = 2;
public static final int KICK_BY_SERVER = 0;
public static final int SERVER_START = 1;
public static final int SERVER_MAINTAIN = 4;
public static final int KICK_BY_OTHER = 3;
public Integer reasonCode = null;

public ConnectionLost(ASObject aso) {

if(aso.get("reasonCode") != null) {
this.reasonCode = (Integer) aso.get("reasonCode");
}
}

public ConnectionLost() {
}

@Override
public ConnectionLost clone() {
ConnectionLost clone = new ConnectionLost();

if(this.reasonCode != null) {
clone.setReasonCode(this.reasonCode);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.reasonCode != null) {
aso.put("reasonCode", reasonCode);
}

return aso;
}

public Integer getReasonCode() {
return reasonCode;
}

public void setReasonCode(Integer reasonCode) {
this.reasonCode = reasonCode;
}
}
