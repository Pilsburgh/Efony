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
public class InjuredTroopUpdate implements EvonyPacket {

    public TroopBean troop = null;
    public Integer castleId = null;
    public Integer goldNeed = null;

    public InjuredTroopUpdate(ASObject aso) {

        if (aso.get("troop") != null) {
            this.troop = new TroopBean((ASObject) aso.get("troop"));
        }

        if (aso.get("castleId") != null) {
            this.castleId = (Integer) aso.get("castleId");
        }

        if (aso.get("goldNeed") != null) {
            this.goldNeed = (Integer) aso.get("goldNeed");
        }
    }

    public InjuredTroopUpdate() {
    }

    @Override
    public InjuredTroopUpdate clone() {
        InjuredTroopUpdate clone = new InjuredTroopUpdate();

        if (this.troop != null) {
            clone.setTroop(this.troop);
        }

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        if (this.goldNeed != null) {
            clone.setGoldNeed(this.goldNeed);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.troop != null) {
            aso.put("troop", troop.toASObject());
        }

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        if (this.goldNeed != null) {
            aso.put("goldNeed", goldNeed);
        }

        return aso;
    }

    public TroopBean getTroop() {
        return troop;
    }

    public void setTroop(TroopBean troop) {
        this.troop = troop;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }

    public Integer getGoldNeed() {
        return goldNeed;
    }

    public void setGoldNeed(Integer goldNeed) {
        this.goldNeed = goldNeed;
    }
}
