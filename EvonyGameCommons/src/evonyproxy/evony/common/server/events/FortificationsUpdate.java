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
public class FortificationsUpdate implements EvonyPacket {

    public FortificationsBean fortification = null;
    public Integer castleId = null;

    public FortificationsUpdate(ASObject aso) {

        if (aso.get("fortification") != null) {
            this.fortification = new FortificationsBean((ASObject) aso.get("fortification"));
        }

        if (aso.get("castleId") != null) {
            this.castleId = (Integer) aso.get("castleId");
        }
    }

    public FortificationsUpdate() {
    }

    @Override
    public FortificationsUpdate clone() {
        FortificationsUpdate clone = new FortificationsUpdate();

        if (this.fortification != null) {
            clone.setFortification(this.fortification);
        }

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.fortification != null) {
            aso.put("fortification", fortification.toASObject());
        }

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        return aso;
    }

    public FortificationsBean getFortification() {
        return fortification;
    }

    public void setFortification(FortificationsBean fortification) {
        this.fortification = fortification;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }
}
