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
public class CastleSignInfoBean implements EvonyPacket {
private Integer x = null;
private String name = null;
private Integer y = null;
private Integer id = null;

public CastleSignInfoBean(ASObject aso) {

if(aso.get("x") != null) {
this.x = (Integer) aso.get("x");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("y") != null) {
this.y = (Integer) aso.get("y");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}
}

public CastleSignInfoBean() {
}

@Override
public CastleSignInfoBean clone() {
CastleSignInfoBean clone = new CastleSignInfoBean();

if(this.x != null) {
clone.setX(this.x);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.y != null) {
clone.setY(this.y);
}

if(this.id != null) {
clone.setId(this.id);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.x != null) {
aso.put("x", x);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.y != null) {
aso.put("y", y);
}

if(this.id != null) {
aso.put("id", id);
}

return aso;
}

public Integer getX() {
return x;
}

public void setX(Integer x) {
this.x = x;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getY() {
return y;
}

public void setY(Integer y) {
this.y = y;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}
}
