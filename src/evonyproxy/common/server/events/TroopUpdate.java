package evonyproxy.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;
import evonyproxy.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class TroopUpdate implements ASObjectable {
public TroopBean troop = null;
public Integer caslteId = null;

public TroopUpdate(ASObject aso) {

if(aso.get("troop") != null) {
this.troop = new TroopBean((ASObject) aso.get("troop"));
}

if(aso.get("caslteId") != null) {
this.caslteId = (Integer) aso.get("caslteId");
}
}

public TroopUpdate() {
}

@Override
public TroopUpdate clone() {
TroopUpdate clone = new TroopUpdate();

if(this.troop != null) {
clone.setTroop(this.troop);
}

if(this.caslteId != null) {
clone.setCaslteId(this.caslteId);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.troop != null) {
aso.put("troop", troop.toASObject());
}

if(this.caslteId != null) {
aso.put("caslteId", caslteId);
}

return aso;
}

public TroopBean getTroop() {
return troop;
}

public void setTroop(TroopBean troop) {
this.troop = troop;
}

public Integer getCaslteId() {
return caslteId;
}

public void setCaslteId(Integer caslteId) {
this.caslteId = caslteId;
}
}
