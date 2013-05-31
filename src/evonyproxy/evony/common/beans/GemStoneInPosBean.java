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
public class GemStoneInPosBean implements EvonyPacket {
private ArrayList<GemStoneLvInfroBean> infro = null;
private Integer pos = null;

public GemStoneInPosBean(ASObject aso) {
infro = new ArrayList<GemStoneLvInfroBean>();

if(aso.get("infro") != null) {
Object[] objArr = (Object[]) aso.get("infro");
for(int j = 0; j < objArr.length; j++) {
infro.add(new GemStoneLvInfroBean((ASObject) objArr[j]));
}
}

if(aso.get("pos") != null) {
this.pos = (Integer) aso.get("pos");
}
}

public GemStoneInPosBean() {
}

@Override
public GemStoneInPosBean clone() {
GemStoneInPosBean clone = new GemStoneInPosBean();

if(this.infro != null) {
ArrayList tmpArrLst = new ArrayList<GemStoneLvInfroBean>();

for(Object bean : infro) {
GemStoneLvInfroBean tmpBean = (GemStoneLvInfroBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setInfro(tmpArrLst);
}

if(this.pos != null) {
clone.setPos(this.pos);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.infro != null) {
ArrayList al = new ArrayList();
for(Object obj : infro) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("infro", al);
}

if(this.pos != null) {
aso.put("pos", pos);
}

return aso;
}

public ArrayList getInfro() {
return infro;
}

public void setInfro(ArrayList infro) {
this.infro = infro;
}

public Integer getPos() {
return pos;
}

public void setPos(Integer pos) {
this.pos = pos;
}
}
