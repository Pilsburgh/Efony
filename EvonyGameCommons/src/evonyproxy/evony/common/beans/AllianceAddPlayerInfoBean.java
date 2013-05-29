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
public class AllianceAddPlayerInfoBean implements EvonyPacket {

    private String state = null;
    private Double inviteTime = null;
    private Integer prestige = null;
    private String userName = null;
    private String invitePerson = null;
    private Integer rank = null;

    public AllianceAddPlayerInfoBean(ASObject aso) {

        if (aso.get("state") != null) {
            this.state = (String) aso.get("state");
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

        if (aso.get("invitePerson") != null) {
            this.invitePerson = (String) aso.get("invitePerson");
        }

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }
    }

    public AllianceAddPlayerInfoBean() {
    }

    @Override
    public AllianceAddPlayerInfoBean clone() {
        AllianceAddPlayerInfoBean clone = new AllianceAddPlayerInfoBean();

        if (this.state != null) {
            clone.setState(this.state);
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

        if (this.invitePerson != null) {
            clone.setInvitePerson(this.invitePerson);
        }

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.state != null) {
            aso.put("state", state);
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

        if (this.invitePerson != null) {
            aso.put("invitePerson", invitePerson);
        }

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        return aso;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getInvitePerson() {
        return invitePerson;
    }

    public void setInvitePerson(String invitePerson) {
        this.invitePerson = invitePerson;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
