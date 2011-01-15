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
public class ConditionBean implements ASObjectable {
private Integer stone = null;
private Integer gold = null;
private Integer iron = null;
private Double destructTime = null;
private ArrayList<ConditionDependItemBean> items = null;
private ArrayList<ConditionDependTechBean> techs = null;
private Integer wood = null;
private Integer population = null;
private Integer food = null;
private ArrayList<BuildingBean> buildings = null;
private Double time = null;

public ConditionBean(ASObject aso) {
items = new ArrayList<ConditionDependItemBean>();
techs = new ArrayList<ConditionDependTechBean>();
buildings = new ArrayList<BuildingBean>();

if(aso.get("stone") != null) {
this.stone = (Integer) aso.get("stone");
}

if(aso.get("gold") != null) {
this.gold = (Integer) aso.get("gold");
}

if(aso.get("iron") != null) {
this.iron = (Integer) aso.get("iron");
}

if(aso.get("destructTime") != null) {
this.destructTime = (Double) aso.get("destructTime");
}

if(aso.get("items") != null) {
Object[] objArr = (Object[]) aso.get("items");
for(int j = 0; j < objArr.length; j++) {
items.add(new ConditionDependItemBean((ASObject) objArr[j]));
}
}

if(aso.get("techs") != null) {
Object[] objArr = (Object[]) aso.get("techs");
for(int j = 0; j < objArr.length; j++) {
techs.add(new ConditionDependTechBean((ASObject) objArr[j]));
}
}

if(aso.get("wood") != null) {
this.wood = (Integer) aso.get("wood");
}

if(aso.get("population") != null) {
this.population = (Integer) aso.get("population");
}

if(aso.get("food") != null) {
this.food = (Integer) aso.get("food");
}

if(aso.get("buildings") != null) {
Object[] objArr = (Object[]) aso.get("buildings");
for(int j = 0; j < objArr.length; j++) {
buildings.add(new BuildingBean((ASObject) objArr[j]));
}
}

if(aso.get("time") != null) {
this.time = (Double) aso.get("time");
}
}

public ConditionBean() {
}

@Override
public ConditionBean clone() {
ConditionBean clone = new ConditionBean();

if(this.stone != null) {
clone.setStone(this.stone);
}

if(this.gold != null) {
clone.setGold(this.gold);
}

if(this.iron != null) {
clone.setIron(this.iron);
}

if(this.destructTime != null) {
clone.setDestructTime(this.destructTime);
}

if(this.items != null) {
ArrayList tmpArrLst = new ArrayList<ConditionDependItemBean>();

for(Object bean : items) {
ConditionDependItemBean tmpBean = (ConditionDependItemBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setItems(tmpArrLst);
}

if(this.techs != null) {
ArrayList tmpArrLst = new ArrayList<ConditionDependTechBean>();

for(Object bean : techs) {
ConditionDependTechBean tmpBean = (ConditionDependTechBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTechs(tmpArrLst);
}

if(this.wood != null) {
clone.setWood(this.wood);
}

if(this.population != null) {
clone.setPopulation(this.population);
}

if(this.food != null) {
clone.setFood(this.food);
}

if(this.buildings != null) {
ArrayList tmpArrLst = new ArrayList<BuildingBean>();

for(Object bean : buildings) {
BuildingBean tmpBean = (BuildingBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBuildings(tmpArrLst);
}

if(this.time != null) {
clone.setTime(this.time);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.stone != null) {
aso.put("stone", stone);
}

if(this.gold != null) {
aso.put("gold", gold);
}

if(this.iron != null) {
aso.put("iron", iron);
}

if(this.destructTime != null) {
aso.put("destructTime", destructTime);
}

if(this.items != null) {
ArrayList al = new ArrayList();
for(Object obj : items) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("items", al);
}

if(this.techs != null) {
ArrayList al = new ArrayList();
for(Object obj : techs) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("techs", al);
}

if(this.wood != null) {
aso.put("wood", wood);
}

if(this.population != null) {
aso.put("population", population);
}

if(this.food != null) {
aso.put("food", food);
}

if(this.buildings != null) {
ArrayList al = new ArrayList();
for(Object obj : buildings) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("buildings", al);
}

if(this.time != null) {
aso.put("time", time);
}

return aso;
}

public Integer getStone() {
return stone;
}

public void setStone(Integer stone) {
this.stone = stone;
}

public Integer getGold() {
return gold;
}

public void setGold(Integer gold) {
this.gold = gold;
}

public Integer getIron() {
return iron;
}

public void setIron(Integer iron) {
this.iron = iron;
}

public Double getDestructTime() {
return destructTime;
}

public void setDestructTime(Double destructTime) {
this.destructTime = destructTime;
}

public ArrayList getItems() {
return items;
}

public void setItems(ArrayList items) {
this.items = items;
}

public ArrayList getTechs() {
return techs;
}

public void setTechs(ArrayList techs) {
this.techs = techs;
}

public Integer getWood() {
return wood;
}

public void setWood(Integer wood) {
this.wood = wood;
}

public Integer getPopulation() {
return population;
}

public void setPopulation(Integer population) {
this.population = population;
}

public Integer getFood() {
return food;
}

public void setFood(Integer food) {
this.food = food;
}

public ArrayList getBuildings() {
return buildings;
}

public void setBuildings(ArrayList buildings) {
this.buildings = buildings;
}

public Double getTime() {
return time;
}

public void setTime(Double time) {
this.time = time;
}
}
