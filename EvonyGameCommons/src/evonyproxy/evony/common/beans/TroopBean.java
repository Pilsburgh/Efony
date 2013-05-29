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
public class TroopBean implements EvonyPacket {

    private Integer heavyCavalry = null;
    private Integer catapult = null;
    private Integer archer = null;
    private Integer lightCavalry = null;
    private Integer ballista = null;
    private Integer militia = null;
    private Integer carriage = null;
    private Integer scouter = null;
    private Integer peasants = null;
    private Integer batteringRam = null;
    private Integer swordsmen = null;
    private Integer pikemen = null;

    public TroopBean(ASObject aso) {

        if (aso.get("heavyCavalry") != null) {
            this.heavyCavalry = (Integer) aso.get("heavyCavalry");
        }

        if (aso.get("catapult") != null) {
            this.catapult = (Integer) aso.get("catapult");
        }

        if (aso.get("archer") != null) {
            this.archer = (Integer) aso.get("archer");
        }

        if (aso.get("lightCavalry") != null) {
            this.lightCavalry = (Integer) aso.get("lightCavalry");
        }

        if (aso.get("ballista") != null) {
            this.ballista = (Integer) aso.get("ballista");
        }

        if (aso.get("militia") != null) {
            this.militia = (Integer) aso.get("militia");
        }

        if (aso.get("carriage") != null) {
            this.carriage = (Integer) aso.get("carriage");
        }

        if (aso.get("scouter") != null) {
            this.scouter = (Integer) aso.get("scouter");
        }

        if (aso.get("peasants") != null) {
            this.peasants = (Integer) aso.get("peasants");
        }

        if (aso.get("batteringRam") != null) {
            this.batteringRam = (Integer) aso.get("batteringRam");
        }

        if (aso.get("swordsmen") != null) {
            this.swordsmen = (Integer) aso.get("swordsmen");
        }

        if (aso.get("pikemen") != null) {
            this.pikemen = (Integer) aso.get("pikemen");
        }
    }

    public TroopBean() {
    }

    @Override
    public TroopBean clone() {
        TroopBean clone = new TroopBean();

        if (this.heavyCavalry != null) {
            clone.setHeavyCavalry(this.heavyCavalry);
        }

        if (this.catapult != null) {
            clone.setCatapult(this.catapult);
        }

        if (this.archer != null) {
            clone.setArcher(this.archer);
        }

        if (this.lightCavalry != null) {
            clone.setLightCavalry(this.lightCavalry);
        }

        if (this.ballista != null) {
            clone.setBallista(this.ballista);
        }

        if (this.militia != null) {
            clone.setMilitia(this.militia);
        }

        if (this.carriage != null) {
            clone.setCarriage(this.carriage);
        }

        if (this.scouter != null) {
            clone.setScouter(this.scouter);
        }

        if (this.peasants != null) {
            clone.setPeasants(this.peasants);
        }

        if (this.batteringRam != null) {
            clone.setBatteringRam(this.batteringRam);
        }

        if (this.swordsmen != null) {
            clone.setSwordsmen(this.swordsmen);
        }

        if (this.pikemen != null) {
            clone.setPikemen(this.pikemen);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.heavyCavalry != null) {
            aso.put("heavyCavalry", heavyCavalry);
        }

        if (this.catapult != null) {
            aso.put("catapult", catapult);
        }

        if (this.archer != null) {
            aso.put("archer", archer);
        }

        if (this.lightCavalry != null) {
            aso.put("lightCavalry", lightCavalry);
        }

        if (this.ballista != null) {
            aso.put("ballista", ballista);
        }

        if (this.militia != null) {
            aso.put("militia", militia);
        }

        if (this.carriage != null) {
            aso.put("carriage", carriage);
        }

        if (this.scouter != null) {
            aso.put("scouter", scouter);
        }

        if (this.peasants != null) {
            aso.put("peasants", peasants);
        }

        if (this.batteringRam != null) {
            aso.put("batteringRam", batteringRam);
        }

        if (this.swordsmen != null) {
            aso.put("swordsmen", swordsmen);
        }

        if (this.pikemen != null) {
            aso.put("pikemen", pikemen);
        }

        return aso;
    }

    public Integer getHeavyCavalry() {
        return heavyCavalry;
    }

    public void setHeavyCavalry(Integer heavyCavalry) {
        this.heavyCavalry = heavyCavalry;
    }

    public Integer getCatapult() {
        return catapult;
    }

    public void setCatapult(Integer catapult) {
        this.catapult = catapult;
    }

    public Integer getArcher() {
        return archer;
    }

    public void setArcher(Integer archer) {
        this.archer = archer;
    }

    public Integer getLightCavalry() {
        return lightCavalry;
    }

    public void setLightCavalry(Integer lightCavalry) {
        this.lightCavalry = lightCavalry;
    }

    public Integer getBallista() {
        return ballista;
    }

    public void setBallista(Integer ballista) {
        this.ballista = ballista;
    }

    public Integer getMilitia() {
        return militia;
    }

    public void setMilitia(Integer militia) {
        this.militia = militia;
    }

    public Integer getCarriage() {
        return carriage;
    }

    public void setCarriage(Integer carriage) {
        this.carriage = carriage;
    }

    public Integer getScouter() {
        return scouter;
    }

    public void setScouter(Integer scouter) {
        this.scouter = scouter;
    }

    public Integer getPeasants() {
        return peasants;
    }

    public void setPeasants(Integer peasants) {
        this.peasants = peasants;
    }

    public Integer getBatteringRam() {
        return batteringRam;
    }

    public void setBatteringRam(Integer batteringRam) {
        this.batteringRam = batteringRam;
    }

    public Integer getSwordsmen() {
        return swordsmen;
    }

    public void setSwordsmen(Integer swordsmen) {
        this.swordsmen = swordsmen;
    }

    public Integer getPikemen() {
        return pikemen;
    }

    public void setPikemen(Integer pikemen) {
        this.pikemen = pikemen;
    }
}
