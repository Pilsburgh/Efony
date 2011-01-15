package evonyproxy.evony.common.module.common;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class GetPackageNumberResponse implements EvonyPacket {
public String errorMsg = null;
public String msg = null;
public Double packageId = null;
public Integer number = null;
public Integer ok = null;

public GetPackageNumberResponse(ASObject aso) {

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("number") != null) {
this.number = (Integer) aso.get("number");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public GetPackageNumberResponse() {
}

@Override
public GetPackageNumberResponse clone() {
GetPackageNumberResponse clone = new GetPackageNumberResponse();

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.number != null) {
clone.setNumber(this.number);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.number != null) {
aso.put("number", number);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public Integer getNumber() {
return number;
}

public void setNumber(Integer number) {
this.number = number;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
