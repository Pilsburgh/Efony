package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class QuestCompleteTipResponse implements EvonyPacket {

    public String name = null;
    public Integer questId = null;

    public QuestCompleteTipResponse(ASObject aso) {

        if (aso.get("name") != null) {
            this.name = (String) aso.get("name");
        }

        if (aso.get("questId") != null) {
            this.questId = (Integer) aso.get("questId");
        }
    }

    public QuestCompleteTipResponse() {
    }

    @Override
    public QuestCompleteTipResponse clone() {
        QuestCompleteTipResponse clone = new QuestCompleteTipResponse();

        if (this.name != null) {
            clone.setName(this.name);
        }

        if (this.questId != null) {
            clone.setQuestId(this.questId);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.name != null) {
            aso.put("name", name);
        }

        if (this.questId != null) {
            aso.put("questId", questId);
        }

        return aso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuestId() {
        return questId;
    }

    public void setQuestId(Integer questId) {
        this.questId = questId;
    }
}
