package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class AllianceChatMsg implements EvonyPacket {
public String msg = null;
public Integer languageType = null;
public String fromUser = null;
public Integer ownitemid = null;

public AllianceChatMsg(ASObject aso) {

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("languageType") != null) {
this.languageType = (Integer) aso.get("languageType");
}

if(aso.get("fromUser") != null) {
this.fromUser = (String) aso.get("fromUser");
}

if(aso.get("ownitemid") != null) {
this.ownitemid = (Integer) aso.get("ownitemid");
}
}

public AllianceChatMsg() {
}

@Override
public AllianceChatMsg clone() {
AllianceChatMsg clone = new AllianceChatMsg();

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.languageType != null) {
clone.setLanguageType(this.languageType);
}

if(this.fromUser != null) {
clone.setFromUser(this.fromUser);
}

if(this.ownitemid != null) {
clone.setOwnitemid(this.ownitemid);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.languageType != null) {
aso.put("languageType", languageType);
}

if(this.fromUser != null) {
aso.put("fromUser", fromUser);
}

if(this.ownitemid != null) {
aso.put("ownitemid", ownitemid);
}

return aso;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Integer getLanguageType() {
return languageType;
}

public void setLanguageType(Integer languageType) {
this.languageType = languageType;
}

public String getFromUser() {
return fromUser;
}

public void setFromUser(String fromUser) {
this.fromUser = fromUser;
}

public Integer getOwnitemid() {
return ownitemid;
}

public void setOwnitemid(Integer ownitemid) {
this.ownitemid = ownitemid;
}
}
