package evonyproxy.evony.command;

import evonyproxy.evony.common.paramBeans.NewArmyParam;
import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class CommissionQuestCommands extends AbstractCommand implements ICommissionQuestCommands {
    public Method _issueCommissionQuest_callback = null;
    public Method _getMyCommissionQuest_callback = null;
    public Method _acceptCommissionQuest_callback = null;
    public Method _getMyAcceptedCommissionQuest_callback = null;
    public Method _getCommissionQuestArmyInfo_callback = null;
    public Method _declineCommissionQuest_callback = null;
    public Method _getAllCommissionQuest_callback = null;
    public Method _addCommissionQuestArmy_callback = null;
    public Method _getCommissionQuestArmyRanking_callback = null;

    /**
     * Command: commission.getAllCommissionQuest
     * Response: CommissionQuestRespone
     */
    public void getAllCommissionQuest(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllCommissionQuest_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALL_COMMISSION_QUEST, aso));
        }

    }

    /**
     * Command: commission.getAllCommissionQuest
     * Response: CommissionQuestRespone
     */
    public void getAllCommissionQuest() {
        getAllCommissionQuest(null);
    }

    /**
     * Command: commission.acceptCommissionQuest
     * Response: CommandResponse
     */
    public void acceptCommissionQuest(int castleId, int questId, NewArmyParam newArmyBean, Method callbackMethod) {
        ASObject aso = new ASObject();

        _acceptCommissionQuest_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("questId", questId);
        aso.put("newArmyBean", newArmyBean);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ACCEPT_COMMISSION_QUEST, aso));
        }

    }

    /**
     * Command: commission.acceptCommissionQuest
     * Response: CommandResponse
     */
    public void acceptCommissionQuest(int castleId, int questId, NewArmyParam newArmyBean) {
        acceptCommissionQuest(castleId, questId, newArmyBean, null);
    }

    /**
     * Command: commission.addCommissionQuestArmy
     * Response: CommandResponse
     */
    public void addCommissionQuestArmy(int castleId, int questId, NewArmyParam newArmyBean, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addCommissionQuestArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("questId", questId);
        aso.put("newArmyBean", newArmyBean);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_COMMISSION_QUEST_ARMY, aso));
        }

    }

    /**
     * Command: commission.addCommissionQuestArmy
     * Response: CommandResponse
     */
    public void addCommissionQuestArmy(int castleId, int questId, NewArmyParam newArmyBean) {
        addCommissionQuestArmy(castleId, questId, newArmyBean, null);
    }

    /**
     * Command: commission.getMyAcceptedCommissionQuest
     * Response: CommissionQuestRespone
     */
    public void getMyAcceptedCommissionQuest(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getMyAcceptedCommissionQuest_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_MY_ACCEPTED_COMMISSION_QUEST, aso));
        }

    }

    /**
     * Command: commission.getMyAcceptedCommissionQuest
     * Response: CommissionQuestRespone
     */
    public void getMyAcceptedCommissionQuest() {
        getMyAcceptedCommissionQuest(null);
    }

    /**
     * Command: commission.getCommissionQuestArmyRanking
     * Response: CommissionQuestArmyRespone
     */
    public void getCommissionQuestArmyRanking(int questId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCommissionQuestArmyRanking_callback = callbackMethod;

        aso.put("questId", questId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_COMMISSION_QUEST_ARMY_RANKING, aso));
        }

    }

    /**
     * Command: commission.getCommissionQuestArmyRanking
     * Response: CommissionQuestArmyRespone
     */
    public void getCommissionQuestArmyRanking(int questId) {
        getCommissionQuestArmyRanking(questId, null);
    }

    /**
     * Command: commission.getCommissionQuestArmyInfo
     * Response: CommissionQuestArmyInfoRespone
     */
    public void getCommissionQuestArmyInfo(int questId, int playerId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCommissionQuestArmyInfo_callback = callbackMethod;

        aso.put("questId", questId);
        aso.put("playerId", playerId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_COMMISSION_QUEST_ARMY_INFO, aso));
        }

    }

    /**
     * Command: commission.getCommissionQuestArmyInfo
     * Response: CommissionQuestArmyInfoRespone
     */
    public void getCommissionQuestArmyInfo(int questId, int playerId) {
        getCommissionQuestArmyInfo(questId, playerId, null);
    }

    /**
     * Command: commission.issueCommissionQuest
     * Response: CommandResponse
     */
    public void issueCommissionQuest(int castleId, int type, int targetX, int targetY, int reward, Method callbackMethod) {
        ASObject aso = new ASObject();

        _issueCommissionQuest_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("type", type);
        aso.put("targetX", targetX);
        aso.put("targetY", targetY);
        aso.put("reward", reward);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ISSUE_COMMISSION_QUEST, aso));
        }

    }

    /**
     * Command: commission.issueCommissionQuest
     * Response: CommandResponse
     */
    public void issueCommissionQuest(int castleId, int type, int targetX, int targetY, int reward) {
        issueCommissionQuest(castleId, type, targetX, targetY, reward, null);
    }

    /**
     * Command: commission.declineCommissionQuest
     * Response: CommandResponse
     */
    public void declineCommissionQuest(int questId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _declineCommissionQuest_callback = callbackMethod;

        aso.put("questId", questId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DECLINE_COMMISSION_QUEST, aso));
        }

    }

    /**
     * Command: commission.declineCommissionQuest
     * Response: CommandResponse
     */
    public void declineCommissionQuest(int questId) {
        declineCommissionQuest(questId, null);
    }

    /**
     * Command: commission.getMyCommissionQuest
     * Response: CommissionQuestRespone
     */
    public void getMyCommissionQuest(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getMyCommissionQuest_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_MY_COMMISSION_QUEST, aso));
        }

    }

    /**
     * Command: commission.getMyCommissionQuest
     * Response: CommissionQuestRespone
     */
    public void getMyCommissionQuest() {
        getMyCommissionQuest(null);
    }
}
