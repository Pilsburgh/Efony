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
*/
public class MapInfoSimpleResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public Integer y1 = null;
public Integer y2 = null;
public Integer ok = null;
public ArrayList<CastleBean> castles = null;
public String errorMsg = null;
public String mapStr = null;
public Integer x1 = null;
public Integer x2 = null;

public MapInfoSimpleResponse(ASObject aso) {
castles = new ArrayList<CastleBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("y1") != null) {
this.y1 = (Integer) aso.get("y1");
}

if(aso.get("y2") != null) {
this.y2 = (Integer) aso.get("y2");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("castles") != null) {
Object[] objArr = (Object[]) aso.get("castles");
for(int j = 0; j < objArr.length; j++) {
castles.add(new CastleBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("mapStr") != null) {
this.mapStr = (String) aso.get("mapStr");
}

if(aso.get("x1") != null) {
this.x1 = (Integer) aso.get("x1");
}

if(aso.get("x2") != null) {
this.x2 = (Integer) aso.get("x2");
}
}

public MapInfoSimpleResponse() {
}

@Override
public MapInfoSimpleResponse clone() {
MapInfoSimpleResponse clone = new MapInfoSimpleResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.y1 != null) {
clone.setY1(this.y1);
}

if(this.y2 != null) {
clone.setY2(this.y2);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.castles != null) {
ArrayList tmpArrLst = new ArrayList<CastleBean>();

for(Object bean : castles) {
CastleBean tmpBean = (CastleBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setCastles(tmpArrLst);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.mapStr != null) {
clone.setMapStr(this.mapStr);
}

if(this.x1 != null) {
clone.setX1(this.x1);
}

if(this.x2 != null) {
clone.setX2(this.x2);
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

if(this.y1 != null) {
aso.put("y1", y1);
}

if(this.y2 != null) {
aso.put("y2", y2);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.castles != null) {
ArrayList al = new ArrayList();
for(Object obj : castles) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("castles", al);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.mapStr != null) {
aso.put("mapStr", mapStr);
}

if(this.x1 != null) {
aso.put("x1", x1);
}

if(this.x2 != null) {
aso.put("x2", x2);
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

public Integer getY1() {
return y1;
}

public void setY1(Integer y1) {
this.y1 = y1;
}

public Integer getY2() {
return y2;
}

public void setY2(Integer y2) {
this.y2 = y2;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}

public ArrayList getCastles() {
return castles;
}

public void setCastles(ArrayList castles) {
this.castles = castles;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public String getMapStr() {
return mapStr;
}

public void setMapStr(String mapStr) {
this.mapStr = mapStr;
}

public Integer getX1() {
return x1;
}

public void setX1(Integer x1) {
this.x1 = x1;
}

public Integer getX2() {
return x2;
}

public void setX2(Integer x2) {
this.x2 = x2;
}
}
