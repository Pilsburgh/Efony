package evonyproxy.evony.common.module.troop;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.common.ASObjectable;
import flex.messaging.io.ArrayCollection;
import evonyproxy.evony.common.beans.*;

/**
 * @version .02
 * @author Michael Archibald
 */
public class TroopProduceListResponse implements ASObjectable {

    public Double packageId = null;
    public String msg = null;
    public ArrayList<TroopProduceListBean> troopList = null;
    public String errorMsg = null;
    public Integer ok = null;

    public TroopProduceListResponse(ASObject aso) {
        troopList = new ArrayList<TroopProduceListBean>();

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("troopList") != null) {
            Object[] objArr = (Object[]) aso.get("troopList");
            for (int j = 0; j < objArr.length; j++) {
                troopList.add(new TroopProduceListBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public TroopProduceListResponse() {
    }

    @Override
    public TroopProduceListResponse clone() {
        TroopProduceListResponse clone = new TroopProduceListResponse();

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.troopList != null) {
            ArrayList tmpArrLst = new ArrayList<TroopProduceListBean>();

            for (Object bean : troopList) {
                TroopProduceListBean tmpBean = (TroopProduceListBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setTroopList(tmpArrLst);
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

        if (this.troopList != null) {
            ArrayList al = new ArrayList();
            for (Object obj : troopList) {
                ASObjectable as = (ASObjectable) obj;
                al.add(as.toASObject());
            }
            aso.put("troopList", al);
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

    public ArrayList getTroopList() {
        return troopList;
    }

    public void setTroopList(ArrayList troopList) {
        this.troopList = troopList;
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
