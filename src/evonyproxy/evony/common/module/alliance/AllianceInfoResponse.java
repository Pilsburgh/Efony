package evonyproxy.evony.common.module.alliance;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class AllianceInfoResponse implements EvonyPacket {
public String errorMsg = null;
public String msg = null;
public Double packageId = null;
public String leader = null;
public String allinaceInfo = null;
public String creator = null;
public Integer memberCount = null;
public Integer prestigeCount = null;
public Integer ok = null;
public Integer ranking = null;

public AllianceInfoResponse(ASObject aso) {

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("leader") != null) {
this.leader = (String) aso.get("leader");
}

if(aso.get("allinaceInfo") != null) {
this.allinaceInfo = (String) aso.get("allinaceInfo");
}

if(aso.get("creator") != null) {
this.creator = (String) aso.get("creator");
}

if(aso.get("memberCount") != null) {
this.memberCount = (Integer) aso.get("memberCount");
}

if(aso.get("prestigeCount") != null) {
this.prestigeCount = (Integer) aso.get("prestigeCount");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}

if(aso.get("ranking") != null) {
this.ranking = (Integer) aso.get("ranking");
}
}

public AllianceInfoResponse() {
}

@Override
public AllianceInfoResponse clone() {
AllianceInfoResponse clone = new AllianceInfoResponse();

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.leader != null) {
clone.setLeader(this.leader);
}

if(this.allinaceInfo != null) {
clone.setAllinaceInfo(this.allinaceInfo);
}

if(this.creator != null) {
clone.setCreator(this.creator);
}

if(this.memberCount != null) {
clone.setMemberCount(this.memberCount);
}

if(this.prestigeCount != null) {
clone.setPrestigeCount(this.prestigeCount);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

if(this.ranking != null) {
clone.setRanking(this.ranking);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.leader != null) {
aso.put("leader", leader);
}

if(this.allinaceInfo != null) {
aso.put("allinaceInfo", allinaceInfo);
}

if(this.creator != null) {
aso.put("creator", creator);
}

if(this.memberCount != null) {
aso.put("memberCount", memberCount);
}

if(this.prestigeCount != null) {
aso.put("prestigeCount", prestigeCount);
}

if(this.ok != null) {
aso.put("ok", ok);
}

if(this.ranking != null) {
aso.put("ranking", ranking);
}

return aso;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public String getLeader() {
return leader;
}

public void setLeader(String leader) {
this.leader = leader;
}

public String getAllinaceInfo() {
return allinaceInfo;
}

public void setAllinaceInfo(String allinaceInfo) {
this.allinaceInfo = allinaceInfo;
}

public String getCreator() {
return creator;
}

public void setCreator(String creator) {
this.creator = creator;
}

public Integer getMemberCount() {
return memberCount;
}

public void setMemberCount(Integer memberCount) {
this.memberCount = memberCount;
}

public Integer getPrestigeCount() {
return prestigeCount;
}

public void setPrestigeCount(Integer prestigeCount) {
this.prestigeCount = prestigeCount;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}

public Integer getRanking() {
return ranking;
}

public void setRanking(Integer ranking) {
this.ranking = ranking;
}
}
