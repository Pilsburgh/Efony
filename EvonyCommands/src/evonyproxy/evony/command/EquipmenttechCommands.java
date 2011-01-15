package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class EquipmenttechCommands extends AbstractCommand implements IEquipmenttechCommands {
    public Method _getCoinsNeed_callback = null;
    public Method _research_callback = null;
    public Method _speedUpResearch_callback = null;
    public Method _cancelResearch_callback = null;
    public Method _getResearchList_callback = null;

    /**
     * Command: equipmenttech.getCoinsNeed
     * Response: CoinsNeedResponse
     */
    public void getCoinsNeed(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCoinsNeed_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_COINS_NEED, aso));
        }

    }

    /**
     * Command: equipmenttech.getCoinsNeed
     * Response: CoinsNeedResponse
     */
    public void getCoinsNeed(int castleId) {
        getCoinsNeed(castleId, null);
    }

    /**
     * Command: equipmenttech.getResearchList
     * Response: AvailableResearchListResponse
     */
    public void getResearchList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getResearchList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_RESEARCH_LIST, aso));
        }

    }

    /**
     * Command: equipmenttech.getResearchList
     * Response: AvailableResearchListResponse
     */
    public void getResearchList(int castleId) {
        getResearchList(castleId, null);
    }

    /**
     * Command: equipmenttech.research
     * Response: ResearchResponse
     */
    public void research(int castleId, int techId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _research_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("techId", techId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RESEARCH, aso));
        }

    }

    /**
     * Command: equipmenttech.research
     * Response: ResearchResponse
     */
    public void research(int castleId, int techId) {
        research(castleId, techId, null);
    }

    /**
     * Command: equipmenttech.cancelResearch
     * Response: CommandResponse
     */
    public void cancelResearch(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelResearch_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_RESEARCH, aso));
        }

    }

    /**
     * Command: equipmenttech.cancelResearch
     * Response: CommandResponse
     */
    public void cancelResearch(int castleId) {
        cancelResearch(castleId, null);
    }

    /**
     * Command: equipmenttech.speedUpResearch
     * Response: ResearchResponse
     */
    public void speedUpResearch(int castleId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _speedUpResearch_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SPEED_UP_RESEARCH, aso));
        }

    }

    /**
     * Command: equipmenttech.speedUpResearch
     * Response: ResearchResponse
     */
    public void speedUpResearch(int castleId, String itemId) {
        speedUpResearch(castleId, itemId, null);
    }
}
