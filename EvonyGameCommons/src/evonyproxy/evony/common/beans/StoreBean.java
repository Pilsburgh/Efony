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
public class StoreBean implements EvonyPacket {
private Integer storePercent = null;
private Integer magnitude = null;
private Integer warehourseCapacity = null;
private Integer resLimt = null;
private Integer unstorage = null;
private Integer storeTypeId = null;
private Integer storage = null;

public StoreBean(ASObject aso) {

if(aso.get("storePercent") != null) {
this.storePercent = (Integer) aso.get("storePercent");
}

if(aso.get("magnitude") != null) {
this.magnitude = (Integer) aso.get("magnitude");
}

if(aso.get("warehourseCapacity") != null) {
this.warehourseCapacity = (Integer) aso.get("warehourseCapacity");
}

if(aso.get("resLimt") != null) {
this.resLimt = (Integer) aso.get("resLimt");
}

if(aso.get("unstorage") != null) {
this.unstorage = (Integer) aso.get("unstorage");
}

if(aso.get("storeTypeId") != null) {
this.storeTypeId = (Integer) aso.get("storeTypeId");
}

if(aso.get("storage") != null) {
this.storage = (Integer) aso.get("storage");
}
}

public StoreBean() {
}

@Override
public StoreBean clone() {
StoreBean clone = new StoreBean();

if(this.storePercent != null) {
clone.setStorePercent(this.storePercent);
}

if(this.magnitude != null) {
clone.setMagnitude(this.magnitude);
}

if(this.warehourseCapacity != null) {
clone.setWarehourseCapacity(this.warehourseCapacity);
}

if(this.resLimt != null) {
clone.setResLimt(this.resLimt);
}

if(this.unstorage != null) {
clone.setUnstorage(this.unstorage);
}

if(this.storeTypeId != null) {
clone.setStoreTypeId(this.storeTypeId);
}

if(this.storage != null) {
clone.setStorage(this.storage);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.storePercent != null) {
aso.put("storePercent", storePercent);
}

if(this.magnitude != null) {
aso.put("magnitude", magnitude);
}

if(this.warehourseCapacity != null) {
aso.put("warehourseCapacity", warehourseCapacity);
}

if(this.resLimt != null) {
aso.put("resLimt", resLimt);
}

if(this.unstorage != null) {
aso.put("unstorage", unstorage);
}

if(this.storeTypeId != null) {
aso.put("storeTypeId", storeTypeId);
}

if(this.storage != null) {
aso.put("storage", storage);
}

return aso;
}

public Integer getStorePercent() {
return storePercent;
}

public void setStorePercent(Integer storePercent) {
this.storePercent = storePercent;
}

public Integer getMagnitude() {
return magnitude;
}

public void setMagnitude(Integer magnitude) {
this.magnitude = magnitude;
}

public Integer getWarehourseCapacity() {
return warehourseCapacity;
}

public void setWarehourseCapacity(Integer warehourseCapacity) {
this.warehourseCapacity = warehourseCapacity;
}

public Integer getResLimt() {
return resLimt;
}

public void setResLimt(Integer resLimt) {
this.resLimt = resLimt;
}

public Integer getUnstorage() {
return unstorage;
}

public void setUnstorage(Integer unstorage) {
this.unstorage = unstorage;
}

public Integer getStoreTypeId() {
return storeTypeId;
}

public void setStoreTypeId(Integer storeTypeId) {
this.storeTypeId = storeTypeId;
}

public Integer getStorage() {
return storage;
}

public void setStorage(Integer storage) {
this.storage = storage;
}
}
