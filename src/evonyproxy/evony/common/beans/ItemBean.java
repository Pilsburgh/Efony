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
public class ItemBean implements EvonyPacket {

    private String id = null;
    private String name = null;
    private Integer maxCount = null;
    private Integer minCount = null;
    private Integer count = null;

    public ItemBean(ASObject aso) {

        if (aso.get("id") != null) {
            this.id = (String) aso.get("id");
        }

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("maxCount") != null) {
            this.maxCount = (Integer) aso.get("maxCount");
        }

        if (aso.get("minCount") != null) {
            this.minCount = (Integer) aso.get("minCount");
        }

        if (aso.get("count") != null) {
            this.count = (Integer) aso.get("count");
        }
    }

    public ItemBean() {
    }

    @Override
    public ItemBean clone() {
        ItemBean clone = new ItemBean();

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.maxCount != null) {
            clone.setMaxCount(this.maxCount);
        }

        if (this.minCount != null) {
            clone.setMinCount(this.minCount);
        }

        if (this.count != null) {
            clone.setCount(this.count);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.maxCount != null) {
            aso.put("maxCount", maxCount);
        }

        if (this.minCount != null) {
            aso.put("minCount", minCount);
        }

        if (this.count != null) {
            aso.put("count", count);
        }

        return aso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
