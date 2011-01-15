package evonyproxy.evony.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class MailBean implements EvonyPacket {
private Integer targetId = null;
private Integer type_id = null;
private String sender = null;
private String receiveTime = null;
private Integer mailid = null;
private Integer playerId = null;
private Boolean selected = null;
private Integer isRead = null;
private String receiver = null;
private String title = null;

public MailBean(ASObject aso) {

if(aso.get("targetId") != null) {
this.targetId = (Integer) aso.get("targetId");
}

if(aso.get("type_id") != null) {
this.type_id = (Integer) aso.get("type_id");
}

if(aso.get("sender") != null) {
this.sender = (String) aso.get("sender");
}

if(aso.get("receiveTime") != null) {
this.receiveTime = (String) aso.get("receiveTime");
}

if(aso.get("mailid") != null) {
this.mailid = (Integer) aso.get("mailid");
}

if(aso.get("playerId") != null) {
this.playerId = (Integer) aso.get("playerId");
}

if(aso.get("selected") != null) {
this.selected = (Boolean) aso.get("selected");
}

if(aso.get("isRead") != null) {
this.isRead = (Integer) aso.get("isRead");
}

if(aso.get("receiver") != null) {
this.receiver = (String) aso.get("receiver");
}

if(aso.get("title") != null) {
this.title = (String) aso.get("title");
}
}

public MailBean() {
}

@Override
public MailBean clone() {
MailBean clone = new MailBean();

if(this.targetId != null) {
clone.setTargetId(this.targetId);
}

if(this.type_id != null) {
clone.setType_id(this.type_id);
}

if(this.sender != null) {
clone.setSender(this.sender);
}

if(this.receiveTime != null) {
clone.setReceiveTime(this.receiveTime);
}

if(this.mailid != null) {
clone.setMailid(this.mailid);
}

if(this.playerId != null) {
clone.setPlayerId(this.playerId);
}

if(this.selected != null) {
clone.setSelected(this.selected);
}

if(this.isRead != null) {
clone.setIsRead(this.isRead);
}

if(this.receiver != null) {
clone.setReceiver(this.receiver);
}

if(this.title != null) {
clone.setTitle(this.title);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.targetId != null) {
aso.put("targetId", targetId);
}

if(this.type_id != null) {
aso.put("type_id", type_id);
}

if(this.sender != null) {
aso.put("sender", sender);
}

if(this.receiveTime != null) {
aso.put("receiveTime", receiveTime);
}

if(this.mailid != null) {
aso.put("mailid", mailid);
}

if(this.playerId != null) {
aso.put("playerId", playerId);
}

if(this.selected != null) {
aso.put("selected", selected);
}

if(this.isRead != null) {
aso.put("isRead", isRead);
}

if(this.receiver != null) {
aso.put("receiver", receiver);
}

if(this.title != null) {
aso.put("title", title);
}

return aso;
}

public Integer getTargetId() {
return targetId;
}

public void setTargetId(Integer targetId) {
this.targetId = targetId;
}

public Integer getType_id() {
return type_id;
}

public void setType_id(Integer type_id) {
this.type_id = type_id;
}

public String getSender() {
return sender;
}

public void setSender(String sender) {
this.sender = sender;
}

public String getReceiveTime() {
return receiveTime;
}

public void setReceiveTime(String receiveTime) {
this.receiveTime = receiveTime;
}

public Integer getMailid() {
return mailid;
}

public void setMailid(Integer mailid) {
this.mailid = mailid;
}

public Integer getPlayerId() {
return playerId;
}

public void setPlayerId(Integer playerId) {
this.playerId = playerId;
}

public Boolean getSelected() {
return selected;
}

public void setSelected(Boolean selected) {
this.selected = selected;
}

public Integer getIsRead() {
return isRead;
}

public void setIsRead(Integer isRead) {
this.isRead = isRead;
}

public String getReceiver() {
return receiver;
}

public void setReceiver(String receiver) {
this.receiver = receiver;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}
}
