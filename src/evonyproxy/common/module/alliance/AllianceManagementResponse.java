package evonyproxy.common.module.alliance;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class AllianceManagementResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public String waitIntoAllianceName = null;
public String errorMsg = null;
public Integer ok = null;

public AllianceManagementResponse(ASObject aso) {

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("waitIntoAllianceName") != null) {
this.waitIntoAllianceName = (String) aso.get("waitIntoAllianceName");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public AllianceManagementResponse() {
}

@Override
public AllianceManagementResponse clone() {
AllianceManagementResponse clone = new AllianceManagementResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.waitIntoAllianceName != null) {
clone.setWaitIntoAllianceName(this.waitIntoAllianceName);
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

if(this.waitIntoAllianceName != null) {
aso.put("waitIntoAllianceName", waitIntoAllianceName);
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

public String getWaitIntoAllianceName() {
return waitIntoAllianceName;
}

public void setWaitIntoAllianceName(String waitIntoAllianceName) {
this.waitIntoAllianceName = waitIntoAllianceName;
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
