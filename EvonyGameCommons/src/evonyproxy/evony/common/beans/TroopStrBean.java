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
public class TroopStrBean implements EvonyPacket {
private String heavyCavalry = null;
private String catapult = null;
private String archer = null;
private String lightCavalry = null;
private String ballista = null;
private String militia = null;
private String carriage = null;
private String scouter = null;
private String peasants = null;
private String batteringRam = null;
private String swordsmen = null;
private String pikemen = null;

public TroopStrBean(ASObject aso) {

if(aso.get("heavyCavalry") != null) {
this.heavyCavalry = (String) aso.get("heavyCavalry");
}

if(aso.get("catapult") != null) {
this.catapult = (String) aso.get("catapult");
}

if(aso.get("archer") != null) {
this.archer = (String) aso.get("archer");
}

if(aso.get("lightCavalry") != null) {
this.lightCavalry = (String) aso.get("lightCavalry");
}

if(aso.get("ballista") != null) {
this.ballista = (String) aso.get("ballista");
}

if(aso.get("militia") != null) {
this.militia = (String) aso.get("militia");
}

if(aso.get("carriage") != null) {
this.carriage = (String) aso.get("carriage");
}

if(aso.get("scouter") != null) {
this.scouter = (String) aso.get("scouter");
}

if(aso.get("peasants") != null) {
this.peasants = (String) aso.get("peasants");
}

if(aso.get("batteringRam") != null) {
this.batteringRam = (String) aso.get("batteringRam");
}

if(aso.get("swordsmen") != null) {
this.swordsmen = (String) aso.get("swordsmen");
}

if(aso.get("pikemen") != null) {
this.pikemen = (String) aso.get("pikemen");
}
}

public TroopStrBean() {
}

@Override
public TroopStrBean clone() {
TroopStrBean clone = new TroopStrBean();

if(this.heavyCavalry != null) {
clone.setHeavyCavalry(this.heavyCavalry);
}

if(this.catapult != null) {
clone.setCatapult(this.catapult);
}

if(this.archer != null) {
clone.setArcher(this.archer);
}

if(this.lightCavalry != null) {
clone.setLightCavalry(this.lightCavalry);
}

if(this.ballista != null) {
clone.setBallista(this.ballista);
}

if(this.militia != null) {
clone.setMilitia(this.militia);
}

if(this.carriage != null) {
clone.setCarriage(this.carriage);
}

if(this.scouter != null) {
clone.setScouter(this.scouter);
}

if(this.peasants != null) {
clone.setPeasants(this.peasants);
}

if(this.batteringRam != null) {
clone.setBatteringRam(this.batteringRam);
}

if(this.swordsmen != null) {
clone.setSwordsmen(this.swordsmen);
}

if(this.pikemen != null) {
clone.setPikemen(this.pikemen);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.heavyCavalry != null) {
aso.put("heavyCavalry", heavyCavalry);
}

if(this.catapult != null) {
aso.put("catapult", catapult);
}

if(this.archer != null) {
aso.put("archer", archer);
}

if(this.lightCavalry != null) {
aso.put("lightCavalry", lightCavalry);
}

if(this.ballista != null) {
aso.put("ballista", ballista);
}

if(this.militia != null) {
aso.put("militia", militia);
}

if(this.carriage != null) {
aso.put("carriage", carriage);
}

if(this.scouter != null) {
aso.put("scouter", scouter);
}

if(this.peasants != null) {
aso.put("peasants", peasants);
}

if(this.batteringRam != null) {
aso.put("batteringRam", batteringRam);
}

if(this.swordsmen != null) {
aso.put("swordsmen", swordsmen);
}

if(this.pikemen != null) {
aso.put("pikemen", pikemen);
}

return aso;
}

public String getHeavyCavalry() {
return heavyCavalry;
}

public void setHeavyCavalry(String heavyCavalry) {
this.heavyCavalry = heavyCavalry;
}

public String getCatapult() {
return catapult;
}

public void setCatapult(String catapult) {
this.catapult = catapult;
}

public String getArcher() {
return archer;
}

public void setArcher(String archer) {
this.archer = archer;
}

public String getLightCavalry() {
return lightCavalry;
}

public void setLightCavalry(String lightCavalry) {
this.lightCavalry = lightCavalry;
}

public String getBallista() {
return ballista;
}

public void setBallista(String ballista) {
this.ballista = ballista;
}

public String getMilitia() {
return militia;
}

public void setMilitia(String militia) {
this.militia = militia;
}

public String getCarriage() {
return carriage;
}

public void setCarriage(String carriage) {
this.carriage = carriage;
}

public String getScouter() {
return scouter;
}

public void setScouter(String scouter) {
this.scouter = scouter;
}

public String getPeasants() {
return peasants;
}

public void setPeasants(String peasants) {
this.peasants = peasants;
}

public String getBatteringRam() {
return batteringRam;
}

public void setBatteringRam(String batteringRam) {
this.batteringRam = batteringRam;
}

public String getSwordsmen() {
return swordsmen;
}

public void setSwordsmen(String swordsmen) {
this.swordsmen = swordsmen;
}

public String getPikemen() {
return pikemen;
}

public void setPikemen(String pikemen) {
this.pikemen = pikemen;
}
}
