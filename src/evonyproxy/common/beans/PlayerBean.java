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
public class PlayerBean implements ASObjectable {
private ArrayList<PackageBean> packageBean = null;
private ArrayList<ItemBean> items = null;
private Integer redCount = null;
private ArrayList<BuffBean> buffs = null;
private ArrayList<CastleBean> castles = null;
private Boolean autoFurlough = null;
private Integer mapSizeX = null;
private Integer gameSpeed = null;
private Integer newReportCount_army = null;
private ArrayList<SaleTypeBean> saleTypeBeans = null;
private Integer newMailCount = null;
private Integer newReportCount_other = null;
private ArrayList<ArmyBean> friendArmys = null;
private Integer gamblingItemIndex = null;
private ArrayList<CastleSignInfoBean> castleSignBean = null;
private Boolean autoHeal = null;
private Integer newMaileCount_inbox = null;
private Integer newMaileCount_system = null;
private Boolean returnReport = null;
private Integer newReportCount = null;
private Boolean changedFace = null;
private Boolean furlough = null;
private ArrayList<ArmyBean> enemyArmys = null;
private ArrayList<EquipmenttechBean> equipments = null;
private Integer furloughDay = null;
private Integer mapSizeY = null;
private Integer finishedQuestCount = null;
private ArrayList<ItemBean> saleItemBeans = null;
private Integer effortPoint = null;
private ArrayList<PlayerInfoBean> friendBeans = null;
private Integer newReportCount_scout = null;
private ArrayList<ArmyBean> selfArmys = null;
private ArrayList<GemStoneInPosBean> gemstoneinpos = null;
private String currentDateTime = null;
private Double currentTime = null;
private String headline = null;
private ArrayList<TroopConfigBean> troopConfigBeans = null;
private Integer newReportCount_trade = null;
private ArrayList<SetShowInfro> setshowinfro = null;
private ArrayList<PlayerInfoBean> blockBeans = null;
private PlayerInfoBean playerInfo = null;

public PlayerBean(ASObject aso) {
packageBean = new ArrayList<PackageBean>();
items = new ArrayList<ItemBean>();
buffs = new ArrayList<BuffBean>();
castles = new ArrayList<CastleBean>();
saleTypeBeans = new ArrayList<SaleTypeBean>();
friendArmys = new ArrayList<ArmyBean>();
castleSignBean = new ArrayList<CastleSignInfoBean>();
enemyArmys = new ArrayList<ArmyBean>();
equipments = new ArrayList<EquipmenttechBean>();
saleItemBeans = new ArrayList<ItemBean>();
friendBeans = new ArrayList<PlayerInfoBean>();
selfArmys = new ArrayList<ArmyBean>();
gemstoneinpos = new ArrayList<GemStoneInPosBean>();
troopConfigBeans = new ArrayList<TroopConfigBean>();
setshowinfro = new ArrayList<SetShowInfro>();
blockBeans = new ArrayList<PlayerInfoBean>();

if(aso.get("packageBean") != null) {
Object[] objArr = (Object[]) aso.get("packageBean");
for(int j = 0; j < objArr.length; j++) {
packageBean.add(new PackageBean((ASObject) objArr[j]));
}
}

if(aso.get("items") != null) {
Object[] objArr = (Object[]) aso.get("items");
for(int j = 0; j < objArr.length; j++) {
items.add(new ItemBean((ASObject) objArr[j]));
}
}

if(aso.get("redCount") != null) {
this.redCount = (Integer) aso.get("redCount");
}

if(aso.get("buffs") != null) {
Object[] objArr = (Object[]) aso.get("buffs");
for(int j = 0; j < objArr.length; j++) {
buffs.add(new BuffBean((ASObject) objArr[j]));
}
}

if(aso.get("castles") != null) {
Object[] objArr = (Object[]) aso.get("castles");
for(int j = 0; j < objArr.length; j++) {
castles.add(new CastleBean((ASObject) objArr[j]));
}
}

if(aso.get("autoFurlough") != null) {
this.autoFurlough = (Boolean) aso.get("autoFurlough");
}

if(aso.get("mapSizeX") != null) {
this.mapSizeX = (Integer) aso.get("mapSizeX");
}

if(aso.get("gameSpeed") != null) {
this.gameSpeed = (Integer) aso.get("gameSpeed");
}

if(aso.get("newReportCount_army") != null) {
this.newReportCount_army = (Integer) aso.get("newReportCount_army");
}

if(aso.get("saleTypeBeans") != null) {
Object[] objArr = (Object[]) aso.get("saleTypeBeans");
for(int j = 0; j < objArr.length; j++) {
saleTypeBeans.add(new SaleTypeBean((ASObject) objArr[j]));
}
}

if(aso.get("newMailCount") != null) {
this.newMailCount = (Integer) aso.get("newMailCount");
}

if(aso.get("newReportCount_other") != null) {
this.newReportCount_other = (Integer) aso.get("newReportCount_other");
}

if(aso.get("friendArmys") != null) {
Object[] objArr = (Object[]) aso.get("friendArmys");
for(int j = 0; j < objArr.length; j++) {
friendArmys.add(new ArmyBean((ASObject) objArr[j]));
}
}

if(aso.get("gamblingItemIndex") != null) {
this.gamblingItemIndex = (Integer) aso.get("gamblingItemIndex");
}

if(aso.get("castleSignBean") != null) {
Object[] objArr = (Object[]) aso.get("castleSignBean");
for(int j = 0; j < objArr.length; j++) {
castleSignBean.add(new CastleSignInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("autoHeal") != null) {
this.autoHeal = (Boolean) aso.get("autoHeal");
}

if(aso.get("newMaileCount_inbox") != null) {
this.newMaileCount_inbox = (Integer) aso.get("newMaileCount_inbox");
}

if(aso.get("newMaileCount_system") != null) {
this.newMaileCount_system = (Integer) aso.get("newMaileCount_system");
}

if(aso.get("returnReport") != null) {
this.returnReport = (Boolean) aso.get("returnReport");
}

if(aso.get("newReportCount") != null) {
this.newReportCount = (Integer) aso.get("newReportCount");
}

if(aso.get("changedFace") != null) {
this.changedFace = (Boolean) aso.get("changedFace");
}

if(aso.get("furlough") != null) {
this.furlough = (Boolean) aso.get("furlough");
}

if(aso.get("enemyArmys") != null) {
Object[] objArr = (Object[]) aso.get("enemyArmys");
for(int j = 0; j < objArr.length; j++) {
enemyArmys.add(new ArmyBean((ASObject) objArr[j]));
}
}

if(aso.get("equipments") != null) {
Object[] objArr = (Object[]) aso.get("equipments");
for(int j = 0; j < objArr.length; j++) {
equipments.add(new EquipmenttechBean((ASObject) objArr[j]));
}
}

if(aso.get("furloughDay") != null) {
this.furloughDay = (Integer) aso.get("furloughDay");
}

if(aso.get("mapSizeY") != null) {
this.mapSizeY = (Integer) aso.get("mapSizeY");
}

if(aso.get("finishedQuestCount") != null) {
this.finishedQuestCount = (Integer) aso.get("finishedQuestCount");
}

if(aso.get("saleItemBeans") != null) {
Object[] objArr = (Object[]) aso.get("saleItemBeans");
for(int j = 0; j < objArr.length; j++) {
saleItemBeans.add(new ItemBean((ASObject) objArr[j]));
}
}

if(aso.get("effortPoint") != null) {
this.effortPoint = (Integer) aso.get("effortPoint");
}

if(aso.get("friendBeans") != null) {
Object[] objArr = (Object[]) aso.get("friendBeans");
for(int j = 0; j < objArr.length; j++) {
friendBeans.add(new PlayerInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("newReportCount_scout") != null) {
this.newReportCount_scout = (Integer) aso.get("newReportCount_scout");
}

if(aso.get("selfArmys") != null) {
Object[] objArr = (Object[]) aso.get("selfArmys");
for(int j = 0; j < objArr.length; j++) {
selfArmys.add(new ArmyBean((ASObject) objArr[j]));
}
}

if(aso.get("gemstoneinpos") != null) {
Object[] objArr = (Object[]) aso.get("gemstoneinpos");
for(int j = 0; j < objArr.length; j++) {
gemstoneinpos.add(new GemStoneInPosBean((ASObject) objArr[j]));
}
}

if(aso.get("currentDateTime") != null) {
this.currentDateTime = (String) aso.get("currentDateTime");
}

if(aso.get("currentTime") != null) {
this.currentTime = (Double) aso.get("currentTime");
}

if(aso.get("headline") != null) {
this.headline = (String) aso.get("headline");
}

if(aso.get("troopConfigBeans") != null) {
Object[] objArr = (Object[]) aso.get("troopConfigBeans");
for(int j = 0; j < objArr.length; j++) {
troopConfigBeans.add(new TroopConfigBean((ASObject) objArr[j]));
}
}

if(aso.get("newReportCount_trade") != null) {
this.newReportCount_trade = (Integer) aso.get("newReportCount_trade");
}

if(aso.get("setshowinfro") != null) {
Object[] objArr = (Object[]) aso.get("setshowinfro");
for(int j = 0; j < objArr.length; j++) {
setshowinfro.add(new SetShowInfro((ASObject) objArr[j]));
}
}

if(aso.get("blockBeans") != null) {
Object[] objArr = (Object[]) aso.get("blockBeans");
for(int j = 0; j < objArr.length; j++) {
blockBeans.add(new PlayerInfoBean((ASObject) objArr[j]));
}
}

if(aso.get("playerInfo") != null) {
this.playerInfo = new PlayerInfoBean((ASObject) aso.get("playerInfo"));
}
}

public PlayerBean() {
}

@Override
public PlayerBean clone() {
PlayerBean clone = new PlayerBean();

if(this.packageBean != null) {
ArrayList tmpArrLst = new ArrayList<PackageBean>();

for(Object bean : packageBean) {
PackageBean tmpBean = (PackageBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setPackageBean(tmpArrLst);
}

if(this.items != null) {
ArrayList tmpArrLst = new ArrayList<ItemBean>();

for(Object bean : items) {
ItemBean tmpBean = (ItemBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setItems(tmpArrLst);
}

if(this.redCount != null) {
clone.setRedCount(this.redCount);
}

if(this.buffs != null) {
ArrayList tmpArrLst = new ArrayList<BuffBean>();

for(Object bean : buffs) {
BuffBean tmpBean = (BuffBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBuffs(tmpArrLst);
}

if(this.castles != null) {
ArrayList tmpArrLst = new ArrayList<CastleBean>();

for(Object bean : castles) {
CastleBean tmpBean = (CastleBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setCastles(tmpArrLst);
}

if(this.autoFurlough != null) {
clone.setAutoFurlough(this.autoFurlough);
}

if(this.mapSizeX != null) {
clone.setMapSizeX(this.mapSizeX);
}

if(this.gameSpeed != null) {
clone.setGameSpeed(this.gameSpeed);
}

if(this.newReportCount_army != null) {
clone.setNewReportCount_army(this.newReportCount_army);
}

if(this.saleTypeBeans != null) {
ArrayList tmpArrLst = new ArrayList<SaleTypeBean>();

for(Object bean : saleTypeBeans) {
SaleTypeBean tmpBean = (SaleTypeBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setSaleTypeBeans(tmpArrLst);
}

if(this.newMailCount != null) {
clone.setNewMailCount(this.newMailCount);
}

if(this.newReportCount_other != null) {
clone.setNewReportCount_other(this.newReportCount_other);
}

if(this.friendArmys != null) {
ArrayList tmpArrLst = new ArrayList<ArmyBean>();

for(Object bean : friendArmys) {
ArmyBean tmpBean = (ArmyBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setFriendArmys(tmpArrLst);
}

if(this.gamblingItemIndex != null) {
clone.setGamblingItemIndex(this.gamblingItemIndex);
}

if(this.castleSignBean != null) {
ArrayList tmpArrLst = new ArrayList<CastleSignInfoBean>();

for(Object bean : castleSignBean) {
CastleSignInfoBean tmpBean = (CastleSignInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setCastleSignBean(tmpArrLst);
}

if(this.autoHeal != null) {
clone.setAutoHeal(this.autoHeal);
}

if(this.newMaileCount_inbox != null) {
clone.setNewMaileCount_inbox(this.newMaileCount_inbox);
}

if(this.newMaileCount_system != null) {
clone.setNewMaileCount_system(this.newMaileCount_system);
}

if(this.returnReport != null) {
clone.setReturnReport(this.returnReport);
}

if(this.newReportCount != null) {
clone.setNewReportCount(this.newReportCount);
}

if(this.changedFace != null) {
clone.setChangedFace(this.changedFace);
}

if(this.furlough != null) {
clone.setFurlough(this.furlough);
}

if(this.enemyArmys != null) {
ArrayList tmpArrLst = new ArrayList<ArmyBean>();

for(Object bean : enemyArmys) {
ArmyBean tmpBean = (ArmyBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setEnemyArmys(tmpArrLst);
}

if(this.equipments != null) {
ArrayList tmpArrLst = new ArrayList<EquipmenttechBean>();

for(Object bean : equipments) {
EquipmenttechBean tmpBean = (EquipmenttechBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setEquipments(tmpArrLst);
}

if(this.furloughDay != null) {
clone.setFurloughDay(this.furloughDay);
}

if(this.mapSizeY != null) {
clone.setMapSizeY(this.mapSizeY);
}

if(this.finishedQuestCount != null) {
clone.setFinishedQuestCount(this.finishedQuestCount);
}

if(this.saleItemBeans != null) {
ArrayList tmpArrLst = new ArrayList<ItemBean>();

for(Object bean : saleItemBeans) {
ItemBean tmpBean = (ItemBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setSaleItemBeans(tmpArrLst);
}

if(this.effortPoint != null) {
clone.setEffortPoint(this.effortPoint);
}

if(this.friendBeans != null) {
ArrayList tmpArrLst = new ArrayList<PlayerInfoBean>();

for(Object bean : friendBeans) {
PlayerInfoBean tmpBean = (PlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setFriendBeans(tmpArrLst);
}

if(this.newReportCount_scout != null) {
clone.setNewReportCount_scout(this.newReportCount_scout);
}

if(this.selfArmys != null) {
ArrayList tmpArrLst = new ArrayList<ArmyBean>();

for(Object bean : selfArmys) {
ArmyBean tmpBean = (ArmyBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setSelfArmys(tmpArrLst);
}

if(this.gemstoneinpos != null) {
ArrayList tmpArrLst = new ArrayList<GemStoneInPosBean>();

for(Object bean : gemstoneinpos) {
GemStoneInPosBean tmpBean = (GemStoneInPosBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setGemstoneinpos(tmpArrLst);
}

if(this.currentDateTime != null) {
clone.setCurrentDateTime(this.currentDateTime);
}

if(this.currentTime != null) {
clone.setCurrentTime(this.currentTime);
}

if(this.headline != null) {
clone.setHeadline(this.headline);
}

if(this.troopConfigBeans != null) {
ArrayList tmpArrLst = new ArrayList<TroopConfigBean>();

for(Object bean : troopConfigBeans) {
TroopConfigBean tmpBean = (TroopConfigBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setTroopConfigBeans(tmpArrLst);
}

if(this.newReportCount_trade != null) {
clone.setNewReportCount_trade(this.newReportCount_trade);
}

if(this.setshowinfro != null) {
ArrayList tmpArrLst = new ArrayList<SetShowInfro>();

for(Object bean : setshowinfro) {
SetShowInfro tmpBean = (SetShowInfro) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setSetshowinfro(tmpArrLst);
}

if(this.blockBeans != null) {
ArrayList tmpArrLst = new ArrayList<PlayerInfoBean>();

for(Object bean : blockBeans) {
PlayerInfoBean tmpBean = (PlayerInfoBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setBlockBeans(tmpArrLst);
}

if(this.playerInfo != null) {
clone.setPlayerInfo(this.playerInfo);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageBean != null) {
ArrayList al = new ArrayList();
for(Object obj : packageBean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("packageBean", al);
}

if(this.items != null) {
ArrayList al = new ArrayList();
for(Object obj : items) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("items", al);
}

if(this.redCount != null) {
aso.put("redCount", redCount);
}

if(this.buffs != null) {
ArrayList al = new ArrayList();
for(Object obj : buffs) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("buffs", al);
}

if(this.castles != null) {
ArrayList al = new ArrayList();
for(Object obj : castles) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("castles", al);
}

if(this.autoFurlough != null) {
aso.put("autoFurlough", autoFurlough);
}

if(this.mapSizeX != null) {
aso.put("mapSizeX", mapSizeX);
}

if(this.gameSpeed != null) {
aso.put("gameSpeed", gameSpeed);
}

if(this.newReportCount_army != null) {
aso.put("newReportCount_army", newReportCount_army);
}

if(this.saleTypeBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : saleTypeBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("saleTypeBeans", al);
}

if(this.newMailCount != null) {
aso.put("newMailCount", newMailCount);
}

if(this.newReportCount_other != null) {
aso.put("newReportCount_other", newReportCount_other);
}

if(this.friendArmys != null) {
ArrayList al = new ArrayList();
for(Object obj : friendArmys) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("friendArmys", al);
}

if(this.gamblingItemIndex != null) {
aso.put("gamblingItemIndex", gamblingItemIndex);
}

if(this.castleSignBean != null) {
ArrayList al = new ArrayList();
for(Object obj : castleSignBean) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("castleSignBean", al);
}

if(this.autoHeal != null) {
aso.put("autoHeal", autoHeal);
}

if(this.newMaileCount_inbox != null) {
aso.put("newMaileCount_inbox", newMaileCount_inbox);
}

if(this.newMaileCount_system != null) {
aso.put("newMaileCount_system", newMaileCount_system);
}

if(this.returnReport != null) {
aso.put("returnReport", returnReport);
}

if(this.newReportCount != null) {
aso.put("newReportCount", newReportCount);
}

if(this.changedFace != null) {
aso.put("changedFace", changedFace);
}

if(this.furlough != null) {
aso.put("furlough", furlough);
}

if(this.enemyArmys != null) {
ArrayList al = new ArrayList();
for(Object obj : enemyArmys) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("enemyArmys", al);
}

if(this.equipments != null) {
ArrayList al = new ArrayList();
for(Object obj : equipments) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("equipments", al);
}

if(this.furloughDay != null) {
aso.put("furloughDay", furloughDay);
}

if(this.mapSizeY != null) {
aso.put("mapSizeY", mapSizeY);
}

if(this.finishedQuestCount != null) {
aso.put("finishedQuestCount", finishedQuestCount);
}

if(this.saleItemBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : saleItemBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("saleItemBeans", al);
}

if(this.effortPoint != null) {
aso.put("effortPoint", effortPoint);
}

if(this.friendBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : friendBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("friendBeans", al);
}

if(this.newReportCount_scout != null) {
aso.put("newReportCount_scout", newReportCount_scout);
}

if(this.selfArmys != null) {
ArrayList al = new ArrayList();
for(Object obj : selfArmys) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("selfArmys", al);
}

if(this.gemstoneinpos != null) {
ArrayList al = new ArrayList();
for(Object obj : gemstoneinpos) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("gemstoneinpos", al);
}

if(this.currentDateTime != null) {
aso.put("currentDateTime", currentDateTime);
}

if(this.currentTime != null) {
aso.put("currentTime", currentTime);
}

if(this.headline != null) {
aso.put("headline", headline);
}

if(this.troopConfigBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : troopConfigBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("troopConfigBeans", al);
}

if(this.newReportCount_trade != null) {
aso.put("newReportCount_trade", newReportCount_trade);
}

if(this.setshowinfro != null) {
ArrayList al = new ArrayList();
for(Object obj : setshowinfro) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("setshowinfro", al);
}

if(this.blockBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : blockBeans) {
ASObjectable as = (ASObjectable) obj;
al.add(as.toASObject());
}
aso.put("blockBeans", al);
}

if(this.playerInfo != null) {
aso.put("playerInfo", playerInfo.toASObject());
}

return aso;
}

public ArrayList getPackageBean() {
return packageBean;
}

public void setPackageBean(ArrayList packageBean) {
this.packageBean = packageBean;
}

public ArrayList getItems() {
return items;
}

public void setItems(ArrayList items) {
this.items = items;
}

public Integer getRedCount() {
return redCount;
}

public void setRedCount(Integer redCount) {
this.redCount = redCount;
}

public ArrayList getBuffs() {
return buffs;
}

public void setBuffs(ArrayList buffs) {
this.buffs = buffs;
}

public ArrayList getCastles() {
return castles;
}

public void setCastles(ArrayList castles) {
this.castles = castles;
}

public Boolean getAutoFurlough() {
return autoFurlough;
}

public void setAutoFurlough(Boolean autoFurlough) {
this.autoFurlough = autoFurlough;
}

public Integer getMapSizeX() {
return mapSizeX;
}

public void setMapSizeX(Integer mapSizeX) {
this.mapSizeX = mapSizeX;
}

public Integer getGameSpeed() {
return gameSpeed;
}

public void setGameSpeed(Integer gameSpeed) {
this.gameSpeed = gameSpeed;
}

public Integer getNewReportCount_army() {
return newReportCount_army;
}

public void setNewReportCount_army(Integer newReportCount_army) {
this.newReportCount_army = newReportCount_army;
}

public ArrayList getSaleTypeBeans() {
return saleTypeBeans;
}

public void setSaleTypeBeans(ArrayList saleTypeBeans) {
this.saleTypeBeans = saleTypeBeans;
}

public Integer getNewMailCount() {
return newMailCount;
}

public void setNewMailCount(Integer newMailCount) {
this.newMailCount = newMailCount;
}

public Integer getNewReportCount_other() {
return newReportCount_other;
}

public void setNewReportCount_other(Integer newReportCount_other) {
this.newReportCount_other = newReportCount_other;
}

public ArrayList getFriendArmys() {
return friendArmys;
}

public void setFriendArmys(ArrayList friendArmys) {
this.friendArmys = friendArmys;
}

public Integer getGamblingItemIndex() {
return gamblingItemIndex;
}

public void setGamblingItemIndex(Integer gamblingItemIndex) {
this.gamblingItemIndex = gamblingItemIndex;
}

public ArrayList getCastleSignBean() {
return castleSignBean;
}

public void setCastleSignBean(ArrayList castleSignBean) {
this.castleSignBean = castleSignBean;
}

public Boolean getAutoHeal() {
return autoHeal;
}

public void setAutoHeal(Boolean autoHeal) {
this.autoHeal = autoHeal;
}

public Integer getNewMaileCount_inbox() {
return newMaileCount_inbox;
}

public void setNewMaileCount_inbox(Integer newMaileCount_inbox) {
this.newMaileCount_inbox = newMaileCount_inbox;
}

public Integer getNewMaileCount_system() {
return newMaileCount_system;
}

public void setNewMaileCount_system(Integer newMaileCount_system) {
this.newMaileCount_system = newMaileCount_system;
}

public Boolean getReturnReport() {
return returnReport;
}

public void setReturnReport(Boolean returnReport) {
this.returnReport = returnReport;
}

public Integer getNewReportCount() {
return newReportCount;
}

public void setNewReportCount(Integer newReportCount) {
this.newReportCount = newReportCount;
}

public Boolean getChangedFace() {
return changedFace;
}

public void setChangedFace(Boolean changedFace) {
this.changedFace = changedFace;
}

public Boolean getFurlough() {
return furlough;
}

public void setFurlough(Boolean furlough) {
this.furlough = furlough;
}

public ArrayList getEnemyArmys() {
return enemyArmys;
}

public void setEnemyArmys(ArrayList enemyArmys) {
this.enemyArmys = enemyArmys;
}

public ArrayList getEquipments() {
return equipments;
}

public void setEquipments(ArrayList equipments) {
this.equipments = equipments;
}

public Integer getFurloughDay() {
return furloughDay;
}

public void setFurloughDay(Integer furloughDay) {
this.furloughDay = furloughDay;
}

public Integer getMapSizeY() {
return mapSizeY;
}

public void setMapSizeY(Integer mapSizeY) {
this.mapSizeY = mapSizeY;
}

public Integer getFinishedQuestCount() {
return finishedQuestCount;
}

public void setFinishedQuestCount(Integer finishedQuestCount) {
this.finishedQuestCount = finishedQuestCount;
}

public ArrayList getSaleItemBeans() {
return saleItemBeans;
}

public void setSaleItemBeans(ArrayList saleItemBeans) {
this.saleItemBeans = saleItemBeans;
}

public Integer getEffortPoint() {
return effortPoint;
}

public void setEffortPoint(Integer effortPoint) {
this.effortPoint = effortPoint;
}

public ArrayList getFriendBeans() {
return friendBeans;
}

public void setFriendBeans(ArrayList friendBeans) {
this.friendBeans = friendBeans;
}

public Integer getNewReportCount_scout() {
return newReportCount_scout;
}

public void setNewReportCount_scout(Integer newReportCount_scout) {
this.newReportCount_scout = newReportCount_scout;
}

public ArrayList getSelfArmys() {
return selfArmys;
}

public void setSelfArmys(ArrayList selfArmys) {
this.selfArmys = selfArmys;
}

public ArrayList getGemstoneinpos() {
return gemstoneinpos;
}

public void setGemstoneinpos(ArrayList gemstoneinpos) {
this.gemstoneinpos = gemstoneinpos;
}

public String getCurrentDateTime() {
return currentDateTime;
}

public void setCurrentDateTime(String currentDateTime) {
this.currentDateTime = currentDateTime;
}

public Double getCurrentTime() {
return currentTime;
}

public void setCurrentTime(Double currentTime) {
this.currentTime = currentTime;
}

public String getHeadline() {
return headline;
}

public void setHeadline(String headline) {
this.headline = headline;
}

public ArrayList getTroopConfigBeans() {
return troopConfigBeans;
}

public void setTroopConfigBeans(ArrayList troopConfigBeans) {
this.troopConfigBeans = troopConfigBeans;
}

public Integer getNewReportCount_trade() {
return newReportCount_trade;
}

public void setNewReportCount_trade(Integer newReportCount_trade) {
this.newReportCount_trade = newReportCount_trade;
}

public ArrayList getSetshowinfro() {
return setshowinfro;
}

public void setSetshowinfro(ArrayList setshowinfro) {
this.setshowinfro = setshowinfro;
}

public ArrayList getBlockBeans() {
return blockBeans;
}

public void setBlockBeans(ArrayList blockBeans) {
this.blockBeans = blockBeans;
}

public PlayerInfoBean getPlayerInfo() {
return playerInfo;
}

public void setPlayerInfo(PlayerInfoBean playerInfo) {
this.playerInfo = playerInfo;
}
}
