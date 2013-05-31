package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class ResearchCompleteUpdate implements EvonyPacket {

    public Integer castleId = null;

    public ResearchCompleteUpdate(ASObject aso) {

        if (aso.get("castleId") != null) {
            this.castleId = (Integer) aso.get("castleId");
        }
    }

    public ResearchCompleteUpdate() {
    }

    @Override
    public ResearchCompleteUpdate clone() {
        ResearchCompleteUpdate clone = new ResearchCompleteUpdate();

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        return aso;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }
}
