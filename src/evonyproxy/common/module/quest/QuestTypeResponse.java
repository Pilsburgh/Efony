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
public class QuestTypeResponse implements ASObjectable {
public ArrayList<QuestTypeBean> types = null;
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;

public QuestTypeResponse(ASObject aso) {
types = new ArrayList<QuestTypeBean>();

if(aso.get("types") != null) {
Object[] objArr = (Object[]) aso.get("types");
for(int j = 0; j < objArr.length; j++) {
types.add(new QuestTypeBean((ASObject) objArr[j]));
}
}

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
}

public QuestTypeResponse() {
}

@Override
public QuestTypeResponse clone() {
QuestTypeResponse clone = new QuestTypeResponse();

if(this.types != null) {
ArrayList tmpArrLst = new ArrayList<QuestTypeBean>();

for(Object bean : types) {
QuestTypeBean tmpBean = (QuestTypeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTypes(tmpArrLst);
}

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

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.types != null) {
ArrayList al = new ArrayList();
for(Object obj : types) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("types", al);
}

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

return aso;
}

public ArrayList getTypes() {
return types;
}

public void setTypes(ArrayList types) {
this.types = types;
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
}
