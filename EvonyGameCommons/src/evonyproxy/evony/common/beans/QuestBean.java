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
public class QuestBean implements EvonyPacket {
private String manual = null;
private Boolean isFinish = null;
private String name = null;
private Integer version = null;
private Boolean islast = null;
private Integer questId = null;
private Boolean isCard = null;
private ArrayList<QuestTargetBean> targets = null;
private String award = null;
private String description = null;

public QuestBean(ASObject aso) {
targets = new ArrayList<QuestTargetBean>();

if(aso.get("manual") != null) {
this.manual = (String) aso.get("manual");
}

if(aso.get("isFinish") != null) {
this.isFinish = (Boolean) aso.get("isFinish");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("version") != null) {
this.version = (Integer) aso.get("version");
}

if(aso.get("islast") != null) {
this.islast = (Boolean) aso.get("islast");
}

if(aso.get("questId") != null) {
this.questId = (Integer) aso.get("questId");
}

if(aso.get("isCard") != null) {
this.isCard = (Boolean) aso.get("isCard");
}

if(aso.get("targets") != null) {
Object[] objArr = (Object[]) aso.get("targets");
for(int j = 0; j < objArr.length; j++) {
targets.add(new QuestTargetBean((ASObject) objArr[j]));
}
}

if(aso.get("award") != null) {
this.award = (String) aso.get("award");
}

if(aso.get("description") != null) {
this.description = (String) aso.get("description");
}
}

public QuestBean() {
}

@Override
public QuestBean clone() {
QuestBean clone = new QuestBean();

if(this.manual != null) {
clone.setManual(this.manual);
}

if(this.isFinish != null) {
clone.setIsFinish(this.isFinish);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.version != null) {
clone.setVersion(this.version);
}

if(this.islast != null) {
clone.setIslast(this.islast);
}

if(this.questId != null) {
clone.setQuestId(this.questId);
}

if(this.isCard != null) {
clone.setIsCard(this.isCard);
}

if(this.targets != null) {
ArrayList tmpArrLst = new ArrayList<QuestTargetBean>();

for(Object bean : targets) {
QuestTargetBean tmpBean = (QuestTargetBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTargets(tmpArrLst);
}

if(this.award != null) {
clone.setAward(this.award);
}

if(this.description != null) {
clone.setDescription(this.description);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.manual != null) {
aso.put("manual", manual);
}

if(this.isFinish != null) {
aso.put("isFinish", isFinish);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.version != null) {
aso.put("version", version);
}

if(this.islast != null) {
aso.put("islast", islast);
}

if(this.questId != null) {
aso.put("questId", questId);
}

if(this.isCard != null) {
aso.put("isCard", isCard);
}

if(this.targets != null) {
ArrayList al = new ArrayList();
for(Object obj : targets) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
}

if(this.award != null) {
aso.put("award", award);
}

if(this.description != null) {
aso.put("description", description);
}

return aso;
}

public String getManual() {
return manual;
}

public void setManual(String manual) {
this.manual = manual;
}

public Boolean getIsFinish() {
return isFinish;
}

public void setIsFinish(Boolean isFinish) {
this.isFinish = isFinish;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getVersion() {
return version;
}

public void setVersion(Integer version) {
this.version = version;
}

public Boolean getIslast() {
return islast;
}

public void setIslast(Boolean islast) {
this.islast = islast;
}

public Integer getQuestId() {
return questId;
}

public void setQuestId(Integer questId) {
this.questId = questId;
}

public Boolean getIsCard() {
return isCard;
}

public void setIsCard(Boolean isCard) {
this.isCard = isCard;
}

public ArrayList getTargets() {
return targets;
}

public void setTargets(ArrayList targets) {
this.targets = targets;
}

public String getAward() {
return award;
}

public void setAward(String award) {
this.award = award;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}
}
