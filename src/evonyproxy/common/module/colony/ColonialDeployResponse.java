package evonyproxy.common.module.colony;

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
public class ColonialDeployResponse implements ASObjectable {
public Double reduceCoolDown = null;
public Double packageId = null;
public String msg = null;
public TroopBean troopBean = null;
public String errorMsg = null;
public Integer ok = null;

public ColonialDeployResponse(ASObject aso) {

if(aso.get("reduceCoolDown") != null) {
this.reduceCoolDown = (Double) aso.get("reduceCoolDown");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("troopBean") != null) {
this.troopBean = new TroopBean((ASObject) aso.get("troopBean"));
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public ColonialDeployResponse() {
}

@Override
public ColonialDeployResponse clone() {
ColonialDeployResponse clone = new ColonialDeployResponse();

if(this.reduceCoolDown != null) {
clone.setReduceCoolDown(this.reduceCoolDown);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.troopBean != null) {
clone.setTroopBean(this.troopBean);
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

if(this.reduceCoolDown != null) {
aso.put("reduceCoolDown", reduceCoolDown);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.troopBean != null) {
aso.put("troopBean", troopBean.toASObject());
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public Double getReduceCoolDown() {
return reduceCoolDown;
}

public void setReduceCoolDown(Double reduceCoolDown) {
this.reduceCoolDown = reduceCoolDown;
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

public TroopBean getTroopBean() {
return troopBean;
}

public void setTroopBean(TroopBean troopBean) {
this.troopBean = troopBean;
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
