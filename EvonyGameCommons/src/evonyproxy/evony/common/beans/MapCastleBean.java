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
public class MapCastleBean implements EvonyPacket {
private Integer declaredWarStatus = null;
private Integer colonialStatus = null;
private Integer relation = null;
private Integer honor = null;
private Integer type = null;
private Boolean canColonize = null;
private Integer colonialRelation = null;
private Boolean furlough = null;
private Integer id = null;
private Double declaredWarStartTime = null;
private Integer powerLevel = null;
private String zoneName = null;
private Boolean npc = null;
private String suzerain = null;
private String userName = null;
private String playerLogoUrl = null;
private Integer castleIcon = null;
private Integer ownerPlayerId = null;
private String name = null;
private Boolean canOccupy = null;
private Boolean freshMan = null;
private Boolean canScout = null;
private String flag = null;
private Boolean canLoot = null;
private Integer state = null;
private Integer castleId = null;
private Integer prestige = null;
private Boolean canTrans = null;
private Boolean canSend = null;
private String allianceName = null;
private Boolean canDeclaredWar = null;

public MapCastleBean(ASObject aso) {

if(aso.get("declaredWarStatus") != null) {
this.declaredWarStatus = (Integer) aso.get("declaredWarStatus");
}

if(aso.get("colonialStatus") != null) {
this.colonialStatus = (Integer) aso.get("colonialStatus");
}

if(aso.get("relation") != null) {
this.relation = (Integer) aso.get("relation");
}

if(aso.get("honor") != null) {
this.honor = (Integer) aso.get("honor");
}

if(aso.get("type") != null) {
this.type = (Integer) aso.get("type");
}

if(aso.get("canColonize") != null) {
this.canColonize = (Boolean) aso.get("canColonize");
}

if(aso.get("colonialRelation") != null) {
this.colonialRelation = (Integer) aso.get("colonialRelation");
}

if(aso.get("furlough") != null) {
this.furlough = (Boolean) aso.get("furlough");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}

if(aso.get("declaredWarStartTime") != null) {
this.declaredWarStartTime = (Double) aso.get("declaredWarStartTime");
}

if(aso.get("powerLevel") != null) {
this.powerLevel = (Integer) aso.get("powerLevel");
}

if(aso.get("zoneName") != null) {
this.zoneName = (String) aso.get("zoneName");
}

if(aso.get("npc") != null) {
this.npc = (Boolean) aso.get("npc");
}

if(aso.get("suzerain") != null) {
this.suzerain = (String) aso.get("suzerain");
}

if(aso.get("userName") != null) {
this.userName = (String) aso.get("userName");
}

if(aso.get("playerLogoUrl") != null) {
this.playerLogoUrl = (String) aso.get("playerLogoUrl");
}

if(aso.get("castleIcon") != null) {
this.castleIcon = (Integer) aso.get("castleIcon");
}

if(aso.get("ownerPlayerId") != null) {
this.ownerPlayerId = (Integer) aso.get("ownerPlayerId");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("canOccupy") != null) {
this.canOccupy = (Boolean) aso.get("canOccupy");
}

if(aso.get("freshMan") != null) {
this.freshMan = (Boolean) aso.get("freshMan");
}

if(aso.get("canScout") != null) {
this.canScout = (Boolean) aso.get("canScout");
}

if(aso.get("flag") != null) {
this.flag = (String) aso.get("flag");
}

if(aso.get("canLoot") != null) {
this.canLoot = (Boolean) aso.get("canLoot");
}

if(aso.get("state") != null) {
this.state = (Integer) aso.get("state");
}

if(aso.get("castleId") != null) {
this.castleId = (Integer) aso.get("castleId");
}

if(aso.get("prestige") != null) {
this.prestige = (Integer) aso.get("prestige");
}

if(aso.get("canTrans") != null) {
this.canTrans = (Boolean) aso.get("canTrans");
}

if(aso.get("canSend") != null) {
this.canSend = (Boolean) aso.get("canSend");
}

if(aso.get("allianceName") != null) {
this.allianceName = (String) aso.get("allianceName");
}

if(aso.get("canDeclaredWar") != null) {
this.canDeclaredWar = (Boolean) aso.get("canDeclaredWar");
}
}

public MapCastleBean() {
}

@Override
public MapCastleBean clone() {
MapCastleBean clone = new MapCastleBean();

if(this.declaredWarStatus != null) {
clone.setDeclaredWarStatus(this.declaredWarStatus);
}

if(this.colonialStatus != null) {
clone.setColonialStatus(this.colonialStatus);
}

if(this.relation != null) {
clone.setRelation(this.relation);
}

if(this.honor != null) {
clone.setHonor(this.honor);
}

if(this.type != null) {
clone.setType(this.type);
}

if(this.canColonize != null) {
clone.setCanColonize(this.canColonize);
}

if(this.colonialRelation != null) {
clone.setColonialRelation(this.colonialRelation);
}

if(this.furlough != null) {
clone.setFurlough(this.furlough);
}

if(this.id != null) {
clone.setId(this.id);
}

if(this.declaredWarStartTime != null) {
clone.setDeclaredWarStartTime(this.declaredWarStartTime);
}

if(this.powerLevel != null) {
clone.setPowerLevel(this.powerLevel);
}

if(this.zoneName != null) {
clone.setZoneName(this.zoneName);
}

if(this.npc != null) {
clone.setNpc(this.npc);
}

if(this.suzerain != null) {
clone.setSuzerain(this.suzerain);
}

if(this.userName != null) {
clone.setUserName(this.userName);
}

if(this.playerLogoUrl != null) {
clone.setPlayerLogoUrl(this.playerLogoUrl);
}

if(this.castleIcon != null) {
clone.setCastleIcon(this.castleIcon);
}

if(this.ownerPlayerId != null) {
clone.setOwnerPlayerId(this.ownerPlayerId);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.canOccupy != null) {
clone.setCanOccupy(this.canOccupy);
}

if(this.freshMan != null) {
clone.setFreshMan(this.freshMan);
}

if(this.canScout != null) {
clone.setCanScout(this.canScout);
}

if(this.flag != null) {
clone.setFlag(this.flag);
}

if(this.canLoot != null) {
clone.setCanLoot(this.canLoot);
}

if(this.state != null) {
clone.setState(this.state);
}

if(this.castleId != null) {
clone.setCastleId(this.castleId);
}

if(this.prestige != null) {
clone.setPrestige(this.prestige);
}

if(this.canTrans != null) {
clone.setCanTrans(this.canTrans);
}

if(this.canSend != null) {
clone.setCanSend(this.canSend);
}

if(this.allianceName != null) {
clone.setAllianceName(this.allianceName);
}

if(this.canDeclaredWar != null) {
clone.setCanDeclaredWar(this.canDeclaredWar);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.declaredWarStatus != null) {
aso.put("declaredWarStatus", declaredWarStatus);
}

if(this.colonialStatus != null) {
aso.put("colonialStatus", colonialStatus);
}

if(this.relation != null) {
aso.put("relation", relation);
}

if(this.honor != null) {
aso.put("honor", honor);
}

if(this.type != null) {
aso.put("type", type);
}

if(this.canColonize != null) {
aso.put("canColonize", canColonize);
}

if(this.colonialRelation != null) {
aso.put("colonialRelation", colonialRelation);
}

if(this.furlough != null) {
aso.put("furlough", furlough);
}

if(this.id != null) {
aso.put("id", id);
}

if(this.declaredWarStartTime != null) {
aso.put("declaredWarStartTime", declaredWarStartTime);
}

if(this.powerLevel != null) {
aso.put("powerLevel", powerLevel);
}

if(this.zoneName != null) {
aso.put("zoneName", zoneName);
}

if(this.npc != null) {
aso.put("npc", npc);
}

if(this.suzerain != null) {
aso.put("suzerain", suzerain);
}

if(this.userName != null) {
aso.put("userName", userName);
}

if(this.playerLogoUrl != null) {
aso.put("playerLogoUrl", playerLogoUrl);
}

if(this.castleIcon != null) {
aso.put("castleIcon", castleIcon);
}

if(this.ownerPlayerId != null) {
aso.put("ownerPlayerId", ownerPlayerId);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.canOccupy != null) {
aso.put("canOccupy", canOccupy);
}

if(this.freshMan != null) {
aso.put("freshMan", freshMan);
}

if(this.canScout != null) {
aso.put("canScout", canScout);
}

if(this.flag != null) {
aso.put("flag", flag);
}

if(this.canLoot != null) {
aso.put("canLoot", canLoot);
}

if(this.state != null) {
aso.put("state", state);
}

if(this.castleId != null) {
aso.put("castleId", castleId);
}

if(this.prestige != null) {
aso.put("prestige", prestige);
}

if(this.canTrans != null) {
aso.put("canTrans", canTrans);
}

if(this.canSend != null) {
aso.put("canSend", canSend);
}

if(this.allianceName != null) {
aso.put("allianceName", allianceName);
}

if(this.canDeclaredWar != null) {
aso.put("canDeclaredWar", canDeclaredWar);
}

return aso;
}

public Integer getDeclaredWarStatus() {
return declaredWarStatus;
}

public void setDeclaredWarStatus(Integer declaredWarStatus) {
this.declaredWarStatus = declaredWarStatus;
}

public Integer getColonialStatus() {
return colonialStatus;
}

public void setColonialStatus(Integer colonialStatus) {
this.colonialStatus = colonialStatus;
}

public Integer getRelation() {
return relation;
}

public void setRelation(Integer relation) {
this.relation = relation;
}

public Integer getHonor() {
return honor;
}

public void setHonor(Integer honor) {
this.honor = honor;
}

public Integer getType() {
return type;
}

public void setType(Integer type) {
this.type = type;
}

public Boolean getCanColonize() {
return canColonize;
}

public void setCanColonize(Boolean canColonize) {
this.canColonize = canColonize;
}

public Integer getColonialRelation() {
return colonialRelation;
}

public void setColonialRelation(Integer colonialRelation) {
this.colonialRelation = colonialRelation;
}

public Boolean getFurlough() {
return furlough;
}

public void setFurlough(Boolean furlough) {
this.furlough = furlough;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Double getDeclaredWarStartTime() {
return declaredWarStartTime;
}

public void setDeclaredWarStartTime(Double declaredWarStartTime) {
this.declaredWarStartTime = declaredWarStartTime;
}

public Integer getPowerLevel() {
return powerLevel;
}

public void setPowerLevel(Integer powerLevel) {
this.powerLevel = powerLevel;
}

public String getZoneName() {
return zoneName;
}

public void setZoneName(String zoneName) {
this.zoneName = zoneName;
}

public Boolean getNpc() {
return npc;
}

public void setNpc(Boolean npc) {
this.npc = npc;
}

public String getSuzerain() {
return suzerain;
}

public void setSuzerain(String suzerain) {
this.suzerain = suzerain;
}

public String getUserName() {
return userName;
}

public void setUserName(String userName) {
this.userName = userName;
}

public String getPlayerLogoUrl() {
return playerLogoUrl;
}

public void setPlayerLogoUrl(String playerLogoUrl) {
this.playerLogoUrl = playerLogoUrl;
}

public Integer getCastleIcon() {
return castleIcon;
}

public void setCastleIcon(Integer castleIcon) {
this.castleIcon = castleIcon;
}

public Integer getOwnerPlayerId() {
return ownerPlayerId;
}

public void setOwnerPlayerId(Integer ownerPlayerId) {
this.ownerPlayerId = ownerPlayerId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Boolean getCanOccupy() {
return canOccupy;
}

public void setCanOccupy(Boolean canOccupy) {
this.canOccupy = canOccupy;
}

public Boolean getFreshMan() {
return freshMan;
}

public void setFreshMan(Boolean freshMan) {
this.freshMan = freshMan;
}

public Boolean getCanScout() {
return canScout;
}

public void setCanScout(Boolean canScout) {
this.canScout = canScout;
}

public String getFlag() {
return flag;
}

public void setFlag(String flag) {
this.flag = flag;
}

public Boolean getCanLoot() {
return canLoot;
}

public void setCanLoot(Boolean canLoot) {
this.canLoot = canLoot;
}

public Integer getState() {
return state;
}

public void setState(Integer state) {
this.state = state;
}

public Integer getCastleId() {
return castleId;
}

public void setCastleId(Integer castleId) {
this.castleId = castleId;
}

public Integer getPrestige() {
return prestige;
}

public void setPrestige(Integer prestige) {
this.prestige = prestige;
}

public Boolean getCanTrans() {
return canTrans;
}

public void setCanTrans(Boolean canTrans) {
this.canTrans = canTrans;
}

public Boolean getCanSend() {
return canSend;
}

public void setCanSend(Boolean canSend) {
this.canSend = canSend;
}

public String getAllianceName() {
return allianceName;
}

public void setAllianceName(String allianceName) {
this.allianceName = allianceName;
}

public Boolean getCanDeclaredWar() {
return canDeclaredWar;
}

public void setCanDeclaredWar(Boolean canDeclaredWar) {
this.canDeclaredWar = canDeclaredWar;
}
}
