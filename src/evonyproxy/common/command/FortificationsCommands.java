package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class FortificationsCommands extends AbstractCommand implements IFortificationsCommands {
    public Method _produceWallProtect_callback = null;
    public Method _accTroopProduce_callback = null;
    public Method _destructWallProtect_callback = null;
    public Method _getProduceQueue_callback = null;
    public Method _getFortificationsProduceList_callback = null;
    public Method _cancelFortificationProduce_callback = null;

    /**
     * Command: fortifications.getFortificationsProduceList
     * Response: FortProduceListResponse
     */
    public void getFortificationsProduceList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getFortificationsProduceList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_FORTIFICATIONS_PRODUCE_LIST, aso));
        }

    }

    /**
     * Command: fortifications.getFortificationsProduceList
     * Response: FortProduceListResponse
     */
    public void getFortificationsProduceList(int castleId) {
        getFortificationsProduceList(castleId, null);
    }

    /**
     * Command: fortifications.produceWallProtect
     * Response: CommandResponse
     */
    public void produceWallProtect(int castleId, int wallProtectType, int num, Method callbackMethod) {
        ASObject aso = new ASObject();

        _produceWallProtect_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("wallProtectType", wallProtectType);
        aso.put("num", num);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(PRODUCE_WALL_PROTECT, aso));
        }

    }

    /**
     * Command: fortifications.produceWallProtect
     * Response: CommandResponse
     */
    public void produceWallProtect(int castleId, int wallProtectType, int num) {
        produceWallProtect(castleId, wallProtectType, num, null);
    }

    /**
     * Command: fortifications.cancelFortificationProduce
     * Response: CommandResponse
     */
    public void cancelFortificationProduce(int castleId, int queueId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelFortificationProduce_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("queueId", queueId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_FORTIFICATION_PRODUCE, aso));
        }

    }

    /**
     * Command: fortifications.cancelFortificationProduce
     * Response: CommandResponse
     */
    public void cancelFortificationProduce(int castleId, int queueId) {
        cancelFortificationProduce(castleId, queueId, null);
    }

    /**
     * Command: fortifications.destructWallProtect
     * Response: CommandResponse
     */
    public void destructWallProtect(int param1, int typeId, int num, Method callbackMethod) {
        ASObject aso = new ASObject();

        _destructWallProtect_callback = callbackMethod;

        aso.put("param1", param1);
        aso.put("typeId", typeId);
        aso.put("num", num);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DESTRUCT_WALL_PROTECT, aso));
        }

    }

    /**
     * Command: fortifications.destructWallProtect
     * Response: CommandResponse
     */
    public void destructWallProtect(int param1, int typeId, int num) {
        destructWallProtect(param1, typeId, num, null);
    }

    /**
     * Command: fortifications.accTroopProduce
     * Response: CommandResponse
     */
    public void accTroopProduce(int castleId, int queueId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _accTroopProduce_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("queueId", queueId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ACC_TROOP_PRODUCE, aso));
        }

    }

    /**
     * Command: fortifications.accTroopProduce
     * Response: CommandResponse
     */
    public void accTroopProduce(int castleId, int queueId, String itemId) {
        accTroopProduce(castleId, queueId, itemId, null);
    }

    /**
     * Command: fortifications.getProduceQueue
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
     * Command: fortifications.getProduceQueue
     * Response: ProduceQueueResponse
     */
    public void getProduceQueue(int castleId) {
        getProduceQueue(castleId, null);
    }
}
