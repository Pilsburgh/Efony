package evonyproxy.evony.common.module.army;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class TroopParamResponse implements EvonyPacket {

    public String msg = null;
    public Integer loadSkillParam = null;
    public Integer driveSkillParam = null;
    public Double packageId = null;
    public String errorMsg = null;
    public Integer transportStationParam = null;
    public Integer ok = null;
    public Integer marchSkillParam = null;

    public TroopParamResponse(ASObject aso) {

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("loadSkillParam") != null) {
            this.loadSkillParam = (Integer) aso.get("loadSkillParam");
        }

        if (aso.get("driveSkillParam") != null) {
            this.driveSkillParam = (Integer) aso.get("driveSkillParam");
        }

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("transportStationParam") != null) {
            this.transportStationParam = (Integer) aso.get("transportStationParam");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }

        if (aso.get("marchSkillParam") != null) {
            this.marchSkillParam = (Integer) aso.get("marchSkillParam");
        }
    }

    public TroopParamResponse() {
    }

    @Override
    public TroopParamResponse clone() {
        TroopParamResponse clone = new TroopParamResponse();

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.loadSkillParam != null) {
            clone.setLoadSkillParam(this.loadSkillParam);
        }

        if (this.driveSkillParam != null) {
            clone.setDriveSkillParam(this.driveSkillParam);
        }

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.errorMsg != null) {
            clone.setErrorMsg(this.errorMsg);
        }

        if (this.transportStationParam != null) {
            clone.setTransportStationParam(this.transportStationParam);
        }

        if (this.ok != null) {
            clone.setOk(this.ok);
        }

        if (this.marchSkillParam != null) {
            clone.setMarchSkillParam(this.marchSkillParam);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.msg != null) {
            aso.put("msg", msg);
        }

        if (this.loadSkillParam != null) {
            aso.put("loadSkillParam", loadSkillParam);
        }

        if (this.driveSkillParam != null) {
            aso.put("driveSkillParam", driveSkillParam);
        }

        if (this.packageId != null) {
            aso.put("packageId", packageId);
        }

        if (this.errorMsg != null) {
            aso.put("errorMsg", errorMsg);
        }

        if (this.transportStationParam != null) {
            aso.put("transportStationParam", transportStationParam);
        }

        if (this.ok != null) {
            aso.put("ok", ok);
        }

        if (this.marchSkillParam != null) {
            aso.put("marchSkillParam", marchSkillParam);
        }

        return aso;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getLoadSkillParam() {
        return loadSkillParam;
    }

    public void setLoadSkillParam(Integer loadSkillParam) {
        this.loadSkillParam = loadSkillParam;
    }

    public Integer getDriveSkillParam() {
        return driveSkillParam;
    }

    public void setDriveSkillParam(Integer driveSkillParam) {
        this.driveSkillParam = driveSkillParam;
    }

    public Double getPackageId() {
        return packageId;
    }

    public void setPackageId(Double packageId) {
        this.packageId = packageId;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getTransportStationParam() {
        return transportStationParam;
    }

    public void setTransportStationParam(Integer transportStationParam) {
        this.transportStationParam = transportStationParam;
    }

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer ok) {
        this.ok = ok;
    }

    public Integer getMarchSkillParam() {
        return marchSkillParam;
    }

    public void setMarchSkillParam(Integer marchSkillParam) {
        this.marchSkillParam = marchSkillParam;
    }
}
