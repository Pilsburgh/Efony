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
public class EquipmenttechBean implements EvonyPacket {

    private Integer lv = null;
    private Integer equipmenttechid = null;

    public EquipmenttechBean(ASObject aso) {

        if (aso.get("lv") != null) {
            this.lv = (Integer) aso.get("lv");
        }

        if (aso.get("equipmenttechid") != null) {
            this.equipmenttechid = (Integer) aso.get("equipmenttechid");
        }
    }

    public EquipmenttechBean() {
    }

    @Override
    public EquipmenttechBean clone() {
        EquipmenttechBean clone = new EquipmenttechBean();

        if (this.lv != null) {
            clone.setLv(this.lv);
        }

        if (this.equipmenttechid != null) {
            clone.setEquipmenttechid(this.equipmenttechid);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.lv != null) {
            aso.put("lv", lv);
        }

        if (this.equipmenttechid != null) {
            aso.put("equipmenttechid", equipmenttechid);
        }

        return aso;
    }

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public Integer getEquipmenttechid() {
        return equipmenttechid;
    }

    public void setEquipmenttechid(Integer equipmenttechid) {
        this.equipmenttechid = equipmenttechid;
    }
}
