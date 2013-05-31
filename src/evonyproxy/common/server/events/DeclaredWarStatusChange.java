package evonyproxy.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;

/**
* @version .02
* @author Michael Archibald
*/
public class DeclaredWarStatusChange implements ASObjectable {
public Integer status = null;
public String userName = null;

public DeclaredWarStatusChange(ASObject aso) {

if(aso.get("status") != null) {
this.status = (Integer) aso.get("status");
}

if(aso.get("userName") != null) {
this.userName = (String) aso.get("userName");
}
}

public DeclaredWarStatusChange() {
}

@Override
public DeclaredWarStatusChange clone() {
DeclaredWarStatusChange clone = new DeclaredWarStatusChange();

if(this.status != null) {
clone.setStatus(this.status);
}

if(this.userName != null) {
clone.setUserName(this.userName);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.status != null) {
aso.put("status", status);
}

if(this.userName != null) {
aso.put("userName", userName);
}

return aso;
}

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public String getUserName() {
return userName;
}

public void setUserName(String userName) {
this.userName = userName;
}
}
