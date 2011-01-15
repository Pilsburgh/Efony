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
public class SetShowInfro implements EvonyPacket {
private Integer selectshowheroid = null;

public SetShowInfro(ASObject aso) {

if(aso.get("selectshowheroid") != null) {
this.selectshowheroid = (Integer) aso.get("selectshowheroid");
}
}

public SetShowInfro() {
}

@Override
public SetShowInfro clone() {
SetShowInfro clone = new SetShowInfro();

if(this.selectshowheroid != null) {
clone.setSelectshowheroid(this.selectshowheroid);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.selectshowheroid != null) {
aso.put("selectshowheroid", selectshowheroid);
}

return aso;
}

public Integer getSelectshowheroid() {
return selectshowheroid;
}

public void setSelectshowheroid(Integer selectshowheroid) {
this.selectshowheroid = selectshowheroid;
}
}
