package evonyproxy.evony.common.module.common;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;
import evonyproxy.evony.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class GetPackageListResponse implements EvonyPacket {
public Double packageId = null;
public String msg = null;
public ArrayList<PackageBean> packages = null;
public String errorMsg = null;
public Integer ok = null;

public GetPackageListResponse(ASObject aso) {
packages = new ArrayList<PackageBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("packages") != null) {
Object[] objArr = (Object[]) aso.get("packages");
for(int j = 0; j < objArr.length; j++) {
packages.add(new PackageBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public GetPackageListResponse() {
}

@Override
public GetPackageListResponse clone() {
GetPackageListResponse clone = new GetPackageListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.packages != null) {
ArrayList tmpArrLst = new ArrayList<PackageBean>();

for(Object bean : packages) {
PackageBean tmpBean = (PackageBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setPackages(tmpArrLst);
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

if(this.packages != null) {
ArrayList al = new ArrayList();
for(Object obj : packages) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("packages", al);
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

public ArrayList getPackages() {
return packages;
}

public void setPackages(ArrayList packages) {
this.packages = packages;
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
