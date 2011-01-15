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
public class GemStoneBean implements ASObjectable {
private String gemstoneid = null;

public GemStoneBean(ASObject aso) {

if(aso.get("gemstoneid") != null) {
this.gemstoneid = (String) aso.get("gemstoneid");
}
}

public GemStoneBean() {
}

@Override
public GemStoneBean clone() {
GemStoneBean clone = new GemStoneBean();

if(this.gemstoneid != null) {
clone.setGemstoneid(this.gemstoneid);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.gemstoneid != null) {
aso.put("gemstoneid", gemstoneid);
}

return aso;
}

public String getGemstoneid() {
return gemstoneid;
}

public void setGemstoneid(String gemstoneid) {
this.gemstoneid = gemstoneid;
}
}
