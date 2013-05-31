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
public class ZoneInfoBean implements EvonyPacket {

    private Integer playerCount = null;
    private Integer castleCount = null;
    private String name = null;
    private Integer rate = null;
    private Integer id = null;

    public ZoneInfoBean(ASObject aso) {

        if (aso.get("playerCount") != null) {
            this.playerCount = (Integer) aso.get("playerCount");
        }

        if (aso.get("castleCount") != null) {
            this.castleCount = (Integer) aso.get("castleCount");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("rate") != null) {
            this.rate = (Integer) aso.get("rate");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }
    }

    public ZoneInfoBean() {
    }

    @Override
    public ZoneInfoBean clone() {
        ZoneInfoBean clone = new ZoneInfoBean();

        if (this.playerCount != null) {
            clone.setPlayerCount(this.playerCount);
        }

        if (this.castleCount != null) {
            clone.setCastleCount(this.castleCount);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.rate != null) {
            clone.setRate(this.rate);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.playerCount != null) {
            aso.put("playerCount", playerCount);
        }

        if (this.castleCount != null) {
            aso.put("castleCount", castleCount);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.rate != null) {
            aso.put("rate", rate);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        return aso;
    }

    public Integer getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(Integer playerCount) {
        this.playerCount = playerCount;
    }

    public Integer getCastleCount() {
        return castleCount;
    }

    public void setCastleCount(Integer castleCount) {
        this.castleCount = castleCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
