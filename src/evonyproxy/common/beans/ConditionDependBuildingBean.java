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
public class ConditionDependBuildingBean implements ASObjectable {
private Integer curLevel = null;
private Boolean successFlag = null;
private Integer typeId = null;
private Integer level = null;

public ConditionDependBuildingBean(ASObject aso) {

if(aso.get("curLevel") != null) {
this.curLevel = (Integer) aso.get("curLevel");
}

if(aso.get("successFlag") != null) {
this.successFlag = (Boolean) aso.get("successFlag");
}

if(aso.get("typeId") != null) {
this.typeId = (Integer) aso.get("typeId");
}

if(aso.get("level") != null) {
this.level = (Integer) aso.get("level");
}
}

public ConditionDependBuildingBean() {
}

@Override
public ConditionDependBuildingBean clone() {
ConditionDependBuildingBean clone = new ConditionDependBuildingBean();

if(this.curLevel != null) {
clone.setCurLevel(this.curLevel);
}

if(this.successFlag != null) {
clone.setSuccessFlag(this.successFlag);
}

if(this.typeId != null) {
clone.setTypeId(this.typeId);
}

if(this.level != null) {
clone.setLevel(this.level);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.curLevel != null) {
aso.put("curLevel", curLevel);
}

if(this.successFlag != null) {
aso.put("successFlag", successFlag);
}

if(this.typeId != null) {
aso.put("typeId", typeId);
}

if(this.level != null) {
aso.put("level", level);
}

return aso;
}

public Integer getCurLevel() {
return curLevel;
}

public void setCurLevel(Integer curLevel) {
this.curLevel = curLevel;
}

public Boolean getSuccessFlag() {
return successFlag;
}

public void setSuccessFlag(Boolean successFlag) {
this.successFlag = successFlag;
}

public Integer getTypeId() {
return typeId;
}

public void setTypeId(Integer typeId) {
this.typeId = typeId;
}

public Integer getLevel() {
return level;
}

public void setLevel(Integer level) {
this.level = level;
}
}
