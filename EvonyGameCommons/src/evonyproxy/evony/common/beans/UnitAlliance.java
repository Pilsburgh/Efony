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
public class UnitAlliance implements EvonyPacket {

    private Integer aPrestigeCount = null;
    private Integer memberCount = null;
    private String leaderName = null;
    private Integer honor = null;
    private String allianceName = null;
    private Integer rank = null;

    public UnitAlliance(ASObject aso) {

        if (aso.get("aPrestigeCount") != null) {
            this.aPrestigeCount = (Integer) aso.get("aPrestigeCount");
        }

        if (aso.get("memberCount") != null) {
            this.memberCount = (Integer) aso.get("memberCount");
        }

        if (aso.get("leaderName") != null) {
            this.leaderName = (String) aso.get("leaderName");
        }

        if (aso.get("honor") != null) {
            this.honor = (Integer) aso.get("honor");
        }

        if (aso.get("allianceName") != null) {
            this.allianceName = (String) aso.get("allianceName");
        }

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }
    }

    public UnitAlliance() {
    }

    @Override
    public UnitAlliance clone() {
        UnitAlliance clone = new UnitAlliance();

        if (this.aPrestigeCount != null) {
            clone.setAPrestigeCount(this.aPrestigeCount);
        }

        if (this.memberCount != null) {
            clone.setMemberCount(this.memberCount);
        }

        if (this.leaderName != null) {
            clone.setLeaderName(this.leaderName);
        }

        if (this.honor != null) {
            clone.setHonor(this.honor);
        }

        if (this.allianceName != null) {
            clone.setAllianceName(this.allianceName);
        }

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.aPrestigeCount != null) {
            aso.put("aPrestigeCount", aPrestigeCount);
        }

        if (this.memberCount != null) {
            aso.put("memberCount", memberCount);
        }

        if (this.leaderName != null) {
            aso.put("leaderName", leaderName);
        }

        if (this.honor != null) {
            aso.put("honor", honor);
        }

        if (this.allianceName != null) {
            aso.put("allianceName", allianceName);
        }

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        return aso;
    }

    public Integer getAPrestigeCount() {
        return aPrestigeCount;
    }

    public void setAPrestigeCount(Integer aPrestigeCount) {
        this.aPrestigeCount = aPrestigeCount;
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

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
