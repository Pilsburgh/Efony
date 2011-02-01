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
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class HeroResponse implements ASObjectable {
public static final int FREE_HERO_STATUS = 0;
public static final int INVALID_ADD_POINT = -10;
public static final int NO_TAVERN = -7;
public static final int NO_CASTLE_FOUND = -1;
public static final int NO_HERO_FOUND = -2;
public static final int GUARD_HERO_STATUS = 2;
public static final int NO_HERO_MANSION = -5;
public static final int NOT_ENOUGH_GOLD_HIRE_HERO = -8;
public static final int HERO_IN_USE = -3;
public static final int INVALID_NAME = -4;
public static final int NO_POSITION_FOR_HERO_ = -6;
public static final int NOT_ENOUGH_GOLD_AWARD_HERO = -9;
public static final int CHIEF_HERO_STATUS = 1;
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public HeroBean hero = null;
public Integer ok = null;

public HeroResponse(ASObject aso) {

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("hero") != null) {
this.hero = new HeroBean((ASObject) aso.get("hero"));
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public HeroResponse() {
}

@Override
public HeroResponse clone() {
HeroResponse clone = new HeroResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.hero != null) {
clone.setHero(this.hero);
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

if(this.hero != null) {
aso.put("hero", hero.toASObject());
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

public HeroBean getHero() {
return hero;
}

public void setHero(HeroBean hero) {
this.hero = hero;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
