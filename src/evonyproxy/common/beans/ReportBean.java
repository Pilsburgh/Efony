package evonyproxy.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class ReportBean implements ASObjectable {
private String title = null;
private String startPos = null;
private Integer type = null;
private Integer id = null;
private Integer armyType = null;
private Boolean selected = null;
private String content = null;
private Integer isRead = null;
private Boolean attack = null;
private Boolean back = null;
private String eventTime = null;
private String targetPos = null;

public ReportBean(ASObject aso) {

if(aso.get("title") != null) {
this.title = (String) aso.get("title");
}

if(aso.get("startPos") != null) {
this.startPos = (String) aso.get("startPos");
}

if(aso.get("type") != null) {
this.type = (Integer) aso.get("type");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}

if(aso.get("armyType") != null) {
this.armyType = (Integer) aso.get("armyType");
}

if(aso.get("selected") != null) {
this.selected = (Boolean) aso.get("selected");
}

if(aso.get("content") != null) {
this.content = (String) aso.get("content");
}

if(aso.get("isRead") != null) {
this.isRead = (Integer) aso.get("isRead");
}

if(aso.get("attack") != null) {
this.attack = (Boolean) aso.get("attack");
}

if(aso.get("back") != null) {
this.back = (Boolean) aso.get("back");
}

if(aso.get("eventTime") != null) {
this.eventTime = (String) aso.get("eventTime");
}

if(aso.get("targetPos") != null) {
this.targetPos = (String) aso.get("targetPos");
}
}

public ReportBean() {
}

@Override
public ReportBean clone() {
ReportBean clone = new ReportBean();

if(this.title != null) {
clone.setTitle(this.title);
}

if(this.startPos != null) {
clone.setStartPos(this.startPos);
}

if(this.type != null) {
clone.setType(this.type);
}

if(this.id != null) {
clone.setId(this.id);
}

if(this.armyType != null) {
clone.setArmyType(this.armyType);
}

if(this.selected != null) {
clone.setSelected(this.selected);
}

if(this.content != null) {
clone.setContent(this.content);
}

if(this.isRead != null) {
clone.setIsRead(this.isRead);
}

if(this.attack != null) {
clone.setAttack(this.attack);
}

if(this.back != null) {
clone.setBack(this.back);
}

if(this.eventTime != null) {
clone.setEventTime(this.eventTime);
}

if(this.targetPos != null) {
clone.setTargetPos(this.targetPos);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.title != null) {
aso.put("title", title);
}

if(this.startPos != null) {
aso.put("startPos", startPos);
}

if(this.type != null) {
aso.put("type", type);
}

if(this.id != null) {
aso.put("id", id);
}

if(this.armyType != null) {
aso.put("armyType", armyType);
}

if(this.selected != null) {
aso.put("selected", selected);
}

if(this.content != null) {
aso.put("content", content);
}

if(this.isRead != null) {
aso.put("isRead", isRead);
}

if(this.attack != null) {
aso.put("attack", attack);
}

if(this.back != null) {
aso.put("back", back);
}

if(this.eventTime != null) {
aso.put("eventTime", eventTime);
}

if(this.targetPos != null) {
aso.put("targetPos", targetPos);
}

return aso;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getStartPos() {
return startPos;
}

public void setStartPos(String startPos) {
this.startPos = startPos;
}

public Integer getType() {
return type;
}

public void setType(Integer type) {
this.type = type;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getArmyType() {
return armyType;
}

public void setArmyType(Integer armyType) {
this.armyType = armyType;
}

public Boolean getSelected() {
return selected;
}

public void setSelected(Boolean selected) {
this.selected = selected;
}

public String getContent() {
return content;
}

public void setContent(String content) {
this.content = content;
}

public Integer getIsRead() {
return isRead;
}

public void setIsRead(Integer isRead) {
this.isRead = isRead;
}

public Boolean getAttack() {
return attack;
}

public void setAttack(Boolean attack) {
this.attack = attack;
}

public Boolean getBack() {
return back;
}

public void setBack(Boolean back) {
this.back = back;
}

public String getEventTime() {
return eventTime;
}

public void setEventTime(String eventTime) {
this.eventTime = eventTime;
}

public String getTargetPos() {
return targetPos;
}

public void setTargetPos(String targetPos) {
this.targetPos = targetPos;
}
}
