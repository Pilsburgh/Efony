package evonyproxy.common.module.common;

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
public class MapCastleResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;
public ArrayList<MapCastleBean> castle = null;

public MapCastleResponse(ASObject aso) {
castle = new ArrayList<MapCastleBean>();

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

if(aso.get("castle") != null) {
Object[] objArr = (Object[]) aso.get("castle");
for(int j = 0; j < objArr.length; j++) {
castle.add(new MapCastleBean((ASObject) objArr[j]));
}
}
}

public MapCastleResponse() {
}

@Override
public MapCastleResponse clone() {
MapCastleResponse clone = new MapCastleResponse();

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

if(this.castle != null) {
ArrayList tmpArrLst = new ArrayList<MapCastleBean>();

for(Object bean : castle) {
MapCastleBean tmpBean = (MapCastleBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setCastle(tmpArrLst);
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

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.castle != null) {
ArrayList al = new ArrayList();
for(Object obj : castle) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("castle", al);
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

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}

public ArrayList getCastle() {
return castle;
}

public void setCastle(ArrayList castle) {
this.castle = castle;
}
}
