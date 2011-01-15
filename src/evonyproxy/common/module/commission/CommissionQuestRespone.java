package evonyproxy.common.module.commission;

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
public class CommissionQuestRespone implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<CommissionQuestBean> commissionQuestBean = null;
public String errorMsg = null;
public Integer ok = null;

public CommissionQuestRespone(ASObject aso) {
commissionQuestBean = new ArrayList<CommissionQuestBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("commissionQuestBean") != null) {
Object[] objArr = (Object[]) aso.get("commissionQuestBean");
for(int j = 0; j < objArr.length; j++) {
commissionQuestBean.add(new CommissionQuestBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public CommissionQuestRespone() {
}

@Override
public CommissionQuestRespone clone() {
CommissionQuestRespone clone = new CommissionQuestRespone();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.commissionQuestBean != null) {
ArrayList tmpArrLst = new ArrayList<CommissionQuestBean>();

for(Object bean : commissionQuestBean) {
CommissionQuestBean tmpBean = (CommissionQuestBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setCommissionQuestBean(tmpArrLst);
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

if(this.commissionQuestBean != null) {
ArrayList al = new ArrayList();
for(Object obj : commissionQuestBean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("commissionQuestBean", al);
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

public ArrayList getCommissionQuestBean() {
return commissionQuestBean;
}

public void setCommissionQuestBean(ArrayList commissionQuestBean) {
this.commissionQuestBean = commissionQuestBean;
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
