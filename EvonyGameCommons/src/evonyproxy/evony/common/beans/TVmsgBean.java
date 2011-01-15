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
public class TVmsgBean implements EvonyPacket {
private Double time = null;
private String msg = null;

public TVmsgBean(ASObject aso) {

if(aso.get("time") != null) {
this.time = (Double) aso.get("time");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}
}

public TVmsgBean() {
}

@Override
public TVmsgBean clone() {
TVmsgBean clone = new TVmsgBean();

if(this.time != null) {
clone.setTime(this.time);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.time != null) {
aso.put("time", time);
}

if(this.msg != null) {
aso.put("msg", msg);
}

return aso;
}

public Double getTime() {
return time;
}

public void setTime(Double time) {
this.time = time;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}
}
