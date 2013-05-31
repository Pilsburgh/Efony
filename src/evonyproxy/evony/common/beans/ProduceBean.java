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
public class ProduceBean implements EvonyPacket {

    private Double costTime = null;
    private Double endTime = null;
    private Integer queueId = null;
    private Integer num = null;
    private Integer type = null;

    public ProduceBean(ASObject aso) {

        if (aso.get("costTime") != null) {
            this.costTime = (Double) aso.get("costTime");
        }

        if (aso.get("endTime") != null) {
            this.endTime = (Double) aso.get("endTime");
        }

        if (aso.get("queueId") != null) {
            this.queueId = (Integer) aso.get("queueId");
        }

        if (aso.get("num") != null) {
            this.num = (Integer) aso.get("num");
        }

        if (aso.get("type") != null) {
            this.type = (Integer) aso.get("type");
        }
    }

    public ProduceBean() {
    }

    @Override
    public ProduceBean clone() {
        ProduceBean clone = new ProduceBean();

        if (this.costTime != null) {
            clone.setCostTime(this.costTime);
        }

        if (this.endTime != null) {
            clone.setEndTime(this.endTime);
        }

        if (this.queueId != null) {
            clone.setQueueId(this.queueId);
        }

        if (this.num != null) {
            clone.setNum(this.num);
        }

        if (this.type != null) {
            clone.setType(this.type);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.costTime != null) {
            aso.put("costTime", costTime);
        }

        if (this.endTime != null) {
            aso.put("endTime", endTime);
        }

        if (this.queueId != null) {
            aso.put("queueId", queueId);
        }

        if (this.num != null) {
            aso.put("num", num);
        }

        if (this.type != null) {
            aso.put("type", type);
        }

        return aso;
    }

    public Double getCostTime() {
        return costTime;
    }

    public void setCostTime(Double costTime) {
        this.costTime = costTime;
    }

    public Double getEndTime() {
        return endTime;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
