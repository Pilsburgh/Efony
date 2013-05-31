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
public class RankHeroBean implements EvonyPacket {

    private String name = null;
    private Integer management = null;
    private Integer isHero = null;
    private Integer grade = null;
    private String kind = null;
    private Integer power = null;
    private Integer rank = null;
    private Integer stratagem = null;

    public RankHeroBean(ASObject aso) {

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("management") != null) {
            this.management = (Integer) aso.get("management");
        }

        if (aso.get("isHero") != null) {
            this.isHero = (Integer) aso.get("isHero");
        }

        if (aso.get("grade") != null) {
            this.grade = (Integer) aso.get("grade");
        }

        if (aso.get("kind") != null) {
            this.kind = (String) aso.get("kind");
        }

        if (aso.get("power") != null) {
            this.power = (Integer) aso.get("power");
        }

        if (aso.get("rank") != null) {
            this.rank = (Integer) aso.get("rank");
        }

        if (aso.get("stratagem") != null) {
            this.stratagem = (Integer) aso.get("stratagem");
        }
    }

    public RankHeroBean() {
    }

    @Override
    public RankHeroBean clone() {
        RankHeroBean clone = new RankHeroBean();

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.management != null) {
            clone.setManagement(this.management);
        }

        if (this.isHero != null) {
            clone.setIsHero(this.isHero);
        }

        if (this.grade != null) {
            clone.setGrade(this.grade);
        }

        if (this.kind != null) {
            clone.setKind(this.kind);
        }

        if (this.power != null) {
            clone.setPower(this.power);
        }

        if (this.rank != null) {
            clone.setRank(this.rank);
        }

        if (this.stratagem != null) {
            clone.setStratagem(this.stratagem);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.management != null) {
            aso.put("management", management);
        }

        if (this.isHero != null) {
            aso.put("isHero", isHero);
        }

        if (this.grade != null) {
            aso.put("grade", grade);
        }

        if (this.kind != null) {
            aso.put("kind", kind);
        }

        if (this.power != null) {
            aso.put("power", power);
        }

        if (this.rank != null) {
            aso.put("rank", rank);
        }

        if (this.stratagem != null) {
            aso.put("stratagem", stratagem);
        }

        return aso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManagement() {
        return management;
    }

    public void setManagement(Integer management) {
        this.management = management;
    }

    public Integer getIsHero() {
        return isHero;
    }

    public void setIsHero(Integer isHero) {
        this.isHero = isHero;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getStratagem() {
        return stratagem;
    }

    public void setStratagem(Integer stratagem) {
        this.stratagem = stratagem;
    }
}
