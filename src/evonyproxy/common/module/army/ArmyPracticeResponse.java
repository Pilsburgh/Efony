package evonyproxy.common.module.army;

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
public class ArmyPracticeResponse implements ASObjectable {
public static final int ARMY_PRACTICE_RESULT_GUARD_WIN = -1;
public static final int ARMY_PRACTICE_RESULT_ATTACK_WIN = 1;
public String msg = null;
public TroopBean attackLostTroop = null;
public Double packageId = null;
public Integer round = null;
public TroopBean defendLostTroop = null;
public String errorMsg = null;
public Integer ok = null;
public Integer result = null;

public ArmyPracticeResponse(ASObject aso) {

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("attackLostTroop") != null) {
this.attackLostTroop = new TroopBean((ASObject) aso.get("attackLostTroop"));
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("round") != null) {
this.round = (Integer) aso.get("round");
}

if(aso.get("defendLostTroop") != null) {
this.defendLostTroop = new TroopBean((ASObject) aso.get("defendLostTroop"));
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("result") != null) {
this.result = (Integer) aso.get("result");
}
}

public ArmyPracticeResponse() {
}

@Override
public ArmyPracticeResponse clone() {
ArmyPracticeResponse clone = new ArmyPracticeResponse();

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.attackLostTroop != null) {
clone.setAttackLostTroop(this.attackLostTroop);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.round != null) {
clone.setRound(this.round);
}

if(this.defendLostTroop != null) {
clone.setDefendLostTroop(this.defendLostTroop);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.result != null) {
clone.setResult(this.result);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.attackLostTroop != null) {
aso.put("attackLostTroop", attackLostTroop.toASObject());
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.round != null) {
aso.put("round", round);
}

if(this.defendLostTroop != null) {
aso.put("defendLostTroop", defendLostTroop.toASObject());
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.result != null) {
aso.put("result", result);
}

return aso;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public TroopBean getAttackLostTroop() {
return attackLostTroop;
}

public void setAttackLostTroop(TroopBean attackLostTroop) {
this.attackLostTroop = attackLostTroop;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public Integer getRound() {
return round;
}

public void setRound(Integer round) {
this.round = round;
}

public TroopBean getDefendLostTroop() {
return defendLostTroop;
}

public void setDefendLostTroop(TroopBean defendLostTroop) {
this.defendLostTroop = defendLostTroop;
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

public Integer getResult() {
return result;
}

public void setResult(Integer result) {
this.result = result;
}
}
