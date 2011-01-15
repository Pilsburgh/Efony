package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Implements all commands used for creating and managing the members of an alliance.
 */
public class AllianceManagementCommands extends AbstractCommand implements IAllianceManagementCommands {
    public Method _rejectComeinAlliance_callback = null;
    public Method _getAllianceWanted_callback = null;
    public Method _dropAllianceFriendshipRelation_callback = null;
    public Method _messagesForAllianceMember_callback = null;
    public Method _setPowerForUserByAlliance_callback = null;
    public Method _addUsertoAlliance_callback = null;
    public Method _addUsertoAllianceList_callback = null;
    public Method _setAllianceFriendship_callback = null;
    public Method _resignForAlliance_callback = null;
    public Method _getPowerFromAlliance_callback = null;
    public Method _sayByetoAlliance_callback = null;
    public Method _agreeComeinAllianceList_callback = null;
    public Method _isHasAlliance_callback = null;
    public Method _kickOutMemberfromAlliance_callback = null;
    public Method _resetTopPowerForAlliance_callback = null;
    public Method _getAllianceFriendshipList_callback = null;
    public Method _cancelUserWantInAlliance_callback = null;
    public Method _agreeComeinAllianceByUser_callback = null;
    public Method _agreeComeinAllianceByLeader_callback = null;
    public Method _canceladdUsertoAlliance_callback = null;
    public Method _leaderWantUserInAllianceList_callback = null;
    public Method _setAllInfoForAlliance_callback = null;
    public Method _createAlliance_callback = null;
    public Method _userWantInAlliance_callback = null;
    public Method _cancelagreeComeinAlliance_callback = null;

    /**
     * Command: alliance.resetTopPowerForAlliance
     * Response: AllianceManagementResponse
     */
    public void resetTopPowerForAlliance(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _resetTopPowerForAlliance_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RESET_TOP_POWER_FOR_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.resetTopPowerForAlliance
     * Response: AllianceManagementResponse
     */
    public void resetTopPowerForAlliance(String userName) {
        resetTopPowerForAlliance(userName, null);
    }

    /**
     * Command: alliance.userWantInAlliance
     * Response: AllianceManagementResponse
     */
    public void userWantInAlliance(String allianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _userWantInAlliance_callback = callbackMethod;

        aso.put("allianceName", allianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(USER_WANT_IN_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.userWantInAlliance
     * Response: AllianceManagementResponse
     */
    public void userWantInAlliance(String allianceName) {
        userWantInAlliance(allianceName, null);
    }

    /**
     * Command: alliance.agreeComeinAllianceList
     * Response: AllianceUserAddResponse
     */
    public void agreeComeinAllianceList(Method callbackMethod) {
        ASObject aso = new ASObject();

        _agreeComeinAllianceList_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(AGREE_COMEIN_ALLIANCE_LIST, aso));
        }

    }

    /**
     * Command: alliance.agreeComeinAllianceList
     * Response: AllianceUserAddResponse
     */
    public void agreeComeinAllianceList() {
        agreeComeinAllianceList(null);
    }

    /**
     * Command: alliance.resignForAlliance
     * Response: AllianceManagementResponse
     */
    public void resignForAlliance(Method callbackMethod) {
        ASObject aso = new ASObject();

        _resignForAlliance_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RESIGN_FOR_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.resignForAlliance
     * Response: AllianceManagementResponse
     */
    public void resignForAlliance() {
        resignForAlliance(null);
    }

    /**
     * Command: alliance.cancelUserWantInAlliance
     * Response: AllianceManagementResponse
     */
    public void cancelUserWantInAlliance(String allianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelUserWantInAlliance_callback = callbackMethod;

        aso.put("allianceName", allianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_USER_WANT_IN_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.cancelUserWantInAlliance
     * Response: AllianceManagementResponse
     */
    public void cancelUserWantInAlliance(String allianceName) {
        cancelUserWantInAlliance(allianceName, null);
    }

    /**
     * Command: alliance.rejectComeinAlliance
     * Response: AllianceUserAddResponse
     */
    public void rejectComeinAlliance(String allianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _rejectComeinAlliance_callback = callbackMethod;

        aso.put("allianceName", allianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REJECT_COMEIN_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.rejectComeinAlliance
     * Response: AllianceUserAddResponse
     */
    public void rejectComeinAlliance(String allianceName) {
        rejectComeinAlliance(allianceName, null);
    }

    /**
     * Command: alliance.cancelagreeComeinAlliance
     * Response: AllianceUserAddResponse
     */
    public void cancelagreeComeinAlliance(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelagreeComeinAlliance_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCELAGREE_COMEIN_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.cancelagreeComeinAlliance
     * Response: AllianceUserAddResponse
     */
    public void cancelagreeComeinAlliance(String userName) {
        cancelagreeComeinAlliance(userName, null);
    }

    /**
     * Command: alliance.addUsertoAllianceList
     * Response: AllianceInviteBeanResponse
     */
    public void addUsertoAllianceList(Method callbackMethod) {
        ASObject aso = new ASObject();

        _addUsertoAllianceList_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_USERTO_ALLIANCE_LIST, aso));
        }

    }

    /**
     * Command: alliance.addUsertoAllianceList
     * Response: AllianceInviteBeanResponse
     */
    public void addUsertoAllianceList() {
        addUsertoAllianceList(null);
    }

    /**
     * Command: alliance.setPowerForUserByAlliance
     * Response: AllianceManagementResponse
     */
    public void setPowerForUserByAlliance(String userName, int typeId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setPowerForUserByAlliance_callback = callbackMethod;

        aso.put("userName", userName);
        aso.put("typeId", typeId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_POWER_FOR_USER_BY_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.setPowerForUserByAlliance
     * Response: AllianceManagementResponse
     */
    public void setPowerForUserByAlliance(String userName, int typeId) {
        setPowerForUserByAlliance(userName, typeId, null);
    }

    /**
     * Command: alliance.canceladdUsertoAlliance
     * Response: AllianceInviteBeanResponse
     */
    public void canceladdUsertoAlliance(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _canceladdUsertoAlliance_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCELADD_USERTO_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.canceladdUsertoAlliance
     * Response: AllianceInviteBeanResponse
     */
    public void canceladdUsertoAlliance(String userName) {
        canceladdUsertoAlliance(userName, null);
    }

    /**
     * Command: alliance.agreeComeinAllianceByLeader
     * Response: AllianceManagementResponse
     */
    public void agreeComeinAllianceByLeader(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _agreeComeinAllianceByLeader_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(AGREE_COMEIN_ALLIANCE_BY_LEADER, aso));
        }

    }

    /**
     * Command: alliance.agreeComeinAllianceByLeader
     * Response: AllianceManagementResponse
     */
    public void agreeComeinAllianceByLeader(String userName) {
        agreeComeinAllianceByLeader(userName, null);
    }

    /**
     * Command: alliance.sayByetoAlliance
     * Response: AllianceManagementResponse
     */
    public void sayByetoAlliance(Method callbackMethod) {
        ASObject aso = new ASObject();

        _sayByetoAlliance_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SAY_BYETO_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.sayByetoAlliance
     * Response: AllianceManagementResponse
     */
    public void sayByetoAlliance() {
        sayByetoAlliance(null);
    }

    /**
     * Command: alliance.getAllianceFriendshipList
     * Response: AllianceFriendshipResponse
     */
    public void getAllianceFriendshipList(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceFriendshipList_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_FRIENDSHIP_LIST, aso));
        }

    }

    /**
     * Command: alliance.getAllianceFriendshipList
     * Response: AllianceFriendshipResponse
     */
    public void getAllianceFriendshipList() {
        getAllianceFriendshipList(null);
    }

    /**
     * Command: alliance.setAllInfoForAlliance
     * Response: AllianceManagementResponse
     */
    public void setAllInfoForAlliance(String allianceName, String infoText, String noteText, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setAllInfoForAlliance_callback = callbackMethod;

        aso.put("allianceName", allianceName);
        aso.put("infoText", infoText);
        aso.put("noteText", noteText);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_ALL_INFO_FOR_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.setAllInfoForAlliance
     * Response: AllianceManagementResponse
     */
    public void setAllInfoForAlliance(String allianceName, String infoText, String noteText) {
        setAllInfoForAlliance(allianceName, infoText, noteText, null);
    }

    /**
     * Command: alliance.agreeComeinAllianceByUser
     * Response: AllianceUserAddResponse
     */
    public void agreeComeinAllianceByUser(int castleId, String allianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _agreeComeinAllianceByUser_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("allianceName", allianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(AGREE_COMEIN_ALLIANCE_BY_USER, aso));
        }

    }

    /**
     * Command: alliance.agreeComeinAllianceByUser
     * Response: AllianceUserAddResponse
     */
    public void agreeComeinAllianceByUser(int castleId, String allianceName) {
        agreeComeinAllianceByUser(castleId, allianceName, null);
    }

    /**
     * Command: alliance.getAllianceWanted
     * Response: WantedAllianceResponse
     */
    public void getAllianceWanted(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceWanted_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_WANTED, aso));
        }

    }

    /**
     * Command: alliance.getAllianceWanted
     * Response: WantedAllianceResponse
     */
    public void getAllianceWanted() {
        getAllianceWanted(null);
    }

    /**
     * Command: alliance.createAlliance
     * Response: AllianceManagementResponse
     */
    public void createAlliance(int castleId, String allianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _createAlliance_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("allianceName", allianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CREATE_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.createAlliance
     * Response: AllianceManagementResponse
     */
    public void createAlliance(int castleId, String allianceName) {
        createAlliance(castleId, allianceName, null);
    }

    /**
     * Command: alliance.addUsertoAlliance
     * Response: AllianceManagementResponse
     */
    public void addUsertoAlliance(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addUsertoAlliance_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_USERTO_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.addUsertoAlliance
     * Response: AllianceManagementResponse
     */
    public void addUsertoAlliance(String userName) {
        addUsertoAlliance(userName, null);
    }

    /**
     * Command: alliance.dropAllianceFriendshipRelation
     * Response: AllianceFriendshipResponse
     */
    public void dropAllianceFriendshipRelation(String targetAllianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _dropAllianceFriendshipRelation_callback = callbackMethod;

        aso.put("targetAllianceName", targetAllianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DROP_ALLIANCE_FRIENDSHIP_RELATION, aso));
        }

    }

    /**
     * Command: alliance.dropAllianceFriendshipRelation
     * Response: AllianceFriendshipResponse
     */
    public void dropAllianceFriendshipRelation(String targetAllianceName) {
        dropAllianceFriendshipRelation(targetAllianceName, null);
    }

    /**
     * Command: alliance.setAllianceFriendship
     * Response: AllianceManagementResponse
     */
    public void setAllianceFriendship(String targetAllianceName, int type, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setAllianceFriendship_callback = callbackMethod;

        aso.put("targetAllianceName", targetAllianceName);
        aso.put("type", type);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_ALLIANCE_FRIENDSHIP, aso));
        }

    }

    /**
     * Command: alliance.setAllianceFriendship
     * Response: AllianceManagementResponse
     */
    public void setAllianceFriendship(String targetAllianceName, int type) {
        setAllianceFriendship(targetAllianceName, type, null);
    }

    /**
     * Command: alliance.isHasAlliance
     * Response: HasAllianceResponse
     */
    public void isHasAlliance(Method callbackMethod) {
        ASObject aso = new ASObject();

        _isHasAlliance_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(IS_HAS_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.isHasAlliance
     * Response: HasAllianceResponse
     */
    public void isHasAlliance() {
        isHasAlliance(null);
    }

    /**
     * Command: alliance.getPowerFromAlliance
     * Response: AlliancePowerLevelResponse
     */
    public void getPowerFromAlliance(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPowerFromAlliance_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_POWER_FROM_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.getPowerFromAlliance
     * Response: AlliancePowerLevelResponse
     */
    public void getPowerFromAlliance() {
        getPowerFromAlliance(null);
    }

    /**
     * Command: alliance.kickOutMemberfromAlliance
     * Response: AllianceManagementResponse
     */
    public void kickOutMemberfromAlliance(String userName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _kickOutMemberfromAlliance_callback = callbackMethod;

        aso.put("userName", userName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(KICK_OUT_MEMBERFROM_ALLIANCE, aso));
        }

    }

    /**
     * Command: alliance.kickOutMemberfromAlliance
     * Response: AllianceManagementResponse
     */
    public void kickOutMemberfromAlliance(String userName) {
        kickOutMemberfromAlliance(userName, null);
    }

    /**
     * Command: alliance.messagesForAllianceMember
     * Response: AllianceManagementResponse
     */
    public void messagesForAllianceMember(String title, String message, int type, Method callbackMethod) {
        ASObject aso = new ASObject();

        _messagesForAllianceMember_callback = callbackMethod;

        aso.put("title", title);
        aso.put("message", message);
        aso.put("type", type);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MESSAGES_FOR_ALLIANCE_MEMBER, aso));
        }

    }

    /**
     * Command: alliance.messagesForAllianceMember
     * Response: AllianceManagementResponse
     */
    public void messagesForAllianceMember(String title, String message, int type) {
        messagesForAllianceMember(title, message, type, null);
    }

    /**
     * Command: alliance.leaderWantUserInAllianceList
     * Response: AllianceInviteOnClientBeanResponse
     */
    public void leaderWantUserInAllianceList(Method callbackMethod) {
        ASObject aso = new ASObject();

        _leaderWantUserInAllianceList_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEADER_WANT_USER_IN_ALLIANCE_LIST, aso));
        }

    }

    /**
     * Command: alliance.leaderWantUserInAllianceList
     * Response: AllianceInviteOnClientBeanResponse
     */
    public void leaderWantUserInAllianceList() {
        leaderWantUserInAllianceList(null);
    }
}
