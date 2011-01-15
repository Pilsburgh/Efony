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
public class TroopProduceListBean implements EvonyPacket {
private ConditionBean conditionBean = null;
private Integer typeId = null;
private Boolean permition = null;

public TroopProduceListBean(ASObject aso) {

if(aso.get("conditionBean") != null) {
this.conditionBean = new ConditionBean((ASObject) aso.get("conditionBean"));
}

if(aso.get("typeId") != null) {
this.typeId = (Integer) aso.get("typeId");
}

if(aso.get("permition") != null) {
this.permition = (Boolean) aso.get("permition");
}
}

public TroopProduceListBean() {
}

@Override
public TroopProduceListBean clone() {
TroopProduceListBean clone = new TroopProduceListBean();

if(this.conditionBean != null) {
clone.setConditionBean(this.conditionBean);
}

if(this.typeId != null) {
clone.setTypeId(this.typeId);
}

if(this.permition != null) {
clone.setPermition(this.permition);
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

if(this.permition != null) {
aso.put("permition", permition);
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

public Boolean getPermition() {
return permition;
}

public void setPermition(Boolean permition) {
this.permition = permition;
}
}
