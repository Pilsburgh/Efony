package evonyproxy.evony.common.module.gemstone;

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
public class GemstoneRespone implements EvonyPacket {

    public Double packageId = null;
    public String msg = null;
    public Integer lv = null;
    public ArrayList<GemStoneBean> gemstoneinfro = null;
    public String errorMsg = null;
    public Integer pos = null;
    public Integer ok = null;

    public GemstoneRespone(ASObject aso) {
        gemstoneinfro = new ArrayList<GemStoneBean>();

        if (aso.get("packageId") != null) {
            this.packageId = (Double) aso.get("packageId");
        }

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("lv") != null) {
            this.lv = (Integer) aso.get("lv");
        }

        if (aso.get("gemstoneinfro") != null) {
            Object[] objArr = (Object[]) aso.get("gemstoneinfro");
            for (int j = 0; j < objArr.length; j++) {
                gemstoneinfro.add(new GemStoneBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("errorMsg") != null) {
            this.errorMsg = (String) aso.get("errorMsg");
        }

        if (aso.get("pos") != null) {
            this.pos = (Integer) aso.get("pos");
        }

        if (aso.get("ok") != null) {
            this.ok = (Integer) aso.get("ok");
        }
    }

    public GemstoneRespone() {
    }

    @Override
    public GemstoneRespone clone() {
        GemstoneRespone clone = new GemstoneRespone();

        if (this.packageId != null) {
            clone.setPackageId(this.packageId);
        }

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.lv != null) {
            clone.setLv(this.lv);
        }

        if (this.gemstoneinfro != null) {
            ArrayList tmpArrLst = new ArrayList<GemStoneBean>();

            for (Object bean : gemstoneinfro) {
                GemStoneBean tmpBean = (GemStoneBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setGemstoneinfro(tmpArrLst);
        }

        if (this.errorMsg != null) {
            clone.setErrorMsg(this.errorMsg);
        }

        if (this.pos != null) {
            clone.setPos(this.pos);
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

        if (this.lv != null) {
            aso.put("lv", lv);
        }

        if (this.gemstoneinfro != null) {
            ArrayList al = new ArrayList();
            for (Object obj : gemstoneinfro) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("gemstoneinfro", al);
        }

        if (this.errorMsg != null) {
            aso.put("errorMsg", errorMsg);
        }

        if (this.pos != null) {
            aso.put("pos", pos);
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

    public Integer getLv() {
        return lv;
    }

    public void setLv(Integer lv) {
        this.lv = lv;
    }

    public ArrayList getGemstoneinfro() {
        return gemstoneinfro;
    }

    public void setGemstoneinfro(ArrayList gemstoneinfro) {
        this.gemstoneinfro = gemstoneinfro;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer ok) {
        this.ok = ok;
    }
}
