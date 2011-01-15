package evonyproxy.common.module.alliance;

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
public class HasAllianceResponse implements ASObjectable {
public Double packageId = null;
public ArrayList<UnitAlliance> middleList = null;
public IndexAllianceInfoBean indexAllianceInfoBean = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;
public Double serialVersionUID = null;
public ArrayList<UnitAlliance> friendlyList = null;
public ArrayList<UnitAlliance> enemyList = null;

public HasAllianceResponse(ASObject aso) {
middleList = new ArrayList<UnitAlliance>();
friendlyList = new ArrayList<UnitAlliance>();
enemyList = new ArrayList<UnitAlliance>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("middleList") != null) {
Object[] objArr = (Object[]) aso.get("middleList");
for(int j = 0; j < objArr.length; j++) {
middleList.add(new UnitAlliance((ASObject) objArr[j]));
}
}

if(aso.get("indexAllianceInfoBean") != null) {
this.indexAllianceInfoBean = new IndexAllianceInfoBean((ASObject) aso.get("indexAllianceInfoBean"));
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

if(aso.get("serialVersionUID") != null) {
this.serialVersionUID = (Double) aso.get("serialVersionUID");
}

if(aso.get("friendlyList") != null) {
Object[] objArr = (Object[]) aso.get("friendlyList");
for(int j = 0; j < objArr.length; j++) {
friendlyList.add(new UnitAlliance((ASObject) objArr[j]));
}
}

if(aso.get("enemyList") != null) {
Object[] objArr = (Object[]) aso.get("enemyList");
for(int j = 0; j < objArr.length; j++) {
enemyList.add(new UnitAlliance((ASObject) objArr[j]));
}
}
}

public HasAllianceResponse() {
}

@Override
public HasAllianceResponse clone() {
HasAllianceResponse clone = new HasAllianceResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.middleList != null) {
ArrayList tmpArrLst = new ArrayList<UnitAlliance>();

for(Object bean : middleList) {
UnitAlliance tmpBean = (UnitAlliance) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setMiddleList(tmpArrLst);
}

if(this.indexAllianceInfoBean != null) {
clone.setIndexAllianceInfoBean(this.indexAllianceInfoBean);
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

if(this.serialVersionUID != null) {
clone.setSerialVersionUID(this.serialVersionUID);
}

if(this.friendlyList != null) {
ArrayList tmpArrLst = new ArrayList<UnitAlliance>();

for(Object bean : friendlyList) {
UnitAlliance tmpBean = (UnitAlliance) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setFriendlyList(tmpArrLst);
}

if(this.enemyList != null) {
ArrayList tmpArrLst = new ArrayList<UnitAlliance>();

for(Object bean : enemyList) {
UnitAlliance tmpBean = (UnitAlliance) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setEnemyList(tmpArrLst);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.middleList != null) {
ArrayList al = new ArrayList();
for(Object obj : middleList) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("middleList", al);
}

if(this.indexAllianceInfoBean != null) {
aso.put("indexAllianceInfoBean", indexAllianceInfoBean.toASObject());
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

if(this.serialVersionUID != null) {
aso.put("serialVersionUID", serialVersionUID);
}

if(this.friendlyList != null) {
ArrayList al = new ArrayList();
for(Object obj : friendlyList) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("friendlyList", al);
}

if(this.enemyList != null) {
ArrayList al = new ArrayList();
for(Object obj : enemyList) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("enemyList", al);
}

return aso;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public ArrayList getMiddleList() {
return middleList;
}

public void setMiddleList(ArrayList middleList) {
this.middleList = middleList;
}

public IndexAllianceInfoBean getIndexAllianceInfoBean() {
return indexAllianceInfoBean;
}

public void setIndexAllianceInfoBean(IndexAllianceInfoBean indexAllianceInfoBean) {
this.indexAllianceInfoBean = indexAllianceInfoBean;
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

public Double getSerialVersionUID() {
return serialVersionUID;
}

public void setSerialVersionUID(Double serialVersionUID) {
this.serialVersionUID = serialVersionUID;
}

public ArrayList getFriendlyList() {
return friendlyList;
}

public void setFriendlyList(ArrayList friendlyList) {
this.friendlyList = friendlyList;
}

public ArrayList getEnemyList() {
return enemyList;
}

public void setEnemyList(ArrayList enemyList) {
this.enemyList = enemyList;
}
}
