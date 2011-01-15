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
public class EquipmentBean implements EvonyPacket {
private String gemstoneid = null;
private Integer addAttribute = null;
private Integer lv = null;
private Integer heroPos = null;
private Integer equipmenttech = null;
private Integer addAttributeType = null;

public EquipmentBean(ASObject aso) {

if(aso.get("gemstoneid") != null) {
this.gemstoneid = (String) aso.get("gemstoneid");
}

if(aso.get("addAttribute") != null) {
this.addAttribute = (Integer) aso.get("addAttribute");
}

if(aso.get("lv") != null) {
this.lv = (Integer) aso.get("lv");
}

if(aso.get("heroPos") != null) {
this.heroPos = (Integer) aso.get("heroPos");
}

if(aso.get("equipmenttech") != null) {
this.equipmenttech = (Integer) aso.get("equipmenttech");
}

if(aso.get("addAttributeType") != null) {
this.addAttributeType = (Integer) aso.get("addAttributeType");
}
}

public EquipmentBean() {
}

@Override
public EquipmentBean clone() {
EquipmentBean clone = new EquipmentBean();

if(this.gemstoneid != null) {
clone.setGemstoneid(this.gemstoneid);
}

if(this.addAttribute != null) {
clone.setAddAttribute(this.addAttribute);
}

if(this.lv != null) {
clone.setLv(this.lv);
}

if(this.heroPos != null) {
clone.setHeroPos(this.heroPos);
}

if(this.equipmenttech != null) {
clone.setEquipmenttech(this.equipmenttech);
}

if(this.addAttributeType != null) {
clone.setAddAttributeType(this.addAttributeType);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.gemstoneid != null) {
aso.put("gemstoneid", gemstoneid);
}

if(this.addAttribute != null) {
aso.put("addAttribute", addAttribute);
}

if(this.lv != null) {
aso.put("lv", lv);
}

if(this.heroPos != null) {
aso.put("heroPos", heroPos);
}

if(this.equipmenttech != null) {
aso.put("equipmenttech", equipmenttech);
}

if(this.addAttributeType != null) {
aso.put("addAttributeType", addAttributeType);
}

return aso;
}

public String getGemstoneid() {
return gemstoneid;
}

public void setGemstoneid(String gemstoneid) {
this.gemstoneid = gemstoneid;
}

public Integer getAddAttribute() {
return addAttribute;
}

public void setAddAttribute(Integer addAttribute) {
this.addAttribute = addAttribute;
}

public Integer getLv() {
return lv;
}

public void setLv(Integer lv) {
this.lv = lv;
}

public Integer getHeroPos() {
return heroPos;
}

public void setHeroPos(Integer heroPos) {
this.heroPos = heroPos;
}

public Integer getEquipmenttech() {
return equipmenttech;
}

public void setEquipmenttech(Integer equipmenttech) {
this.equipmenttech = equipmenttech;
}

public Integer getAddAttributeType() {
return addAttributeType;
}

public void setAddAttributeType(Integer addAttributeType) {
this.addAttributeType = addAttributeType;
}
}
