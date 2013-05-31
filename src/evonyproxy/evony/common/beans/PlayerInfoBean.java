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
public class PlayerInfoBean implements EvonyPacket {

    private Double lastLoginTime = null;
    private Double createrTime = null;
    private String office = null;
    private Integer castleCount = null;
    private Integer honor = null;
    private Integer levelId = null;
    private Integer medal = null;
    private Integer sex = null;
    private String accountName = null;
    private String faceUrl = null;
    private Integer id = null;
    private String date = null;
    private String allianceLevel = null;
    private Integer population = null;
    private String flag = null;
    private Integer effortPoint = null;
    private Integer prestige = null;
    private String userName = null;
    private Integer titleId = null;
    private Integer ranking = null;
    private String alliance = null;

    public PlayerInfoBean(ASObject aso) {

        if (aso.get("lastLoginTime") != null) {
            this.lastLoginTime = (Double) aso.get("lastLoginTime");
        }

        if (aso.get("createrTime") != null) {
            this.createrTime = (Double) aso.get("createrTime");
        }

        if (aso.get("office") != null) {
            this.office = (String) aso.get("office");
        }

        if (aso.get("castleCount") != null) {
            this.castleCount = (Integer) aso.get("castleCount");
        }

        if (aso.get("honor") != null) {
            this.honor = (Integer) aso.get("honor");
        }

        if (aso.get("levelId") != null) {
            this.levelId = (Integer) aso.get("levelId");
        }

        if (aso.get("medal") != null) {
            this.medal = (Integer) aso.get("medal");
        }

        if (aso.get("sex") != null) {
            this.sex = (Integer) aso.get("sex");
        }

        if (aso.get("accountName") != null) {
            this.accountName = (String) aso.get("accountName");
        }

        if (aso.get("faceUrl") != null) {
            this.faceUrl = (String) aso.get("faceUrl");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }

        if (aso.get("date") != null) {
            this.date = (String) aso.get("date");
        }

        if (aso.get("allianceLevel") != null) {
            this.allianceLevel = (String) aso.get("allianceLevel");
        }

        if (aso.get("population") != null) {
            this.population = (Integer) aso.get("population");
        }

        if (aso.get("flag") != null) {
            this.flag = (String) aso.get("flag");
        }

        if (aso.get("effortPoint") != null) {
            this.effortPoint = (Integer) aso.get("effortPoint");
        }

        if (aso.get("prestige") != null) {
            this.prestige = (Integer) aso.get("prestige");
        }

        if (aso.get("userName") != null) {
            this.userName = (String) aso.get("userName");
        }

        if (aso.get("titleId") != null) {
            this.titleId = (Integer) aso.get("titleId");
        }

        if (aso.get("ranking") != null) {
            this.ranking = (Integer) aso.get("ranking");
        }

        if (aso.get("alliance") != null) {
            this.alliance = (String) aso.get("alliance");
        }
    }

    public PlayerInfoBean() {
    }

    @Override
    public PlayerInfoBean clone() {
        PlayerInfoBean clone = new PlayerInfoBean();

        if (this.lastLoginTime != null) {
            clone.setLastLoginTime(this.lastLoginTime);
        }

        if (this.createrTime != null) {
            clone.setCreaterTime(this.createrTime);
        }

        if (this.office != null) {
            clone.setOffice(this.office);
        }

        if (this.castleCount != null) {
            clone.setCastleCount(this.castleCount);
        }

        if (this.honor != null) {
            clone.setHonor(this.honor);
        }

        if (this.levelId != null) {
            clone.setLevelId(this.levelId);
        }

        if (this.medal != null) {
            clone.setMedal(this.medal);
        }

        if (this.sex != null) {
            clone.setSex(this.sex);
        }

        if (this.accountName != null) {
            clone.setAccountName(this.accountName);
        }

        if (this.faceUrl != null) {
            clone.setFaceUrl(this.faceUrl);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.date != null) {
            clone.setDate(this.date);
        }

        if (this.allianceLevel != null) {
            clone.setAllianceLevel(this.allianceLevel);
        }

        if (this.population != null) {
            clone.setPopulation(this.population);
        }

        if (this.flag != null) {
            clone.setFlag(this.flag);
        }

        if (this.effortPoint != null) {
            clone.setEffortPoint(this.effortPoint);
        }

        if (this.prestige != null) {
            clone.setPrestige(this.prestige);
        }

        if (this.userName != null) {
            clone.setUserName(this.userName);
        }

        if (this.titleId != null) {
            clone.setTitleId(this.titleId);
        }

        if (this.ranking != null) {
            clone.setRanking(this.ranking);
        }

        if (this.alliance != null) {
            clone.setAlliance(this.alliance);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.lastLoginTime != null) {
            aso.put("lastLoginTime", lastLoginTime);
        }

        if (this.createrTime != null) {
            aso.put("createrTime", createrTime);
        }

        if (this.office != null) {
            aso.put("office", office);
        }

        if (this.castleCount != null) {
            aso.put("castleCount", castleCount);
        }

        if (this.honor != null) {
            aso.put("honor", honor);
        }

        if (this.levelId != null) {
            aso.put("levelId", levelId);
        }

        if (this.medal != null) {
            aso.put("medal", medal);
        }

        if (this.sex != null) {
            aso.put("sex", sex);
        }

        if (this.accountName != null) {
            aso.put("accountName", accountName);
        }

        if (this.faceUrl != null) {
            aso.put("faceUrl", faceUrl);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.date != null) {
            aso.put("date", date);
        }

        if (this.allianceLevel != null) {
            aso.put("allianceLevel", allianceLevel);
        }

        if (this.population != null) {
            aso.put("population", population);
        }

        if (this.flag != null) {
            aso.put("flag", flag);
        }

        if (this.effortPoint != null) {
            aso.put("effortPoint", effortPoint);
        }

        if (this.prestige != null) {
            aso.put("prestige", prestige);
        }

        if (this.userName != null) {
            aso.put("userName", userName);
        }

        if (this.titleId != null) {
            aso.put("titleId", titleId);
        }

        if (this.ranking != null) {
            aso.put("ranking", ranking);
        }

        if (this.alliance != null) {
            aso.put("alliance", alliance);
        }

        return aso;
    }

    public Double getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Double lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Double getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Double createrTime) {
        this.createrTime = createrTime;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Integer getCastleCount() {
        return castleCount;
    }

    public void setCastleCount(Integer castleCount) {
        this.castleCount = castleCount;
    }

    public Integer getHonor() {
        return honor;
    }

    public void setHonor(Integer honor) {
        this.honor = honor;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getMedal() {
        return medal;
    }

    public void setMedal(Integer medal) {
        this.medal = medal;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAllianceLevel() {
        return allianceLevel;
    }

    public void setAllianceLevel(String allianceLevel) {
        this.allianceLevel = allianceLevel;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getEffortPoint() {
        return effortPoint;
    }

    public void setEffortPoint(Integer effortPoint) {
        this.effortPoint = effortPoint;
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

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }
}
