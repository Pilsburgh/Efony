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
public class ResourceInfoBean implements ASObjectable {
private Integer workPeople = null;
private Double increaseRate = null;
private Integer max = null;
private Integer storeRercent = null;
private Double amount = null;

public ResourceInfoBean(ASObject aso) {

if(aso.get("workPeople") != null) {
this.workPeople = (Integer) aso.get("workPeople");
}

if(aso.get("increaseRate") != null) {
this.increaseRate = (Double) aso.get("increaseRate");
}

if(aso.get("max") != null) {
this.max = (Integer) aso.get("max");
}

if(aso.get("storeRercent") != null) {
this.storeRercent = (Integer) aso.get("storeRercent");
}

if(aso.get("amount") != null) {
this.amount = (Double) aso.get("amount");
}
}

public ResourceInfoBean() {
}

@Override
public ResourceInfoBean clone() {
ResourceInfoBean clone = new ResourceInfoBean();

if(this.workPeople != null) {
clone.setWorkPeople(this.workPeople);
}

if(this.increaseRate != null) {
clone.setIncreaseRate(this.increaseRate);
}

if(this.max != null) {
clone.setMax(this.max);
}

if(this.storeRercent != null) {
clone.setStoreRercent(this.storeRercent);
}

if(this.amount != null) {
clone.setAmount(this.amount);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.workPeople != null) {
aso.put("workPeople", workPeople);
}

if(this.increaseRate != null) {
aso.put("increaseRate", increaseRate);
}

if(this.max != null) {
aso.put("max", max);
}

if(this.storeRercent != null) {
aso.put("storeRercent", storeRercent);
}

if(this.amount != null) {
aso.put("amount", amount);
}

return aso;
}

public Integer getWorkPeople() {
return workPeople;
}

public void setWorkPeople(Integer workPeople) {
this.workPeople = workPeople;
}

public Double getIncreaseRate() {
return increaseRate;
}

public void setIncreaseRate(Double increaseRate) {
this.increaseRate = increaseRate;
}

public Integer getMax() {
return max;
}

public void setMax(Integer max) {
this.max = max;
}

public Integer getStoreRercent() {
return storeRercent;
}

public void setStoreRercent(Integer storeRercent) {
this.storeRercent = storeRercent;
}

public Double getAmount() {
return amount;
}

public void setAmount(Double amount) {
this.amount = amount;
}
}
