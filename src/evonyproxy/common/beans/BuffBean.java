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
public class BuffBean implements ASObjectable {
private String descName = null;
private Double endTime = null;
private String typeId = null;

public BuffBean(ASObject aso) {

if(aso.get("descName") != null) {
this.descName = (String) aso.get("descName");
}

if(aso.get("endTime") != null) {
this.endTime = (Double) aso.get("endTime");
}

if(aso.get("typeId") != null) {
this.typeId = (String) aso.get("typeId");
}
}

public BuffBean() {
}

@Override
public BuffBean clone() {
BuffBean clone = new BuffBean();

if(this.descName != null) {
clone.setDescName(this.descName);
}

if(this.endTime != null) {
clone.setEndTime(this.endTime);
}

if(this.typeId != null) {
clone.setTypeId(this.typeId);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.descName != null) {
aso.put("descName", descName);
}

if(this.endTime != null) {
aso.put("endTime", endTime);
}

if(this.typeId != null) {
aso.put("typeId", typeId);
}

return aso;
}

public String getDescName() {
return descName;
}

public void setDescName(String descName) {
this.descName = descName;
}

public Double getEndTime() {
return endTime;
}

public void setEndTime(Double endTime) {
this.endTime = endTime;
}

public String getTypeId() {
return typeId;
}

public void setTypeId(String typeId) {
this.typeId = typeId;
}
}
