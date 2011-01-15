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
public class EffortListBean implements ASObjectable {
private String effortListInfo = null;
private Integer effortTypeid = null;

public EffortListBean(ASObject aso) {

if(aso.get("effortListInfo") != null) {
this.effortListInfo = (String) aso.get("effortListInfo");
}

if(aso.get("effortTypeid") != null) {
this.effortTypeid = (Integer) aso.get("effortTypeid");
}
}

public EffortListBean() {
}

@Override
public EffortListBean clone() {
EffortListBean clone = new EffortListBean();

if(this.effortListInfo != null) {
clone.setEffortListInfo(this.effortListInfo);
}

if(this.effortTypeid != null) {
clone.setEffortTypeid(this.effortTypeid);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.effortListInfo != null) {
aso.put("effortListInfo", effortListInfo);
}

if(this.effortTypeid != null) {
aso.put("effortTypeid", effortTypeid);
}

return aso;
}

public String getEffortListInfo() {
return effortListInfo;
}

public void setEffortListInfo(String effortListInfo) {
this.effortListInfo = effortListInfo;
}

public Integer getEffortTypeid() {
return effortTypeid;
}

public void setEffortTypeid(Integer effortTypeid) {
this.effortTypeid = effortTypeid;
}
}
