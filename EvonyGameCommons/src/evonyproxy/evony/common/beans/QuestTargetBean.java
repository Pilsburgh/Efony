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
public class QuestTargetBean implements EvonyPacket {
private String name = null;
private Boolean finished = null;

public QuestTargetBean(ASObject aso) {

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("finished") != null) {
this.finished = (Boolean) aso.get("finished");
}
}

public QuestTargetBean() {
}

@Override
public QuestTargetBean clone() {
QuestTargetBean clone = new QuestTargetBean();

if(this.name != null) {
clone.setName(this.name);
}

if(this.finished != null) {
clone.setFinished(this.finished);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.name != null) {
aso.put("name", name);
}

if(this.finished != null) {
aso.put("finished", finished);
}

return aso;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Boolean getFinished() {
return finished;
}

public void setFinished(Boolean finished) {
this.finished = finished;
}
}
