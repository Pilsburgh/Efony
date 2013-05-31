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
public class AvailableResearchListBean implements EvonyPacket {

    private Integer avalevel = null;
    private Double endTime = null;
    private Boolean upgradeing = null;
    private Integer level = null;
    private ConditionBean conditionBean = null;
    private Double startTime = null;
    private Double castleId = null;
    private Integer typeId = null;
    private Boolean permition = null;

    public AvailableResearchListBean(ASObject aso) {

        if (aso.get("avalevel") != null) {
            this.avalevel = (Integer) aso.get("avalevel");
        }

        if (aso.get("endTime") != null) {
            this.endTime = (Double) aso.get("endTime");
        }

        if (aso.get("upgradeing") != null) {
            this.upgradeing = (Boolean) aso.get("upgradeing");
        }

        if (aso.get("level") != null) {
            this.level = (Integer) aso.get("level");
        }

        if (aso.get("conditionBean") != null) {
            this.conditionBean = new ConditionBean((ASObject) aso.get("conditionBean"));
        }

        if (aso.get("startTime") != null) {
            this.startTime = (Double) aso.get("startTime");
        }

        if (aso.get("castleId") != null) {
            this.castleId = (Double) aso.get("castleId");
        }

        if (aso.get("typeId") != null) {
            this.typeId = (Integer) aso.get("typeId");
        }

        if (aso.get("permition") != null) {
            this.permition = (Boolean) aso.get("permition");
        }
    }

    public AvailableResearchListBean() {
    }

    @Override
    public AvailableResearchListBean clone() {
        AvailableResearchListBean clone = new AvailableResearchListBean();

        if (this.avalevel != null) {
            clone.setAvalevel(this.avalevel);
        }

        if (this.endTime != null) {
            clone.setEndTime(this.endTime);
        }

        if (this.upgradeing != null) {
            clone.setUpgradeing(this.upgradeing);
        }

        if (this.level != null) {
            clone.setLevel(this.level);
        }

        if (this.conditionBean != null) {
            clone.setConditionBean(this.conditionBean);
        }

        if (this.startTime != null) {
            clone.setStartTime(this.startTime);
        }

        if (this.castleId != null) {
            clone.setCastleId(this.castleId);
        }

        if (this.typeId != null) {
            clone.setTypeId(this.typeId);
        }

        if (this.permition != null) {
            clone.setPermition(this.permition);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.avalevel != null) {
            aso.put("avalevel", avalevel);
        }

        if (this.endTime != null) {
            aso.put("endTime", endTime);
        }

        if (this.upgradeing != null) {
            aso.put("upgradeing", upgradeing);
        }

        if (this.level != null) {
            aso.put("level", level);
        }

        if (this.conditionBean != null) {
            aso.put("conditionBean", conditionBean.toASObject());
        }

        if (this.startTime != null) {
            aso.put("startTime", startTime);
        }

        if (this.castleId != null) {
            aso.put("castleId", castleId);
        }

        if (this.typeId != null) {
            aso.put("typeId", typeId);
        }

        if (this.permition != null) {
            aso.put("permition", permition);
        }

        return aso;
    }

    public Integer getAvalevel() {
        return avalevel;
    }

    public void setAvalevel(Integer avalevel) {
        this.avalevel = avalevel;
    }

    public Double getEndTime() {
        return endTime;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    public Boolean getUpgradeing() {
        return upgradeing;
    }

    public void setUpgradeing(Boolean upgradeing) {
        this.upgradeing = upgradeing;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ConditionBean getConditionBean() {
        return conditionBean;
    }

    public void setConditionBean(ConditionBean conditionBean) {
        this.conditionBean = conditionBean;
    }

    public Double getStartTime() {
        return startTime;
    }

    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    public Double getCastleId() {
        return castleId;
    }

    public void setCastleId(Double castleId) {
        this.castleId = castleId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Boolean getPermition() {
        return permition;
    }

    public void setPermition(Boolean permition) {
        this.permition = permition;
    }
}
