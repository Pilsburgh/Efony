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

    private Object stratagem = null;
    private Object experience = null;
    private Object loyalty = null;
    private Object fieldtype = null;
    private String infro = null;
    private Object defence = null;
    private Object management = null;
    private Object politics = null;
    private Object managementBuffAdded = null;
    private Object speed = null;
    private Object morale = null;
    private Object power = null;
    private Object powerBuffAdded = null;
    private Object id = null;
    private Boolean sex = null;
    private Object npc_id = null;
    private ArrayList<BuffBean> buffs = null;
    private String facebook_id = null;
    private Object remainPoint = null;
    private String logoUrl = null;
    private Object stratagemAdded = null;
    private Object maxStrength = null;
    private Object intelligence = null;
    private Object leadershipAdded = null;
    private Object status = null;
    private String name = null;
    private Object stratagemBuffAdded = null;
    private Object level = null;
    private Object managementAdded = null;
    private Object upgradeExp = null;
    private Object isHero = null;
    private Object powerAdded = null;
    private Object leadership = null;
    private Object stamina = null;
    private String itemId = null;
    private Object attack = null;
    private Object itemAmount = null;
    private ArrayList<EquipmentBean> equipmentbean = null;

    public HeroBean(ASObject aso) {
        buffs = new ArrayList<BuffBean>();
        equipmentbean = new ArrayList<EquipmentBean>();

        if (aso.get("stratagem") != null) {
            this.stratagem =  aso.get("stratagem");
        }

        if (aso.get("experience") != null) {
            this.experience =  aso.get("experience");
        }

        if (aso.get("loyalty") != null) {
            this.loyalty =  aso.get("loyalty");
        }

        if (aso.get("fieldtype") != null) {
            this.fieldtype =  aso.get("fieldtype");
        }

        if (aso.get("infro") != null) {
            this.infro = (String) aso.get("infro");
        }

        if (aso.get("defence") != null) {
            this.defence =  aso.get("defence");
        }

        if (aso.get("management") != null) {
            this.management =  aso.get("management");
        }

        if (aso.get("politics") != null) {
            this.politics =  aso.get("politics");
        }

        if (aso.get("managementBuffAdded") != null) {
            this.managementBuffAdded =  aso.get("managementBuffAdded");
        }

        if (aso.get("speed") != null) {
            this.speed =  aso.get("speed");
        }

        if (aso.get("morale") != null) {
            this.morale =  aso.get("morale");
        }

        if (aso.get("power") != null) {
            this.power =  aso.get("power");
        }

        if (aso.get("powerBuffAdded") != null) {
            this.powerBuffAdded =  aso.get("powerBuffAdded");
        }

        if (aso.get("id") != null) {
            this.id =  aso.get("id");
        }

        if (aso.get("sex") != null) {
            this.sex = (Boolean) aso.get("sex");
        }

        if (aso.get("npc_id") != null) {
            this.npc_id =  aso.get("npc_id");
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
            this.remainPoint =  aso.get("remainPoint");
        }

        if (aso.get("logoUrl") != null) {
            this.logoUrl = (String) aso.get("logoUrl");
        }

        if (aso.get("stratagemAdded") != null) {
            this.stratagemAdded =  aso.get("stratagemAdded");
        }

        if (aso.get("maxStrength") != null) {
            this.maxStrength =  aso.get("maxStrength");
        }

        if (aso.get("intelligence") != null) {
            this.intelligence =  aso.get("intelligence");
        }

        if (aso.get("leadershipAdded") != null) {
            this.leadershipAdded =  aso.get("leadershipAdded");
        }

        if (aso.get("status") != null) {
            this.status =  aso.get("status");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("stratagemBuffAdded") != null) {
            this.stratagemBuffAdded =  aso.get("stratagemBuffAdded");
        }

        if (aso.get("level") != null) {
            this.level =  aso.get("level");
        }

        if (aso.get("managementAdded") != null) {
            this.managementAdded =  aso.get("managementAdded");
        }

        if (aso.get("upgradeExp") != null) {
            this.upgradeExp =  aso.get("upgradeExp");
        }

        if (aso.get("isHero") != null) {
            this.isHero =  aso.get("isHero");
        }

        if (aso.get("powerAdded") != null) {
            this.powerAdded =  aso.get("powerAdded");
        }

        if (aso.get("leadership") != null) {
            this.leadership =  aso.get("leadership");
        }

        if (aso.get("stamina") != null) {
            this.stamina =  aso.get("stamina");
        }

        if (aso.get("itemId") != null) {
            this.itemId = (String) aso.get("itemId");
        }

        if (aso.get("attack") != null) {
            this.attack =  aso.get("attack");
        }

        if (aso.get("itemAmount") != null) {
            this.itemAmount =  aso.get("itemAmount");
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

    public Object getStratagem() {
        return stratagem;
    }

    public void setStratagem(Object stratagem) {
        this.stratagem = stratagem;
    }

    public Object getExperience() {
        return experience;
    }

    public void setExperience(Object experience) {
        this.experience = experience;
    }

    public Object getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Object loyalty) {
        this.loyalty = loyalty;
    }

    public Object getFieldtype() {
        return fieldtype;
    }

    public void setFieldtype(Object fieldtype) {
        this.fieldtype = fieldtype;
    }

    public String getInfro() {
        return infro;
    }

    public void setInfro(String infro) {
        this.infro = infro;
    }

    public Object getDefence() {
        return defence;
    }

    public void setDefence(Object defence) {
        this.defence = defence;
    }

    public Object getManagement() {
        return management;
    }

    public void setManagement(Object management) {
        this.management = management;
    }

    public Object getPolitics() {
        return politics;
    }

    public void setPolitics(Object politics) {
        this.politics = politics;
    }

    public Object getManagementBuffAdded() {
        return managementBuffAdded;
    }

    public void setManagementBuffAdded(Object managementBuffAdded) {
        this.managementBuffAdded = managementBuffAdded;
    }

    public Object getSpeed() {
        return speed;
    }

    public void setSpeed(Object speed) {
        this.speed = speed;
    }

    public Object getMorale() {
        return morale;
    }

    public void setMorale(Object morale) {
        this.morale = morale;
    }

    public Object getPower() {
        return power;
    }

    public void setPower(Object power) {
        this.power = power;
    }

    public Object getPowerBuffAdded() {
        return powerBuffAdded;
    }

    public void setPowerBuffAdded(Object powerBuffAdded) {
        this.powerBuffAdded = powerBuffAdded;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Object getNpc_id() {
        return npc_id;
    }

    public void setNpc_id(Object npc_id) {
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

    public Object getRemainPoint() {
        return remainPoint;
    }

    public void setRemainPoint(Object remainPoint) {
        this.remainPoint = remainPoint;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Object getStratagemAdded() {
        return stratagemAdded;
    }

    public void setStratagemAdded(Object stratagemAdded) {
        this.stratagemAdded = stratagemAdded;
    }

    public Object getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(Object maxStrength) {
        this.maxStrength = maxStrength;
    }

    public Object getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Object intelligence) {
        this.intelligence = intelligence;
    }

    public Object getLeadershipAdded() {
        return leadershipAdded;
    }

    public void setLeadershipAdded(Object leadershipAdded) {
        this.leadershipAdded = leadershipAdded;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getStratagemBuffAdded() {
        return stratagemBuffAdded;
    }

    public void setStratagemBuffAdded(Object stratagemBuffAdded) {
        this.stratagemBuffAdded = stratagemBuffAdded;
    }

    public Object getLevel() {
        return level;
    }

    public void setLevel(Object level) {
        this.level = level;
    }

    public Object getManagementAdded() {
        return managementAdded;
    }

    public void setManagementAdded(Object managementAdded) {
        this.managementAdded = managementAdded;
    }

    public Object getUpgradeExp() {
        return upgradeExp;
    }

    public void setUpgradeExp(Object upgradeExp) {
        this.upgradeExp = upgradeExp;
    }

    public Object getIsHero() {
        return isHero;
    }

    public void setIsHero(Object isHero) {
        this.isHero = isHero;
    }

    public Object getPowerAdded() {
        return powerAdded;
    }

    public void setPowerAdded(Object powerAdded) {
        this.powerAdded = powerAdded;
    }

    public Object getLeadership() {
        return leadership;
    }

    public void setLeadership(Object leadership) {
        this.leadership = leadership;
    }

    public Object getStamina() {
        return stamina;
    }

    public void setStamina(Object stamina) {
        this.stamina = stamina;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Object getAttack() {
        return attack;
    }

    public void setAttack(Object attack) {
        this.attack = attack;
    }

    public Object getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Object itemAmount) {
        this.itemAmount = itemAmount;
    }

    public ArrayList getEquipmentbean() {
        return equipmentbean;
    }

    public void setEquipmentbean(ArrayList equipmentbean) {
        this.equipmentbean = equipmentbean;
    }
}
