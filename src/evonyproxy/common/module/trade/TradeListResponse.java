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
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class TradeListResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<TradeBean> trades = null;
public String errorMsg = null;
public Integer ok = null;

public TradeListResponse(ASObject aso) {
trades = new ArrayList<TradeBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("trades") != null) {
Object[] objArr = (Object[]) aso.get("trades");
for(int j = 0; j < objArr.length; j++) {
trades.add(new TradeBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public TradeListResponse() {
}

@Override
public TradeListResponse clone() {
TradeListResponse clone = new TradeListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.trades != null) {
ArrayList tmpArrLst = new ArrayList<TradeBean>();

for(Object bean : trades) {
TradeBean tmpBean = (TradeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTrades(tmpArrLst);
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

if(this.trades != null) {
ArrayList al = new ArrayList();
for(Object obj : trades) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("trades", al);
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

public ArrayList getTrades() {
return trades;
}

public void setTrades(ArrayList trades) {
this.trades = trades;
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
