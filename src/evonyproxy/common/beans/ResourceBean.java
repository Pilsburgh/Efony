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
public class ResourceBean implements ASObjectable {
private Double wood = null;
private Double stone = null;
private Double food = null;
private Double gold = null;
private Double iron = null;

public ResourceBean(ASObject aso) {

if(aso.get("wood") != null) {
this.wood = (Double) aso.get("wood");
}

if(aso.get("stone") != null) {
this.stone = (Double) aso.get("stone");
}

if(aso.get("food") != null) {
this.food = (Double) aso.get("food");
}

if(aso.get("gold") != null) {
this.gold = (Double) aso.get("gold");
}

if(aso.get("iron") != null) {
this.iron = (Double) aso.get("iron");
}
}

public ResourceBean() {
}

@Override
public ResourceBean clone() {
ResourceBean clone = new ResourceBean();

if(this.wood != null) {
clone.setWood(this.wood);
}

if(this.stone != null) {
clone.setStone(this.stone);
}

if(this.food != null) {
clone.setFood(this.food);
}

if(this.gold != null) {
clone.setGold(this.gold);
}

if(this.iron != null) {
clone.setIron(this.iron);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.wood != null) {
aso.put("wood", wood);
}

if(this.stone != null) {
aso.put("stone", stone);
}

if(this.food != null) {
aso.put("food", food);
}

if(this.gold != null) {
aso.put("gold", gold);
}

if(this.iron != null) {
aso.put("iron", iron);
}

return aso;
}

public Double getWood() {
return wood;
}

public void setWood(Double wood) {
this.wood = wood;
}

public Double getStone() {
return stone;
}

public void setStone(Double stone) {
this.stone = stone;
}

public Double getFood() {
return food;
}

public void setFood(Double food) {
this.food = food;
}

public Double getGold() {
return gold;
}

public void setGold(Double gold) {
this.gold = gold;
}

public Double getIron() {
return iron;
}

public void setIron(Double iron) {
this.iron = iron;
}
}
