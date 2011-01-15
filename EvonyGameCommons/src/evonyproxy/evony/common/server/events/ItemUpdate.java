package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;
import evonyproxy.evony.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class ItemUpdate implements EvonyPacket {
public ArrayList<ItemBean> items = null;

public ItemUpdate(ASObject aso) {
items = new ArrayList<ItemBean>();

if(aso.get("items") != null) {
Object[] objArr = (Object[]) aso.get("items");
for(int j = 0; j < objArr.length; j++) {
items.add(new ItemBean((ASObject) objArr[j]));
}
}
}

public ItemUpdate() {
}

@Override
public ItemUpdate clone() {
ItemUpdate clone = new ItemUpdate();

if(this.items != null) {
ArrayList tmpArrLst = new ArrayList<ItemBean>();

for(Object bean : items) {
ItemBean tmpBean = (ItemBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setItems(tmpArrLst);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.items != null) {
ArrayList al = new ArrayList();
for(Object obj : items) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("items", al);
}

return aso;
}

public ArrayList getItems() {
return items;
}

public void setItems(ArrayList items) {
this.items = items;
}
}
