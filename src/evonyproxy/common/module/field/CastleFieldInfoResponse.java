package evonyproxy.common.module.field;

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
public class CastleFieldInfoResponse implements ASObjectable {
public ArrayList<FieldBean> fields = null;
public Double packageId = null;
public String msg = null;
public String errorMsg = null;
public Integer ok = null;

public CastleFieldInfoResponse(ASObject aso) {
fields = new ArrayList<FieldBean>();

if(aso.get("fields") != null) {
Object[] objArr = (Object[]) aso.get("fields");
for(int j = 0; j < objArr.length; j++) {
fields.add(new FieldBean((ASObject) objArr[j]));
}
}

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public CastleFieldInfoResponse() {
}

@Override
public CastleFieldInfoResponse clone() {
CastleFieldInfoResponse clone = new CastleFieldInfoResponse();

if(this.fields != null) {
ArrayList tmpArrLst = new ArrayList<FieldBean>();

for(Object bean : fields) {
FieldBean tmpBean = (FieldBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setFields(tmpArrLst);
}

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.fields != null) {
ArrayList al = new ArrayList();
for(Object obj : fields) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("fields", al);
}

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public ArrayList getFields() {
return fields;
}

public void setFields(ArrayList fields) {
this.fields = fields;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
