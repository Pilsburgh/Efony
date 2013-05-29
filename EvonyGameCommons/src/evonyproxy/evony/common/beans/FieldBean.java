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
public class FieldBean implements EvonyPacket {

    private Integer statu = null;
    private String name = null;
    private Integer type = null;
    private Integer level = null;
    private ArrayList<ArmyBean> armys = null;
    private Integer id = null;

    public FieldBean(ASObject aso) {
        armys = new ArrayList<ArmyBean>();

        if (aso.get("statu") != null) {
            this.statu = (Integer) aso.get("statu");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("type") != null) {
            this.type = (Integer) aso.get("type");
        }

        if (aso.get("level") != null) {
            this.level = (Integer) aso.get("level");
        }

        if (aso.get("armys") != null) {
            Object[] objArr = (Object[]) aso.get("armys");
            for (int j = 0; j < objArr.length; j++) {
                armys.add(new ArmyBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }
    }

    public FieldBean() {
    }

    @Override
    public FieldBean clone() {
        FieldBean clone = new FieldBean();

        if (this.statu != null) {
            clone.setStatu(this.statu);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.type != null) {
            clone.setType(this.type);
        }

        if (this.level != null) {
            clone.setLevel(this.level);
        }

        if (this.armys != null) {
            ArrayList tmpArrLst = new ArrayList<ArmyBean>();

            for (Object bean : armys) {
                ArmyBean tmpBean = (ArmyBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setArmys(tmpArrLst);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.statu != null) {
            aso.put("statu", statu);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.type != null) {
            aso.put("type", type);
        }

        if (this.level != null) {
            aso.put("level", level);
        }

        if (this.armys != null) {
            ArrayList al = new ArrayList();
            for (Object obj : armys) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("armys", al);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        return aso;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ArrayList getArmys() {
        return armys;
    }

    public void setArmys(ArrayList armys) {
        this.armys = armys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
