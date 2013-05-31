package evonyproxy.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;
import evonyproxy.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class FriendArmysUpdate implements ASObjectable {
public ArrayList<ArmyBean> armys = null;

public FriendArmysUpdate(ASObject aso) {
armys = new ArrayList<ArmyBean>();

if(aso.get("armys") != null) {
Object[] objArr = (Object[]) aso.get("armys");
for(int j = 0; j < objArr.length; j++) {
armys.add(new ArmyBean((ASObject) objArr[j]));
}
}
}

public FriendArmysUpdate() {
}

@Override
public FriendArmysUpdate clone() {
FriendArmysUpdate clone = new FriendArmysUpdate();

if(this.armys != null) {
ArrayList tmpArrLst = new ArrayList<ArmyBean>();

for(Object bean : armys) {
ArmyBean tmpBean = (ArmyBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setArmys(tmpArrLst);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.armys != null) {
ArrayList al = new ArrayList();
for(Object obj : armys) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("armys", al);
}

return aso;
}

public ArrayList getArmys() {
return armys;
}

public void setArmys(ArrayList armys) {
this.armys = armys;
}
}
