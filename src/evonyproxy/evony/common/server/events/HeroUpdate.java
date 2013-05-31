package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;
import evonyproxy.evony.common.beans.*;

/**
 * @version .02
 * @author Michael Archibald
 */
public class HeroUpdate implements EvonyPacket {

    public Integer castleId = null;
    public HeroBean hero = null;
    public Integer updateType = null;

    public HeroUpdate(ASObject aso) {

        if (aso.get("castleId") != null) {
            this.castleId = (Integer) aso.get("castleId");
        }

        if (aso.get("hero") != null) {
            this.hero = new HeroBean((ASObject) aso.get("hero"));
        }

        if (aso.get("updateType") != null) {
            this.updateType = (Integer) aso.get("updateType");
        }
    }

    public HeroUpdate() {
    }

    @Override
    public HeroUpdate clone() {
        HeroUpdate clone = new HeroUpdate();

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        if (this.hero != null) {
            clone.setHero(this.hero);
        }

        if (this.updateType != null) {
            clone.setUpdateType(this.updateType);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        if (this.hero != null) {
            aso.put("hero", hero.toASObject());
        }

        if (this.updateType != null) {
            aso.put("updateType", updateType);
        }

        return aso;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }

    public HeroBean getHero() {
        return hero;
    }

    public void setHero(HeroBean hero) {
        this.hero = hero;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }
}
