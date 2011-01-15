package evonyproxy.evony.common.module.rank;

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
public class RankHeroResponse implements EvonyPacket {
public Double packageId = null;
public String msg = null;
public Integer pageNo = null;
public ArrayList<HeroBean> beans = null;
public Integer pageSize = null;
public String errorMsg = null;
public Integer totalPage = null;
public Integer ok = null;

public RankHeroResponse(ASObject aso) {
beans = new ArrayList<HeroBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("pageNo") != null) {
this.pageNo = (Integer) aso.get("pageNo");
}

if(aso.get("beans") != null) {
Object[] objArr = (Object[]) aso.get("beans");
for(int j = 0; j < objArr.length; j++) {
beans.add(new HeroBean((ASObject) objArr[j]));
}
}

if(aso.get("pageSize") != null) {
this.pageSize = (Integer) aso.get("pageSize");
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

public RankHeroResponse() {
}

@Override
public RankHeroResponse clone() {
RankHeroResponse clone = new RankHeroResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.pageNo != null) {
clone.setPageNo(this.pageNo);
}

if(this.beans != null) {
ArrayList tmpArrLst = new ArrayList<HeroBean>();

for(Object bean : beans) {
HeroBean tmpBean = (HeroBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBeans(tmpArrLst);
}

if(this.pageSize != null) {
clone.setPageSize(this.pageSize);
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

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.pageNo != null) {
aso.put("pageNo", pageNo);
}

if(this.beans != null) {
ArrayList al = new ArrayList();
for(Object obj : beans) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("beans", al);
}

if(this.pageSize != null) {
aso.put("pageSize", pageSize);
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

public ArrayList getBeans() {
return beans;
}

public void setBeans(ArrayList beans) {
this.beans = beans;
}

public Integer getPageSize() {
return pageSize;
}

public void setPageSize(Integer pageSize) {
this.pageSize = pageSize;
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
