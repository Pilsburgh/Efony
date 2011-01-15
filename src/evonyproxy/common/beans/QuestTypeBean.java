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
public class QuestTypeBean implements ASObjectable {
private Boolean isFinish = null;
private Integer version = null;
private String name = null;
private String description = null;
private Integer mainId = null;
private Integer typeId = null;

public QuestTypeBean(ASObject aso) {

if(aso.get("isFinish") != null) {
this.isFinish = (Boolean) aso.get("isFinish");
}

if(aso.get("version") != null) {
this.version = (Integer) aso.get("version");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("description") != null) {
this.description = (String) aso.get("description");
}

if(aso.get("mainId") != null) {
this.mainId = (Integer) aso.get("mainId");
}

if(aso.get("typeId") != null) {
this.typeId = (Integer) aso.get("typeId");
}
}

public QuestTypeBean() {
}

@Override
public QuestTypeBean clone() {
QuestTypeBean clone = new QuestTypeBean();

if(this.isFinish != null) {
clone.setIsFinish(this.isFinish);
}

if(this.version != null) {
clone.setVersion(this.version);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.description != null) {
clone.setDescription(this.description);
}

if(this.mainId != null) {
clone.setMainId(this.mainId);
}

if(this.typeId != null) {
clone.setTypeId(this.typeId);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.isFinish != null) {
aso.put("isFinish", isFinish);
}

if(this.version != null) {
aso.put("version", version);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.description != null) {
aso.put("description", description);
}

if(this.mainId != null) {
aso.put("mainId", mainId);
}

if(this.typeId != null) {
aso.put("typeId", typeId);
}

return aso;
}

public Boolean getIsFinish() {
return isFinish;
}

public void setIsFinish(Boolean isFinish) {
this.isFinish = isFinish;
}

public Integer getVersion() {
return version;
}

public void setVersion(Integer version) {
this.version = version;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public Integer getMainId() {
return mainId;
}

public void setMainId(Integer mainId) {
this.mainId = mainId;
}

public Integer getTypeId() {
return typeId;
}

public void setTypeId(Integer typeId) {
this.typeId = typeId;
}
}
