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
public class BuildingBean implements ASObjectable {
private Double endTime = null;
private Integer status = null;
private String name = null;
private Double startTime = null;
private Integer typeId = null;
private Integer positionId = null;
private Integer level = null;

public BuildingBean(ASObject aso) {

if(aso.get("endTime") != null) {
this.endTime = (Double) aso.get("endTime");
}

if(aso.get("status") != null) {
this.status = (Integer) aso.get("status");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("startTime") != null) {
this.startTime = (Double) aso.get("startTime");
}

if(aso.get("typeId") != null) {
this.typeId = (Integer) aso.get("typeId");
}

if(aso.get("positionId") != null) {
this.positionId = (Integer) aso.get("positionId");
}

if(aso.get("level") != null) {
this.level = (Integer) aso.get("level");
}
}

public BuildingBean() {
}

@Override
public BuildingBean clone() {
BuildingBean clone = new BuildingBean();

if(this.endTime != null) {
clone.setEndTime(this.endTime);
}

if(this.status != null) {
clone.setStatus(this.status);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.startTime != null) {
clone.setStartTime(this.startTime);
}

if(this.typeId != null) {
clone.setTypeId(this.typeId);
}

if(this.positionId != null) {
clone.setPositionId(this.positionId);
}

if(this.level != null) {
clone.setLevel(this.level);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.endTime != null) {
aso.put("endTime", endTime);
}

if(this.status != null) {
aso.put("status", status);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.startTime != null) {
aso.put("startTime", startTime);
}

if(this.typeId != null) {
aso.put("typeId", typeId);
}

if(this.positionId != null) {
aso.put("positionId", positionId);
}

if(this.level != null) {
aso.put("level", level);
}

return aso;
}

public Double getEndTime() {
return endTime;
}

public void setEndTime(Double endTime) {
this.endTime = endTime;
}

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Double getStartTime() {
return startTime;
}

public void setStartTime(Double startTime) {
this.startTime = startTime;
}

public Integer getTypeId() {
return typeId;
}

public void setTypeId(Integer typeId) {
this.typeId = typeId;
}

public Integer getPositionId() {
return positionId;
}

public void setPositionId(Integer positionId) {
this.positionId = positionId;
}

public Integer getLevel() {
return level;
}

public void setLevel(Integer level) {
this.level = level;
}
}
