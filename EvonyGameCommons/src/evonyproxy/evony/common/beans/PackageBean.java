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
public class PackageBean implements EvonyPacket {

    public static final int PACKAGE_TYPE_SERIAL = 1;
    public static final int PACKAGE_TYPE_NORMAL = 3;
    public static final int PACKAGE_TYPE_SCORES = 2;
    private Integer status = null;
    private Integer type = null;
    private ArrayList<ItemBean> itemList = null;
    private Double provideTime = null;
    private Integer id = null;
    private Integer isUseNow = null;
    private String claimedTime = null;
    private Integer scores = null;
    private Integer maxMedal = null;
    private Integer minMedal = null;
    private String desc = null;
    private String packageName = null;
    private Double expiredTime = null;

    public PackageBean(ASObject aso) {
        itemList = new ArrayList<ItemBean>();

        if (aso.get("status") != null) {
            this.status = (Integer) aso.get("status");
        }

        if (aso.get("type") != null) {
            this.type = (Integer) aso.get("type");
        }

        if (aso.get("itemList") != null) {
            Object[] objArr = (Object[]) aso.get("itemList");
            for (int j = 0; j < objArr.length; j++) {
                itemList.add(new ItemBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("provideTime") != null) {
            this.provideTime = (Double) aso.get("provideTime");
        }

        if (aso.get("id") != null) {
            this.id = (Integer) aso.get("id");
        }

        if (aso.get("isUseNow") != null) {
            this.isUseNow = (Integer) aso.get("isUseNow");
        }

        if (aso.get("claimedTime") != null) {
            this.claimedTime = (String) aso.get("claimedTime");
        }

        if (aso.get("scores") != null) {
            this.scores = (Integer) aso.get("scores");
        }

        if (aso.get("maxMedal") != null) {
            this.maxMedal = (Integer) aso.get("maxMedal");
        }

        if (aso.get("minMedal") != null) {
            this.minMedal = (Integer) aso.get("minMedal");
        }

        if (aso.get("desc") != null) {
            this.desc = (String) aso.get("desc");
        }

        if (aso.get("packageName") != null) {
            this.packageName = (String) aso.get("packageName");
        }

        if (aso.get("expiredTime") != null) {
            this.expiredTime = (Double) aso.get("expiredTime");
        }
    }

    public PackageBean() {
    }

    @Override
    public PackageBean clone() {
        PackageBean clone = new PackageBean();

        if (this.status != null) {
            clone.setStatus(this.status);
        }

        if (this.type != null) {
            clone.setType(this.type);
        }

        if (this.itemList != null) {
            ArrayList tmpArrLst = new ArrayList<ItemBean>();

            for (Object bean : itemList) {
                ItemBean tmpBean = (ItemBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setItemList(tmpArrLst);
        }

        if (this.provideTime != null) {
            clone.setProvideTime(this.provideTime);
        }

        if (this.id != null) {
            clone.setId(this.id);
        }

        if (this.isUseNow != null) {
            clone.setIsUseNow(this.isUseNow);
        }

        if (this.claimedTime != null) {
            clone.setClaimedTime(this.claimedTime);
        }

        if (this.scores != null) {
            clone.setScores(this.scores);
        }

        if (this.maxMedal != null) {
            clone.setMaxMedal(this.maxMedal);
        }

        if (this.minMedal != null) {
            clone.setMinMedal(this.minMedal);
        }

        if (this.desc != null) {
            clone.setDesc(this.desc);
        }

        if (this.packageName != null) {
            clone.setPackageName(this.packageName);
        }

        if (this.expiredTime != null) {
            clone.setExpiredTime(this.expiredTime);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.status != null) {
            aso.put("status", status);
        }

        if (this.type != null) {
            aso.put("type", type);
        }

        if (this.itemList != null) {
            ArrayList al = new ArrayList();
            for (Object obj : itemList) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
        }

        if (this.provideTime != null) {
            aso.put("provideTime", provideTime);
        }

        if (this.id != null) {
            aso.put("id", id);
        }

        if (this.isUseNow != null) {
            aso.put("isUseNow", isUseNow);
        }

        if (this.claimedTime != null) {
            aso.put("claimedTime", claimedTime);
        }

        if (this.scores != null) {
            aso.put("scores", scores);
        }

        if (this.maxMedal != null) {
            aso.put("maxMedal", maxMedal);
        }

        if (this.minMedal != null) {
            aso.put("minMedal", minMedal);
        }

        if (this.desc != null) {
            aso.put("desc", desc);
        }

        if (this.packageName != null) {
            aso.put("packageName", packageName);
        }

        if (this.expiredTime != null) {
            aso.put("expiredTime", expiredTime);
        }

        return aso;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ArrayList getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList itemList) {
        this.itemList = itemList;
    }

    public Double getProvideTime() {
        return provideTime;
    }

    public void setProvideTime(Double provideTime) {
        this.provideTime = provideTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsUseNow() {
        return isUseNow;
    }

    public void setIsUseNow(Integer isUseNow) {
        this.isUseNow = isUseNow;
    }

    public String getClaimedTime() {
        return claimedTime;
    }

    public void setClaimedTime(String claimedTime) {
        this.claimedTime = claimedTime;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Integer getMaxMedal() {
        return maxMedal;
    }

    public void setMaxMedal(Integer maxMedal) {
        this.maxMedal = maxMedal;
    }

    public Integer getMinMedal() {
        return minMedal;
    }

    public void setMinMedal(Integer minMedal) {
        this.minMedal = minMedal;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Double expiredTime) {
        this.expiredTime = expiredTime;
    }
}
