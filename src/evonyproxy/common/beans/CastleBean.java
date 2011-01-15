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
public class CastleBean implements ASObjectable {
private ArrayList<HeroBean> heros = null;
private Integer status = null;
private String name = null;
private ArrayList<TradeBean> transingTrades = null;
private CastleResourceBean resource = null;
private Boolean allowAlliance = null;
private ArrayList<TradeBean> trades = null;
private Integer powerlevel = null;
private Integer fieldId = null;
private Integer id = null;
private FortificationsBean fortification = null;
private ArrayList<BuildingBean> buildings = null;
private ArrayList<FieldBean> fields = null;
private Boolean hasEnemy = null;
private String logUrl = null;
private Integer icon = null;
private Boolean canChangeIcon = null;
private Boolean goOutForBattle = null;
private TroopBean troop = null;

public CastleBean(ASObject aso) {
heros = new ArrayList<HeroBean>();
transingTrades = new ArrayList<TradeBean>();
trades = new ArrayList<TradeBean>();
buildings = new ArrayList<BuildingBean>();
fields = new ArrayList<FieldBean>();

if(aso.get("heros") != null) {
Object[] objArr = (Object[]) aso.get("heros");
for(int j = 0; j < objArr.length; j++) {
heros.add(new HeroBean((ASObject) objArr[j]));
}
}

if(aso.get("status") != null) {
this.status = (Integer) aso.get("status");
}

if(aso.get("name") != null) {
this.name = (String) aso.get("name");
}

if(aso.get("transingTrades") != null) {
Object[] objArr = (Object[]) aso.get("transingTrades");
for(int j = 0; j < objArr.length; j++) {
transingTrades.add(new TradeBean((ASObject) objArr[j]));
}
}

if(aso.get("resource") != null) {
this.resource = new CastleResourceBean((ASObject) aso.get("resource"));
}

if(aso.get("allowAlliance") != null) {
this.allowAlliance = (Boolean) aso.get("allowAlliance");
}

if(aso.get("trades") != null) {
Object[] objArr = (Object[]) aso.get("trades");
for(int j = 0; j < objArr.length; j++) {
trades.add(new TradeBean((ASObject) objArr[j]));
}
}

if(aso.get("powerlevel") != null) {
this.powerlevel = (Integer) aso.get("powerlevel");
}

if(aso.get("fieldId") != null) {
this.fieldId = (Integer) aso.get("fieldId");
}

if(aso.get("id") != null) {
this.id = (Integer) aso.get("id");
}

if(aso.get("fortification") != null) {
this.fortification = new FortificationsBean((ASObject) aso.get("fortification"));
}

if(aso.get("buildings") != null) {
Object[] objArr = (Object[]) aso.get("buildings");
for(int j = 0; j < objArr.length; j++) {
buildings.add(new BuildingBean((ASObject) objArr[j]));
}
}

if(aso.get("fields") != null) {
Object[] objArr = (Object[]) aso.get("fields");
for(int j = 0; j < objArr.length; j++) {
fields.add(new FieldBean((ASObject) objArr[j]));
}
}

if(aso.get("hasEnemy") != null) {
this.hasEnemy = (Boolean) aso.get("hasEnemy");
}

if(aso.get("logUrl") != null) {
this.logUrl = (String) aso.get("logUrl");
}

if(aso.get("icon") != null) {
this.icon = (Integer) aso.get("icon");
}

if(aso.get("canChangeIcon") != null) {
this.canChangeIcon = (Boolean) aso.get("canChangeIcon");
}

if(aso.get("goOutForBattle") != null) {
this.goOutForBattle = (Boolean) aso.get("goOutForBattle");
}

if(aso.get("troop") != null) {
this.troop = new TroopBean((ASObject) aso.get("troop"));
}
}

public CastleBean() {
}

@Override
public CastleBean clone() {
CastleBean clone = new CastleBean();

if(this.heros != null) {
ArrayList tmpArrLst = new ArrayList<HeroBean>();

for(Object bean : heros) {
HeroBean tmpBean = (HeroBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setHeros(tmpArrLst);
}

if(this.status != null) {
clone.setStatus(this.status);
}

if(this.name != null) {
clone.setName(this.name);
}

if(this.transingTrades != null) {
ArrayList tmpArrLst = new ArrayList<TradeBean>();

for(Object bean : transingTrades) {
TradeBean tmpBean = (TradeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTransingTrades(tmpArrLst);
}

if(this.resource != null) {
clone.setResource(this.resource);
}

if(this.allowAlliance != null) {
clone.setAllowAlliance(this.allowAlliance);
}

if(this.trades != null) {
ArrayList tmpArrLst = new ArrayList<TradeBean>();

for(Object bean : trades) {
TradeBean tmpBean = (TradeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTrades(tmpArrLst);
}

if(this.powerlevel != null) {
clone.setPowerlevel(this.powerlevel);
}

if(this.fieldId != null) {
clone.setFieldId(this.fieldId);
}

if(this.id != null) {
clone.setId(this.id);
}

if(this.fortification != null) {
clone.setFortification(this.fortification);
}

if(this.buildings != null) {
ArrayList tmpArrLst = new ArrayList<BuildingBean>();

for(Object bean : buildings) {
BuildingBean tmpBean = (BuildingBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBuildings(tmpArrLst);
}

if(this.fields != null) {
ArrayList tmpArrLst = new ArrayList<FieldBean>();

for(Object bean : fields) {
FieldBean tmpBean = (FieldBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setFields(tmpArrLst);
}

if(this.hasEnemy != null) {
clone.setHasEnemy(this.hasEnemy);
}

if(this.logUrl != null) {
clone.setLogUrl(this.logUrl);
}

if(this.icon != null) {
clone.setIcon(this.icon);
}

if(this.canChangeIcon != null) {
clone.setCanChangeIcon(this.canChangeIcon);
}

if(this.goOutForBattle != null) {
clone.setGoOutForBattle(this.goOutForBattle);
}

if(this.troop != null) {
clone.setTroop(this.troop);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.heros != null) {
ArrayList al = new ArrayList();
for(Object obj : heros) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("heros", al);
}

if(this.status != null) {
aso.put("status", status);
}

if(this.name != null) {
aso.put("name", name);
}

if(this.transingTrades != null) {
ArrayList al = new ArrayList();
for(Object obj : transingTrades) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("transingTrades", al);
}

if(this.resource != null) {
aso.put("resource", resource.toASObject());
}

if(this.allowAlliance != null) {
aso.put("allowAlliance", allowAlliance);
}

if(this.trades != null) {
ArrayList al = new ArrayList();
for(Object obj : trades) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("trades", al);
}

if(this.powerlevel != null) {
aso.put("powerlevel", powerlevel);
}

if(this.fieldId != null) {
aso.put("fieldId", fieldId);
}

if(this.id != null) {
aso.put("id", id);
}

if(this.fortification != null) {
aso.put("fortification", fortification.toASObject());
}

if(this.buildings != null) {
ArrayList al = new ArrayList();
for(Object obj : buildings) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("buildings", al);
}

if(this.fields != null) {
ArrayList al = new ArrayList();
for(Object obj : fields) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("fields", al);
}

if(this.hasEnemy != null) {
aso.put("hasEnemy", hasEnemy);
}

if(this.logUrl != null) {
aso.put("logUrl", logUrl);
}

if(this.icon != null) {
aso.put("icon", icon);
}

if(this.canChangeIcon != null) {
aso.put("canChangeIcon", canChangeIcon);
}

if(this.goOutForBattle != null) {
aso.put("goOutForBattle", goOutForBattle);
}

if(this.troop != null) {
aso.put("troop", troop.toASObject());
}

return aso;
}

public ArrayList getHeros() {
return heros;
}

public void setHeros(ArrayList heros) {
this.heros = heros;
}

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public ArrayList getTransingTrades() {
return transingTrades;
}

public void setTransingTrades(ArrayList transingTrades) {
this.transingTrades = transingTrades;
}

public CastleResourceBean getResource() {
return resource;
}

public void setResource(CastleResourceBean resource) {
this.resource = resource;
}

public Boolean getAllowAlliance() {
return allowAlliance;
}

public void setAllowAlliance(Boolean allowAlliance) {
this.allowAlliance = allowAlliance;
}

public ArrayList getTrades() {
return trades;
}

public void setTrades(ArrayList trades) {
this.trades = trades;
}

public Integer getPowerlevel() {
return powerlevel;
}

public void setPowerlevel(Integer powerlevel) {
this.powerlevel = powerlevel;
}

public Integer getFieldId() {
return fieldId;
}

public void setFieldId(Integer fieldId) {
this.fieldId = fieldId;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public FortificationsBean getFortification() {
return fortification;
}

public void setFortification(FortificationsBean fortification) {
this.fortification = fortification;
}

public ArrayList getBuildings() {
return buildings;
}

public void setBuildings(ArrayList buildings) {
this.buildings = buildings;
}

public ArrayList getFields() {
return fields;
}

public void setFields(ArrayList fields) {
this.fields = fields;
}

public Boolean getHasEnemy() {
return hasEnemy;
}

public void setHasEnemy(Boolean hasEnemy) {
this.hasEnemy = hasEnemy;
}

public String getLogUrl() {
return logUrl;
}

public void setLogUrl(String logUrl) {
this.logUrl = logUrl;
}

public Integer getIcon() {
return icon;
}

public void setIcon(Integer icon) {
this.icon = icon;
}

public Boolean getCanChangeIcon() {
return canChangeIcon;
}

public void setCanChangeIcon(Boolean canChangeIcon) {
this.canChangeIcon = canChangeIcon;
}

public Boolean getGoOutForBattle() {
return goOutForBattle;
}

public void setGoOutForBattle(Boolean goOutForBattle) {
this.goOutForBattle = goOutForBattle;
}

public TroopBean getTroop() {
return troop;
}

public void setTroop(TroopBean troop) {
this.troop = troop;
}
}
