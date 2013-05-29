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
public class TradesUpdate implements EvonyPacket {

    public Integer updateType = null;
    public Integer castleId = null;
    public TradeBean tradeBean = null;

    public TradesUpdate(ASObject aso) {

        if (aso.get("updateType") != null) {
            this.updateType = (Integer) aso.get("updateType");
        }

        if (aso.get("castleId") != null) {
            this.castleId = (Integer) aso.get("castleId");
        }

        if (aso.get("tradeBean") != null) {
            this.tradeBean = new TradeBean((ASObject) aso.get("tradeBean"));
        }
    }

    public TradesUpdate() {
    }

    @Override
    public TradesUpdate clone() {
        TradesUpdate clone = new TradesUpdate();

        if (this.updateType != null) {
            clone.setUpdateType(this.updateType);
        }

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        if (this.tradeBean != null) {
            clone.setTradeBean(this.tradeBean);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.updateType != null) {
            aso.put("updateType", updateType);
        }

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        if (this.tradeBean != null) {
            aso.put("tradeBean", tradeBean.toASObject());
        }

        return aso;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public Integer getCastleId() {
        return castleId;
    }

    public void setCastleId(Integer castleId) {
        this.castleId = castleId;
    }

    public TradeBean getTradeBean() {
        return tradeBean;
    }

    public void setTradeBean(TradeBean tradeBean) {
        this.tradeBean = tradeBean;
    }
}
