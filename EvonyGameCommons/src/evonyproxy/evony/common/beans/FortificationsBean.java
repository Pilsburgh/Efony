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
public class FortificationsBean implements EvonyPacket {
private Integer trap = null;
private Integer arrowTower = null;
private Integer rockfall = null;
private Integer rollingLogs = null;
private Integer abatis = null;

public FortificationsBean(ASObject aso) {

if(aso.get("trap") != null) {
this.trap = (Integer) aso.get("trap");
}

if(aso.get("arrowTower") != null) {
this.arrowTower = (Integer) aso.get("arrowTower");
}

if(aso.get("rockfall") != null) {
this.rockfall = (Integer) aso.get("rockfall");
}

if(aso.get("rollingLogs") != null) {
this.rollingLogs = (Integer) aso.get("rollingLogs");
}

if(aso.get("abatis") != null) {
this.abatis = (Integer) aso.get("abatis");
}
}

public FortificationsBean() {
}

@Override
public FortificationsBean clone() {
FortificationsBean clone = new FortificationsBean();

if(this.trap != null) {
clone.setTrap(this.trap);
}

if(this.arrowTower != null) {
clone.setArrowTower(this.arrowTower);
}

if(this.rockfall != null) {
clone.setRockfall(this.rockfall);
}

if(this.rollingLogs != null) {
clone.setRollingLogs(this.rollingLogs);
}

if(this.abatis != null) {
clone.setAbatis(this.abatis);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.trap != null) {
aso.put("trap", trap);
}

if(this.arrowTower != null) {
aso.put("arrowTower", arrowTower);
}

if(this.rockfall != null) {
aso.put("rockfall", rockfall);
}

if(this.rollingLogs != null) {
aso.put("rollingLogs", rollingLogs);
}

if(this.abatis != null) {
aso.put("abatis", abatis);
}

return aso;
}

public Integer getTrap() {
return trap;
}

public void setTrap(Integer trap) {
this.trap = trap;
}

public Integer getArrowTower() {
return arrowTower;
}

public void setArrowTower(Integer arrowTower) {
this.arrowTower = arrowTower;
}

public Integer getRockfall() {
return rockfall;
}

public void setRockfall(Integer rockfall) {
this.rockfall = rockfall;
}

public Integer getRollingLogs() {
return rollingLogs;
}

public void setRollingLogs(Integer rollingLogs) {
this.rollingLogs = rollingLogs;
}

public Integer getAbatis() {
return abatis;
}

public void setAbatis(Integer abatis) {
this.abatis = abatis;
}
}
