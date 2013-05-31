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
public class NewReport implements EvonyPacket {

    public Integer other_count = null;
    public Integer scout_cout = null;
    public Integer army_count = null;
    public Integer count = null;
    public Integer trade_count = null;

    public NewReport(ASObject aso) {

        if (aso.get("other_count") != null) {
            this.other_count = (Integer) aso.get("other_count");
        }

        if (aso.get("scout_cout") != null) {
            this.scout_cout = (Integer) aso.get("scout_cout");
        }

        if (aso.get("army_count") != null) {
            this.army_count = (Integer) aso.get("army_count");
        }

        if (aso.get("count") != null) {
            this.count = (Integer) aso.get("count");
        }

        if (aso.get("trade_count") != null) {
            this.trade_count = (Integer) aso.get("trade_count");
        }
    }

    public NewReport() {
    }

    @Override
    public NewReport clone() {
        NewReport clone = new NewReport();

        if (this.other_count != null) {
            clone.setOther_count(this.other_count);
        }

        if (this.scout_cout != null) {
            clone.setScout_cout(this.scout_cout);
        }

        if (this.army_count != null) {
            clone.setArmy_count(this.army_count);
        }

        if (this.count != null) {
            clone.setCount(this.count);
        }

        if (this.trade_count != null) {
            clone.setTrade_count(this.trade_count);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.other_count != null) {
            aso.put("other_count", other_count);
        }

        if (this.scout_cout != null) {
            aso.put("scout_cout", scout_cout);
        }

        if (this.army_count != null) {
            aso.put("army_count", army_count);
        }

        if (this.count != null) {
            aso.put("count", count);
        }

        if (this.trade_count != null) {
            aso.put("trade_count", trade_count);
        }

        return aso;
    }

    public Integer getOther_count() {
        return other_count;
    }

    public void setOther_count(Integer other_count) {
        this.other_count = other_count;
    }

    public Integer getScout_cout() {
        return scout_cout;
    }

    public void setScout_cout(Integer scout_cout) {
        this.scout_cout = scout_cout;
    }

    public Integer getArmy_count() {
        return army_count;
    }

    public void setArmy_count(Integer army_count) {
        this.army_count = army_count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTrade_count() {
        return trade_count;
    }

    public void setTrade_count(Integer trade_count) {
        this.trade_count = trade_count;
    }
}
