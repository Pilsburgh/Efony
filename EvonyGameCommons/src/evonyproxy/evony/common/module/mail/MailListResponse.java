package evonyproxy.evony.common.module.mail;

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
public class MailListResponse implements EvonyPacket {
public Double packageId = null;
public String msg = null;
public Integer pageNo = null;
public String errorMsg = null;
public Integer totalPage = null;
public Integer ok = null;
public ArrayList<MailBean> mails = null;

public MailListResponse(ASObject aso) {
mails = new ArrayList<MailBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
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

if(aso.get("mails") != null) {
Object[] objArr = (Object[]) aso.get("mails");
for(int j = 0; j < objArr.length; j++) {
mails.add(new MailBean((ASObject) objArr[j]));
}
}
}

public MailListResponse() {
}

@Override
public MailListResponse clone() {
MailListResponse clone = new MailListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
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

if(this.mails != null) {
ArrayList tmpArrLst = new ArrayList<MailBean>();

for(Object bean : mails) {
MailBean tmpBean = (MailBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setMails(tmpArrLst);
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

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.totalPage != null) {
aso.put("totalPage", totalPage);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.mails != null) {
ArrayList al = new ArrayList();
for(Object obj : mails) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("mails", al);
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

public ArrayList getMails() {
return mails;
}

public void setMails(ArrayList mails) {
this.mails = mails;
}
}
