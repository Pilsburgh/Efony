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
public class GemStoneLvInfroBean implements ASObjectable {
private ArrayList<GemStoneBean> gemstoneids = null;
private Integer lv = null;

public GemStoneLvInfroBean(ASObject aso) {
gemstoneids = new ArrayList<GemStoneBean>();

if(aso.get("gemstoneids") != null) {
Object[] objArr = (Object[]) aso.get("gemstoneids");
for(int j = 0; j < objArr.length; j++) {
gemstoneids.add(new GemStoneBean((ASObject) objArr[j]));
}
}

if(aso.get("lv") != null) {
this.lv = (Integer) aso.get("lv");
}
}

public GemStoneLvInfroBean() {
}

@Override
public GemStoneLvInfroBean clone() {
GemStoneLvInfroBean clone = new GemStoneLvInfroBean();

if(this.gemstoneids != null) {
ArrayList tmpArrLst = new ArrayList<GemStoneBean>();

for(Object bean : gemstoneids) {
GemStoneBean tmpBean = (GemStoneBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setGemstoneids(tmpArrLst);
}

if(this.lv != null) {
clone.setLv(this.lv);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.gemstoneids != null) {
ArrayList al = new ArrayList();
for(Object obj : gemstoneids) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("gemstoneids", al);
}

if(this.lv != null) {
aso.put("lv", lv);
}

return aso;
}

public ArrayList getGemstoneids() {
return gemstoneids;
}

public void setGemstoneids(ArrayList gemstoneids) {
this.gemstoneids = gemstoneids;
}

public Integer getLv() {
return lv;
}

public void setLv(Integer lv) {
this.lv = lv;
}
}
