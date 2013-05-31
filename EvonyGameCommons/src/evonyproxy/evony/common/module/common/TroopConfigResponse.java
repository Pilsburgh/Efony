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
public class TroopConfigResponse implements EvonyPacket {

    public Double packageId = null;
    public String msg = null;
    public ArrayList<TroopConfigBean> troopConfigBeans = null;
    public String errorMsg = null;
    public Integer ok = null;

    public TroopConfigResponse(ASObject aso) {
        troopConfigBeans = new ArrayList<TroopConfigBean>();

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("troopConfigBeans") != null) {
            Object[] objArr = (Object[]) aso.get("troopConfigBeans");
            for (int j = 0; j < objArr.length; j++) {
                troopConfigBeans.add(new TroopConfigBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public TroopConfigResponse() {
    }

    @Override
    public TroopConfigResponse clone() {
        TroopConfigResponse clone = new TroopConfigResponse();

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.troopConfigBeans != null) {
            ArrayList tmpArrLst = new ArrayList<TroopConfigBean>();

            for (Object bean : troopConfigBeans) {
                TroopConfigBean tmpBean = (TroopConfigBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setTroopConfigBeans(tmpArrLst);
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

        if (this.troopConfigBeans != null) {
            ArrayList al = new ArrayList();
            for (Object obj : troopConfigBeans) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("troopConfigBeans", al);
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

    public ArrayList getTroopConfigBeans() {
        return troopConfigBeans;
    }

    public void setTroopConfigBeans(ArrayList troopConfigBeans) {
        this.troopConfigBeans = troopConfigBeans;
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
