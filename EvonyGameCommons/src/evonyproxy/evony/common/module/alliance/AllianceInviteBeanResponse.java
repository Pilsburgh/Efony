package evonyproxy.evony.common.module.alliance;

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
public class AllianceInviteBeanResponse implements EvonyPacket {
public Double packageId = null;
public String msg = null;
public ArrayList<AllianceAddPlayerInfoBean> allianceAddPlayerInfoBeanList = null;
public String errorMsg = null;
public Integer ok = null;

public AllianceInviteBeanResponse(ASObject aso) {
allianceAddPlayerInfoBeanList = new ArrayList<AllianceAddPlayerInfoBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("allianceAddPlayerInfoBeanList") != null) {
Object[] objArr = (Object[]) aso.get("allianceAddPlayerInfoBeanList");
for(int j = 0; j < objArr.length; j++) {
allianceAddPlayerInfoBeanList.add(new AllianceAddPlayerInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public AllianceInviteBeanResponse() {
}

@Override
public AllianceInviteBeanResponse clone() {
AllianceInviteBeanResponse clone = new AllianceInviteBeanResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.allianceAddPlayerInfoBeanList != null) {
ArrayList tmpArrLst = new ArrayList<AllianceAddPlayerInfoBean>();

for(Object bean : allianceAddPlayerInfoBeanList) {
AllianceAddPlayerInfoBean tmpBean = (AllianceAddPlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setAllianceAddPlayerInfoBeanList(tmpArrLst);
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

if(this.allianceAddPlayerInfoBeanList != null) {
ArrayList al = new ArrayList();
for(Object obj : allianceAddPlayerInfoBeanList) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("allianceAddPlayerInfoBeanList", al);
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

public ArrayList getAllianceAddPlayerInfoBeanList() {
return allianceAddPlayerInfoBeanList;
}

public void setAllianceAddPlayerInfoBeanList(ArrayList allianceAddPlayerInfoBeanList) {
this.allianceAddPlayerInfoBeanList = allianceAddPlayerInfoBeanList;
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
