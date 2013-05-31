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
public class CommissionQuestArmyRankBean implements EvonyPacket {

    private Integer rank = null;
    private Double experience = null;
    private Integer playerId = null;

    public CommissionQuestArmyRankBean(ASObject aso) {

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }

        if (aso.get("experience") != null) {
            this.experience = (Double) aso.get("experience");
        }

        if (aso.get("playerId") != null) {
            this.playerId = (Integer) aso.get("playerId");
        }
    }

    public CommissionQuestArmyRankBean() {
    }

    @Override
    public CommissionQuestArmyRankBean clone() {
        CommissionQuestArmyRankBean clone = new CommissionQuestArmyRankBean();

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        if (this.experience != null) {
            clone.setExperience(this.experience);
        }

        if (this.playerId != null) {
            clone.setPlayerId(this.playerId);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        if (this.experience != null) {
            aso.put("experience", experience);
        }

        if (this.playerId != null) {
            aso.put("playerId", playerId);
        }

        return aso;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
}
