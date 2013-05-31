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
public class IndexAllianceInfoBean implements EvonyPacket {

    private Integer rank = null;
    private String allianceInfo = null;
    private Integer memberLimit = null;
    private String creatorName = null;
    private String allianceNote = null;
    private Integer memberCount = null;
    private String leaderName = null;
    private Integer prestige = null;
    private String allianceName = null;

    public IndexAllianceInfoBean(ASObject aso) {

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }

        if (aso.get("allianceInfo") != null) {
            this.allianceInfo = (String) aso.get("allianceInfo");
        }

        if (aso.get("memberLimit") != null) {
            this.memberLimit = (Integer) aso.get("memberLimit");
        }

        if (aso.get("creatorName") != null) {
            this.creatorName = (String) aso.get("creatorName");
        }

        if (aso.get("allianceNote") != null) {
            this.allianceNote = (String) aso.get("allianceNote");
        }

        if (aso.get("memberCount") != null) {
            this.memberCount = (Integer) aso.get("memberCount");
        }

        if (aso.get("leaderName") != null) {
            this.leaderName = (String) aso.get("leaderName");
        }

        if (aso.get("prestige") != null) {
            this.prestige = (Integer) aso.get("prestige");
        }

        if (aso.get("allianceName") != null) {
            this.allianceName = (String) aso.get("allianceName");
        }
    }

    public IndexAllianceInfoBean() {
    }

    @Override
    public IndexAllianceInfoBean clone() {
        IndexAllianceInfoBean clone = new IndexAllianceInfoBean();

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        if (this.allianceInfo != null) {
            clone.setAllianceInfo(this.allianceInfo);
        }

        if (this.memberLimit != null) {
            clone.setMemberLimit(this.memberLimit);
        }

        if (this.creatorName != null) {
            clone.setCreatorName(this.creatorName);
        }

        if (this.allianceNote != null) {
            clone.setAllianceNote(this.allianceNote);
        }

        if (this.memberCount != null) {
            clone.setMemberCount(this.memberCount);
        }

        if (this.leaderName != null) {
            clone.setLeaderName(this.leaderName);
        }

        if (this.prestige != null) {
            clone.setPrestige(this.prestige);
        }

        if (this.allianceName != null) {
            clone.setAllianceName(this.allianceName);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        if (this.allianceInfo != null) {
            aso.put("allianceInfo", allianceInfo);
        }

        if (this.memberLimit != null) {
            aso.put("memberLimit", memberLimit);
        }

        if (this.creatorName != null) {
            aso.put("creatorName", creatorName);
        }

        if (this.allianceNote != null) {
            aso.put("allianceNote", allianceNote);
        }

        if (this.memberCount != null) {
            aso.put("memberCount", memberCount);
        }

        if (this.leaderName != null) {
            aso.put("leaderName", leaderName);
        }

        if (this.prestige != null) {
            aso.put("prestige", prestige);
        }

        if (this.allianceName != null) {
            aso.put("allianceName", allianceName);
        }

        return aso;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getAllianceInfo() {
        return allianceInfo;
    }

    public void setAllianceInfo(String allianceInfo) {
        this.allianceInfo = allianceInfo;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(Integer memberLimit) {
        this.memberLimit = memberLimit;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getAllianceNote() {
        return allianceNote;
    }

    public void setAllianceNote(String allianceNote) {
        this.allianceNote = allianceNote;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public Integer getPrestige() {
        return prestige;
    }

    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }
}
