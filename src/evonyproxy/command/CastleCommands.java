package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Implements all commands used for managing buildings in a city.
 */
public class CastleCommands extends AbstractCommand implements ICastleCommands {
    public Method _getAvailableBuildingListOutside_callback = null;
    public Method _getAvailableBuildingListInside_callback = null;
    public Method _speedUpBuildCommand_callback = null;
    public Method _getAvailableBuildingBean_callback = null;
    public Method _newBuilding_callback = null;
    public Method _getDestructBuildBean_callback = null;
    public Method _upgradeBuilding_callback = null;
    public Method _cancleBuildCommand_callback = null;
    public Method _UpdateCastleResources_callback = null;
    public Method _getCoinsNeed_callback = null;
    public Method _checkOutUpgrade_callback = null;
    public Method _destructBuilding_callback = null;

    /**
     * Command: castle.getAvailableBuildingListOutside
     * Response: AvailableBuilingListResponse
     */
    public void getAvailableBuildingListOutside(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAvailableBuildingListOutside_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_AVAILABLE_BUILDING_LIST_OUTSIDE, aso));
        }

    }

    /**
     * Command: castle.getAvailableBuildingListOutside
     * Response: AvailableBuilingListResponse
     */
    public void getAvailableBuildingListOutside(int castleId) {
        getAvailableBuildingListOutside(castleId, null);
    }

    /**
     * Command: castle.getAvailableBuildingListInside
     * Response: AvailableBuilingListResponse
     */
    public void getAvailableBuildingListInside(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAvailableBuildingListInside_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_AVAILABLE_BUILDING_LIST_INSIDE, aso));
        }

    }

    /**
     * Command: castle.getAvailableBuildingListInside
     * Response: AvailableBuilingListResponse
     */
    public void getAvailableBuildingListInside(int castleId) {
        getAvailableBuildingListInside(castleId, null);
    }

    /**
     * Command: castle.getCoinsNeed
     * Response: CoinsNeedResponse
     */
    public void getCoinsNeed(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCoinsNeed_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_COINS_NEED, aso));
        }

    }

    /**
     * Command: castle.getCoinsNeed
     * Response: CoinsNeedResponse
     */
    public void getCoinsNeed(int castleId, int positionId) {
        getCoinsNeed(castleId, positionId, null);
    }

    /**
     * Command: castle.getDestructBuildBean
     * Response: AvailableBuilingListResponse
     */
    public void getDestructBuildBean(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getDestructBuildBean_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_DESTRUCT_BUILD_BEAN, aso));
        }

    }

    /**
     * Command: castle.getDestructBuildBean
     * Response: AvailableBuilingListResponse
     */
    public void getDestructBuildBean(int castleId, int positionId) {
        getDestructBuildBean(castleId, positionId, null);
    }

    /**
     * Command: castle.checkOutUpgrade
     * Response: CheckOutBuildingResponse
     */
    public void checkOutUpgrade(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _checkOutUpgrade_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHECK_OUT_UPGRADE, aso));
        }

    }

    /**
     * Command: castle.checkOutUpgrade
     * Response: CheckOutBuildingResponse
     */
    public void checkOutUpgrade(int castleId, int positionId) {
        checkOutUpgrade(castleId, positionId, null);
    }

    /**
     * Command: castle.getAvailableBuildingBean
     * Response: AvailableBuilingListResponse
     */
    public void getAvailableBuildingBean(int castleId, int typeId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAvailableBuildingBean_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("typeId", typeId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_AVAILABLE_BUILDING_BEAN, aso));
        }

    }

    /**
     * Command: castle.getAvailableBuildingBean
     * Response: AvailableBuilingListResponse
     */
    public void getAvailableBuildingBean(int castleId, int typeId) {
        getAvailableBuildingBean(castleId, typeId, null);
    }

    /**
     * Command: castle.UpdateCastleResources
     * Response: AvailableBuilingListResponse
     */
    public void UpdateCastleResources(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _UpdateCastleResources_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(UPDATE_CASTLE_RESOURCES, aso));
        }

    }

    /**
     * Command: castle.UpdateCastleResources
     * Response: AvailableBuilingListResponse
     */
    public void UpdateCastleResources(int castleId) {
        UpdateCastleResources(castleId, null);
    }

    /**
     * Command: castle.cancleBuildCommand
     * Response: CommandResponse
     */
    public void cancleBuildCommand(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancleBuildCommand_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCLE_BUILD_COMMAND, aso));
        }

    }

    /**
     * Command: castle.cancleBuildCommand
     * Response: CommandResponse
     */
    public void cancleBuildCommand(int castleId, int positionId) {
        cancleBuildCommand(castleId, positionId, null);
    }

    /**
     * Command: castle.speedUpBuildCommand
     * Response: CommandResponse
     */
    public void speedUpBuildCommand(int castleId, int positionId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _speedUpBuildCommand_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SPEED_UP_BUILD_COMMAND, aso));
        }

    }

    /**
     * Command: castle.speedUpBuildCommand
     * Response: CommandResponse
     */
    public void speedUpBuildCommand(int castleId, int positionId, String itemId) {
        speedUpBuildCommand(castleId, positionId, itemId, null);
    }

    /**
     * Command: castle.upgradeBuilding
     * Response: CommandResponse
     */
    public void upgradeBuilding(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _upgradeBuilding_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(UPGRADE_BUILDING, aso));
        }

    }

    /**
     * Command: castle.upgradeBuilding
     * Response: CommandResponse
     */
    public void upgradeBuilding(int castleId, int positionId) {
        upgradeBuilding(castleId, positionId, null);
    }

    /**
     * Command: castle.destructBuilding
     * Response: CommandResponse
     */
    public void destructBuilding(int castleId, int positionId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _destructBuilding_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DESTRUCT_BUILDING, aso));
        }

    }

    /**
     * Command: castle.destructBuilding
     * Response: CommandResponse
     */
    public void destructBuilding(int castleId, int positionId) {
        destructBuilding(castleId, positionId, null);
    }

    /**
     * Command: castle.newBuilding
     * Response: CommandResponse
     */
    public void newBuilding(int castleId, int positionId, int buildingType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _newBuilding_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("positionId", positionId);
        aso.put("buildingType", buildingType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(NEW_BUILDING, aso));
        }

    }

    /**
     * Command: castle.newBuilding
     * Response: CommandResponse
     */
    public void newBuilding(int castleId, int positionId, int buildingType) {
        newBuilding(castleId, positionId, buildingType, null);
    }
}
