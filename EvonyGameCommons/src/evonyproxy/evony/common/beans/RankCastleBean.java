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
public class RankCastleBean implements EvonyPacket {

    private Integer population = null;
    private String name = null;
    private String grade = null;
    private String kind = null;
    private Integer level = null;
    private Integer rank = null;
    private String alliance = null;

    public RankCastleBean(ASObject aso) {

        if (aso.get("population") != null) {
            this.population = (Integer) aso.get("population");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("grade") != null) {
            this.grade = (String) aso.get("grade");
        }

        if (aso.get("kind") != null) {
            this.kind = (String) aso.get("kind");
        }

        if (aso.get("level") != null) {
            this.level = (Integer) aso.get("level");
        }

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }

        if (aso.get("alliance") != null) {
            this.alliance = (String) aso.get("alliance");
        }
    }

    public RankCastleBean() {
    }

    @Override
    public RankCastleBean clone() {
        RankCastleBean clone = new RankCastleBean();

        if (this.population != null) {
            clone.setPopulation(this.population);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.grade != null) {
            clone.setGrade(this.grade);
        }

        if (this.kind != null) {
            clone.setKind(this.kind);
        }

        if (this.level != null) {
            clone.setLevel(this.level);
        }

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        if (this.alliance != null) {
            clone.setAlliance(this.alliance);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.population != null) {
            aso.put("population", population);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.grade != null) {
            aso.put("grade", grade);
        }

        if (this.kind != null) {
            aso.put("kind", kind);
        }

        if (this.level != null) {
            aso.put("level", level);
        }

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        if (this.alliance != null) {
            aso.put("alliance", alliance);
        }

        return aso;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }
}
