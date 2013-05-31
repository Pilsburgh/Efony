package evonyproxy.evony.common.module.army;

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
public class StayAllianceReponse implements EvonyPacket {

    public Double packageId = null;
    public String msg = null;
    public String errorMsg = null;
    public ArrayList<ArmyBean> allianceArmys = null;
    public Integer ok = null;

    public StayAllianceReponse(ASObject aso) {
        allianceArmys = new ArrayList<ArmyBean>();

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("allianceArmys") != null) {
            Object[] objArr = (Object[]) aso.get("allianceArmys");
            for (int j = 0; j < objArr.length; j++) {
                allianceArmys.add(new ArmyBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public StayAllianceReponse() {
    }

    @Override
    public StayAllianceReponse clone() {
        StayAllianceReponse clone = new StayAllianceReponse();

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.errorMsg != null) {
            clone.setErrorMsg(this.errorMsg);
        }

        if (this.allianceArmys != null) {
            ArrayList tmpArrLst = new ArrayList<ArmyBean>();

            for (Object bean : allianceArmys) {
                ArmyBean tmpBean = (ArmyBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setAllianceArmys(tmpArrLst);
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

        if (this.errorMsg != null) {
            aso.put("errorMsg", errorMsg);
        }

        if (this.allianceArmys != null) {
            ArrayList al = new ArrayList();
            for (Object obj : allianceArmys) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("allianceArmys", al);
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

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ArrayList getAllianceArmys() {
        return allianceArmys;
    }

    public void setAllianceArmys(ArrayList allianceArmys) {
        this.allianceArmys = allianceArmys;
    }

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer ok) {
        this.ok = ok;
    }
}
