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
public class NewMail implements EvonyPacket {
public Integer count_inbox = null;
public Integer count = null;
public Integer count_system = null;

public NewMail(ASObject aso) {

if(aso.get("count_inbox") != null) {
this.count_inbox = (Integer) aso.get("count_inbox");
}

if(aso.get("count") != null) {
this.count = (Integer) aso.get("count");
}

if(aso.get("count_system") != null) {
this.count_system = (Integer) aso.get("count_system");
}
}

public NewMail() {
}

@Override
public NewMail clone() {
NewMail clone = new NewMail();

if(this.count_inbox != null) {
clone.setCount_inbox(this.count_inbox);
}

if(this.count != null) {
clone.setCount(this.count);
}

if(this.count_system != null) {
clone.setCount_system(this.count_system);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.count_inbox != null) {
aso.put("count_inbox", count_inbox);
}

if(this.count != null) {
aso.put("count", count);
}

if(this.count_system != null) {
aso.put("count_system", count_system);
}

return aso;
}

public Integer getCount_inbox() {
return count_inbox;
}

public void setCount_inbox(Integer count_inbox) {
this.count_inbox = count_inbox;
}

public Integer getCount() {
return count;
}

public void setCount(Integer count) {
this.count = count;
}

public Integer getCount_system() {
return count_system;
}

public void setCount_system(Integer count_system) {
this.count_system = count_system;
}
}
