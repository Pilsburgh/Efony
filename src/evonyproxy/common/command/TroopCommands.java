package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class TroopCommands extends AbstractCommand implements ITroopCommands {
    public Method _produceTroop_callback = null;
    public Method _accTroopProduce_callback = null;
    public Method _checkIdleBarrack_callback = null;
    public Method _getProduceQueue_callback = null;
    public Method _cancelTroopProduce_callback = null;
    public Method _getTroopProduceList_callback = null;
    public Method _disbandTroop_callback = null;

    /**
     * Command: troop.getProduceQueue
     * Response: ProduceQueueResponse
     */
    public void getProduceQueue(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getProduceQueue_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PRODUCE_QUEUE, aso));
        }

    }

    /**
     * Command: troop.getProduceQueue
     * Response: ProduceQueueResponse
     */
    public void getProduceQueue(int castleId) {
        getProduceQueue(castleId, null);
    }

    /**
     * Command: troop.cancelTroopProduce
     * Response: CommandResponse
     */
    public void cancelTroopProduce(int castleId, int positionId, int queueId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelTroopProduce_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        aso.put("queueId", queueId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_TROOP_PRODUCE, aso));
        }

    }

    /**
     * Command: troop.cancelTroopProduce
     * Response: CommandResponse
     */
    public void cancelTroopProduce(int castleId, int positionId, int queueId) {
        cancelTroopProduce(castleId, positionId, queueId, null);
    }

    /**
     * Command: troop.checkIdleBarrack
     * Response: CommandResponse
     */
    public void checkIdleBarrack(int castleId, int troopType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _checkIdleBarrack_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("troopType", troopType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHECK_IDLE_BARRACK, aso));
        }

    }

    /**
     * Command: troop.checkIdleBarrack
     * Response: CommandResponse
     */
    public void checkIdleBarrack(int castleId, int troopType) {
        checkIdleBarrack(castleId, troopType, null);
    }

    /**
     * Command: troop.disbandTroop
     * Response: CommandResponse
     */
    public void disbandTroop(int castleId, int troopType, int num, Method callbackMethod) {
        ASObject aso = new ASObject();

        _disbandTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("troopType", troopType);
        aso.put("num", num);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DISBAND_TROOP, aso));
        }

    }

    /**
     * Command: troop.disbandTroop
     * Response: CommandResponse
     */
    public void disbandTroop(int castleId, int troopType, int num) {
        disbandTroop(castleId, troopType, num, null);
    }

    /**
     * Command: troop.produceTroop
     * Response: CommandResponse
     */
    public void produceTroop(int castleId, int positionId, int troopType, int num, Boolean isShare, Boolean toIdle, Method callbackMethod) {
        ASObject aso = new ASObject();

        _produceTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        aso.put("troopType", troopType);
        aso.put("num", num);
        aso.put("isShare", isShare);
        aso.put("toIdle", toIdle);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(PRODUCE_TROOP, aso));
        }

    }

    /**
     * Command: troop.produceTroop
     * Response: CommandResponse
     */
    public void produceTroop(int castleId, int positionId, int troopType, int num, Boolean isShare, Boolean toIdle) {
        produceTroop(castleId, positionId, troopType, num, isShare, toIdle, null);
    }

    /**
     * Command: troop.accTroopProduce
     * Response: CommandResponse
     */
    public void accTroopProduce(int castleId, int positionId, int queueId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _accTroopProduce_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        aso.put("queueId", queueId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ACC_TROOP_PRODUCE, aso));
        }

    }

    /**
     * Command: troop.accTroopProduce
     * Response: CommandResponse
     */
    public void accTroopProduce(int castleId, int positionId, int queueId, String itemId) {
        accTroopProduce(castleId, positionId, queueId, itemId, null);
    }

    /**
     * Command: troop.getTroopProduceList
     * Response: TroopProduceListResponse
     */
    public void getTroopProduceList(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getTroopProduceList_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_TROOP_PRODUCE_LIST, aso));
        }

    }

    /**
     * Command: troop.getTroopProduceList
     * Response: TroopProduceListResponse
     */
    public void getTroopProduceList(int castleId, int positionId) {
        getTroopProduceList(castleId, positionId, null);
    }
}
