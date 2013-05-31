package evonyproxy.common.module.city;

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
public class StoreListResponse implements ASObjectable {
public Double packageId = null;
public Integer ok = null;
public String msg = null;
public Integer totalCap = null;
public ArrayList<StoreBean> storeBeans = null;
public String errorMsg = null;

public StoreListResponse(ASObject aso) {
storeBeans = new ArrayList<StoreBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("totalCap") != null) {
this.totalCap = (Integer) aso.get("totalCap");
}

if(aso.get("storeBeans") != null) {
Object[] objArr = (Object[]) aso.get("storeBeans");
for(int j = 0; j < objArr.length; j++) {
storeBeans.add(new StoreBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}
}

public StoreListResponse() {
}

@Override
public StoreListResponse clone() {
StoreListResponse clone = new StoreListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.totalCap != null) {
clone.setTotalCap(this.totalCap);
}

if(this.storeBeans != null) {
ArrayList tmpArrLst = new ArrayList<StoreBean>();

for(Object bean : storeBeans) {
StoreBean tmpBean = (StoreBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setStoreBeans(tmpArrLst);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.totalCap != null) {
aso.put("totalCap", totalCap);
}

if(this.storeBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : storeBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("storeBeans", al);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

return aso;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Integer getTotalCap() {
return totalCap;
}

public void setTotalCap(Integer totalCap) {
this.totalCap = totalCap;
}

public ArrayList getStoreBeans() {
return storeBeans;
}

public void setStoreBeans(ArrayList storeBeans) {
this.storeBeans = storeBeans;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}
}
