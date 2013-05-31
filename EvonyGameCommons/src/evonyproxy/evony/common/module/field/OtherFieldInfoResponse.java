package evonyproxy.evony.common.module.field;

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
public class OtherFieldInfoResponse implements EvonyPacket {

    public String msg = null;
    public Double packageId = null;
    public MapCastleBean bean = null;
    public String errorMsg = null;
    public Integer ok = null;

    public OtherFieldInfoResponse(ASObject aso) {

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("bean") != null) {
            this.bean = new MapCastleBean((ASObject) aso.get("bean"));
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public OtherFieldInfoResponse() {
    }

    @Override
    public OtherFieldInfoResponse clone() {
        OtherFieldInfoResponse clone = new OtherFieldInfoResponse();

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.bean != null) {
            clone.setBean(this.bean);
        }

        if (this.errorMsg != null) {
            clone.setErrorMsg(this.errorMsg);
        }

        if (this.ok != null) {
            clone.setOk(this.ok);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.msg != null) {
            aso.put("msg", msg);
        }

        if (this.packageId != null) {
            aso.put("packageId", packageId);
        }

        if (this.bean != null) {
            aso.put("bean", bean.toASObject());
        }

        if (this.errorMsg != null) {
            aso.put("errorMsg", errorMsg);
        }

        if (this.ok != null) {
            aso.put("ok", ok);
        }

        return aso;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Double getPackageId() {
        return packageId;
    }

    public void setPackageId(Double packageId) {
        this.packageId = packageId;
    }

    public MapCastleBean getBean() {
        return bean;
    }

    public void setBean(MapCastleBean bean) {
        this.bean = bean;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer ok) {
        this.ok = ok;
    }
}
