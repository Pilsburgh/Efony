package evonyproxy.evony.common.paramBeans;

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
public class NewArmyParam implements EvonyPacket {

    private TroopBean troops = null;
    private Integer missionType = null;
    private Integer heroId = null;
    private ResourceBean resource = null;
    private Boolean useFlag = null;
    private Boolean backAfterConstruct = null;
    private Integer restTime = null;
    private Integer targetPoint = null;

    public NewArmyParam(ASObject aso) {

        if (aso.get("troops") != null) {
            this.troops = new TroopBean((ASObject) aso.get("troops"));
        }

        if (aso.get("missionType") != null) {
            this.missionType = (Integer) aso.get("missionType");
        }

        if (aso.get("heroId") != null) {
            this.heroId = (Integer) aso.get("heroId");
        }

        if (aso.get("resource") != null) {
            this.resource = new ResourceBean((ASObject) aso.get("resource"));
        }

        if (aso.get("useFlag") != null) {
            this.useFlag = (Boolean) aso.get("useFlag");
        }

        if (aso.get("backAfterConstruct") != null) {
            this.backAfterConstruct = (Boolean) aso.get("backAfterConstruct");
        }

        if (aso.get("restTime") != null) {
            this.restTime = (Integer) aso.get("restTime");
        }

        if (aso.get("targetPoint") != null) {
            this.targetPoint = (Integer) aso.get("targetPoint");
        }
    }

    public NewArmyParam() {
    }

    @Override
    public NewArmyParam clone() {
        NewArmyParam clone = new NewArmyParam();

        if (this.troops != null) {
            clone.setTroops(this.troops);
        }

        if (this.missionType != null) {
            clone.setMissionType(this.missionType);
        }

        if (this.heroId != null) {
            clone.setHeroId(this.heroId);
        }

        if (this.resource != null) {
            clone.setResource(this.resource);
        }

        if (this.useFlag != null) {
            clone.setUseFlag(this.useFlag);
        }

        if (this.backAfterConstruct != null) {
            clone.setBackAfterConstruct(this.backAfterConstruct);
        }

        if (this.restTime != null) {
            clone.setRestTime(this.restTime);
        }

        if (this.targetPoint != null) {
            clone.setTargetPoint(this.targetPoint);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.troops != null) {
            aso.put("troops", troops.toASObject());
        }

        if (this.missionType != null) {
            aso.put("missionType", missionType);
        }

        if (this.heroId != null) {
            aso.put("heroId", heroId);
        }

        if (this.resource != null) {
            aso.put("resource", resource.toASObject());
        }

        if (this.useFlag != null) {
            aso.put("useFlag", useFlag);
        }

        if (this.backAfterConstruct != null) {
            aso.put("backAfterConstruct", backAfterConstruct);
        }

        if (this.restTime != null) {
            aso.put("restTime", restTime);
        }

        if (this.targetPoint != null) {
            aso.put("targetPoint", targetPoint);
        }

        return aso;
    }

    public TroopBean getTroops() {
        return troops;
    }

    public void setTroops(TroopBean troops) {
        this.troops = troops;
    }

    public Integer getMissionType() {
        return missionType;
    }

    public void setMissionType(Integer missionType) {
        this.missionType = missionType;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    public ResourceBean getResource() {
        return resource;
    }

    public void setResource(ResourceBean resource) {
        this.resource = resource;
    }

    public Boolean getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
    }

    public Boolean getBackAfterConstruct() {
        return backAfterConstruct;
    }

    public void setBackAfterConstruct(Boolean backAfterConstruct) {
        this.backAfterConstruct = backAfterConstruct;
    }

    public Integer getRestTime() {
        return restTime;
    }

    public void setRestTime(Integer restTime) {
        this.restTime = restTime;
    }

    public Integer getTargetPoint() {
        return targetPoint;
    }

    public void setTargetPoint(Integer targetPoint) {
        this.targetPoint = targetPoint;
    }
}
