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
public class CastleUpdate implements EvonyPacket {

    public Integer updateType = null;
    public CastleBean castleBean = null;

    public CastleUpdate(ASObject aso) {

        if (aso.get("updateType") != null) {
            this.updateType = (Integer) aso.get("updateType");
        }

        if (aso.get("castleBean") != null) {
            this.castleBean = new CastleBean((ASObject) aso.get("castleBean"));
        }
    }

    public CastleUpdate() {
    }

    @Override
    public CastleUpdate clone() {
        CastleUpdate clone = new CastleUpdate();

        if (this.updateType != null) {
            clone.setUpdateType(this.updateType);
        }

        if (this.castleBean != null) {
            clone.setCastleBean(this.castleBean);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.updateType != null) {
            aso.put("updateType", updateType);
        }

        if (this.castleBean != null) {
            aso.put("castleBean", castleBean.toASObject());
        }

        return aso;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public CastleBean getCastleBean() {
        return castleBean;
    }

    public void setCastleBean(CastleBean castleBean) {
        this.castleBean = castleBean;
    }
}
