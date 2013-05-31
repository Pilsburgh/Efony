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
public class NpcHeroBean implements EvonyPacket {

    public static final int HIRED_STATUS = 2;
    public static final int FREE_STATUS = 0;
    public static final int CATCH_STATUS = 1;
    public static final int GENERAL_NPC_HERO = 0;
    private Integer npcid = null;
    private String introduce = null;
    private Integer type = null;
    private Integer management = null;
    private Integer questType = null;
    private Integer sex = null;
    private Integer power = null;
    private Integer wisdom_base = null;
    private String logoimage = null;
    private Integer field = null;
    private Integer leadership_Added = null;
    private Integer power_Added = null;
    private Integer stratagem_Added = null;
    private Integer bravery_base = null;
    private Integer management_Added = null;
    private String province = null;
    private String zi = null;
    private Integer catchQuestId = null;
    private Integer status = null;
    private Integer affairs_base = null;
    private String name = null;
    private Integer uid = null;
    private String taskitemid = null;
    private Integer level = null;
    private Integer face = null;
    private Integer leadership = null;
    private Integer loyalty = null;
    private Integer hireQuestId = null;
    private Integer stratagem = null;

    public NpcHeroBean(ASObject aso) {

        if (aso.get("npcid") != null) {
            this.npcid = (Integer) aso.get("npcid");
        }

        if (aso.get("introduce") != null) {
            this.introduce = (String) aso.get("introduce");
        }

        if (aso.get("type") != null) {
            this.type = (Integer) aso.get("type");
        }

        if (aso.get("management") != null) {
            this.management = (Integer) aso.get("management");
        }

        if (aso.get("questType") != null) {
            this.questType = (Integer) aso.get("questType");
        }

        if (aso.get("sex") != null) {
            this.sex = (Integer) aso.get("sex");
        }

        if (aso.get("power") != null) {
            this.power = (Integer) aso.get("power");
        }

        if (aso.get("wisdom_base") != null) {
            this.wisdom_base = (Integer) aso.get("wisdom_base");
        }

        if (aso.get("logoimage") != null) {
            this.logoimage = (String) aso.get("logoimage");
        }

        if (aso.get("field") != null) {
            this.field = (Integer) aso.get("field");
        }

        if (aso.get("leadership_Added") != null) {
            this.leadership_Added = (Integer) aso.get("leadership_Added");
        }

        if (aso.get("power_Added") != null) {
            this.power_Added = (Integer) aso.get("power_Added");
        }

        if (aso.get("stratagem_Added") != null) {
            this.stratagem_Added = (Integer) aso.get("stratagem_Added");
        }

        if (aso.get("bravery_base") != null) {
            this.bravery_base = (Integer) aso.get("bravery_base");
        }

        if (aso.get("management_Added") != null) {
            this.management_Added = (Integer) aso.get("management_Added");
        }

        if (aso.get("province") != null) {
            this.province = (String) aso.get("province");
        }

        if (aso.get("zi") != null) {
            this.zi = (String) aso.get("zi");
        }

        if (aso.get("catchQuestId") != null) {
            this.catchQuestId = (Integer) aso.get("catchQuestId");
        }

        if (aso.get("status") != null) {
            this.status = (Integer) aso.get("status");
        }

        if (aso.get("affairs_base") != null) {
            this.affairs_base = (Integer) aso.get("affairs_base");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("uid") != null) {
            this.uid = (Integer) aso.get("uid");
        }

        if (aso.get("taskitemid") != null) {
            this.taskitemid = (String) aso.get("taskitemid");
        }

        if (aso.get("level") != null) {
            this.level = (Integer) aso.get("level");
        }

        if (aso.get("face") != null) {
            this.face = (Integer) aso.get("face");
        }

        if (aso.get("leadership") != null) {
            this.leadership = (Integer) aso.get("leadership");
        }

        if (aso.get("loyalty") != null) {
            this.loyalty = (Integer) aso.get("loyalty");
        }

        if (aso.get("hireQuestId") != null) {
            this.hireQuestId = (Integer) aso.get("hireQuestId");
        }

        if (aso.get("stratagem") != null) {
            this.stratagem = (Integer) aso.get("stratagem");
        }
    }

    public NpcHeroBean() {
    }

    @Override
    public NpcHeroBean clone() {
        NpcHeroBean clone = new NpcHeroBean();

        if (this.npcid != null) {
            clone.setNpcid(this.npcid);
        }

        if (this.introduce != null) {
            clone.setIntroduce(this.introduce);
        }

        if (this.type != null) {
            clone.setType(this.type);
        }

        if (this.management != null) {
            clone.setManagement(this.management);
        }

        if (this.questType != null) {
            clone.setQuestType(this.questType);
        }

        if (this.sex != null) {
            clone.setSex(this.sex);
        }

        if (this.power != null) {
            clone.setPower(this.power);
        }

        if (this.wisdom_base != null) {
            clone.setWisdom_base(this.wisdom_base);
        }

        if (this.logoimage != null) {
            clone.setLogoimage(this.logoimage);
        }

        if (this.field != null) {
            clone.setField(this.field);
        }

        if (this.leadership_Added != null) {
            clone.setLeadership_Added(this.leadership_Added);
        }

        if (this.power_Added != null) {
            clone.setPower_Added(this.power_Added);
        }

        if (this.stratagem_Added != null) {
            clone.setStratagem_Added(this.stratagem_Added);
        }

        if (this.bravery_base != null) {
            clone.setBravery_base(this.bravery_base);
        }

        if (this.management_Added != null) {
            clone.setManagement_Added(this.management_Added);
        }

        if (this.province != null) {
            clone.setProvince(this.province);
        }

        if (this.zi != null) {
            clone.setZi(this.zi);
        }

        if (this.catchQuestId != null) {
            clone.setCatchQuestId(this.catchQuestId);
        }

        if (this.status != null) {
            clone.setStatus(this.status);
        }

        if (this.affairs_base != null) {
            clone.setAffairs_base(this.affairs_base);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.uid != null) {
            clone.setUid(this.uid);
        }

        if (this.taskitemid != null) {
            clone.setTaskitemid(this.taskitemid);
        }

        if (this.level != null) {
            clone.setLevel(this.level);
        }

        if (this.face != null) {
            clone.setFace(this.face);
        }

        if (this.leadership != null) {
            clone.setLeadership(this.leadership);
        }

        if (this.loyalty != null) {
            clone.setLoyalty(this.loyalty);
        }

        if (this.hireQuestId != null) {
            clone.setHireQuestId(this.hireQuestId);
        }

        if (this.stratagem != null) {
            clone.setStratagem(this.stratagem);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.npcid != null) {
            aso.put("npcid", npcid);
        }

        if (this.introduce != null) {
            aso.put("introduce", introduce);
        }

        if (this.type != null) {
            aso.put("type", type);
        }

        if (this.management != null) {
            aso.put("management", management);
        }

        if (this.questType != null) {
            aso.put("questType", questType);
        }

        if (this.sex != null) {
            aso.put("sex", sex);
        }

        if (this.power != null) {
            aso.put("power", power);
        }

        if (this.wisdom_base != null) {
            aso.put("wisdom_base", wisdom_base);
        }

        if (this.logoimage != null) {
            aso.put("logoimage", logoimage);
        }

        if (this.field != null) {
            aso.put("field", field);
        }

        if (this.leadership_Added != null) {
            aso.put("leadership_Added", leadership_Added);
        }

        if (this.power_Added != null) {
            aso.put("power_Added", power_Added);
        }

        if (this.stratagem_Added != null) {
            aso.put("stratagem_Added", stratagem_Added);
        }

        if (this.bravery_base != null) {
            aso.put("bravery_base", bravery_base);
        }

        if (this.management_Added != null) {
            aso.put("management_Added", management_Added);
        }

        if (this.province != null) {
            aso.put("province", province);
        }

        if (this.zi != null) {
            aso.put("zi", zi);
        }

        if (this.catchQuestId != null) {
            aso.put("catchQuestId", catchQuestId);
        }

        if (this.status != null) {
            aso.put("status", status);
        }

        if (this.affairs_base != null) {
            aso.put("affairs_base", affairs_base);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.uid != null) {
            aso.put("uid", uid);
        }

        if (this.taskitemid != null) {
            aso.put("taskitemid", taskitemid);
        }

        if (this.level != null) {
            aso.put("level", level);
        }

        if (this.face != null) {
            aso.put("face", face);
        }

        if (this.leadership != null) {
            aso.put("leadership", leadership);
        }

        if (this.loyalty != null) {
            aso.put("loyalty", loyalty);
        }

        if (this.hireQuestId != null) {
            aso.put("hireQuestId", hireQuestId);
        }

        if (this.stratagem != null) {
            aso.put("stratagem", stratagem);
        }

        return aso;
    }

    public Integer getNpcid() {
        return npcid;
    }

    public void setNpcid(Integer npcid) {
        this.npcid = npcid;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getManagement() {
        return management;
    }

    public void setManagement(Integer management) {
        this.management = management;
    }

    public Integer getQuestType() {
        return questType;
    }

    public void setQuestType(Integer questType) {
        this.questType = questType;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getWisdom_base() {
        return wisdom_base;
    }

    public void setWisdom_base(Integer wisdom_base) {
        this.wisdom_base = wisdom_base;
    }

    public String getLogoimage() {
        return logoimage;
    }

    public void setLogoimage(String logoimage) {
        this.logoimage = logoimage;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public Integer getLeadership_Added() {
        return leadership_Added;
    }

    public void setLeadership_Added(Integer leadership_Added) {
        this.leadership_Added = leadership_Added;
    }

    public Integer getPower_Added() {
        return power_Added;
    }

    public void setPower_Added(Integer power_Added) {
        this.power_Added = power_Added;
    }

    public Integer getStratagem_Added() {
        return stratagem_Added;
    }

    public void setStratagem_Added(Integer stratagem_Added) {
        this.stratagem_Added = stratagem_Added;
    }

    public Integer getBravery_base() {
        return bravery_base;
    }

    public void setBravery_base(Integer bravery_base) {
        this.bravery_base = bravery_base;
    }

    public Integer getManagement_Added() {
        return management_Added;
    }

    public void setManagement_Added(Integer management_Added) {
        this.management_Added = management_Added;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    public Integer getCatchQuestId() {
        return catchQuestId;
    }

    public void setCatchQuestId(Integer catchQuestId) {
        this.catchQuestId = catchQuestId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAffairs_base() {
        return affairs_base;
    }

    public void setAffairs_base(Integer affairs_base) {
        this.affairs_base = affairs_base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTaskitemid() {
        return taskitemid;
    }

    public void setTaskitemid(String taskitemid) {
        this.taskitemid = taskitemid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFace() {
        return face;
    }

    public void setFace(Integer face) {
        this.face = face;
    }

    public Integer getLeadership() {
        return leadership;
    }

    public void setLeadership(Integer leadership) {
        this.leadership = leadership;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getHireQuestId() {
        return hireQuestId;
    }

    public void setHireQuestId(Integer hireQuestId) {
        this.hireQuestId = hireQuestId;
    }

    public Integer getStratagem() {
        return stratagem;
    }

    public void setStratagem(Integer stratagem) {
        this.stratagem = stratagem;
    }
}
