package evonyproxy.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class AllianceEvent implements ASObjectable {
private Double time = null;
private String eventName = null;

public AllianceEvent(ASObject aso) {

if(aso.get("time") != null) {
this.time = (Double) aso.get("time");
}

if(aso.get("eventName") != null) {
this.eventName = (String) aso.get("eventName");
}
}

public AllianceEvent() {
}

@Override
public AllianceEvent clone() {
AllianceEvent clone = new AllianceEvent();

if(this.time != null) {
clone.setTime(this.time);
}

if(this.eventName != null) {
clone.setEventName(this.eventName);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.time != null) {
aso.put("time", time);
}

if(this.eventName != null) {
aso.put("eventName", eventName);
}

return aso;
}

public Double getTime() {
return time;
}

public void setTime(Double time) {
this.time = time;
}

public String getEventName() {
return eventName;
}

public void setEventName(String eventName) {
this.eventName = eventName;
}
}
