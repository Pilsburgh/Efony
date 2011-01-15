package evonyproxy.common.module.trade;

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
public class TransingTradeListResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<TradeBean> transingTrades = null;
public String errorMsg = null;
public Integer ok = null;

public TransingTradeListResponse(ASObject aso) {
transingTrades = new ArrayList<TradeBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("transingTrades") != null) {
Object[] objArr = (Object[]) aso.get("transingTrades");
for(int j = 0; j < objArr.length; j++) {
transingTrades.add(new TradeBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public TransingTradeListResponse() {
}

@Override
public TransingTradeListResponse clone() {
TransingTradeListResponse clone = new TransingTradeListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.transingTrades != null) {
ArrayList tmpArrLst = new ArrayList<TradeBean>();

for(Object bean : transingTrades) {
TradeBean tmpBean = (TradeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTransingTrades(tmpArrLst);
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

if(this.transingTrades != null) {
ArrayList al = new ArrayList();
for(Object obj : transingTrades) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("transingTrades", al);
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

public ArrayList getTransingTrades() {
return transingTrades;
}

public void setTransingTrades(ArrayList transingTrades) {
this.transingTrades = transingTrades;
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
