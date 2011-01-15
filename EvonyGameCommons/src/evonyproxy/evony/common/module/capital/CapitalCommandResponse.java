package evonyproxy.evony.common.module.capital;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class CapitalCommandResponse implements EvonyPacket {
public String msg = null;
public Integer targetFieldId = null;
public Double packageId = null;
public Integer castleId = null;
public String armyType = null;
public Integer amount = null;
public String errorMsg = null;
public Integer ok = null;

public CapitalCommandResponse(ASObject aso) {

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("targetFieldId") != null) {
this.targetFieldId = (Integer) aso.get("targetFieldId");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("castleId") != null) {
this.castleId = (Integer) aso.get("castleId");
}

if(aso.get("armyType") != null) {
this.armyType = (String) aso.get("armyType");
}

if(aso.get("amount") != null) {
this.amount = (Integer) aso.get("amount");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public CapitalCommandResponse() {
}

@Override
public CapitalCommandResponse clone() {
CapitalCommandResponse clone = new CapitalCommandResponse();

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.targetFieldId != null) {
clone.setTargetFieldId(this.targetFieldId);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.castleId != null) {
clone.setCastleId(this.castleId);
}

if(this.armyType != null) {
clone.setArmyType(this.armyType);
}

if(this.amount != null) {
clone.setAmount(this.amount);
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

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.targetFieldId != null) {
aso.put("targetFieldId", targetFieldId);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.castleId != null) {
aso.put("castleId", castleId);
}

if(this.armyType != null) {
aso.put("armyType", armyType);
}

if(this.amount != null) {
aso.put("amount", amount);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Integer getTargetFieldId() {
return targetFieldId;
}

public void setTargetFieldId(Integer targetFieldId) {
this.targetFieldId = targetFieldId;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public Integer getCastleId() {
return castleId;
}

public void setCastleId(Integer castleId) {
this.castleId = castleId;
}

public String getArmyType() {
return armyType;
}

public void setArmyType(String armyType) {
this.armyType = armyType;
}

public Integer getAmount() {
return amount;
}

public void setAmount(Integer amount) {
this.amount = amount;
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
