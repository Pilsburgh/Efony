package evonyproxy.common.module.friend;

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
public class FriendResponse implements ASObjectable {
public Double packageId = null;
public ArrayList<PlayerInfoBean> blockArr = null;
public String msg = null;
public ArrayList<PlayerInfoBean> friendArr = null;
public String errorMsg = null;
public Integer ok = null;

public FriendResponse(ASObject aso) {
blockArr = new ArrayList<PlayerInfoBean>();
friendArr = new ArrayList<PlayerInfoBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("blockArr") != null) {
Object[] objArr = (Object[]) aso.get("blockArr");
for(int j = 0; j < objArr.length; j++) {
blockArr.add(new PlayerInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("friendArr") != null) {
Object[] objArr = (Object[]) aso.get("friendArr");
for(int j = 0; j < objArr.length; j++) {
friendArr.add(new PlayerInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public FriendResponse() {
}

@Override
public FriendResponse clone() {
FriendResponse clone = new FriendResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.blockArr != null) {
ArrayList tmpArrLst = new ArrayList<PlayerInfoBean>();

for(Object bean : blockArr) {
PlayerInfoBean tmpBean = (PlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBlockArr(tmpArrLst);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.friendArr != null) {
ArrayList tmpArrLst = new ArrayList<PlayerInfoBean>();

for(Object bean : friendArr) {
PlayerInfoBean tmpBean = (PlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setFriendArr(tmpArrLst);
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

if(this.blockArr != null) {
ArrayList al = new ArrayList();
for(Object obj : blockArr) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("blockArr", al);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.friendArr != null) {
ArrayList al = new ArrayList();
for(Object obj : friendArr) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("friendArr", al);
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

public ArrayList getBlockArr() {
return blockArr;
}

public void setBlockArr(ArrayList blockArr) {
this.blockArr = blockArr;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public ArrayList getFriendArr() {
return friendArr;
}

public void setFriendArr(ArrayList friendArr) {
this.friendArr = friendArr;
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
