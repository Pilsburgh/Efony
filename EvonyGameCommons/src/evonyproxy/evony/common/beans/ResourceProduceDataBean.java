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
public class ResourceProduceDataBean implements EvonyPacket {
private Integer armyPercentage = null;
private Integer commenceRate = null;
private Integer productionCapacity = null;
private Integer typeid = null;
private Integer totalOutput = null;
private Integer cimeliaPercentage = null;
private Integer fieldPercentage = null;
private Integer commenceDemands = null;
private Integer heroPercentage = null;
private Integer maxLabour = null;
private Integer naturalPercentage = null;
private Integer basicOutput = null;
private Integer technologicalPercentage = null;

public ResourceProduceDataBean(ASObject aso) {

if(aso.get("armyPercentage") != null) {
this.armyPercentage = (Integer) aso.get("armyPercentage");
}

if(aso.get("commenceRate") != null) {
this.commenceRate = (Integer) aso.get("commenceRate");
}

if(aso.get("productionCapacity") != null) {
this.productionCapacity = (Integer) aso.get("productionCapacity");
}

if(aso.get("typeid") != null) {
this.typeid = (Integer) aso.get("typeid");
}

if(aso.get("totalOutput") != null) {
this.totalOutput = (Integer) aso.get("totalOutput");
}

if(aso.get("cimeliaPercentage") != null) {
this.cimeliaPercentage = (Integer) aso.get("cimeliaPercentage");
}

if(aso.get("fieldPercentage") != null) {
this.fieldPercentage = (Integer) aso.get("fieldPercentage");
}

if(aso.get("commenceDemands") != null) {
this.commenceDemands = (Integer) aso.get("commenceDemands");
}

if(aso.get("heroPercentage") != null) {
this.heroPercentage = (Integer) aso.get("heroPercentage");
}

if(aso.get("maxLabour") != null) {
this.maxLabour = (Integer) aso.get("maxLabour");
}

if(aso.get("naturalPercentage") != null) {
this.naturalPercentage = (Integer) aso.get("naturalPercentage");
}

if(aso.get("basicOutput") != null) {
this.basicOutput = (Integer) aso.get("basicOutput");
}

if(aso.get("technologicalPercentage") != null) {
this.technologicalPercentage = (Integer) aso.get("technologicalPercentage");
}
}

public ResourceProduceDataBean() {
}

@Override
public ResourceProduceDataBean clone() {
ResourceProduceDataBean clone = new ResourceProduceDataBean();

if(this.armyPercentage != null) {
clone.setArmyPercentage(this.armyPercentage);
}

if(this.commenceRate != null) {
clone.setCommenceRate(this.commenceRate);
}

if(this.productionCapacity != null) {
clone.setProductionCapacity(this.productionCapacity);
}

if(this.typeid != null) {
clone.setTypeid(this.typeid);
}

if(this.totalOutput != null) {
clone.setTotalOutput(this.totalOutput);
}

if(this.cimeliaPercentage != null) {
clone.setCimeliaPercentage(this.cimeliaPercentage);
}

if(this.fieldPercentage != null) {
clone.setFieldPercentage(this.fieldPercentage);
}

if(this.commenceDemands != null) {
clone.setCommenceDemands(this.commenceDemands);
}

if(this.heroPercentage != null) {
clone.setHeroPercentage(this.heroPercentage);
}

if(this.maxLabour != null) {
clone.setMaxLabour(this.maxLabour);
}

if(this.naturalPercentage != null) {
clone.setNaturalPercentage(this.naturalPercentage);
}

if(this.basicOutput != null) {
clone.setBasicOutput(this.basicOutput);
}

if(this.technologicalPercentage != null) {
clone.setTechnologicalPercentage(this.technologicalPercentage);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.armyPercentage != null) {
aso.put("armyPercentage", armyPercentage);
}

if(this.commenceRate != null) {
aso.put("commenceRate", commenceRate);
}

if(this.productionCapacity != null) {
aso.put("productionCapacity", productionCapacity);
}

if(this.typeid != null) {
aso.put("typeid", typeid);
}

if(this.totalOutput != null) {
aso.put("totalOutput", totalOutput);
}

if(this.cimeliaPercentage != null) {
aso.put("cimeliaPercentage", cimeliaPercentage);
}

if(this.fieldPercentage != null) {
aso.put("fieldPercentage", fieldPercentage);
}

if(this.commenceDemands != null) {
aso.put("commenceDemands", commenceDemands);
}

if(this.heroPercentage != null) {
aso.put("heroPercentage", heroPercentage);
}

if(this.maxLabour != null) {
aso.put("maxLabour", maxLabour);
}

if(this.naturalPercentage != null) {
aso.put("naturalPercentage", naturalPercentage);
}

if(this.basicOutput != null) {
aso.put("basicOutput", basicOutput);
}

if(this.technologicalPercentage != null) {
aso.put("technologicalPercentage", technologicalPercentage);
}

return aso;
}

public Integer getArmyPercentage() {
return armyPercentage;
}

public void setArmyPercentage(Integer armyPercentage) {
this.armyPercentage = armyPercentage;
}

public Integer getCommenceRate() {
return commenceRate;
}

public void setCommenceRate(Integer commenceRate) {
this.commenceRate = commenceRate;
}

public Integer getProductionCapacity() {
return productionCapacity;
}

public void setProductionCapacity(Integer productionCapacity) {
this.productionCapacity = productionCapacity;
}

public Integer getTypeid() {
return typeid;
}

public void setTypeid(Integer typeid) {
this.typeid = typeid;
}

public Integer getTotalOutput() {
return totalOutput;
}

public void setTotalOutput(Integer totalOutput) {
this.totalOutput = totalOutput;
}

public Integer getCimeliaPercentage() {
return cimeliaPercentage;
}

public void setCimeliaPercentage(Integer cimeliaPercentage) {
this.cimeliaPercentage = cimeliaPercentage;
}

public Integer getFieldPercentage() {
return fieldPercentage;
}

public void setFieldPercentage(Integer fieldPercentage) {
this.fieldPercentage = fieldPercentage;
}

public Integer getCommenceDemands() {
return commenceDemands;
}

public void setCommenceDemands(Integer commenceDemands) {
this.commenceDemands = commenceDemands;
}

public Integer getHeroPercentage() {
return heroPercentage;
}

public void setHeroPercentage(Integer heroPercentage) {
this.heroPercentage = heroPercentage;
}

public Integer getMaxLabour() {
return maxLabour;
}

public void setMaxLabour(Integer maxLabour) {
this.maxLabour = maxLabour;
}

public Integer getNaturalPercentage() {
return naturalPercentage;
}

public void setNaturalPercentage(Integer naturalPercentage) {
this.naturalPercentage = naturalPercentage;
}

public Integer getBasicOutput() {
return basicOutput;
}

public void setBasicOutput(Integer basicOutput) {
this.basicOutput = basicOutput;
}

public Integer getTechnologicalPercentage() {
return technologicalPercentage;
}

public void setTechnologicalPercentage(Integer technologicalPercentage) {
this.technologicalPercentage = technologicalPercentage;
}
}
