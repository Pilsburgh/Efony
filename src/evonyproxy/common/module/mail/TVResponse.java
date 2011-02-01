package evonyproxy.common.module.mail;

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
public class TVResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;
public ArrayList<TVmsgBean> tvBeans = null;

public TVResponse(ASObject aso) {
tvBeans = new ArrayList<TVmsgBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
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

if(aso.get("tvBeans") != null) {
Object[] objArr = (Object[]) aso.get("tvBeans");
for(int j = 0; j < objArr.length; j++) {
tvBeans.add(new TVmsgBean((ASObject) objArr[j]));
}
}
}

public TVResponse() {
}

@Override
public TVResponse clone() {
TVResponse clone = new TVResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
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

if(this.tvBeans != null) {
ArrayList tmpArrLst = new ArrayList<TVmsgBean>();

for(Object bean : tvBeans) {
TVmsgBean tmpBean = (TVmsgBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTvBeans(tmpArrLst);
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

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.tvBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : tvBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("tvBeans", al);
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

public ArrayList getTvBeans() {
return tvBeans;
}

public void setTvBeans(ArrayList tvBeans) {
this.tvBeans = tvBeans;
}
}
