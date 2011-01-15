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
public class RankAllianceBean implements ASObjectable {
private Integer honor = null;
private Integer member = null;
private String name = null;
private Integer id = null;
private String date = null;
private String description = null;
private Integer prestige = null;
private String createrName = null;
private Integer city = null;
private String playerName = null;
private Integer rank = null;

public RankAllianceBean(ASObject aso) {

if(aso.get("honor") != null) {
this.honor = (Integer) aso.get("honor");
}

if(aso.get("member") != null) {
this.member = (Integer) aso.get("member");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}

if(aso.get("date") != null) {
this.date = (String) aso.get("date");
}

if(aso.get("description") != null) {
this.description = (String) aso.get("description");
}

if(aso.get("prestige") != null) {
this.prestige = (Integer) aso.get("prestige");
}

if(aso.get("createrName") != null) {
this.createrName = (String) aso.get("createrName");
}

if(aso.get("city") != null) {
this.city = (Integer) aso.get("city");
}

if(aso.get("playerName") != null) {
this.playerName = (String) aso.get("playerName");
}

if(aso.get("rank") != null) {
this.rank = (Integer) aso.get("rank");
}
}

public RankAllianceBean() {
}

@Override
public RankAllianceBean clone() {
RankAllianceBean clone = new RankAllianceBean();

if(this.honor != null) {
clone.setHonor(this.honor);
}

if(this.member != null) {
clone.setMember(this.member);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.id != null) {
clone.setId(this.id);
}

if(this.date != null) {
clone.setDate(this.date);
}

if(this.description != null) {
clone.setDescription(this.description);
}

if(this.prestige != null) {
clone.setPrestige(this.prestige);
}

if(this.createrName != null) {
clone.setCreaterName(this.createrName);
}

if(this.city != null) {
clone.setCity(this.city);
}

if(this.playerName != null) {
clone.setPlayerName(this.playerName);
}

if(this.rank != null) {
clone.setRank(this.rank);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.honor != null) {
aso.put("honor", honor);
}

if(this.member != null) {
aso.put("member", member);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.id != null) {
aso.put("id", id);
}

if(this.date != null) {
aso.put("date", date);
}

if(this.description != null) {
aso.put("description", description);
}

if(this.prestige != null) {
aso.put("prestige", prestige);
}

if(this.createrName != null) {
aso.put("createrName", createrName);
}

if(this.city != null) {
aso.put("city", city);
}

if(this.playerName != null) {
aso.put("playerName", playerName);
}

if(this.rank != null) {
aso.put("rank", rank);
}

return aso;
}

public Integer getHonor() {
return honor;
}

public void setHonor(Integer honor) {
this.honor = honor;
}

public Integer getMember() {
return member;
}

public void setMember(Integer member) {
this.member = member;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public Integer getPrestige() {
return prestige;
}

public void setPrestige(Integer prestige) {
this.prestige = prestige;
}

public String getCreaterName() {
return createrName;
}

public void setCreaterName(String createrName) {
this.createrName = createrName;
}

public Integer getCity() {
return city;
}

public void setCity(Integer city) {
this.city = city;
}

public String getPlayerName() {
return playerName;
}

public void setPlayerName(String playerName) {
this.playerName = playerName;
}

public Integer getRank() {
return rank;
}

public void setRank(Integer rank) {
this.rank = rank;
}
}
