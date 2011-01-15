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
public class AllianceQueryBean implements EvonyPacket {
private String bulletin = null;
private Integer limit = null;
private String name = null;
private Integer curNum = null;
private String creatorName = null;
private String leaderName = null;
private Integer prestige = null;
private String desc = null;
private Integer ranking = null;

public AllianceQueryBean(ASObject aso) {

if(aso.get("bulletin") != null) {
this.bulletin = (String) aso.get("bulletin");
}

if(aso.get("limit") != null) {
this.limit = (Integer) aso.get("limit");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("curNum") != null) {
this.curNum = (Integer) aso.get("curNum");
}

if(aso.get("creatorName") != null) {
this.creatorName = (String) aso.get("creatorName");
}

if(aso.get("leaderName") != null) {
this.leaderName = (String) aso.get("leaderName");
}

if(aso.get("prestige") != null) {
this.prestige = (Integer) aso.get("prestige");
}

if(aso.get("desc") != null) {
this.desc = (String) aso.get("desc");
}

if(aso.get("ranking") != null) {
this.ranking = (Integer) aso.get("ranking");
}
}

public AllianceQueryBean() {
}

@Override
public AllianceQueryBean clone() {
AllianceQueryBean clone = new AllianceQueryBean();

if(this.bulletin != null) {
clone.setBulletin(this.bulletin);
}

if(this.limit != null) {
clone.setLimit(this.limit);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.curNum != null) {
clone.setCurNum(this.curNum);
}

if(this.creatorName != null) {
clone.setCreatorName(this.creatorName);
}

if(this.leaderName != null) {
clone.setLeaderName(this.leaderName);
}

if(this.prestige != null) {
clone.setPrestige(this.prestige);
}

if(this.desc != null) {
clone.setDesc(this.desc);
}

if(this.ranking != null) {
clone.setRanking(this.ranking);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.bulletin != null) {
aso.put("bulletin", bulletin);
}

if(this.limit != null) {
aso.put("limit", limit);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.curNum != null) {
aso.put("curNum", curNum);
}

if(this.creatorName != null) {
aso.put("creatorName", creatorName);
}

if(this.leaderName != null) {
aso.put("leaderName", leaderName);
}

if(this.prestige != null) {
aso.put("prestige", prestige);
}

if(this.desc != null) {
aso.put("desc", desc);
}

if(this.ranking != null) {
aso.put("ranking", ranking);
}

return aso;
}

public String getBulletin() {
return bulletin;
}

public void setBulletin(String bulletin) {
this.bulletin = bulletin;
}

public Integer getLimit() {
return limit;
}

public void setLimit(Integer limit) {
this.limit = limit;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getCurNum() {
return curNum;
}

public void setCurNum(Integer curNum) {
this.curNum = curNum;
}

public String getCreatorName() {
return creatorName;
}

public void setCreatorName(String creatorName) {
this.creatorName = creatorName;
}

public String getLeaderName() {
return leaderName;
}

public void setLeaderName(String leaderName) {
this.leaderName = leaderName;
}

public Integer getPrestige() {
return prestige;
}

public void setPrestige(Integer prestige) {
this.prestige = prestige;
}

public String getDesc() {
return desc;
}

public void setDesc(String desc) {
this.desc = desc;
}

public Integer getRanking() {
return ranking;
}

public void setRanking(Integer ranking) {
this.ranking = ranking;
}
}
