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
public class MarketTradeBean implements EvonyPacket {
private Integer amount = null;
private Double price = null;

public MarketTradeBean(ASObject aso) {

if(aso.get("amount") != null) {
this.amount = (Integer) aso.get("amount");
}

if(aso.get("price") != null) {
this.price = (Double) aso.get("price");
}
}

public MarketTradeBean() {
}

@Override
public MarketTradeBean clone() {
MarketTradeBean clone = new MarketTradeBean();

if(this.amount != null) {
clone.setAmount(this.amount);
}

if(this.price != null) {
clone.setPrice(this.price);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.amount != null) {
aso.put("amount", amount);
}

if(this.price != null) {
aso.put("price", price);
}

return aso;
}

public Integer getAmount() {
return amount;
}

public void setAmount(Integer amount) {
this.amount = amount;
}

public Double getPrice() {
return price;
}

public void setPrice(Double price) {
this.price = price;
}
}
