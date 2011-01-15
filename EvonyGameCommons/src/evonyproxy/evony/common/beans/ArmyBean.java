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
public class ArmyBean implements EvonyPacket {
private Integer armyId = null;
private Integer missionType = null;
private String hero = null;
private ResourceBean resource = null;
private Integer startFieldId = null;
private Integer heroid = null;
private String targetPosName = null;
private Integer direction = null;
private Double restTime = null;
private Boolean selected = null;
private Double startTime = null;
private String startPosName = null;
private Integer heroLevel = null;
private Double reachTime = null;
private Integer targetFieldId = null;
private String king = null;
private String alliance = null;
private TroopStrBean troop = null;

public ArmyBean(ASObject aso) {

if(aso.get("armyId") != null) {
this.armyId = (Integer) aso.get("armyId");
}

if(aso.get("missionType") != null) {
this.missionType = (Integer) aso.get("missionType");
}

if(aso.get("hero") != null) {
this.hero = (String) aso.get("hero");
}

if(aso.get("resource") != null) {
this.resource = new ResourceBean((ASObject) aso.get("resource"));
}

if(aso.get("startFieldId") != null) {
this.startFieldId = (Integer) aso.get("startFieldId");
}

if(aso.get("heroid") != null) {
this.heroid = (Integer) aso.get("heroid");
}

if(aso.get("targetPosName") != null) {
this.targetPosName = (String) aso.get("targetPosName");
}

if(aso.get("direction") != null) {
this.direction = (Integer) aso.get("direction");
}

if(aso.get("restTime") != null) {
this.restTime = (Double) aso.get("restTime");
}

if(aso.get("selected") != null) {
this.selected = (Boolean) aso.get("selected");
}

if(aso.get("startTime") != null) {
this.startTime = (Double) aso.get("startTime");
}

if(aso.get("startPosName") != null) {
this.startPosName = (String) aso.get("startPosName");
}

if(aso.get("heroLevel") != null) {
this.heroLevel = (Integer) aso.get("heroLevel");
}

if(aso.get("reachTime") != null) {
this.reachTime = (Double) aso.get("reachTime");
}

if(aso.get("targetFieldId") != null) {
this.targetFieldId = (Integer) aso.get("targetFieldId");
}

if(aso.get("king") != null) {
this.king = (String) aso.get("king");
}

if(aso.get("alliance") != null) {
this.alliance = (String) aso.get("alliance");
}

if(aso.get("troop") != null) {
this.troop = new TroopStrBean((ASObject) aso.get("troop"));
}
}

public ArmyBean() {
}

@Override
public ArmyBean clone() {
ArmyBean clone = new ArmyBean();

if(this.armyId != null) {
clone.setArmyId(this.armyId);
}

if(this.missionType != null) {
clone.setMissionType(this.missionType);
}

if(this.hero != null) {
clone.setHero(this.hero);
}

if(this.resource != null) {
clone.setResource(this.resource);
}

if(this.startFieldId != null) {
clone.setStartFieldId(this.startFieldId);
}

if(this.heroid != null) {
clone.setHeroid(this.heroid);
}

if(this.targetPosName != null) {
clone.setTargetPosName(this.targetPosName);
}

if(this.direction != null) {
clone.setDirection(this.direction);
}

if(this.restTime != null) {
clone.setRestTime(this.restTime);
}

if(this.selected != null) {
clone.setSelected(this.selected);
}

if(this.startTime != null) {
clone.setStartTime(this.startTime);
}

if(this.startPosName != null) {
clone.setStartPosName(this.startPosName);
}

if(this.heroLevel != null) {
clone.setHeroLevel(this.heroLevel);
}

if(this.reachTime != null) {
clone.setReachTime(this.reachTime);
}

if(this.targetFieldId != null) {
clone.setTargetFieldId(this.targetFieldId);
}

if(this.king != null) {
clone.setKing(this.king);
}

if(this.alliance != null) {
clone.setAlliance(this.alliance);
}

if(this.troop != null) {
clone.setTroop(this.troop);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.armyId != null) {
aso.put("armyId", armyId);
}

if(this.missionType != null) {
aso.put("missionType", missionType);
}

if(this.hero != null) {
aso.put("hero", hero);
}

if(this.resource != null) {
aso.put("resource", resource.toASObject());
}

if(this.startFieldId != null) {
aso.put("startFieldId", startFieldId);
}

if(this.heroid != null) {
aso.put("heroid", heroid);
}

if(this.targetPosName != null) {
aso.put("targetPosName", targetPosName);
}

if(this.direction != null) {
aso.put("direction", direction);
}

if(this.restTime != null) {
aso.put("restTime", restTime);
}

if(this.selected != null) {
aso.put("selected", selected);
}

if(this.startTime != null) {
aso.put("startTime", startTime);
}

if(this.startPosName != null) {
aso.put("startPosName", startPosName);
}

if(this.heroLevel != null) {
aso.put("heroLevel", heroLevel);
}

if(this.reachTime != null) {
aso.put("reachTime", reachTime);
}

if(this.targetFieldId != null) {
aso.put("targetFieldId", targetFieldId);
}

if(this.king != null) {
aso.put("king", king);
}

if(this.alliance != null) {
aso.put("alliance", alliance);
}

if(this.troop != null) {
aso.put("troop", troop.toASObject());
}

return aso;
}

public Integer getArmyId() {
return armyId;
}

public void setArmyId(Integer armyId) {
this.armyId = armyId;
}

public Integer getMissionType() {
return missionType;
}

public void setMissionType(Integer missionType) {
this.missionType = missionType;
}

public String getHero() {
return hero;
}

public void setHero(String hero) {
this.hero = hero;
}

public ResourceBean getResource() {
return resource;
}

public void setResource(ResourceBean resource) {
this.resource = resource;
}

public Integer getStartFieldId() {
return startFieldId;
}

public void setStartFieldId(Integer startFieldId) {
this.startFieldId = startFieldId;
}

public Integer getHeroid() {
return heroid;
}

public void setHeroid(Integer heroid) {
this.heroid = heroid;
}

public String getTargetPosName() {
return targetPosName;
}

public void setTargetPosName(String targetPosName) {
this.targetPosName = targetPosName;
}

public Integer getDirection() {
return direction;
}

public void setDirection(Integer direction) {
this.direction = direction;
}

public Double getRestTime() {
return restTime;
}

public void setRestTime(Double restTime) {
this.restTime = restTime;
}

public Boolean getSelected() {
return selected;
}

public void setSelected(Boolean selected) {
this.selected = selected;
}

public Double getStartTime() {
return startTime;
}

public void setStartTime(Double startTime) {
this.startTime = startTime;
}

public String getStartPosName() {
return startPosName;
}

public void setStartPosName(String startPosName) {
this.startPosName = startPosName;
}

public Integer getHeroLevel() {
return heroLevel;
}

public void setHeroLevel(Integer heroLevel) {
this.heroLevel = heroLevel;
}

public Double getReachTime() {
return reachTime;
}

public void setReachTime(Double reachTime) {
this.reachTime = reachTime;
}

public Integer getTargetFieldId() {
return targetFieldId;
}

public void setTargetFieldId(Integer targetFieldId) {
this.targetFieldId = targetFieldId;
}

public String getKing() {
return king;
}

public void setKing(String king) {
this.king = king;
}

public String getAlliance() {
return alliance;
}

public void setAlliance(String alliance) {
this.alliance = alliance;
}

public TroopStrBean getTroop() {
return troop;
}

public void setTroop(TroopStrBean troop) {
this.troop = troop;
}
}
