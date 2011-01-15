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
public class GamblingItemBean implements EvonyPacket {
private Integer kind = null;
private Integer count = null;
private String id = null;

public GamblingItemBean(ASObject aso) {

if(aso.get("kind") != null) {
this.kind = (Integer) aso.get("kind");
}

if(aso.get("count") != null) {
this.count = (Integer) aso.get("count");
}

if(aso.get("id") != null) {
this.id = (String) aso.get("id");
}
}

public GamblingItemBean() {
}

@Override
public GamblingItemBean clone() {
GamblingItemBean clone = new GamblingItemBean();

if(this.kind != null) {
clone.setKind(this.kind);
}

if(this.count != null) {
clone.setCount(this.count);
}

if(this.id != null) {
clone.setId(this.id);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.kind != null) {
aso.put("kind", kind);
}

if(this.count != null) {
aso.put("count", count);
}

if(this.id != null) {
aso.put("id", id);
}

return aso;
}

public Integer getKind() {
return kind;
}

public void setKind(Integer kind) {
this.kind = kind;
}

public Integer getCount() {
return count;
}

public void setCount(Integer count) {
this.count = count;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}
}
