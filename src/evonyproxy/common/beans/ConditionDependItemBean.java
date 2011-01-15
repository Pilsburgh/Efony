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
public class ConditionDependItemBean implements ASObjectable {
private Integer num = null;
private Integer curNum = null;
private Boolean successFlag = null;
private String id = null;

public ConditionDependItemBean(ASObject aso) {

if(aso.get("num") != null) {
this.num = (Integer) aso.get("num");
}

if(aso.get("curNum") != null) {
this.curNum = (Integer) aso.get("curNum");
}

if(aso.get("successFlag") != null) {
this.successFlag = (Boolean) aso.get("successFlag");
}

if(aso.get("id") != null) {
this.id = (String) aso.get("id");
}
}

public ConditionDependItemBean() {
}

@Override
public ConditionDependItemBean clone() {
ConditionDependItemBean clone = new ConditionDependItemBean();

if(this.num != null) {
clone.setNum(this.num);
}

if(this.curNum != null) {
clone.setCurNum(this.curNum);
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

if(this.num != null) {
aso.put("num", num);
}

if(this.curNum != null) {
aso.put("curNum", curNum);
}

if(this.successFlag != null) {
aso.put("successFlag", successFlag);
}

if(this.id != null) {
aso.put("id", id);
}

return aso;
}

public Integer getNum() {
return num;
}

public void setNum(Integer num) {
this.num = num;
}

public Integer getCurNum() {
return curNum;
}

public void setCurNum(Integer curNum) {
this.curNum = curNum;
}

public Boolean getSuccessFlag() {
return successFlag;
}

public void setSuccessFlag(Boolean successFlag) {
this.successFlag = successFlag;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}
}
