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
public class PlayerBuffUpdate implements EvonyPacket {
public Integer updateType = null;
public BuffBean buffBean = null;

public PlayerBuffUpdate(ASObject aso) {

if(aso.get("updateType") != null) {
this.updateType = (Integer) aso.get("updateType");
}

if(aso.get("buffBean") != null) {
this.buffBean = new BuffBean((ASObject) aso.get("buffBean"));
}
}

public PlayerBuffUpdate() {
}

@Override
public PlayerBuffUpdate clone() {
PlayerBuffUpdate clone = new PlayerBuffUpdate();

if(this.updateType != null) {
clone.setUpdateType(this.updateType);
}

if(this.buffBean != null) {
clone.setBuffBean(this.buffBean);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.updateType != null) {
aso.put("updateType", updateType);
}

if(this.buffBean != null) {
aso.put("buffBean", buffBean.toASObject());
}

return aso;
}

public Integer getUpdateType() {
return updateType;
}

public void setUpdateType(Integer updateType) {
this.updateType = updateType;
}

public BuffBean getBuffBean() {
return buffBean;
}

public void setBuffBean(BuffBean buffBean) {
this.buffBean = buffBean;
}
}
