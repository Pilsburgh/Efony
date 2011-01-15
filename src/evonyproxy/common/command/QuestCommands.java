package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class QuestCommands extends AbstractCommand implements IQuestCommands {
    public Method _award_callback = null;
    public Method _awardPacket_callback = null;
    public Method _getQuestType_callback = null;
    public Method _getEffortList_callback = null;
    public Method _getEffortListByTargeTypeid_callback = null;
    public Method _accept_callback = null;
    public Method _abandon_callback = null;
    public Method _getQuestList_callback = null;

    /**
     * Command: quest.awardPacket
     * Response: CommandResponse
     */
    public void awardPacket(int castleId, int questId, String key, Method callbackMethod) {
        ASObject aso = new ASObject();

        _awardPacket_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("questId", questId);
        aso.put("key", key);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(AWARD_PACKET, aso));
        }

    }

    /**
     * Command: quest.awardPacket
     * Response: CommandResponse
     */
    public void awardPacket(int castleId, int questId, String key) {
        awardPacket(castleId, questId, key, null);
    }

    /**
     * Command: quest.accept
     * Response: QuestListResponse
     */
    public void accept(int ncpid, int castleid, Method callbackMethod) {
        ASObject aso = new ASObject();

        _accept_callback = callbackMethod;

        aso.put("ncpid", ncpid);
        aso.put("castleid", castleid);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ACCEPT, aso));
        }

    }

    /**
     * Command: quest.accept
     * Response: QuestListResponse
     */
    public void accept(int ncpid, int castleid) {
        accept(ncpid, castleid, null);
    }

    /**
     * Command: quest.getQuestType
     * Response: QuestTypeResponse
     */
    public void getQuestType(int castleId, int type, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getQuestType_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("type", type);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_QUEST_TYPE, aso));
        }

    }

    /**
     * Command: quest.getQuestType
     * Response: QuestTypeResponse
     */
    public void getQuestType(int castleId, int type) {
        getQuestType(castleId, type, null);
    }

    /**
     * Command: quest.award
     * Response: CommandResponse
     */
    public void award(int castleId, int questId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _award_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("questId", questId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(AWARD, aso));
        }

    }

    /**
     * Command: quest.award
     * Response: CommandResponse
     */
    public void award(int castleId, int questId) {
        award(castleId, questId, null);
    }

    /**
     * Command: quest.getEffortList
     * Response: EffortListResponse
     */
    public void getEffortList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getEffortList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_EFFORT_LIST, aso));
        }

    }

    /**
     * Command: quest.getEffortList
     * Response: EffortListResponse
     */
    public void getEffortList(int castleId) {
        getEffortList(castleId, null);
    }

    /**
     * Command: quest.getEffortListByTargeTypeid
     * Response: QuestListResponse
     */
    public void getEffortListByTargeTypeid(int castleId, int TargeTypeid, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getEffortListByTargeTypeid_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("TargeTypeid", TargeTypeid);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_EFFORT_LIST_BY_TARGE_TYPEID, aso));
        }

    }

    /**
     * Command: quest.getEffortListByTargeTypeid
     * Response: QuestListResponse
     */
    public void getEffortListByTargeTypeid(int castleId, int TargeTypeid) {
        getEffortListByTargeTypeid(castleId, TargeTypeid, null);
    }

    /**
     * Command: quest.getQuestList
     * Response: QuestListResponse
     */
    public void getQuestList(int castleId, int typeId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getQuestList_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("typeId", typeId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_QUEST_LIST, aso));
        }

    }

    /**
     * Command: quest.getQuestList
     * Response: QuestListResponse
     */
    public void getQuestList(int castleId, int typeId) {
        getQuestList(castleId, typeId, null);
    }

    /**
     * Command: quest.abandon
     * Response: CommandResponse
     */
    public void abandon(int questid, int castleid, Method callbackMethod) {
        ASObject aso = new ASObject();

        _abandon_callback = callbackMethod;

        aso.put("questid", questid);
        aso.put("castleid", castleid);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ABANDON, aso));
        }

    }

    /**
     * Command: quest.abandon
     * Response: CommandResponse
     */
    public void abandon(int questid, int castleid) {
        abandon(questid, castleid, null);
    }
}
