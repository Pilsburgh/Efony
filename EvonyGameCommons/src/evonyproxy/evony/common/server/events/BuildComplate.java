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
public class BuildComplate implements EvonyPacket {

    public Integer castleId = null;
    public BuildingBean buildingBean = null;

    public BuildComplate(ASObject aso) {

        if (aso.get("castleId") != null) {
            this.castleId = (Integer) aso.get("castleId");
        }

        if (aso.get("buildingBean") != null) {
            this.buildingBean = new BuildingBean((ASObject) aso.get("buildingBean"));
        }
    }

    public BuildComplate() {
    }

    @Override
    public BuildComplate clone() {
        BuildComplate clone = new BuildComplate();

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        if (this.buildingBean != null) {
            clone.setBuildingBean(this.buildingBean);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        if (this.buildingBean != null) {
            aso.put("buildingBean", buildingBean.toASObject());
        }

        return aso;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }

    public BuildingBean getBuildingBean() {
        return buildingBean;
    }

    public void setBuildingBean(BuildingBean buildingBean) {
        this.buildingBean = buildingBean;
    }
}
