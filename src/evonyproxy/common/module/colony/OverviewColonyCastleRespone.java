package evonyproxy.common.module.colony;

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
public class OverviewColonyCastleRespone implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<BuildingBean> buildingBean = null;
public String errorMsg = null;
public Integer ok = null;

public OverviewColonyCastleRespone(ASObject aso) {
buildingBean = new ArrayList<BuildingBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("buildingBean") != null) {
Object[] objArr = (Object[]) aso.get("buildingBean");
for(int j = 0; j < objArr.length; j++) {
buildingBean.add(new BuildingBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public OverviewColonyCastleRespone() {
}

@Override
public OverviewColonyCastleRespone clone() {
OverviewColonyCastleRespone clone = new OverviewColonyCastleRespone();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.buildingBean != null) {
ArrayList tmpArrLst = new ArrayList<BuildingBean>();

for(Object bean : buildingBean) {
BuildingBean tmpBean = (BuildingBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBuildingBean(tmpArrLst);
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

if(this.buildingBean != null) {
ArrayList al = new ArrayList();
for(Object obj : buildingBean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("buildingBean", al);
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

public ArrayList getBuildingBean() {
return buildingBean;
}

public void setBuildingBean(ArrayList buildingBean) {
this.buildingBean = buildingBean;
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
