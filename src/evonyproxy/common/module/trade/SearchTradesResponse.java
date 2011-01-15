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
public class SearchTradesResponse implements ASObjectable {
public ArrayList<MarketTradeBean> buyers = null;
public Double packageId = null;
public ArrayList<MarketTradeBean> sellers = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;

public SearchTradesResponse(ASObject aso) {
buyers = new ArrayList<MarketTradeBean>();
sellers = new ArrayList<MarketTradeBean>();

if(aso.get("buyers") != null) {
Object[] objArr = (Object[]) aso.get("buyers");
for(int j = 0; j < objArr.length; j++) {
buyers.add(new MarketTradeBean((ASObject) objArr[j]));
}
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("sellers") != null) {
Object[] objArr = (Object[]) aso.get("sellers");
for(int j = 0; j < objArr.length; j++) {
sellers.add(new MarketTradeBean((ASObject) objArr[j]));
}
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

public SearchTradesResponse() {
}

@Override
public SearchTradesResponse clone() {
SearchTradesResponse clone = new SearchTradesResponse();

if(this.buyers != null) {
ArrayList tmpArrLst = new ArrayList<MarketTradeBean>();

for(Object bean : buyers) {
MarketTradeBean tmpBean = (MarketTradeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBuyers(tmpArrLst);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.sellers != null) {
ArrayList tmpArrLst = new ArrayList<MarketTradeBean>();

for(Object bean : sellers) {
MarketTradeBean tmpBean = (MarketTradeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setSellers(tmpArrLst);
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

if(this.buyers != null) {
ArrayList al = new ArrayList();
for(Object obj : buyers) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("buyers", al);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.sellers != null) {
ArrayList al = new ArrayList();
for(Object obj : sellers) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("sellers", al);
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

public ArrayList getBuyers() {
return buyers;
}

public void setBuyers(ArrayList buyers) {
this.buyers = buyers;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public ArrayList getSellers() {
return sellers;
}

public void setSellers(ArrayList sellers) {
this.sellers = sellers;
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
