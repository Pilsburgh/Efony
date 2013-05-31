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
public class CbUpdate implements EvonyPacket {

    public Integer tp = null;
    public String text = null;

    public CbUpdate(ASObject aso) {

        if (aso.get("tp") != null) {
            this.tp = (Integer) aso.get("tp");
        }

        if (aso.get("text") != null) {
            this.text = (String) aso.get("text");
        }
    }

    public CbUpdate() {
    }

    @Override
    public CbUpdate clone() {
        CbUpdate clone = new CbUpdate();

        if (this.tp != null) {
            clone.setTp(this.tp);
        }

        if (this.text != null) {
            clone.setText(this.text);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.tp != null) {
            aso.put("tp", tp);
        }

        if (this.text != null) {
            aso.put("text", text);
        }

        return aso;
    }

    public Integer getTp() {
        return tp;
    }

    public void setTp(Integer tp) {
        this.tp = tp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
