package evonyproxy.common.module.tech;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;
import evonyproxy.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class AvailableResearchListResponse implements ASObjectable {
public Double packageId = null;
public Integer academyCount = null;
public String msg = null;
public ArrayList<AvailableResearchListBean> acailableResearchBeans = null;
public String errorMsg = null;
public Integer ok = null;

public AvailableResearchListResponse(ASObject aso) {
acailableResearchBeans = new ArrayList<AvailableResearchListBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("academyCount") != null) {
this.academyCount = (Integer) aso.get("academyCount");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("acailableResearchBeans") != null) {
Object[] objArr = (Object[]) aso.get("acailableResearchBeans");
for(int j = 0; j < objArr.length; j++) {
acailableResearchBeans.add(new AvailableResearchListBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public AvailableResearchListResponse() {
}

@Override
public AvailableResearchListResponse clone() {
AvailableResearchListResponse clone = new AvailableResearchListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.academyCount != null) {
clone.setAcademyCount(this.academyCount);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.acailableResearchBeans != null) {
ArrayList tmpArrLst = new ArrayList<AvailableResearchListBean>();

for(Object bean : acailableResearchBeans) {
AvailableResearchListBean tmpBean = (AvailableResearchListBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setAcailableResearchBeans(tmpArrLst);
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

if(this.academyCount != null) {
aso.put("academyCount", academyCount);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.acailableResearchBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : acailableResearchBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("acailableResearchBeans", al);
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

public Integer getAcademyCount() {
return academyCount;
}

public void setAcademyCount(Integer academyCount) {
this.academyCount = academyCount;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public ArrayList getAcailableResearchBeans() {
return acailableResearchBeans;
}

public void setAcailableResearchBeans(ArrayList acailableResearchBeans) {
this.acailableResearchBeans = acailableResearchBeans;
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
