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
public class ChannelChatMsg implements EvonyPacket {
public String msg = null;
public String channel = null;
public Integer languageType = null;
public Integer ownitemid = null;
public String fromUser = null;

public ChannelChatMsg(ASObject aso) {

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("channel") != null) {
this.channel = (String) aso.get("channel");
}

if(aso.get("languageType") != null) {
this.languageType = (Integer) aso.get("languageType");
}

if(aso.get("ownitemid") != null) {
this.ownitemid = (Integer) aso.get("ownitemid");
}

if(aso.get("fromUser") != null) {
this.fromUser = (String) aso.get("fromUser");
}
}

public ChannelChatMsg() {
}

@Override
public ChannelChatMsg clone() {
ChannelChatMsg clone = new ChannelChatMsg();

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.channel != null) {
clone.setChannel(this.channel);
}

if(this.languageType != null) {
clone.setLanguageType(this.languageType);
}

if(this.ownitemid != null) {
clone.setOwnitemid(this.ownitemid);
}

if(this.fromUser != null) {
clone.setFromUser(this.fromUser);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.channel != null) {
aso.put("channel", channel);
}

if(this.languageType != null) {
aso.put("languageType", languageType);
}

if(this.ownitemid != null) {
aso.put("ownitemid", ownitemid);
}

if(this.fromUser != null) {
aso.put("fromUser", fromUser);
}

return aso;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public String getChannel() {
return channel;
}

public void setChannel(String channel) {
this.channel = channel;
}

public Integer getLanguageType() {
return languageType;
}

public void setLanguageType(Integer languageType) {
this.languageType = languageType;
}

public Integer getOwnitemid() {
return ownitemid;
}

public void setOwnitemid(Integer ownitemid) {
this.ownitemid = ownitemid;
}

public String getFromUser() {
return fromUser;
}

public void setFromUser(String fromUser) {
this.fromUser = fromUser;
}
}
