package evonyproxy.evony.common.module.gamblingranking;

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
public class GamblingRankingRespone implements EvonyPacket {
public Double packageId = null;
public ArrayList<GamblingRankingBean> gamblingRankingBeans = null;
public String msg = null;
public Integer pageNo = null;
public String errorMsg = null;
public Integer totalPage = null;
public Integer ok = null;

public GamblingRankingRespone(ASObject aso) {
gamblingRankingBeans = new ArrayList<GamblingRankingBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("gamblingRankingBeans") != null) {
Object[] objArr = (Object[]) aso.get("gamblingRankingBeans");
for(int j = 0; j < objArr.length; j++) {
gamblingRankingBeans.add(new GamblingRankingBean((ASObject) objArr[j]));
}
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("pageNo") != null) {
this.pageNo = (Integer) aso.get("pageNo");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("totalPage") != null) {
this.totalPage = (Integer) aso.get("totalPage");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public GamblingRankingRespone() {
}

@Override
public GamblingRankingRespone clone() {
GamblingRankingRespone clone = new GamblingRankingRespone();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.gamblingRankingBeans != null) {
ArrayList tmpArrLst = new ArrayList<GamblingRankingBean>();

for(Object bean : gamblingRankingBeans) {
GamblingRankingBean tmpBean = (GamblingRankingBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setGamblingRankingBeans(tmpArrLst);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.pageNo != null) {
clone.setPageNo(this.pageNo);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.totalPage != null) {
clone.setTotalPage(this.totalPage);
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

if(this.gamblingRankingBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : gamblingRankingBeans) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("gamblingRankingBeans", al);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.pageNo != null) {
aso.put("pageNo", pageNo);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.totalPage != null) {
aso.put("totalPage", totalPage);
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

public ArrayList getGamblingRankingBeans() {
return gamblingRankingBeans;
}

public void setGamblingRankingBeans(ArrayList gamblingRankingBeans) {
this.gamblingRankingBeans = gamblingRankingBeans;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Integer getPageNo() {
return pageNo;
}

public void setPageNo(Integer pageNo) {
this.pageNo = pageNo;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public Integer getTotalPage() {
return totalPage;
}

public void setTotalPage(Integer totalPage) {
this.totalPage = totalPage;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
