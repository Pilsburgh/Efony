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
public class HeroBean implements EvonyPacket {

    private Integer stratagem = null;
    private Integer experience = null;
    private Integer loyalty = null;
    private Integer fieldtype = null;
    private String infro = null;
    private Integer defence = null;
    private Integer management = null;
    private Integer politics = null;
    private Integer managementBuffAdded = null;
    private Integer speed = null;
    private Integer morale = null;
    private Integer power = null;
    private Integer powerBuffAdded = null;
    private Integer id = null;
    private Boolean sex = null;
    private Integer npc_id = null;
    private ArrayList<BuffBean> buffs = null;
    private String facebook_id = null;
    private Integer remainPoint = null;
    private String logoUrl = null;
    private Integer stratagemAdded = null;
    private Integer maxStrength = null;
    private Integer intelligence = null;
    private Integer leadershipAdded = null;
    private Integer status = null;
    private String name = null;
    private Integer stratagemBuffAdded = null;
    private Integer level = null;
    private Integer managementAdded = null;
    private Integer upgradeExp = null;
    private Integer isHero = null;
    private Integer powerAdded = null;
    private Integer leadership = null;
    private Integer stamina = null;
    private String itemId = null;
    private Integer attack = null;
    private Integer itemAmount = null;
    private ArrayList<EquipmentBean> equipmentbean = null;

    public HeroBean(ASObject aso) {
        buffs = new ArrayList<BuffBean>();
        equipmentbean = new ArrayList<EquipmentBean>();

        if (aso.get("stratagem") != null) {
            this.stratagem = (Integer) aso.get("stratagem");
        }

        if (aso.get("experience") != null) {
            this.experience = (Integer) aso.get("experience");
        }

        if (aso.get("loyalty") != null) {
            this.loyalty = (Integer) aso.get("loyalty");
        }

        if (aso.get("fieldtype") != null) {
            this.fieldtype = (Integer) aso.get("fieldtype");
        }

        if (aso.get("infro") != null) {
            this.infro = (String) aso.get("infro");
        }

        if (aso.get("defence") != null) {
            this.defence = (Integer) aso.get("defence");
        }

        if (aso.get("management") != null) {
            this.management = (Integer) aso.get("management");
        }

        if (aso.get("politics") != null) {
            this.politics = (Integer) aso.get("politics");
        }

        if (aso.get("managementBuffAdded") != null) {
            this.managementBuffAdded = (Integer) aso.get("managementBuffAdded");
        }

        if (aso.get("speed") != null) {
            this.speed = (Integer) aso.get("speed");
        }

        if (aso.get("morale") != null) {
            this.morale = (Integer) aso.get("morale");
        }

        if (aso.get("power") != null) {
            this.power = (Integer) aso.get("power");
        }

        if (aso.get("powerBuffAdded") != null) {
            this.powerBuffAdded = (Integer) aso.get("powerBuffAdded");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }

        if (aso.get("sex") != null) {
            this.sex = (Boolean) aso.get("sex");
        }

        if (aso.get("npc_id") != null) {
            this.npc_id = (Integer) aso.get("npc_id");
        }

        if (aso.get("buffs") != null) {
            Object[] objArr = (Object[]) aso.get("buffs");
            for (int j = 0; j < objArr.length; j++) {
                buffs.add(new BuffBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("facebook_id") != null) {
            this.facebook_id = (String) aso.get("facebook_id");
        }

        if (aso.get("remainPoint") != null) {
            this.remainPoint = (Integer) aso.get("remainPoint");
        }

        if (aso.get("logoUrl") != null) {
            this.logoUrl = (String) aso.get("logoUrl");
        }

        if (aso.get("stratagemAdded") != null) {
            this.stratagemAdded = (Integer) aso.get("stratagemAdded");
        }

        if (aso.get("maxStrength") != null) {
            this.maxStrength = (Integer) aso.get("maxStrength");
        }

        if (aso.get("intelligence") != null) {
            this.intelligence = (Integer) aso.get("intelligence");
        }

        if (aso.get("leadershipAdded") != null) {
            this.leadershipAdded = (Integer) aso.get("leadershipAdded");
        }

        if (aso.get("status") != null) {
            this.status = (Integer) aso.get("status");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("stratagemBuffAdded") != null) {
            this.stratagemBuffAdded = (Integer) aso.get("stratagemBuffAdded");
        }

        if (aso.get("level") != null) {
            this.level = (Integer) aso.get("level");
        }

        if (aso.get("managementAdded") != null) {
            this.managementAdded = (Integer) aso.get("managementAdded");
        }

        if (aso.get("upgradeExp") != null) {
            this.upgradeExp = (Integer) aso.get("upgradeExp");
        }

        if (aso.get("isHero") != null) {
            this.isHero = (Integer) aso.get("isHero");
        }

        if (aso.get("powerAdded") != null) {
            this.powerAdded = (Integer) aso.get("powerAdded");
        }

        if (aso.get("leadership") != null) {
            this.leadership = (Integer) aso.get("leadership");
        }

        if (aso.get("stamina") != null) {
            this.stamina = (Integer) aso.get("stamina");
        }

        if (aso.get("itemId") != null) {
            this.itemId = (String) aso.get("itemId");
        }

        if (aso.get("attack") != null) {
            this.attack = (Integer) aso.get("attack");
        }

        if (aso.get("itemAmount") != null) {
            this.itemAmount = (Integer) aso.get("itemAmount");
        }

        if (aso.get("equipmentbean") != null) {
            Object[] objArr = (Object[]) aso.get("equipmentbean");
            for (int j = 0; j < objArr.length; j++) {
                equipmentbean.add(new EquipmentBean((ASObject) objArr[j]));
            }
        }
    }

    public HeroBean() {
    }

    @Override
    public HeroBean clone() {
        HeroBean clone = new HeroBean();

        if (this.stratagem != null) {
            clone.setStratagem(this.stratagem);
        }

        if (this.experience != null) {
            clone.setExperience(this.experience);
        }

        if (this.loyalty != null) {
            clone.setLoyalty(this.loyalty);
        }

        if (this.fieldtype != null) {
            clone.setFieldtype(this.fieldtype);
        }

        if (this.infro != null) {
            clone.setInfro(this.infro);
        }

        if (this.defence != null) {
            clone.setDefence(this.defence);
        }

        if (this.management != null) {
            clone.setManagement(this.management);
        }

        if (this.politics != null) {
            clone.setPolitics(this.politics);
        }

        if (this.managementBuffAdded != null) {
            clone.setManagementBuffAdded(this.managementBuffAdded);
        }

        if (this.speed != null) {
            clone.setSpeed(this.speed);
        }

        if (this.morale != null) {
            clone.setMorale(this.morale);
        }

        if (this.power != null) {
            clone.setPower(this.power);
        }

        if (this.powerBuffAdded != null) {
            clone.setPowerBuffAdded(this.powerBuffAdded);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.sex != null) {
            clone.setSex(this.sex);
        }

        if (this.npc_id != null) {
            clone.setNpc_id(this.npc_id);
        }

        if (this.buffs != null) {
            ArrayList tmpArrLst = new ArrayList<BuffBean>();

            for (Object bean : buffs) {
                BuffBean tmpBean = (BuffBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setBuffs(tmpArrLst);
        }

        if (this.facebook_id != null) {
            clone.setFacebook_id(this.facebook_id);
        }

        if (this.remainPoint != null) {
            clone.setRemainPoint(this.remainPoint);
        }

        if (this.logoUrl != null) {
            clone.setLogoUrl(this.logoUrl);
        }

        if (this.stratagemAdded != null) {
            clone.setStratagemAdded(this.stratagemAdded);
        }

        if (this.maxStrength != null) {
            clone.setMaxStrength(this.maxStrength);
        }

        if (this.intelligence != null) {
            clone.setIntelligence(this.intelligence);
        }

        if (this.leadershipAdded != null) {
            clone.setLeadershipAdded(this.leadershipAdded);
        }

        if (this.status != null) {
            clone.setStatus(this.status);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.stratagemBuffAdded != null) {
            clone.setStratagemBuffAdded(this.stratagemBuffAdded);
        }

        if (this.level != null) {
            clone.setLevel(this.level);
        }

        if (this.managementAdded != null) {
            clone.setManagementAdded(this.managementAdded);
        }

        if (this.upgradeExp != null) {
            clone.setUpgradeExp(this.upgradeExp);
        }

        if (this.isHero != null) {
            clone.setIsHero(this.isHero);
        }

        if (this.powerAdded != null) {
            clone.setPowerAdded(this.powerAdded);
        }

        if (this.leadership != null) {
            clone.setLeadership(this.leadership);
        }

        if (this.stamina != null) {
            clone.setStamina(this.stamina);
        }

        if (this.itemId != null) {
            clone.setItemId(this.itemId);
        }

        if (this.attack != null) {
            clone.setAttack(this.attack);
        }

        if (this.itemAmount != null) {
            clone.setItemAmount(this.itemAmount);
        }

        if (this.equipmentbean != null) {
            ArrayList tmpArrLst = new ArrayList<EquipmentBean>();

            for (Object bean : equipmentbean) {
                EquipmentBean tmpBean = (EquipmentBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setEquipmentbean(tmpArrLst);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.stratagem != null) {
            aso.put("stratagem", stratagem);
        }

        if (this.experience != null) {
            aso.put("experience", experience);
        }

        if (this.loyalty != null) {
            aso.put("loyalty", loyalty);
        }

        if (this.fieldtype != null) {
            aso.put("fieldtype", fieldtype);
        }

        if (this.infro != null) {
            aso.put("infro", infro);
        }

        if (this.defence != null) {
            aso.put("defence", defence);
        }

        if (this.management != null) {
            aso.put("management", management);
        }

        if (this.politics != null) {
            aso.put("politics", politics);
        }

        if (this.managementBuffAdded != null) {
            aso.put("managementBuffAdded", managementBuffAdded);
        }

        if (this.speed != null) {
            aso.put("speed", speed);
        }

        if (this.morale != null) {
            aso.put("morale", morale);
        }

        if (this.power != null) {
            aso.put("power", power);
        }

        if (this.powerBuffAdded != null) {
            aso.put("powerBuffAdded", powerBuffAdded);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.sex != null) {
            aso.put("sex", sex);
        }

        if (this.npc_id != null) {
            aso.put("npc_id", npc_id);
        }

        if (this.buffs != null) {
            ArrayList al = new ArrayList();
            for (Object obj : buffs) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("buffs", al);
        }

        if (this.facebook_id != null) {
            aso.put("facebook_id", facebook_id);
        }

        if (this.remainPoint != null) {
            aso.put("remainPoint", remainPoint);
        }

        if (this.logoUrl != null) {
            aso.put("logoUrl", logoUrl);
        }

        if (this.stratagemAdded != null) {
            aso.put("stratagemAdded", stratagemAdded);
        }

        if (this.maxStrength != null) {
            aso.put("maxStrength", maxStrength);
        }

        if (this.intelligence != null) {
            aso.put("intelligence", intelligence);
        }

        if (this.leadershipAdded != null) {
            aso.put("leadershipAdded", leadershipAdded);
        }

        if (this.status != null) {
            aso.put("status", status);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.stratagemBuffAdded != null) {
            aso.put("stratagemBuffAdded", stratagemBuffAdded);
        }

        if (this.level != null) {
            aso.put("level", level);
        }

        if (this.managementAdded != null) {
            aso.put("managementAdded", managementAdded);
        }

        if (this.upgradeExp != null) {
            aso.put("upgradeExp", upgradeExp);
        }

        if (this.isHero != null) {
            aso.put("isHero", isHero);
        }

        if (this.powerAdded != null) {
            aso.put("powerAdded", powerAdded);
        }

        if (this.leadership != null) {
            aso.put("leadership", leadership);
        }

        if (this.stamina != null) {
            aso.put("stamina", stamina);
        }

        if (this.itemId != null) {
            aso.put("itemId", itemId);
        }

        if (this.attack != null) {
            aso.put("attack", attack);
        }

        if (this.itemAmount != null) {
            aso.put("itemAmount", itemAmount);
        }

        if (this.equipmentbean != null) {
            ArrayList al = new ArrayList();
            for (Object obj : equipmentbean) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("equipmentbean", al);
        }

        return aso;
    }

    public Integer getStratagem() {
        return stratagem;
    }

    public void setStratagem(Integer stratagem) {
        this.stratagem = stratagem;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(Integer fieldtype) {
        this.fieldtype = fieldtype;
    }

    public String getInfro() {
        return infro;
    }

    public void setInfro(String infro) {
        this.infro = infro;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getManagement() {
        return management;
    }

    public void setManagement(Integer management) {
        this.management = management;
    }

    public Integer getPolitics() {
        return politics;
    }

    public void setPolitics(Integer politics) {
        this.politics = politics;
    }

    public Integer getManagementBuffAdded() {
        return managementBuffAdded;
    }

    public void setManagementBuffAdded(Integer managementBuffAdded) {
        this.managementBuffAdded = managementBuffAdded;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getMorale() {
        return morale;
    }

    public void setMorale(Integer morale) {
        this.morale = morale;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPowerBuffAdded() {
        return powerBuffAdded;
    }

    public void setPowerBuffAdded(Integer powerBuffAdded) {
        this.powerBuffAdded = powerBuffAdded;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getNpc_id() {
        return npc_id;
    }

    public void setNpc_id(Integer npc_id) {
        this.npc_id = npc_id;
    }

    public ArrayList getBuffs() {
        return buffs;
    }

    public void setBuffs(ArrayList buffs) {
        this.buffs = buffs;
    }

    public String getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }

    public Integer getRemainPoint() {
        return remainPoint;
    }

    public void setRemainPoint(Integer remainPoint) {
        this.remainPoint = remainPoint;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getStratagemAdded() {
        return stratagemAdded;
    }

    public void setStratagemAdded(Integer stratagemAdded) {
        this.stratagemAdded = stratagemAdded;
    }

    public Integer getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(Integer maxStrength) {
        this.maxStrength = maxStrength;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getLeadershipAdded() {
        return leadershipAdded;
    }

    public void setLeadershipAdded(Integer leadershipAdded) {
        this.leadershipAdded = leadershipAdded;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStratagemBuffAdded() {
        return stratagemBuffAdded;
    }

    public void setStratagemBuffAdded(Integer stratagemBuffAdded) {
        this.stratagemBuffAdded = stratagemBuffAdded;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getManagementAdded() {
        return managementAdded;
    }

    public void setManagementAdded(Integer managementAdded) {
        this.managementAdded = managementAdded;
    }

    public Integer getUpgradeExp() {
        return upgradeExp;
    }

    public void setUpgradeExp(Integer upgradeExp) {
        this.upgradeExp = upgradeExp;
    }

    public Integer getIsHero() {
        return isHero;
    }

    public void setIsHero(Integer isHero) {
        this.isHero = isHero;
    }

    public Integer getPowerAdded() {
        return powerAdded;
    }

    public void setPowerAdded(Integer powerAdded) {
        this.powerAdded = powerAdded;
    }

    public Integer getLeadership() {
        return leadership;
    }

    public void setLeadership(Integer leadership) {
        this.leadership = leadership;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
    }

    public ArrayList getEquipmentbean() {
        return equipmentbean;
    }

    public void setEquipmentbean(ArrayList equipmentbean) {
        this.equipmentbean = equipmentbean;
    }
}
