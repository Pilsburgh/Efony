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
public class SaleItemBean implements EvonyPacket {

    private String items = null;
    private Integer saleType = null;

    public SaleItemBean(ASObject aso) {

        if (aso.get("items") != null) {
            this.items = (String) aso.get("items");
        }

        if (aso.get("saleType") != null) {
            this.saleType = (Integer) aso.get("saleType");
        }
    }

    public SaleItemBean() {
    }

    @Override
    public SaleItemBean clone() {
        SaleItemBean clone = new SaleItemBean();

        if (this.items != null) {
            clone.setItems(this.items);
        }

        if (this.saleType != null) {
            clone.setSaleType(this.saleType);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.items != null) {
            aso.put("items", items);
        }

        if (this.saleType != null) {
            aso.put("saleType", saleType);
        }

        return aso;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }
}
