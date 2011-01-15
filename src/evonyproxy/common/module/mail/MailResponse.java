package evonyproxy.common.module.mail;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class MailResponse implements ASObjectable {
public String msg = null;
public Integer type_id = null;
public Double packageId = null;
public Integer targetId = null;
public String receiveTime = null;
public String content = null;
public Integer mailid = null;
public String errorMsg = null;
public Integer playerId = null;
public String title = null;
public Integer isRead = null;
public Integer ok = null;
public String receiver = null;
public String sender = null;

public MailResponse(ASObject aso) {

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("type_id") != null) {
this.type_id = (Integer) aso.get("type_id");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("targetId") != null) {
this.targetId = (Integer) aso.get("targetId");
}

if(aso.get("receiveTime") != null) {
this.receiveTime = (String) aso.get("receiveTime");
}

if(aso.get("content") != null) {
this.content = (String) aso.get("content");
}

if(aso.get("mailid") != null) {
this.mailid = (Integer) aso.get("mailid");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("playerId") != null) {
this.playerId = (Integer) aso.get("playerId");
}

if(aso.get("title") != null) {
this.title = (String) aso.get("title");
}

if(aso.get("isRead") != null) {
this.isRead = (Integer) aso.get("isRead");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("receiver") != null) {
this.receiver = (String) aso.get("receiver");
}

if(aso.get("sender") != null) {
this.sender = (String) aso.get("sender");
}
}

public MailResponse() {
}

@Override
public MailResponse clone() {
MailResponse clone = new MailResponse();

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.type_id != null) {
clone.setType_id(this.type_id);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.targetId != null) {
clone.setTargetId(this.targetId);
}

if(this.receiveTime != null) {
clone.setReceiveTime(this.receiveTime);
}

if(this.content != null) {
clone.setContent(this.content);
}

if(this.mailid != null) {
clone.setMailid(this.mailid);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.playerId != null) {
clone.setPlayerId(this.playerId);
}

if(this.title != null) {
clone.setTitle(this.title);
}

if(this.isRead != null) {
clone.setIsRead(this.isRead);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.receiver != null) {
clone.setReceiver(this.receiver);
}

if(this.sender != null) {
clone.setSender(this.sender);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.type_id != null) {
aso.put("type_id", type_id);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.targetId != null) {
aso.put("targetId", targetId);
}

if(this.receiveTime != null) {
aso.put("receiveTime", receiveTime);
}

if(this.content != null) {
aso.put("content", content);
}

if(this.mailid != null) {
aso.put("mailid", mailid);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.playerId != null) {
aso.put("playerId", playerId);
}

if(this.title != null) {
aso.put("title", title);
}

if(this.isRead != null) {
aso.put("isRead", isRead);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.receiver != null) {
aso.put("receiver", receiver);
}

if(this.sender != null) {
aso.put("sender", sender);
}

return aso;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Integer getType_id() {
return type_id;
}

public void setType_id(Integer type_id) {
this.type_id = type_id;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public Integer getTargetId() {
return targetId;
}

public void setTargetId(Integer targetId) {
this.targetId = targetId;
}

public String getReceiveTime() {
return receiveTime;
}

public void setReceiveTime(String receiveTime) {
this.receiveTime = receiveTime;
}

public String getContent() {
return content;
}

public void setContent(String content) {
this.content = content;
}

public Integer getMailid() {
return mailid;
}

public void setMailid(Integer mailid) {
this.mailid = mailid;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public Integer getPlayerId() {
return playerId;
}

public void setPlayerId(Integer playerId) {
this.playerId = playerId;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public Integer getIsRead() {
return isRead;
}

public void setIsRead(Integer isRead) {
this.isRead = isRead;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}

public String getReceiver() {
return receiver;
}

public void setReceiver(String receiver) {
this.receiver = receiver;
}

public String getSender() {
return sender;
}

public void setSender(String sender) {
this.sender = sender;
}
}
