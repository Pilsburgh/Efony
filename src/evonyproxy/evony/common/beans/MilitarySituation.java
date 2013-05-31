package evonyproxy.evony.common.beans;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class MilitarySituation implements EvonyPacket {

    private String startPos = null;
    private String otherAllianceName = null;
    private Integer type = null;
    private Integer id = null;
    private String time = null;
    private String eventName = null;
    private Boolean attack = null;
    private String xml_data = null;
    private String targetPos = null;

    public MilitarySituation(ASObject aso) {

        if (aso.get("startPos") != null) {
            this.startPos = (String) aso.get("startPos");
        }

        if (aso.get("otherAllianceName") != null) {
            this.otherAllianceName = (String) aso.get("otherAllianceName");
        }

        if (aso.get("type") != null) {
            this.type = (Integer) aso.get("type");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }

        if (aso.get("time") != null) {
            this.time = (String) aso.get("time");
        }

        if (aso.get("eventName") != null) {
            this.eventName = (String) aso.get("eventName");
        }

        if (aso.get("attack") != null) {
            this.attack = (Boolean) aso.get("attack");
        }

        if (aso.get("xml_data") != null) {
            this.xml_data = (String) aso.get("xml_data");
        }

        if (aso.get("targetPos") != null) {
            this.targetPos = (String) aso.get("targetPos");
        }
    }

    public MilitarySituation() {
    }

    @Override
    public MilitarySituation clone() {
        MilitarySituation clone = new MilitarySituation();

        if (this.startPos != null) {
            clone.setStartPos(this.startPos);
        }

        if (this.otherAllianceName != null) {
            clone.setOtherAllianceName(this.otherAllianceName);
        }

        if (this.type != null) {
            clone.setType(this.type);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.time != null) {
            clone.setTime(this.time);
        }

        if (this.eventName != null) {
            clone.setEventName(this.eventName);
        }

        if (this.attack != null) {
            clone.setAttack(this.attack);
        }

        if (this.xml_data != null) {
            clone.setXml_data(this.xml_data);
        }

        if (this.targetPos != null) {
            clone.setTargetPos(this.targetPos);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.startPos != null) {
            aso.put("startPos", startPos);
        }

        if (this.otherAllianceName != null) {
            aso.put("otherAllianceName", otherAllianceName);
        }

        if (this.type != null) {
            aso.put("type", type);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.time != null) {
            aso.put("time", time);
        }

        if (this.eventName != null) {
            aso.put("eventName", eventName);
        }

        if (this.attack != null) {
            aso.put("attack", attack);
        }

        if (this.xml_data != null) {
            aso.put("xml_data", xml_data);
        }

        if (this.targetPos != null) {
            aso.put("targetPos", targetPos);
        }

        return aso;
    }

    public String getStartPos() {
        return startPos;
    }

    public void setStartPos(String startPos) {
        this.startPos = startPos;
    }

    public String getOtherAllianceName() {
        return otherAllianceName;
    }

    public void setOtherAllianceName(String otherAllianceName) {
        this.otherAllianceName = otherAllianceName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Boolean getAttack() {
        return attack;
    }

    public void setAttack(Boolean attack) {
        this.attack = attack;
    }

    public String getXml_data() {
        return xml_data;
    }

    public void setXml_data(String xml_data) {
        this.xml_data = xml_data;
    }

    public String getTargetPos() {
        return targetPos;
    }

    public void setTargetPos(String targetPos) {
        this.targetPos = targetPos;
    }
}
