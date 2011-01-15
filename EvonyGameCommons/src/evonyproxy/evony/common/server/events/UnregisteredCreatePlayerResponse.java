package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;
import evonyproxy.evony.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class UnregisteredCreatePlayerResponse implements EvonyPacket {
public static final int CREATE_RESULT_HAVE_CREATED = -3;
public static final int CREATE_RESULT_ZONE_FULL = -2;
public static final int CREATE_RESULT_NAME_DUP = -1;
public Double packageId = null;
public PlayerBean player = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;

public UnregisteredCreatePlayerResponse(ASObject aso) {

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("player") != null) {
this.player = new PlayerBean((ASObject) aso.get("player"));
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public UnregisteredCreatePlayerResponse() {
}

@Override
public UnregisteredCreatePlayerResponse clone() {
UnregisteredCreatePlayerResponse clone = new UnregisteredCreatePlayerResponse();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.player != null) {
clone.setPlayer(this.player);
}

if(this.msg != null) {
clone.setMsg(this.msg);
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

if(this.player != null) {
aso.put("player", player.toASObject());
}

if(this.msg != null) {
aso.put("msg", msg);
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

public PlayerBean getPlayer() {
return player;
}

public void setPlayer(PlayerBean player) {
this.player = player;
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

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
