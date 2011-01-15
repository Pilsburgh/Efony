package evonyproxy.common.module.npchero;

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
public class NpcHeroListResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<HeroBean> simpleNpcHeros = null;
public ArrayList<HeroBean> npcHeros = null;
public String errorMsg = null;
public Integer ok = null;

public NpcHeroListResponse(ASObject aso) {
simpleNpcHeros = new ArrayList<HeroBean>();
npcHeros = new ArrayList<HeroBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("simpleNpcHeros") != null) {
Object[] objArr = (Object[]) aso.get("simpleNpcHeros");
for(int j = 0; j < objArr.length; j++) {
simpleNpcHeros.add(new HeroBean((ASObject) objArr[j]));
}
}

if(aso.get("npcHeros") != null) {
Object[] objArr = (Object[]) aso.get("npcHeros");
for(int j = 0; j < objArr.length; j++) {
npcHeros.add(new HeroBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public NpcHeroListResponse() {
}

@Override
public NpcHeroListResponse clone() {
NpcHeroListResponse clone = new NpcHeroListResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.simpleNpcHeros != null) {
ArrayList tmpArrLst = new ArrayList<HeroBean>();

for(Object bean : simpleNpcHeros) {
HeroBean tmpBean = (HeroBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setSimpleNpcHeros(tmpArrLst);
}

if(this.npcHeros != null) {
ArrayList tmpArrLst = new ArrayList<HeroBean>();

for(Object bean : npcHeros) {
HeroBean tmpBean = (HeroBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setNpcHeros(tmpArrLst);
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

if(this.simpleNpcHeros != null) {
ArrayList al = new ArrayList();
for(Object obj : simpleNpcHeros) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("simpleNpcHeros", al);
}

if(this.npcHeros != null) {
ArrayList al = new ArrayList();
for(Object obj : npcHeros) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("npcHeros", al);
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

public ArrayList getSimpleNpcHeros() {
return simpleNpcHeros;
}

public void setSimpleNpcHeros(ArrayList simpleNpcHeros) {
this.simpleNpcHeros = simpleNpcHeros;
}

public ArrayList getNpcHeros() {
return npcHeros;
}

public void setNpcHeros(ArrayList npcHeros) {
this.npcHeros = npcHeros;
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
