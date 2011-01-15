package evonyproxy.common.module.celeb;

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
public class CelebResponse implements ASObjectable {
public Double packageId = null;
public String msg = null;
public ArrayList<RankAllianceBean> allianceBean = null;
public ArrayList<PlayerInfoBean> playerBean = null;
public String errorMsg = null;
public Integer ok = null;

public CelebResponse(ASObject aso) {
allianceBean = new ArrayList<RankAllianceBean>();
playerBean = new ArrayList<PlayerInfoBean>();

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("allianceBean") != null) {
Object[] objArr = (Object[]) aso.get("allianceBean");
for(int j = 0; j < objArr.length; j++) {
allianceBean.add(new RankAllianceBean((ASObject) objArr[j]));
}
}

if(aso.get("playerBean") != null) {
Object[] objArr = (Object[]) aso.get("playerBean");
for(int j = 0; j < objArr.length; j++) {
playerBean.add(new PlayerInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public CelebResponse() {
}

@Override
public CelebResponse clone() {
CelebResponse clone = new CelebResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.allianceBean != null) {
ArrayList tmpArrLst = new ArrayList<RankAllianceBean>();

for(Object bean : allianceBean) {
RankAllianceBean tmpBean = (RankAllianceBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setAllianceBean(tmpArrLst);
}

if(this.playerBean != null) {
ArrayList tmpArrLst = new ArrayList<PlayerInfoBean>();

for(Object bean : playerBean) {
PlayerInfoBean tmpBean = (PlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setPlayerBean(tmpArrLst);
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

if(this.allianceBean != null) {
ArrayList al = new ArrayList();
for(Object obj : allianceBean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("allianceBean", al);
}

if(this.playerBean != null) {
ArrayList al = new ArrayList();
for(Object obj : playerBean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("playerBean", al);
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

public ArrayList getAllianceBean() {
return allianceBean;
}

public void setAllianceBean(ArrayList allianceBean) {
this.allianceBean = allianceBean;
}

public ArrayList getPlayerBean() {
return playerBean;
}

public void setPlayerBean(ArrayList playerBean) {
this.playerBean = playerBean;
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
