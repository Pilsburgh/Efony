package evonyproxy.evony.common.module.common;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class GetRelationshipRespone implements EvonyPacket {
public Integer declaredWarStatus = null;
public String msg = null;
public Double packageId = null;
public Boolean freshman = null;
public Integer allianceRelation = null;
public String errorMsg = null;
public Integer ok = null;
public Boolean canDeclaredWar = null;

public GetRelationshipRespone(ASObject aso) {

if(aso.get("declaredWarStatus") != null) {
this.declaredWarStatus = (Integer) aso.get("declaredWarStatus");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("freshman") != null) {
this.freshman = (Boolean) aso.get("freshman");
}

if(aso.get("allianceRelation") != null) {
this.allianceRelation = (Integer) aso.get("allianceRelation");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("canDeclaredWar") != null) {
this.canDeclaredWar = (Boolean) aso.get("canDeclaredWar");
}
}

public GetRelationshipRespone() {
}

@Override
public GetRelationshipRespone clone() {
GetRelationshipRespone clone = new GetRelationshipRespone();

if(this.declaredWarStatus != null) {
clone.setDeclaredWarStatus(this.declaredWarStatus);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.freshman != null) {
clone.setFreshman(this.freshman);
}

if(this.allianceRelation != null) {
clone.setAllianceRelation(this.allianceRelation);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.canDeclaredWar != null) {
clone.setCanDeclaredWar(this.canDeclaredWar);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.declaredWarStatus != null) {
aso.put("declaredWarStatus", declaredWarStatus);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.freshman != null) {
aso.put("freshman", freshman);
}

if(this.allianceRelation != null) {
aso.put("allianceRelation", allianceRelation);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.canDeclaredWar != null) {
aso.put("canDeclaredWar", canDeclaredWar);
}

return aso;
}

public Integer getDeclaredWarStatus() {
return declaredWarStatus;
}

public void setDeclaredWarStatus(Integer declaredWarStatus) {
this.declaredWarStatus = declaredWarStatus;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public Boolean getFreshman() {
return freshman;
}

public void setFreshman(Boolean freshman) {
this.freshman = freshman;
}

public Integer getAllianceRelation() {
return allianceRelation;
}

public void setAllianceRelation(Integer allianceRelation) {
this.allianceRelation = allianceRelation;
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

public Boolean getCanDeclaredWar() {
return canDeclaredWar;
}

public void setCanDeclaredWar(Boolean canDeclaredWar) {
this.canDeclaredWar = canDeclaredWar;
}
}
