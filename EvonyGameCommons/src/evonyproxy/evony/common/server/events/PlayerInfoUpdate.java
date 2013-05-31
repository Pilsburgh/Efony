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
public class PlayerInfoUpdate implements EvonyPacket {

    public PlayerInfoBean playerInfo = null;

    public PlayerInfoUpdate(ASObject aso) {

        if (aso.get("playerInfo") != null) {
            this.playerInfo = new PlayerInfoBean((ASObject) aso.get("playerInfo"));
        }
    }

    public PlayerInfoUpdate() {
    }

    @Override
    public PlayerInfoUpdate clone() {
        PlayerInfoUpdate clone = new PlayerInfoUpdate();

        if (this.playerInfo != null) {
            clone.setPlayerInfo(this.playerInfo);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.playerInfo != null) {
            aso.put("playerInfo", playerInfo.toASObject());
        }

        return aso;
    }

    public PlayerInfoBean getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfoBean playerInfo) {
        this.playerInfo = playerInfo;
    }
}
