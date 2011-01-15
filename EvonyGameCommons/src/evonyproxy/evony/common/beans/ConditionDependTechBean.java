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
public class ConditionDependTechBean implements EvonyPacket {
private Integer level = null;
private Integer curLevel = null;
private Boolean successFlag = null;
private Integer id = null;

public ConditionDependTechBean(ASObject aso) {

if(aso.get("level") != null) {
this.level = (Integer) aso.get("level");
}

if(aso.get("curLevel") != null) {
this.curLevel = (Integer) aso.get("curLevel");
}

if(aso.get("successFlag") != null) {
this.successFlag = (Boolean) aso.get("successFlag");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}
}

public ConditionDependTechBean() {
}

@Override
public ConditionDependTechBean clone() {
ConditionDependTechBean clone = new ConditionDependTechBean();

if(this.level != null) {
clone.setLevel(this.level);
}

if(this.curLevel != null) {
clone.setCurLevel(this.curLevel);
}

if(this.successFlag != null) {
clone.setSuccessFlag(this.successFlag);
}

if(this.id != null) {
clone.setId(this.id);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.level != null) {
aso.put("level", level);
}

if(this.curLevel != null) {
aso.put("curLevel", curLevel);
}

if(this.successFlag != null) {
aso.put("successFlag", successFlag);
}

if(this.id != null) {
aso.put("id", id);
}

return aso;
}

public Integer getLevel() {
return level;
}

public void setLevel(Integer level) {
this.level = level;
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

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}
}
