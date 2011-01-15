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
public class AvailableBuildingListBean implements ASObjectable {
private ConditionBean conditionBean = null;
private Integer typeId = null;

public AvailableBuildingListBean(ASObject aso) {

if(aso.get("conditionBean") != null) {
this.conditionBean = new ConditionBean((ASObject) aso.get("conditionBean"));
}

if(aso.get("typeId") != null) {
this.typeId = (Integer) aso.get("typeId");
}
}

public AvailableBuildingListBean() {
}

@Override
public AvailableBuildingListBean clone() {
AvailableBuildingListBean clone = new AvailableBuildingListBean();

if(this.conditionBean != null) {
clone.setConditionBean(this.conditionBean);
}

if(this.typeId != null) {
clone.setTypeId(this.typeId);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.conditionBean != null) {
aso.put("conditionBean", conditionBean.toASObject());
}

if(this.typeId != null) {
aso.put("typeId", typeId);
}

return aso;
}

public ConditionBean getConditionBean() {
return conditionBean;
}

public void setConditionBean(ConditionBean conditionBean) {
this.conditionBean = conditionBean;
}

public Integer getTypeId() {
return typeId;
}

public void setTypeId(Integer typeId) {
this.typeId = typeId;
}
}
