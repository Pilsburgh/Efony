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
public class AllianceAddPlayerByUserInfoBean implements EvonyPacket {

    private Integer castleCount = null;
    private Double inviteTime = null;
    private Integer prestige = null;
    private String userName = null;
    private Integer rank = null;

    public AllianceAddPlayerByUserInfoBean(ASObject aso) {

        if (aso.get("castleCount") != null) {
            this.castleCount = (Integer) aso.get("castleCount");
        }

        if (aso.get("inviteTime") != null) {
            this.inviteTime = (Double) aso.get("inviteTime");
        }

        if (aso.get("prestige") != null) {
            this.prestige = (Integer) aso.get("prestige");
        }

        if (aso.get("userName") != null) {
            this.userName = (String) aso.get("userName");
        }

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }
    }

    public AllianceAddPlayerByUserInfoBean() {
    }

    @Override
    public AllianceAddPlayerByUserInfoBean clone() {
        AllianceAddPlayerByUserInfoBean clone = new AllianceAddPlayerByUserInfoBean();

        if (this.castleCount != null) {
            clone.setCastleCount(this.castleCount);
        }

        if (this.inviteTime != null) {
            clone.setInviteTime(this.inviteTime);
        }

        if (this.prestige != null) {
            clone.setPrestige(this.prestige);
        }

        if (this.userName != null) {
            clone.setUserName(this.userName);
        }

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.castleCount != null) {
            aso.put("castleCount", castleCount);
        }

        if (this.inviteTime != null) {
            aso.put("inviteTime", inviteTime);
        }

        if (this.prestige != null) {
            aso.put("prestige", prestige);
        }

        if (this.userName != null) {
            aso.put("userName", userName);
        }

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        return aso;
    }

    public Integer getCastleCount() {
        return castleCount;
    }

    public void setCastleCount(Integer castleCount) {
        this.castleCount = castleCount;
    }

    public Double getInviteTime() {
        return inviteTime;
    }

    public void setInviteTime(Double inviteTime) {
        this.inviteTime = inviteTime;
    }

    public Integer getPrestige() {
        return prestige;
    }

    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
