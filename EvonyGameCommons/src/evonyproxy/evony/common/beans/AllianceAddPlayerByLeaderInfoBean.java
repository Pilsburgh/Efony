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
public class AllianceAddPlayerByLeaderInfoBean implements EvonyPacket {
private Integer memberCount = null;
private Integer prestige = null;
private String allianceName = null;
private Integer rank = null;

public AllianceAddPlayerByLeaderInfoBean(ASObject aso) {

if(aso.get("memberCount") != null) {
this.memberCount = (Integer) aso.get("memberCount");
}

if(aso.get("prestige") != null) {
this.prestige = (Integer) aso.get("prestige");
}

if(aso.get("allianceName") != null) {
this.allianceName = (String) aso.get("allianceName");
}

if(aso.get("rank") != null) {
this.rank = (Integer) aso.get("rank");
}
}

public AllianceAddPlayerByLeaderInfoBean() {
}

@Override
public AllianceAddPlayerByLeaderInfoBean clone() {
AllianceAddPlayerByLeaderInfoBean clone = new AllianceAddPlayerByLeaderInfoBean();

if(this.memberCount != null) {
clone.setMemberCount(this.memberCount);
}

if(this.prestige != null) {
clone.setPrestige(this.prestige);
}

if(this.allianceName != null) {
clone.setAllianceName(this.allianceName);
}

if(this.rank != null) {
clone.setRank(this.rank);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.memberCount != null) {
aso.put("memberCount", memberCount);
}

if(this.prestige != null) {
aso.put("prestige", prestige);
}

if(this.allianceName != null) {
aso.put("allianceName", allianceName);
}

if(this.rank != null) {
aso.put("rank", rank);
}

return aso;
}

public Integer getMemberCount() {
return memberCount;
}

public void setMemberCount(Integer memberCount) {
this.memberCount = memberCount;
}

public Integer getPrestige() {
return prestige;
}

public void setPrestige(Integer prestige) {
this.prestige = prestige;
}

public String getAllianceName() {
return allianceName;
}

public void setAllianceName(String allianceName) {
this.allianceName = allianceName;
}

public Integer getRank() {
return rank;
}

public void setRank(Integer rank) {
this.rank = rank;
}
}
