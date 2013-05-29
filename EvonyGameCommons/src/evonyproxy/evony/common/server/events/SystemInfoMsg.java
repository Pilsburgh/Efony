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
public class SystemInfoMsg implements EvonyPacket {

    public String msg = null;
    public Boolean tV = null;
    public Boolean noSenderSystemInfo = null;
    public String tVContext = null;
    public String sender = null;
    public Boolean alliance = null;

    public SystemInfoMsg(ASObject aso) {

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("tV") != null) {
            this.tV = (Boolean) aso.get("tV");
        }

        if (aso.get("noSenderSystemInfo") != null) {
            this.noSenderSystemInfo = (Boolean) aso.get("noSenderSystemInfo");
        }

        if (aso.get("tVContext") != null) {
            this.tVContext = (String) aso.get("tVContext");
        }

        if (aso.get("sender") != null) {
            this.sender = (String) aso.get("sender");
        }

        if (aso.get("alliance") != null) {
            this.alliance = (Boolean) aso.get("alliance");
        }
    }

    public SystemInfoMsg() {
    }

    @Override
    public SystemInfoMsg clone() {
        SystemInfoMsg clone = new SystemInfoMsg();

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.tV != null) {
            clone.setTV(this.tV);
        }

        if (this.noSenderSystemInfo != null) {
            clone.setNoSenderSystemInfo(this.noSenderSystemInfo);
        }

        if (this.tVContext != null) {
            clone.setTVContext(this.tVContext);
        }

        if (this.sender != null) {
            clone.setSender(this.sender);
        }

        if (this.alliance != null) {
            clone.setAlliance(this.alliance);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.msg != null) {
            aso.put("msg", msg);
        }

        if (this.tV != null) {
            aso.put("tV", tV);
        }

        if (this.noSenderSystemInfo != null) {
            aso.put("noSenderSystemInfo", noSenderSystemInfo);
        }

        if (this.tVContext != null) {
            aso.put("tVContext", tVContext);
        }

        if (this.sender != null) {
            aso.put("sender", sender);
        }

        if (this.alliance != null) {
            aso.put("alliance", alliance);
        }

        return aso;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getTV() {
        return tV;
    }

    public void setTV(Boolean tV) {
        this.tV = tV;
    }

    public Boolean getNoSenderSystemInfo() {
        return noSenderSystemInfo;
    }

    public void setNoSenderSystemInfo(Boolean noSenderSystemInfo) {
        this.noSenderSystemInfo = noSenderSystemInfo;
    }

    public String getTVContext() {
        return tVContext;
    }

    public void setTVContext(String tVContext) {
        this.tVContext = tVContext;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Boolean getAlliance() {
        return alliance;
    }

    public void setAlliance(Boolean alliance) {
        this.alliance = alliance;
    }
}
