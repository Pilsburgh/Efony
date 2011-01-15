package evonyproxy.common.module.hero;

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
public class HeroListResponse implements ASObjectable {
public ArrayList<HeroBean> heros = null;
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public Integer posCount = null;
public Integer ok = null;

public HeroListResponse(ASObject aso) {
heros = new ArrayList<HeroBean>();

if(aso.get("heros") != null) {
Object[] objArr = (Object[]) aso.get("heros");
for(int j = 0; j < objArr.length; j++) {
heros.add(new HeroBean((ASObject) objArr[j]));
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

if(aso.get("posCount") != null) {
this.posCount = (Integer) aso.get("posCount");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public HeroListResponse() {
}

@Override
public HeroListResponse clone() {
HeroListResponse clone = new HeroListResponse();

if(this.heros != null) {
ArrayList tmpArrLst = new ArrayList<HeroBean>();

for(Object bean : heros) {
HeroBean tmpBean = (HeroBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setHeros(tmpArrLst);
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

if(this.posCount != null) {
clone.setPosCount(this.posCount);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.heros != null) {
ArrayList al = new ArrayList();
for(Object obj : heros) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("heros", al);
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

if(this.posCount != null) {
aso.put("posCount", posCount);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public ArrayList getHeros() {
return heros;
}

public void setHeros(ArrayList heros) {
this.heros = heros;
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

public Integer getPosCount() {
return posCount;
}

public void setPosCount(Integer posCount) {
this.posCount = posCount;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
