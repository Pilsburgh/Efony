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
public class SaleTypeBean implements ASObjectable {
private String items = null;
private String typeName = null;

public SaleTypeBean(ASObject aso) {

if(aso.get("items") != null) {
this.items = (String) aso.get("items");
}

if(aso.get("typeName") != null) {
this.typeName = (String) aso.get("typeName");
}
}

public SaleTypeBean() {
}

@Override
public SaleTypeBean clone() {
SaleTypeBean clone = new SaleTypeBean();

if(this.items != null) {
clone.setItems(this.items);
}

if(this.typeName != null) {
clone.setTypeName(this.typeName);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.items != null) {
aso.put("items", items);
}

if(this.typeName != null) {
aso.put("typeName", typeName);
}

return aso;
}

public String getItems() {
return items;
}

public void setItems(String items) {
this.items = items;
}

public String getTypeName() {
return typeName;
}

public void setTypeName(String typeName) {
this.typeName = typeName;
}
}
