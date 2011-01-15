package evonyproxy.common.module.colony;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class ColonyLevyeRespone implements ASObjectable {
public String msg = null;
public Double packageId = null;
public String armyType = null;
public Integer amount = null;
public String errorMsg = null;
public Integer ok = null;

public ColonyLevyeRespone(ASObject aso) {

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
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

public ColonyLevyeRespone() {
}

@Override
public ColonyLevyeRespone clone() {
ColonyLevyeRespone clone = new ColonyLevyeRespone();

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
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

if(this.packageId != null) {
aso.put("packageId", packageId);
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

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
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
