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
public class BuyResourceBean implements EvonyPacket {
private Integer forFood = null;
private Integer foodRemain = null;
private Integer woodRemain = null;
private Integer forStone = null;
private Integer ironRemain = null;
private Integer stoneRemain = null;
private Integer forWood = null;
private Integer forIron = null;

public BuyResourceBean(ASObject aso) {

if(aso.get("forFood") != null) {
this.forFood = (Integer) aso.get("forFood");
}

if(aso.get("foodRemain") != null) {
this.foodRemain = (Integer) aso.get("foodRemain");
}

if(aso.get("woodRemain") != null) {
this.woodRemain = (Integer) aso.get("woodRemain");
}

if(aso.get("forStone") != null) {
this.forStone = (Integer) aso.get("forStone");
}

if(aso.get("ironRemain") != null) {
this.ironRemain = (Integer) aso.get("ironRemain");
}

if(aso.get("stoneRemain") != null) {
this.stoneRemain = (Integer) aso.get("stoneRemain");
}

if(aso.get("forWood") != null) {
this.forWood = (Integer) aso.get("forWood");
}

if(aso.get("forIron") != null) {
this.forIron = (Integer) aso.get("forIron");
}
}

public BuyResourceBean() {
}

@Override
public BuyResourceBean clone() {
BuyResourceBean clone = new BuyResourceBean();

if(this.forFood != null) {
clone.setForFood(this.forFood);
}

if(this.foodRemain != null) {
clone.setFoodRemain(this.foodRemain);
}

if(this.woodRemain != null) {
clone.setWoodRemain(this.woodRemain);
}

if(this.forStone != null) {
clone.setForStone(this.forStone);
}

if(this.ironRemain != null) {
clone.setIronRemain(this.ironRemain);
}

if(this.stoneRemain != null) {
clone.setStoneRemain(this.stoneRemain);
}

if(this.forWood != null) {
clone.setForWood(this.forWood);
}

if(this.forIron != null) {
clone.setForIron(this.forIron);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.forFood != null) {
aso.put("forFood", forFood);
}

if(this.foodRemain != null) {
aso.put("foodRemain", foodRemain);
}

if(this.woodRemain != null) {
aso.put("woodRemain", woodRemain);
}

if(this.forStone != null) {
aso.put("forStone", forStone);
}

if(this.ironRemain != null) {
aso.put("ironRemain", ironRemain);
}

if(this.stoneRemain != null) {
aso.put("stoneRemain", stoneRemain);
}

if(this.forWood != null) {
aso.put("forWood", forWood);
}

if(this.forIron != null) {
aso.put("forIron", forIron);
}

return aso;
}

public Integer getForFood() {
return forFood;
}

public void setForFood(Integer forFood) {
this.forFood = forFood;
}

public Integer getFoodRemain() {
return foodRemain;
}

public void setFoodRemain(Integer foodRemain) {
this.foodRemain = foodRemain;
}

public Integer getWoodRemain() {
return woodRemain;
}

public void setWoodRemain(Integer woodRemain) {
this.woodRemain = woodRemain;
}

public Integer getForStone() {
return forStone;
}

public void setForStone(Integer forStone) {
this.forStone = forStone;
}

public Integer getIronRemain() {
return ironRemain;
}

public void setIronRemain(Integer ironRemain) {
this.ironRemain = ironRemain;
}

public Integer getStoneRemain() {
return stoneRemain;
}

public void setStoneRemain(Integer stoneRemain) {
this.stoneRemain = stoneRemain;
}

public Integer getForWood() {
return forWood;
}

public void setForWood(Integer forWood) {
this.forWood = forWood;
}

public Integer getForIron() {
return forIron;
}

public void setForIron(Integer forIron) {
this.forIron = forIron;
}
}
