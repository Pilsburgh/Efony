package evonyproxy.common.module.quest;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;
import evonyproxy.common.beans.*;

/**
 * @version .02
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class EffortListResponse implements ASObjectable {
public Double packageId = null;
public String effortpoint = null;
public String effortcomplete = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;
public ArrayList<EffortListBean> effortlistbean = null;

public EffortListResponse(ASObject aso) {
effortlistbean = new ArrayList<EffortListBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("effortpoint") != null) {
this.effortpoint = (String) aso.get("effortpoint");
}

if(aso.get("effortcomplete") != null) {
this.effortcomplete = (String) aso.get("effortcomplete");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("effortlistbean") != null) {
Object[] objArr = (Object[]) aso.get("effortlistbean");
for(int j = 0; j < objArr.length; j++) {
effortlistbean.add(new EffortListBean((ASObject) objArr[j]));
}
}
}

public EffortListResponse() {
}

@Override
public EffortListResponse clone() {
EffortListResponse clone = new EffortListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.effortpoint != null) {
clone.setEffortpoint(this.effortpoint);
}

if(this.effortcomplete != null) {
clone.setEffortcomplete(this.effortcomplete);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.effortlistbean != null) {
ArrayList tmpArrLst = new ArrayList<EffortListBean>();

for(Object bean : effortlistbean) {
EffortListBean tmpBean = (EffortListBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setEffortlistbean(tmpArrLst);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.effortpoint != null) {
aso.put("effortpoint", effortpoint);
}

if(this.effortcomplete != null) {
aso.put("effortcomplete", effortcomplete);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.effortlistbean != null) {
ArrayList al = new ArrayList();
for(Object obj : effortlistbean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("effortlistbean", al);
}

return aso;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public String getEffortpoint() {
return effortpoint;
}

public void setEffortpoint(String effortpoint) {
this.effortpoint = effortpoint;
}

public String getEffortcomplete() {
return effortcomplete;
}

public void setEffortcomplete(String effortcomplete) {
this.effortcomplete = effortcomplete;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
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

public ArrayList getEffortlistbean() {
return effortlistbean;
}

public void setEffortlistbean(ArrayList effortlistbean) {
this.effortlistbean = effortlistbean;
}
}
