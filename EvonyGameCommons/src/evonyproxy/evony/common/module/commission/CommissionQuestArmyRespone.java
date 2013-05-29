package evonyproxy.evony.common.module.commission;

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
public class CommissionQuestArmyRespone implements EvonyPacket {

    public ArrayList<CommissionQuestArmyRankBean> armyRankBean = null;
    public Double packageId = null;
    public String msg = null;
    public String errorMsg = null;
    public Integer ok = null;

    public CommissionQuestArmyRespone(ASObject aso) {
        armyRankBean = new ArrayList<CommissionQuestArmyRankBean>();

        if (aso.get("armyRankBean") != null) {
            Object[] objArr = (Object[]) aso.get("armyRankBean");
            for (int j = 0; j < objArr.length; j++) {
                armyRankBean.add(new CommissionQuestArmyRankBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public CommissionQuestArmyRespone() {
    }

    @Override
    public CommissionQuestArmyRespone clone() {
        CommissionQuestArmyRespone clone = new CommissionQuestArmyRespone();

        if (this.armyRankBean != null) {
            ArrayList tmpArrLst = new ArrayList<CommissionQuestArmyRankBean>();

            for (Object bean : armyRankBean) {
                CommissionQuestArmyRankBean tmpBean = (CommissionQuestArmyRankBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setArmyRankBean(tmpArrLst);
        }

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
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

        if (this.armyRankBean != null) {
            ArrayList al = new ArrayList();
            for (Object obj : armyRankBean) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("armyRankBean", al);
        }

        if (this.packageId != null) {
            aso.put("packageId", packageId);
        }

        if (this.msg != null) {
            aso.put("msg", msg);
        }

        if (this.errorMsg != null) {
            aso.put("errorMsg", errorMsg);
        }

        if (this.ok != null) {
            aso.put("ok", ok);
        }

        return aso;
    }

    public ArrayList getArmyRankBean() {
        return armyRankBean;
    }

    public void setArmyRankBean(ArrayList armyRankBean) {
        this.armyRankBean = armyRankBean;
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

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer ok) {
        this.ok = ok;
    }
}
