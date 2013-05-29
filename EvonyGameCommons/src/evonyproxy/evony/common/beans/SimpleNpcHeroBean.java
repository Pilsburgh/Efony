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
public class SimpleNpcHeroBean implements EvonyPacket {

    private Integer npcid = null;
    private String introduce = null;
    private String name = null;

    public SimpleNpcHeroBean(ASObject aso) {

        if (aso.get("npcid") != null) {
            this.npcid = (Integer) aso.get("npcid");
        }

        if (aso.get("introduce") != null) {
            this.introduce = (String) aso.get("introduce");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }
    }

    public SimpleNpcHeroBean() {
    }

    @Override
    public SimpleNpcHeroBean clone() {
        SimpleNpcHeroBean clone = new SimpleNpcHeroBean();

        if (this.npcid != null) {
            clone.setNpcid(this.npcid);
        }

        if (this.introduce != null) {
            clone.setIntroduce(this.introduce);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.npcid != null) {
            aso.put("npcid", npcid);
        }

        if (this.introduce != null) {
            aso.put("introduce", introduce);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        return aso;
    }

    public Integer getNpcid() {
        return npcid;
    }

    public void setNpcid(Integer npcid) {
        this.npcid = npcid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
