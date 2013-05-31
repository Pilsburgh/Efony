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
public class TroopConfigBean implements EvonyPacket {

    private String name = null;
    private Double time = null;
    private TroopBean troop = null;

    public TroopConfigBean(ASObject aso) {

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("time") != null) {
            this.time = (Double) aso.get("time");
        }

        if (aso.get("troop") != null) {
            this.troop = new TroopBean((ASObject) aso.get("troop"));
        }
    }

    public TroopConfigBean() {
    }

    @Override
    public TroopConfigBean clone() {
        TroopConfigBean clone = new TroopConfigBean();

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.time != null) {
            clone.setTime(this.time);
        }

        if (this.troop != null) {
            clone.setTroop(this.troop);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.time != null) {
            aso.put("time", time);
        }

        if (this.troop != null) {
            aso.put("troop", troop.toASObject());
        }

        return aso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public TroopBean getTroop() {
        return troop;
    }

    public void setTroop(TroopBean troop) {
        this.troop = troop;
    }
}
