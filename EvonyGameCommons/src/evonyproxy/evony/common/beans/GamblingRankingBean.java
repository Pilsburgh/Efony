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
public class GamblingRankingBean implements EvonyPacket {
private Integer isReward = null;
private ArrayList<ItemBean> itemsBeans = null;
private String playerName = null;
private Integer count = null;
private Integer rank = null;

public GamblingRankingBean(ASObject aso) {
itemsBeans = new ArrayList<ItemBean>();

if(aso.get("isReward") != null) {
this.isReward = (Integer) aso.get("isReward");
}

if(aso.get("itemsBeans") != null) {
Object[] objArr = (Object[]) aso.get("itemsBeans");
for(int j = 0; j < objArr.length; j++) {
itemsBeans.add(new ItemBean((ASObject) objArr[j]));
}
}

if(aso.get("playerName") != null) {
this.playerName = (String) aso.get("playerName");
}

if(aso.get("count") != null) {
this.count = (Integer) aso.get("count");
}

if(aso.get("rank") != null) {
this.rank = (Integer) aso.get("rank");
}
}

public GamblingRankingBean() {
}

@Override
public GamblingRankingBean clone() {
GamblingRankingBean clone = new GamblingRankingBean();

if(this.isReward != null) {
clone.setIsReward(this.isReward);
}

if(this.itemsBeans != null) {
ArrayList tmpArrLst = new ArrayList<ItemBean>();

for(Object bean : itemsBeans) {
ItemBean tmpBean = (ItemBean) bean;
tmpArrLst.add(tmpBean.clone());
}
clone.setItemsBeans(tmpArrLst);
}

if(this.playerName != null) {
clone.setPlayerName(this.playerName);
}

if(this.count != null) {
clone.setCount(this.count);
}

if(this.rank != null) {
clone.setRank(this.rank);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.isReward != null) {
aso.put("isReward", isReward);
}

if(this.itemsBeans != null) {
ArrayList al = new ArrayList();
for(Object obj : itemsBeans) {
EvonyPacket as = (EvonyPacket) obj;
al.add(as.toASObject());
}
aso.put("itemsBeans", al);
}

if(this.playerName != null) {
aso.put("playerName", playerName);
}

if(this.count != null) {
aso.put("count", count);
}

if(this.rank != null) {
aso.put("rank", rank);
}

return aso;
}

public Integer getIsReward() {
return isReward;
}

public void setIsReward(Integer isReward) {
this.isReward = isReward;
}

public ArrayList getItemsBeans() {
return itemsBeans;
}

public void setItemsBeans(ArrayList itemsBeans) {
this.itemsBeans = itemsBeans;
}

public String getPlayerName() {
return playerName;
}

public void setPlayerName(String playerName) {
this.playerName = playerName;
}

public Integer getCount() {
return count;
}

public void setCount(Integer count) {
this.count = count;
}

public Integer getRank() {
return rank;
}

public void setRank(Integer rank) {
this.rank = rank;
}
}
