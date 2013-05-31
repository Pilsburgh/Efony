package evonyproxy.evony.common.module.common;

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
public class ZoneInfoResponse implements EvonyPacket {

    public Double packageId = null;
    public String msg = null;
    public ArrayList<ZoneInfoBean> zones = null;
    public String errorMsg = null;
    public Integer ok = null;

    public ZoneInfoResponse(ASObject aso) {
        zones = new ArrayList<ZoneInfoBean>();

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("zones") != null) {
            Object[] objArr = (Object[]) aso.get("zones");
            for (int j = 0; j < objArr.length; j++) {
                zones.add(new ZoneInfoBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public ZoneInfoResponse() {
    }

    @Override
    public ZoneInfoResponse clone() {
        ZoneInfoResponse clone = new ZoneInfoResponse();

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.zones != null) {
            ArrayList tmpArrLst = new ArrayList<ZoneInfoBean>();

            for (Object bean : zones) {
                ZoneInfoBean tmpBean = (ZoneInfoBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setZones(tmpArrLst);
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

        if (this.packageId != null) {
            aso.put("packageId", packageId);
        }

        if (this.msg != null) {
            aso.put("msg", msg);
        }

        if (this.zones != null) {
            ArrayList al = new ArrayList();
            for (Object obj : zones) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("zones", al);
        }

        if (this.errorMsg != null) {
            aso.put("errorMsg", errorMsg);
        }

        if (this.ok != null) {
            aso.put("ok", ok);
        }

        return aso;
    }

    public Double getPackageId() {
        return packageId;
    }

    public void setPackageId(Double packageId) {
        this.packageId = packageId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ArrayList getZones() {
        return zones;
    }

    public void setZones(ArrayList zones) {
        this.zones = zones;
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
