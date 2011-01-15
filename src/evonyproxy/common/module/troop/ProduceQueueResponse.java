package evonyproxy.common.module.troop;

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
public class ProduceQueueResponse implements ASObjectable {
public Double packageId = null;
public Integer ok = null;
public ArrayList<AllProduceBean> allProduceQueue = null;
public String msg = null;
public String errorMsg = null;

public ProduceQueueResponse(ASObject aso) {
allProduceQueue = new ArrayList<AllProduceBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("allProduceQueue") != null) {
Object[] objArr = (Object[]) aso.get("allProduceQueue");
for(int j = 0; j < objArr.length; j++) {
allProduceQueue.add(new AllProduceBean((ASObject) objArr[j]));
}
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}
}

public ProduceQueueResponse() {
}

@Override
public ProduceQueueResponse clone() {
ProduceQueueResponse clone = new ProduceQueueResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.allProduceQueue != null) {
ArrayList tmpArrLst = new ArrayList<AllProduceBean>();

for(Object bean : allProduceQueue) {
AllProduceBean tmpBean = (AllProduceBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setAllProduceQueue(tmpArrLst);
}

if(this.msg != null) {
clone.setMsg(this.msg);
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

if(this.allProduceQueue != null) {
ArrayList al = new ArrayList();
for(Object obj : allProduceQueue) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("allProduceQueue", al);
}

if(this.msg != null) {
aso.put("msg", msg);
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

public ArrayList getAllProduceQueue() {
return allProduceQueue;
}

public void setAllProduceQueue(ArrayList allProduceQueue) {
this.allProduceQueue = allProduceQueue;
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
}
