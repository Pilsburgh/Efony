package evonyproxy.common.module.common;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class ChangeNameResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public Integer changeType = null;
public String nowName = null;
public String errorMsg = null;
public Integer ok = null;

public ChangeNameResponse(ASObject aso) {

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("changeType") != null) {
this.changeType = (Integer) aso.get("changeType");
}

if(aso.get("nowName") != null) {
this.nowName = (String) aso.get("nowName");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public ChangeNameResponse() {
}

@Override
public ChangeNameResponse clone() {
ChangeNameResponse clone = new ChangeNameResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.changeType != null) {
clone.setChangeType(this.changeType);
}

if(this.nowName != null) {
clone.setNowName(this.nowName);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.changeType != null) {
aso.put("changeType", changeType);
}

if(this.nowName != null) {
aso.put("nowName", nowName);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Integer getChangeType() {
return changeType;
}

public void setChangeType(Integer changeType) {
this.changeType = changeType;
}

public String getNowName() {
return nowName;
}

public void setNowName(String nowName) {
this.nowName = nowName;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
