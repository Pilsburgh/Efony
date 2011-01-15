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
public class ColonyBean implements ASObjectable {
private Double endTime = null;
private String lordName = null;
private Integer status = null;
private Integer relation = null;
private Boolean isCanLevy = null;
private String cityName = null;
private String position = null;
private String time = null;
private Integer castleId = null;
private Boolean isCanOverview = null;

public ColonyBean(ASObject aso) {

if(aso.get("endTime") != null) {
this.endTime = (Double) aso.get("endTime");
}

if(aso.get("lordName") != null) {
this.lordName = (String) aso.get("lordName");
}

if(aso.get("status") != null) {
this.status = (Integer) aso.get("status");
}

if(aso.get("relation") != null) {
this.relation = (Integer) aso.get("relation");
}

if(aso.get("isCanLevy") != null) {
this.isCanLevy = (Boolean) aso.get("isCanLevy");
}

if(aso.get("cityName") != null) {
this.cityName = (String) aso.get("cityName");
}

if(aso.get("position") != null) {
this.position = (String) aso.get("position");
}

if(aso.get("time") != null) {
this.time = (String) aso.get("time");
}

if(aso.get("castleId") != null) {
this.castleId = (Integer) aso.get("castleId");
}

if(aso.get("isCanOverview") != null) {
this.isCanOverview = (Boolean) aso.get("isCanOverview");
}
}

public ColonyBean() {
}

@Override
public ColonyBean clone() {
ColonyBean clone = new ColonyBean();

if(this.endTime != null) {
clone.setEndTime(this.endTime);
}

if(this.lordName != null) {
clone.setLordName(this.lordName);
}

if(this.status != null) {
clone.setStatus(this.status);
}

if(this.relation != null) {
clone.setRelation(this.relation);
}

if(this.isCanLevy != null) {
clone.setIsCanLevy(this.isCanLevy);
}

if(this.cityName != null) {
clone.setCityName(this.cityName);
}

if(this.position != null) {
clone.setPosition(this.position);
}

if(this.time != null) {
clone.setTime(this.time);
}

if(this.castleId != null) {
clone.setCastleId(this.castleId);
}

if(this.isCanOverview != null) {
clone.setIsCanOverview(this.isCanOverview);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.endTime != null) {
aso.put("endTime", endTime);
}

if(this.lordName != null) {
aso.put("lordName", lordName);
}

if(this.status != null) {
aso.put("status", status);
}

if(this.relation != null) {
aso.put("relation", relation);
}

if(this.isCanLevy != null) {
aso.put("isCanLevy", isCanLevy);
}

if(this.cityName != null) {
aso.put("cityName", cityName);
}

if(this.position != null) {
aso.put("position", position);
}

if(this.time != null) {
aso.put("time", time);
}

if(this.castleId != null) {
aso.put("castleId", castleId);
}

if(this.isCanOverview != null) {
aso.put("isCanOverview", isCanOverview);
}

return aso;
}

public Double getEndTime() {
return endTime;
}

public void setEndTime(Double endTime) {
this.endTime = endTime;
}

public String getLordName() {
return lordName;
}

public void setLordName(String lordName) {
this.lordName = lordName;
}

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public Integer getRelation() {
return relation;
}

public void setRelation(Integer relation) {
this.relation = relation;
}

public Boolean getIsCanLevy() {
return isCanLevy;
}

public void setIsCanLevy(Boolean isCanLevy) {
this.isCanLevy = isCanLevy;
}

public String getCityName() {
return cityName;
}

public void setCityName(String cityName) {
this.cityName = cityName;
}

public String getPosition() {
return position;
}

public void setPosition(String position) {
this.position = position;
}

public String getTime() {
return time;
}

public void setTime(String time) {
this.time = time;
}

public Integer getCastleId() {
return castleId;
}

public void setCastleId(Integer castleId) {
this.castleId = castleId;
}

public Boolean getIsCanOverview() {
return isCanOverview;
}

public void setIsCanOverview(Boolean isCanOverview) {
this.isCanOverview = isCanOverview;
}
}
