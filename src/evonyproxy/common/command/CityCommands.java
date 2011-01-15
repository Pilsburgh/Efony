package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class CityCommands extends AbstractCommand implements ICityCommands {
    public Method _advMoveCastle_callback = null;
    public Method _modifyCastleName_callback = null;
    public Method _modifyUserName_callback = null;
    public Method _modifyCastleIcon_callback = null;
    public Method _moveCastle_callback = null;
    public Method _modifyFlag_callback = null;
    public Method _giveupCastle_callback = null;
    public Method _getStoreList_callback = null;
    public Method _modifyStorePercent_callback = null;
    public Method _constructCastle_callback = null;
    public Method _setStopWarState_callback = null;
    public Method _uniteAdvMoveCastle_callback = null;

    /**
     * Command: city.giveupCastle
     * Response: CommandResponse
     */
    public void giveupCastle(String password, int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _giveupCastle_callback = callbackMethod;

        aso.put("password", password);
        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GIVEUP_CASTLE, aso));
        }

    }

    /**
     * Command: city.giveupCastle
     * Response: CommandResponse
     */
    public void giveupCastle(String password, int castleId) {
        giveupCastle(password, castleId, null);
    }

    /**
     * Command: city.modifyStorePercent
     * Response: CommandResponse
     */
    public void modifyStorePercent(int castleId, int foodrate, int woodrate, int stonerate, int ironrate, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyStorePercent_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("foodrate", foodrate);
        aso.put("woodrate", woodrate);
        aso.put("stonerate", stonerate);
        aso.put("ironrate", ironrate);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_STORE_PERCENT, aso));
        }

    }

    /**
     * Command: city.modifyStorePercent
     * Response: CommandResponse
     */
    public void modifyStorePercent(int castleId, int foodrate, int woodrate, int stonerate, int ironrate) {
        modifyStorePercent(castleId, foodrate, woodrate, stonerate, ironrate, null);
    }

    /**
     * Command: city.modifyFlag
     * Response: CommandResponse
     */
    public void modifyFlag(String newFlag, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyFlag_callback = callbackMethod;

        aso.put("newFlag", newFlag);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_FLAG, aso));
        }

    }

    /**
     * Command: city.modifyFlag
     * Response: CommandResponse
     */
    public void modifyFlag(String newFlag) {
        modifyFlag(newFlag, null);
    }

    /**
     * Command: city.modifyUserName
     * Response: CommandResponse
     */
    public void modifyUserName(String userName, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyUserName_callback = callbackMethod;

        aso.put("userName", userName);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_USER_NAME, aso));
        }

    }

    /**
     * Command: city.modifyUserName
     * Response: CommandResponse
     */
    public void modifyUserName(String userName, String itemId) {
        modifyUserName(userName, itemId, null);
    }

    /**
     * Command: city.uniteAdvMoveCastle
     * Response: CommandResponse
     */
    public void uniteAdvMoveCastle(int castleId, int targetId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _uniteAdvMoveCastle_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetId", targetId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(UNITE_ADV_MOVE_CASTLE, aso));
        }

    }

    /**
     * Command: city.uniteAdvMoveCastle
     * Response: CommandResponse
     */
    public void uniteAdvMoveCastle(int castleId, int targetId) {
        uniteAdvMoveCastle(castleId, targetId, null);
    }

    /**
     * Command: city.getStoreList
     * Response: StoreListResponse
     */
    public void getStoreList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getStoreList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_STORE_LIST, aso));
        }

    }

    /**
     * Command: city.getStoreList
     * Response: StoreListResponse
     */
    public void getStoreList(int castleId) {
        getStoreList(castleId, null);
    }

    /**
     * Command: city.modifyCastleIcon
     * Response: CommandResponse
     */
    public void modifyCastleIcon(int castleId, int icon, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyCastleIcon_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("icon", icon);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_CASTLE_ICON, aso));
        }

    }

    /**
     * Command: city.modifyCastleIcon
     * Response: CommandResponse
     */
    public void modifyCastleIcon(int castleId, int icon) {
        modifyCastleIcon(castleId, icon, null);
    }

    /**
     * Command: city.setStopWarState
     * Response: CommandResponse
     */
    public void setStopWarState(String ItemId, String passWord, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setStopWarState_callback = callbackMethod;

        aso.put("ItemId", ItemId);
        aso.put("passWord", passWord);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_STOP_WAR_STATE, aso));
        }

    }

    /**
     * Command: city.setStopWarState
     * Response: CommandResponse
     */
    public void setStopWarState(String ItemId, String passWord) {
        setStopWarState(ItemId, passWord, null);
    }

    /**
     * Command: city.constructCastle
     * Response: CommandResponse
     */
    public void constructCastle(int castleId, int fieldId, Boolean isTroopBack, Method callbackMethod) {
        ASObject aso = new ASObject();

        _constructCastle_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("fieldId", fieldId);
        aso.put("isTroopBack", isTroopBack);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CONSTRUCT_CASTLE, aso));
        }

    }

    /**
     * Command: city.constructCastle
     * Response: CommandResponse
     */
    public void constructCastle(int castleId, int fieldId, Boolean isTroopBack) {
        constructCastle(castleId, fieldId, isTroopBack, null);
    }

    /**
     * Command: city.moveCastle
     * Response: CommandResponse
     */
    public void moveCastle(int castleId, int zoneId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _moveCastle_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("zoneId", zoneId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MOVE_CASTLE, aso));
        }

    }

    /**
     * Command: city.moveCastle
     * Response: CommandResponse
     */
    public void moveCastle(int castleId, int zoneId) {
        moveCastle(castleId, zoneId, null);
    }

    /**
     * Command: city.advMoveCastle
     * Response: CommandResponse
     */
    public void advMoveCastle(int castleId, int targetId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _advMoveCastle_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetId", targetId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADV_MOVE_CASTLE, aso));
        }

    }

    /**
     * Command: city.advMoveCastle
     * Response: CommandResponse
     */
    public void advMoveCastle(int castleId, int targetId) {
        advMoveCastle(castleId, targetId, null);
    }

    /**
     * Command: city.modifyCastleName
     * Response: CommandResponse
     */
    public void modifyCastleName(int castleId, String name, String logUrl, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyCastleName_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("name", name);
        aso.put("logUrl", logUrl);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_CASTLE_NAME, aso));
        }

    }

    /**
     * Command: city.modifyCastleName
     * Response: CommandResponse
     */
    public void modifyCastleName(int castleId, String name, String logUrl) {
        modifyCastleName(castleId, name, logUrl, null);
    }
}
