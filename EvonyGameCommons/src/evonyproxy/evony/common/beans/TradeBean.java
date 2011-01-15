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
public class TradeBean implements EvonyPacket {
private String resourceName = null;
private Double price = null;
private Integer amount = null;
private Integer id = null;
private Integer tradeType = null;
private String tradeTypeName = null;
private Integer dealedAmount = null;
private Double dealedTotal = null;
private Integer resType = null;

public TradeBean(ASObject aso) {

if(aso.get("resourceName") != null) {
this.resourceName = (String) aso.get("resourceName");
}

if(aso.get("price") != null) {
this.price = (Double) aso.get("price");
}

if(aso.get("amount") != null) {
this.amount = (Integer) aso.get("amount");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}

if(aso.get("tradeType") != null) {
this.tradeType = (Integer) aso.get("tradeType");
}

if(aso.get("tradeTypeName") != null) {
this.tradeTypeName = (String) aso.get("tradeTypeName");
}

if(aso.get("dealedAmount") != null) {
this.dealedAmount = (Integer) aso.get("dealedAmount");
}

if(aso.get("dealedTotal") != null) {
this.dealedTotal = (Double) aso.get("dealedTotal");
}

if(aso.get("resType") != null) {
this.resType = (Integer) aso.get("resType");
}
}

public TradeBean() {
}

@Override
public TradeBean clone() {
TradeBean clone = new TradeBean();

if(this.resourceName != null) {
clone.setResourceName(this.resourceName);
}

if(this.price != null) {
clone.setPrice(this.price);
}

if(this.amount != null) {
clone.setAmount(this.amount);
}

if(this.id != null) {
clone.setId(this.id);
}

if(this.tradeType != null) {
clone.setTradeType(this.tradeType);
}

if(this.tradeTypeName != null) {
clone.setTradeTypeName(this.tradeTypeName);
}

if(this.dealedAmount != null) {
clone.setDealedAmount(this.dealedAmount);
}

if(this.dealedTotal != null) {
clone.setDealedTotal(this.dealedTotal);
}

if(this.resType != null) {
clone.setResType(this.resType);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.resourceName != null) {
aso.put("resourceName", resourceName);
}

if(this.price != null) {
aso.put("price", price);
}

if(this.amount != null) {
aso.put("amount", amount);
}

if(this.id != null) {
aso.put("id", id);
}

if(this.tradeType != null) {
aso.put("tradeType", tradeType);
}

if(this.tradeTypeName != null) {
aso.put("tradeTypeName", tradeTypeName);
}

if(this.dealedAmount != null) {
aso.put("dealedAmount", dealedAmount);
}

if(this.dealedTotal != null) {
aso.put("dealedTotal", dealedTotal);
}

if(this.resType != null) {
aso.put("resType", resType);
}

return aso;
}

public String getResourceName() {
return resourceName;
}

public void setResourceName(String resourceName) {
this.resourceName = resourceName;
}

public Double getPrice() {
return price;
}

public void setPrice(Double price) {
this.price = price;
}

public Integer getAmount() {
return amount;
}

public void setAmount(Integer amount) {
this.amount = amount;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getTradeType() {
return tradeType;
}

public void setTradeType(Integer tradeType) {
this.tradeType = tradeType;
}

public String getTradeTypeName() {
return tradeTypeName;
}

public void setTradeTypeName(String tradeTypeName) {
this.tradeTypeName = tradeTypeName;
}

public Integer getDealedAmount() {
return dealedAmount;
}

public void setDealedAmount(Integer dealedAmount) {
this.dealedAmount = dealedAmount;
}

public Double getDealedTotal() {
return dealedTotal;
}

public void setDealedTotal(Double dealedTotal) {
this.dealedTotal = dealedTotal;
}

public Integer getResType() {
return resType;
}

public void setResType(Integer resType) {
this.resType = resType;
}
}
