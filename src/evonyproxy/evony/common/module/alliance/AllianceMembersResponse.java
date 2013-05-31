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
public class AllianceMembersResponse implements EvonyPacket {
public ArrayList<PlayerInfoBean> members = null;
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;

public AllianceMembersResponse(ASObject aso) {
members = new ArrayList<PlayerInfoBean>();

if(aso.get("members") != null) {
Object[] objArr = (Object[]) aso.get("members");
for(int j = 0; j < objArr.length; j++) {
members.add(new PlayerInfoBean((ASObject) objArr[j]));
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

public AllianceMembersResponse() {
}

@Override
public AllianceMembersResponse clone() {
AllianceMembersResponse clone = new AllianceMembersResponse();

if(this.members != null) {
ArrayList tmpArrLst = new ArrayList<PlayerInfoBean>();

for(Object bean : members) {
PlayerInfoBean tmpBean = (PlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setMembers(tmpArrLst);
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

if(this.members != null) {
ArrayList al = new ArrayList();
for(Object obj : members) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("members", al);
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

public ArrayList getMembers() {
return members;
}

public void setMembers(ArrayList members) {
this.members = members;
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
