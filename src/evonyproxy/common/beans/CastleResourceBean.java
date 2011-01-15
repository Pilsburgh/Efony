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
public class CastleResourceBean implements ASObjectable {
private Integer texRate = null;
private Integer buildPeople = null;
private ResourceInfoBean stone = null;
private Integer populationDirection = null;
private Double gold = null;
private ResourceInfoBean iron = null;
private Integer curPopulation = null;
private Integer complaint = null;
private Integer taxIncome = null;
private ResourceInfoBean wood = null;
private ResourceInfoBean food = null;
private Integer support = null;
private Double troopCostFood = null;
private Integer workPeople = null;
private Integer herosSalary = null;
private Integer maxPopulation = null;

public CastleResourceBean(ASObject aso) {

if(aso.get("texRate") != null) {
this.texRate = (Integer) aso.get("texRate");
}

if(aso.get("buildPeople") != null) {
this.buildPeople = (Integer) aso.get("buildPeople");
}

if(aso.get("stone") != null) {
this.stone = new ResourceInfoBean((ASObject) aso.get("stone"));
}

if(aso.get("populationDirection") != null) {
this.populationDirection = (Integer) aso.get("populationDirection");
}

if(aso.get("gold") != null) {
this.gold = (Double) aso.get("gold");
}

if(aso.get("iron") != null) {
this.iron = new ResourceInfoBean((ASObject) aso.get("iron"));
}

if(aso.get("curPopulation") != null) {
this.curPopulation = (Integer) aso.get("curPopulation");
}

if(aso.get("complaint") != null) {
this.complaint = (Integer) aso.get("complaint");
}

if(aso.get("taxIncome") != null) {
this.taxIncome = (Integer) aso.get("taxIncome");
}

if(aso.get("wood") != null) {
this.wood = new ResourceInfoBean((ASObject) aso.get("wood"));
}

if(aso.get("food") != null) {
this.food = new ResourceInfoBean((ASObject) aso.get("food"));
}

if(aso.get("support") != null) {
this.support = (Integer) aso.get("support");
}

if(aso.get("troopCostFood") != null) {
this.troopCostFood = (Double) aso.get("troopCostFood");
}

if(aso.get("workPeople") != null) {
this.workPeople = (Integer) aso.get("workPeople");
}

if(aso.get("herosSalary") != null) {
this.herosSalary = (Integer) aso.get("herosSalary");
}

if(aso.get("maxPopulation") != null) {
this.maxPopulation = (Integer) aso.get("maxPopulation");
}
}

public CastleResourceBean() {
}

@Override
public CastleResourceBean clone() {
CastleResourceBean clone = new CastleResourceBean();

if(this.texRate != null) {
clone.setTexRate(this.texRate);
}

if(this.buildPeople != null) {
clone.setBuildPeople(this.buildPeople);
}

if(this.stone != null) {
clone.setStone(this.stone);
}

if(this.populationDirection != null) {
clone.setPopulationDirection(this.populationDirection);
}

if(this.gold != null) {
clone.setGold(this.gold);
}

if(this.iron != null) {
clone.setIron(this.iron);
}

if(this.curPopulation != null) {
clone.setCurPopulation(this.curPopulation);
}

if(this.complaint != null) {
clone.setComplaint(this.complaint);
}

if(this.taxIncome != null) {
clone.setTaxIncome(this.taxIncome);
}

if(this.wood != null) {
clone.setWood(this.wood);
}

if(this.food != null) {
clone.setFood(this.food);
}

if(this.support != null) {
clone.setSupport(this.support);
}

if(this.troopCostFood != null) {
clone.setTroopCostFood(this.troopCostFood);
}

if(this.workPeople != null) {
clone.setWorkPeople(this.workPeople);
}

if(this.herosSalary != null) {
clone.setHerosSalary(this.herosSalary);
}

if(this.maxPopulation != null) {
clone.setMaxPopulation(this.maxPopulation);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.texRate != null) {
aso.put("texRate", texRate);
}

if(this.buildPeople != null) {
aso.put("buildPeople", buildPeople);
}

if(this.stone != null) {
aso.put("stone", stone.toASObject());
}

if(this.populationDirection != null) {
aso.put("populationDirection", populationDirection);
}

if(this.gold != null) {
aso.put("gold", gold);
}

if(this.iron != null) {
aso.put("iron", iron.toASObject());
}

if(this.curPopulation != null) {
aso.put("curPopulation", curPopulation);
}

if(this.complaint != null) {
aso.put("complaint", complaint);
}

if(this.taxIncome != null) {
aso.put("taxIncome", taxIncome);
}

if(this.wood != null) {
aso.put("wood", wood.toASObject());
}

if(this.food != null) {
aso.put("food", food.toASObject());
}

if(this.support != null) {
aso.put("support", support);
}

if(this.troopCostFood != null) {
aso.put("troopCostFood", troopCostFood);
}

if(this.workPeople != null) {
aso.put("workPeople", workPeople);
}

if(this.herosSalary != null) {
aso.put("herosSalary", herosSalary);
}

if(this.maxPopulation != null) {
aso.put("maxPopulation", maxPopulation);
}

return aso;
}

public Integer getTexRate() {
return texRate;
}

public void setTexRate(Integer texRate) {
this.texRate = texRate;
}

public Integer getBuildPeople() {
return buildPeople;
}

public void setBuildPeople(Integer buildPeople) {
this.buildPeople = buildPeople;
}

public ResourceInfoBean getStone() {
return stone;
}

public void setStone(ResourceInfoBean stone) {
this.stone = stone;
}

public Integer getPopulationDirection() {
return populationDirection;
}

public void setPopulationDirection(Integer populationDirection) {
this.populationDirection = populationDirection;
}

public Double getGold() {
return gold;
}

public void setGold(Double gold) {
this.gold = gold;
}

public ResourceInfoBean getIron() {
return iron;
}

public void setIron(ResourceInfoBean iron) {
this.iron = iron;
}

public Integer getCurPopulation() {
return curPopulation;
}

public void setCurPopulation(Integer curPopulation) {
this.curPopulation = curPopulation;
}

public Integer getComplaint() {
return complaint;
}

public void setComplaint(Integer complaint) {
this.complaint = complaint;
}

public Integer getTaxIncome() {
return taxIncome;
}

public void setTaxIncome(Integer taxIncome) {
this.taxIncome = taxIncome;
}

public ResourceInfoBean getWood() {
return wood;
}

public void setWood(ResourceInfoBean wood) {
this.wood = wood;
}

public ResourceInfoBean getFood() {
return food;
}

public void setFood(ResourceInfoBean food) {
this.food = food;
}

public Integer getSupport() {
return support;
}

public void setSupport(Integer support) {
this.support = support;
}

public Double getTroopCostFood() {
return troopCostFood;
}

public void setTroopCostFood(Double troopCostFood) {
this.troopCostFood = troopCostFood;
}

public Integer getWorkPeople() {
return workPeople;
}

public void setWorkPeople(Integer workPeople) {
this.workPeople = workPeople;
}

public Integer getHerosSalary() {
return herosSalary;
}

public void setHerosSalary(Integer herosSalary) {
this.herosSalary = herosSalary;
}

public Integer getMaxPopulation() {
return maxPopulation;
}

public void setMaxPopulation(Integer maxPopulation) {
this.maxPopulation = maxPopulation;
}
}
