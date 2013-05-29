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
public class TransingTradeBean implements EvonyPacket {

    private Integer amount = null;
    private Double endTime = null;
    private String resourceName = null;
    private Double price = null;
    private Integer total = null;
    private Integer id = null;
    private Integer resType = null;

    public TransingTradeBean(ASObject aso) {

        if (aso.get("amount") != null) {
            this.amount = (Integer) aso.get("amount");
        }

        if (aso.get("endTime") != null) {
            this.endTime = (Double) aso.get("endTime");
        }

        if (aso.get("resourceName") != null) {
            this.resourceName = (String) aso.get("resourceName");
        }

        if (aso.get("price") != null) {
            this.price = (Double) aso.get("price");
        }

        if (aso.get("total") != null) {
            this.total = (Integer) aso.get("total");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }

        if (aso.get("resType") != null) {
            this.resType = (Integer) aso.get("resType");
        }
    }

    public TransingTradeBean() {
    }

    @Override
    public TransingTradeBean clone() {
        TransingTradeBean clone = new TransingTradeBean();

        if (this.amount != null) {
            clone.setAmount(this.amount);
        }

        if (this.endTime != null) {
            clone.setEndTime(this.endTime);
        }

        if (this.resourceName != null) {
            clone.setResourceName(this.resourceName);
        }

        if (this.price != null) {
            clone.setPrice(this.price);
        }

        if (this.total != null) {
            clone.setTotal(this.total);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.resType != null) {
            clone.setResType(this.resType);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.amount != null) {
            aso.put("amount", amount);
        }

        if (this.endTime != null) {
            aso.put("endTime", endTime);
        }

        if (this.resourceName != null) {
            aso.put("resourceName", resourceName);
        }

        if (this.price != null) {
            aso.put("price", price);
        }

        if (this.total != null) {
            aso.put("total", total);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.resType != null) {
            aso.put("resType", resType);
        }

        return aso;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getEndTime() {
        return endTime;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResType() {
        return resType;
    }

    public void setResType(Integer resType) {
        this.resType = resType;
    }
}
