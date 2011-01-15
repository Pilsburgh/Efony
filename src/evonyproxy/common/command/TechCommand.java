package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class TechCommand extends AbstractCommand implements ITechCommand {
    public Method _getCoinsNeed_callback = null;
    public Method _research_callback = null;
    public Method _speedUpResearch_callback = null;
    public Method _cancelResearch_callback = null;
    public Method _getResearchList_callback = null;

    /**
     * Command: tech.getCoinsNeed
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
     * Command: tech.getCoinsNeed
     * Response: CoinsNeedResponse
     */
    public void getCoinsNeed(int castleId) {
        getCoinsNeed(castleId, null);
    }

    /**
     * Command: tech.getResearchList
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
     * Command: tech.getResearchList
     * Response: AvailableResearchListResponse
     */
    public void getResearchList(int castleId) {
        getResearchList(castleId, null);
    }

    /**
     * Command: tech.research
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
     * Command: tech.research
     * Response: ResearchResponse
     */
    public void research(int castleId, int techId) {
        research(castleId, techId, null);
    }

    /**
     * Command: tech.cancelResearch
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
     * Command: tech.cancelResearch
     * Response: CommandResponse
     */
    public void cancelResearch(int castleId) {
        cancelResearch(castleId, null);
    }

    /**
     * Command: tech.speedUpResearch
     * Response: ResearchResponse
     */
    public void speedUpResearch(int castleId, String param2, Method callbackMethod) {
        ASObject aso = new ASObject();

        _speedUpResearch_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("param2", param2);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SPEED_UP_RESEARCH, aso));
        }

    }

    /**
     * Command: tech.speedUpResearch
     * Response: ResearchResponse
     */
    public void speedUpResearch(int castleId, String param2) {
        speedUpResearch(castleId, param2, null);
    }
}
