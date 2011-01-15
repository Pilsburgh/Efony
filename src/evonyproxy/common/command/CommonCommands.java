package evonyproxy.common.command;

import evonyproxy.common.beans.TroopBean;
import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class CommonCommands extends AbstractCommand implements ICommonCommands {
    public Method _worldChat_callback = null;
    public Method _addToFavorites_callback = null;
    public Method _saveUnregisteredPlayer_callback = null;
    public Method _getRelationship_callback = null;
    public Method _getCanDeclaredWarAgainstPlayer_callback = null;
    public Method _mapInfo_callback = null;
    public Method _createNewPlayer_callback = null;
    public Method _setTroopConfig_callback = null;
    public Method _getPlayerDeclaredWarStatus_callback = null;
    public Method _setReturnReport_callback = null;
    public Method _changeHeadline_callback = null;
    public Method _mapInfoSimple_callback = null;
    public Method _getPackageNumber_callback = null;
    public Method _changeUserFace_callback = null;
    public Method _facebookConnect_callback = null;
    public Method _mapCastle_callback = null;
    public Method _declaredWarAgainstPlayer_callback = null;
    public Method _getPackage_callback = null;
    public Method _allianceChat_callback = null;
    public Method _delUniteServerPeaceStatus_callback = null;
    public Method _getPackageList_callback = null;
    public Method _getPlayerInfoByName_callback = null;
    public Method _channelChat_callback = null;
    public Method _setAutoHeal_callback = null;
    public Method _zoneInfo_callback = null;
    public Method _privateChat_callback = null;
    public Method _deleteUserAndRestart_callback = null;
    public Method _changeName_callback = null;

    /**
     * Command: common.setTroopConfig
     * Response: TroopConfigResponse
     */
    public void setTroopConfig(String name, TroopBean config, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setTroopConfig_callback = callbackMethod;

        aso.put("name", name);
        aso.put("config", config);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_TROOP_CONFIG, aso));
        }

    }

    /**
     * Command: common.setTroopConfig
     * Response: TroopConfigResponse
     */
    public void setTroopConfig(String name, TroopBean config) {
        setTroopConfig(name, config, null);
    }

    /**
     * Command: common.createNewPlayer
     * Response: CreatePlayerResponse
     */
    public void createNewPlayer(String userName, int sex, String faceUrl, String flag, String castleName, int zone, Method callbackMethod) {
        ASObject aso = new ASObject();

        _createNewPlayer_callback = callbackMethod;

        aso.put("userName", userName);
        aso.put("sex", sex);
        aso.put("faceUrl", faceUrl);
        aso.put("flag", flag);
        aso.put("castleName", castleName);
        aso.put("zone", zone);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CREATE_NEW_PLAYER, aso));
        }

    }

    /**
     * Command: common.createNewPlayer
     * Response: CreatePlayerResponse
     */
    public void createNewPlayer(String userName, int sex, String faceUrl, String flag, String castleName, int zone) {
        createNewPlayer(userName, sex, faceUrl, flag, castleName, zone, null);
    }

    /**
     * Command: common.setReturnReport
     * Response: CommandResponse
     */
    public void setReturnReport(Boolean returnReport, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setReturnReport_callback = callbackMethod;

        aso.put("returnReport", returnReport);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_RETURN_REPORT, aso));
        }

    }

    /**
     * Command: common.setReturnReport
     * Response: CommandResponse
     */
    public void setReturnReport(Boolean returnReport) {
        setReturnReport(returnReport, null);
    }

    /**
     * Command: common.getPlayerInfoByName
     * Response: PlayerInfoResponse
     */
    public void getPlayerInfoByName(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPlayerInfoByName_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PLAYER_INFO_BY_NAME, aso));
        }

    }

    /**
     * Command: common.getPlayerInfoByName
     * Response: PlayerInfoResponse
     */
    public void getPlayerInfoByName(String userName) {
        getPlayerInfoByName(userName, null);
    }

    /**
     * Command: common.getPackageNumber
     * Response: GetPackageNumberResponse
     */
    public void getPackageNumber(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPackageNumber_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PACKAGE_NUMBER, aso));
        }

    }

    /**
     * Command: common.getPackageNumber
     * Response: GetPackageNumberResponse
     */
    public void getPackageNumber() {
        getPackageNumber(null);
    }

    /**
     * Command: common.zoneInfo
     * Response: ZoneInfoResponse
     */
    public void zoneInfo(Method callbackMethod) {
        ASObject aso = new ASObject();

        _zoneInfo_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ZONE_INFO, aso));
        }

    }

    /**
     * Command: common.zoneInfo
     * Response: ZoneInfoResponse
     */
    public void zoneInfo() {
        zoneInfo(null);
    }

    /**
     * Command: common.getPackage
     * Response: GetPackageResponse
     */
    public void getPackage(int ruleId, String serial, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPackage_callback = callbackMethod;

        aso.put("ruleId", ruleId);
        aso.put("serial", serial);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PACKAGE, aso));
        }

    }

    /**
     * Command: common.getPackage
     * Response: GetPackageResponse
     */
    public void getPackage(int ruleId, String serial) {
        getPackage(ruleId, serial, null);
    }

    /**
     * Command: common.saveUnregisteredPlayer
     * Response: CommandResponse
     */
    public void saveUnregisteredPlayer(String account, String password, Method callbackMethod) {
        ASObject aso = new ASObject();

        _saveUnregisteredPlayer_callback = callbackMethod;

        aso.put("account", account);
        aso.put("password", password);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SAVE_UNREGISTERED_PLAYER, aso));
        }

    }

    /**
     * Command: common.saveUnregisteredPlayer
     * Response: CommandResponse
     */
    public void saveUnregisteredPlayer(String account, String password) {
        saveUnregisteredPlayer(account, password, null);
    }

    /**
     * Command: common.privateChat
     * Response: ChatResponse
     */
    public void privateChat(String targetName, String msg, Method callbackMethod) {
        ASObject aso = new ASObject();

        _privateChat_callback = callbackMethod;

        aso.put("targetName", targetName);
        aso.put("msg", msg);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(PRIVATE_CHAT, aso));
        }

    }

    /**
     * Command: common.privateChat
     * Response: ChatResponse
     */
    public void privateChat(String targetName, String msg) {
        privateChat(targetName, msg, null);
    }

    /**
     * Command: common.getCanDeclaredWarAgainstPlayer
     * Response: GetCanDeclaredWarAgainstPlayerRespone
     */
    public void getCanDeclaredWarAgainstPlayer(int playerId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCanDeclaredWarAgainstPlayer_callback = callbackMethod;

        aso.put("playerId", playerId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_CAN_DECLARED_WAR_AGAINST_PLAYER, aso));
        }

    }

    /**
     * Command: common.getCanDeclaredWarAgainstPlayer
     * Response: GetCanDeclaredWarAgainstPlayerRespone
     */
    public void getCanDeclaredWarAgainstPlayer(int playerId) {
        getCanDeclaredWarAgainstPlayer(playerId, null);
    }

    /**
     * Command: common.changeHeadline
     * Response: CommandResponse
     */
    public void changeHeadline(String headline, Method callbackMethod) {
        ASObject aso = new ASObject();

        _changeHeadline_callback = callbackMethod;

        aso.put("headline", headline);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHANGE_HEADLINE, aso));
        }

    }

    /**
     * Command: common.changeHeadline
     * Response: CommandResponse
     */
    public void changeHeadline(String headline) {
        changeHeadline(headline, null);
    }

    /**
     * Command: common.changeUserFace
     * Response: ChangeUserFaceResponse
     */
    public void changeUserFace(String faceUrl, int sex, Method callbackMethod) {
        ASObject aso = new ASObject();

        _changeUserFace_callback = callbackMethod;

        aso.put("faceUrl", faceUrl);
        aso.put("sex", sex);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHANGE_USER_FACE, aso));
        }

    }

    /**
     * Command: common.changeUserFace
     * Response: ChangeUserFaceResponse
     */
    public void changeUserFace(String faceUrl, int sex) {
        changeUserFace(faceUrl, sex, null);
    }

    /**
     * Command: common.allianceChat
     * Response: ChatResponse
     */
    public void allianceChat(String msg, int languageType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _allianceChat_callback = callbackMethod;

        aso.put("msg", msg);
        aso.put("languageType", languageType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ALLIANCE_CHAT, aso));
        }

    }

    /**
     * Command: common.allianceChat
     * Response: ChatResponse
     */
    public void allianceChat(String msg, int languageType) {
        allianceChat(msg, languageType, null);
    }

    /**
     * Command: common.mapInfo
     * Response: MapInfoResponse
     */
    public void mapInfo(int castleId, int x1, int y1, int x2, int y2, Method callbackMethod) {
        ASObject aso = new ASObject();

        _mapInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("x1", x1);
        aso.put("y1", y1);
        aso.put("x2", x2);
        aso.put("y2", y2);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MAP_INFO, aso));
        }

    }

    /**
     * Command: common.mapInfo
     * Response: MapInfoResponse
     */
    public void mapInfo(int castleId, int x1, int y1, int x2, int y2) {
        mapInfo(castleId, x1, y1, x2, y2, null);
    }

    /**
     * Command: common.addToFavorites
     * Response: CommandResponse
     */
    public void addToFavorites(Method callbackMethod) {
        ASObject aso = new ASObject();

        _addToFavorites_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_TO_FAVORITES, aso));
        }

    }

    /**
     * Command: common.addToFavorites
     * Response: CommandResponse
     */
    public void addToFavorites() {
        addToFavorites(null);
    }

    /**
     * Command: common.setAutoHeal
     * Response: CommandResponse
     */
    public void setAutoHeal(Boolean autoHeal, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setAutoHeal_callback = callbackMethod;

        aso.put("autoHeal", autoHeal);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_AUTO_HEAL, aso));
        }

    }

    /**
     * Command: common.setAutoHeal
     * Response: CommandResponse
     */
    public void setAutoHeal(Boolean autoHeal) {
        setAutoHeal(autoHeal, null);
    }

    /**
     * Command: common.facebookConnect
     * Response: CommandResponse
     */
    public void facebookConnect(String facebookId, String password, String fbsig, Method callbackMethod) {
        ASObject aso = new ASObject();

        _facebookConnect_callback = callbackMethod;

        aso.put("facebookId", facebookId);
        aso.put("password", password);
        aso.put("fbsig", fbsig);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(FACEBOOK_CONNECT, aso));
        }

    }

    /**
     * Command: common.facebookConnect
     * Response: CommandResponse
     */
    public void facebookConnect(String facebookId, String password, String fbsig) {
        facebookConnect(facebookId, password, fbsig, null);
    }

    /**
     * Command: common.getPlayerDeclaredWarStatus
     * Response: GetDeclaredWarResponse
     */
    public void getPlayerDeclaredWarStatus(int playerId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPlayerDeclaredWarStatus_callback = callbackMethod;

        aso.put("playerId", playerId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PLAYER_DECLARED_WAR_STATUS, aso));
        }

    }

    /**
     * Command: common.getPlayerDeclaredWarStatus
     * Response: GetDeclaredWarResponse
     */
    public void getPlayerDeclaredWarStatus(int playerId) {
        getPlayerDeclaredWarStatus(playerId, null);
    }

    /**
     * Command: common.delUniteServerPeaceStatus
     * Response: CommandResponse
     */
    public void delUniteServerPeaceStatus(Method callbackMethod) {
        ASObject aso = new ASObject();

        _delUniteServerPeaceStatus_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DEL_UNITE_SERVER_PEACE_STATUS, aso));
        }

    }

    /**
     * Command: common.delUniteServerPeaceStatus
     * Response: CommandResponse
     */
    public void delUniteServerPeaceStatus() {
        delUniteServerPeaceStatus(null);
    }

    /**
     * Command: common.changeName
     * Response: ChangeNameResponse
     */
    public void changeName(int type, String nowName, String newName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _changeName_callback = callbackMethod;

        aso.put("type", type);
        aso.put("nowName", nowName);
        aso.put("newName", newName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHANGE_NAME, aso));
        }

    }

    /**
     * Command: common.changeName
     * Response: ChangeNameResponse
     */
    public void changeName(int type, String nowName, String newName) {
        changeName(type, nowName, newName, null);
    }

    /**
     * Command: common.getRelationship
     * Response: GetRelationshipRespone
     */
    public void getRelationship(int playerId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getRelationship_callback = callbackMethod;

        aso.put("playerId", playerId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_RELATIONSHIP, aso));
        }

    }

    /**
     * Command: common.getRelationship
     * Response: GetRelationshipRespone
     */
    public void getRelationship(int playerId) {
        getRelationship(playerId, null);
    }

    /**
     * Command: common.declaredWarAgainstPlayer
     * Response: CommandResponse
     */
    public void declaredWarAgainstPlayer(int playerId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _declaredWarAgainstPlayer_callback = callbackMethod;

        aso.put("playerId", playerId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DECLARED_WAR_AGAINST_PLAYER, aso));
        }

    }

    /**
     * Command: common.declaredWarAgainstPlayer
     * Response: CommandResponse
     */
    public void declaredWarAgainstPlayer(int playerId) {
        declaredWarAgainstPlayer(playerId, null);
    }

    /**
     * Command: common.worldChat
     * Response: ChatResponse
     */
    public void worldChat(String msg, int languageType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _worldChat_callback = callbackMethod;

        aso.put("msg", msg);
        aso.put("languageType", languageType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(WORLD_CHAT, aso));
        }

    }

    /**
     * Command: common.worldChat
     * Response: ChatResponse
     */
    public void worldChat(String msg, int languageType) {
        worldChat(msg, languageType, null);
    }

    /**
     * Command: common.getPackageList
     * Response: GetPackageListResponse
     */
    public void getPackageList(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPackageList_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PACKAGE_LIST, aso));
        }

    }

    /**
     * Command: common.getPackageList
     * Response: GetPackageListResponse
     */
    public void getPackageList() {
        getPackageList(null);
    }

    /**
     * Command: common.mapCastle
     * Response: MapCastleResponse
     */
    public void mapCastle(int castleId, int x1, int y1, int x2, int y2, Method callbackMethod) {
        ASObject aso = new ASObject();

        _mapCastle_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("x1", x1);
        aso.put("y1", y1);
        aso.put("x2", x2);
        aso.put("y2", y2);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MAP_CASTLE, aso));
        }

    }

    /**
     * Command: common.mapCastle
     * Response: MapCastleResponse
     */
    public void mapCastle(int castleId, int x1, int y1, int x2, int y2) {
        mapCastle(castleId, x1, y1, x2, y2, null);
    }

    /**
     * Command: common.deleteUserAndRestart
     * Response: CommandResponse
     */
    public void deleteUserAndRestart(String pwd, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteUserAndRestart_callback = callbackMethod;

        aso.put("pwd", pwd);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_USER_AND_RESTART, aso));
        }

    }

    /**
     * Command: common.deleteUserAndRestart
     * Response: CommandResponse
     */
    public void deleteUserAndRestart(String pwd) {
        deleteUserAndRestart(pwd, null);
    }

    /**
     * Command: common.channelChat
     * Response: ChatResponse
     */
    public void channelChat(String channel, String sendMsg, int languageType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _channelChat_callback = callbackMethod;

        aso.put("channel", channel);
        aso.put("sendMsg", sendMsg);
        aso.put("languageType", languageType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHANNEL_CHAT, aso));
        }

    }

    /**
     * Command: common.channelChat
     * Response: ChatResponse
     */
    public void channelChat(String channel, String sendMsg, int languageType) {
        channelChat(channel, sendMsg, languageType, null);
    }

    /**
     * Command: common.mapInfoSimple
     * Response: MapInfoSimpleResponse
     */
    public void mapInfoSimple(int castleId, int x1, int y1, int x2, int y2, Method callbackMethod) {
        ASObject aso = new ASObject();

        _mapInfoSimple_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("x1", x1);
        aso.put("y1", y1);
        aso.put("x2", x2);
        aso.put("y2", y2);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MAP_INFO_SIMPLE, aso));
        }

    }

    /**
     * Command: common.mapInfoSimple
     * Response: MapInfoSimpleResponse
     */
    public void mapInfoSimple(int castleId, int x1, int y1, int x2, int y2) {
        mapInfoSimple(castleId, x1, y1, x2, y2, null);
    }
}
