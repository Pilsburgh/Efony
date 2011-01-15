package evonyproxy.common.module.castle;

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
public class CastleSignResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public ArrayList<CastleSignInfoBean> castleSignInfoArr = null;
public Integer ok = null;

public CastleSignResponse(ASObject aso) {
castleSignInfoArr = new ArrayList<CastleSignInfoBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("castleSignInfoArr") != null) {
Object[] objArr = (Object[]) aso.get("castleSignInfoArr");
for(int j = 0; j < objArr.length; j++) {
castleSignInfoArr.add(new CastleSignInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public CastleSignResponse() {
}

@Override
public CastleSignResponse clone() {
CastleSignResponse clone = new CastleSignResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.castleSignInfoArr != null) {
ArrayList tmpArrLst = new ArrayList<CastleSignInfoBean>();

for(Object bean : castleSignInfoArr) {
CastleSignInfoBean tmpBean = (CastleSignInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setCastleSignInfoArr(tmpArrLst);
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

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.castleSignInfoArr != null) {
ArrayList al = new ArrayList();
for(Object obj : castleSignInfoArr) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("castleSignInfoArr", al);
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

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public ArrayList getCastleSignInfoArr() {
return castleSignInfoArr;
}

public void setCastleSignInfoArr(ArrayList castleSignInfoArr) {
this.castleSignInfoArr = castleSignInfoArr;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
