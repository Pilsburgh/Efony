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
public class AllProduceBean implements EvonyPacket {

    private ArrayList<ProduceBean> allProduceQueue = null;
    private Integer positionId = null;

    public AllProduceBean(ASObject aso) {
        allProduceQueue = new ArrayList<ProduceBean>();

        if (aso.get("allProduceQueue") != null) {
            Object[] objArr = (Object[]) aso.get("allProduceQueue");
            for (int j = 0; j < objArr.length; j++) {
                allProduceQueue.add(new ProduceBean((ASObject) objArr[j]));
            }
        }

        if (aso.get("positionId") != null) {
            this.positionId = (Integer) aso.get("positionId");
        }
    }

    public AllProduceBean() {
    }

    @Override
    public AllProduceBean clone() {
        AllProduceBean clone = new AllProduceBean();

        if (this.allProduceQueue != null) {
            ArrayList tmpArrLst = new ArrayList<ProduceBean>();

            for (Object bean : allProduceQueue) {
                ProduceBean tmpBean = (ProduceBean) bean;
                tmpArrLst.add(tmpBean.clone());
            }
            clone.setAllProduceQueue(tmpArrLst);
        }

        if (this.positionId != null) {
            clone.setPositionId(this.positionId);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.allProduceQueue != null) {
            ArrayList al = new ArrayList();
            for (Object obj : allProduceQueue) {
                EvonyPacket as = (EvonyPacket) obj;
                al.add(as.toASObject());
            }
            aso.put("allProduceQueue", al);
        }

        if (this.positionId != null) {
            aso.put("positionId", positionId);
        }

        return aso;
    }

    public ArrayList getAllProduceQueue() {
        return allProduceQueue;
    }

    public void setAllProduceQueue(ArrayList allProduceQueue) {
        this.allProduceQueue = allProduceQueue;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }
}
