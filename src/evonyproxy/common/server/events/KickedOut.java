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
public class KickedOut implements ASObjectable {
public String ip = null;

public KickedOut(ASObject aso) {

if(aso.get("ip") != null) {
this.ip = (String) aso.get("ip");
}
}

public KickedOut() {
}

@Override
public KickedOut clone() {
KickedOut clone = new KickedOut();

if(this.ip != null) {
clone.setIp(this.ip);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.ip != null) {
aso.put("ip", ip);
}

return aso;
}

public String getIp() {
return ip;
}

public void setIp(String ip) {
this.ip = ip;
}
}
