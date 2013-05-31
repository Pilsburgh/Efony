package evonyproxy.evony.common.module.hero;

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
public class SetShowInfroResponse implements EvonyPacket {

    public Double packageId = null;
    public String msg = null;
    public ArrayList<SetShowInfro> selectheroids = null;
    public String errorMsg = null;
    public Integer ok = null;

    public SetShowInfroResponse(ASObject aso) {
        selectheroids = new ArrayList<SetShowInfro>();

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("selectheroids") != null) {
            Object[] objArr = (Object[]) aso.get("selectheroids");
            for (int j = 0; j < objArr.length; j++) {
                selectheroids.add(new SetShowInfro((ASObject) objArr[j]));
            }
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public SetShowInfroResponse() {
    }

    @Override
    public SetShowInfroResponse clone() {
        SetShowInfroResponse clone = new SetShowInfroResponse();

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.selectheroids != null) {
            ArrayList tmpArrLst = new ArrayList<SetShowInfro>();

            for (Object bean : selectheroids) {
                SetShowInfro tmpBean = (SetShowInfro) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setSelectheroids(tmpArrLst);
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

        if (this.selectheroids != null) {
            ArrayList al = new ArrayList();
            for (Object obj : selectheroids) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("selectheroids", al);
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

    public ArrayList getSelectheroids() {
        return selectheroids;
    }

    public void setSelectheroids(ArrayList selectheroids) {
        this.selectheroids = selectheroids;
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
