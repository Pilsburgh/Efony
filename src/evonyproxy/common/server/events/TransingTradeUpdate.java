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
public class TransingTradeUpdate implements ASObjectable {
public TransingTradeBean bean = null;
public Integer updateType = null;
public Integer castleId = null;

public TransingTradeUpdate(ASObject aso) {

if(aso.get("bean") != null) {
this.bean = new TransingTradeBean((ASObject) aso.get("bean"));
}

if(aso.get("updateType") != null) {
this.updateType = (Integer) aso.get("updateType");
}

if(aso.get("castleId") != null) {
this.castleId = (Integer) aso.get("castleId");
}
}

public TransingTradeUpdate() {
}

@Override
public TransingTradeUpdate clone() {
TransingTradeUpdate clone = new TransingTradeUpdate();

if(this.bean != null) {
clone.setBean(this.bean);
}

if(this.updateType != null) {
clone.setUpdateType(this.updateType);
}

if(this.castleId != null) {
clone.setCastleId(this.castleId);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.bean != null) {
aso.put("bean", bean.toASObject());
}

if(this.updateType != null) {
aso.put("updateType", updateType);
}

if(this.castleId != null) {
aso.put("castleId", castleId);
}

return aso;
}

public TransingTradeBean getBean() {
return bean;
}

public void setBean(TransingTradeBean bean) {
this.bean = bean;
}

public Integer getUpdateType() {
return updateType;
}

public void setUpdateType(Integer updateType) {
this.updateType = updateType;
}

public Integer getCastleId() {
return castleId;
}

public void setCastleId(Integer castleId) {
this.castleId = castleId;
}
}
