package evonyproxy.common.command;

import evonyproxy.common.beans.TroopBean;
import evonyproxy.common.paramBeans.NewArmyParam;
import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Implements all commands for creating and managing sets of TroopBean.
 */
public class ArmyCommands extends AbstractCommand implements IArmyCommands {
    public Method _setArmyGoOut_callback = null;
    public Method _callBackArmy_callback = null;
    public Method _disbandFleeTroop_callback = null;
    public Method _newArmy_callback = null;
    public Method _getFleeTroop_callback = null;
    public Method _getTroopParam_callback = null;
    public Method _disbandInjuredTroop_callback = null;
    public Method _exerciseArmy_callback = null;
    public Method _getStayAllianceArmys_callback = null;
    public Method _cureInjuredTroop_callback = null;
    public Method _recruitFleeTroop_callback = null;
    public Method _setAllowAllianceArmy_callback = null;
    public Method _getInjuredTroop_callback = null;

    /**
     * Command: army.getStayAllianceArmys
     * Response: StayAllianceReponse
     */
    public void getStayAllianceArmys(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getStayAllianceArmys_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_STAY_ALLIANCE_ARMYS, aso));
        }

    }

    /**
     * Command: army.getStayAllianceArmys
     * Response: StayAllianceReponse
     */
    public void getStayAllianceArmys(int castleId) {
        getStayAllianceArmys(castleId, null);
    }

    /**
     * Command: army.disbandFleeTroop
     * Response: CommandResponse
     */
    public void disbandFleeTroop(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _disbandFleeTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DISBAND_FLEE_TROOP, aso));
        }

    }

    /**
     * Command: army.disbandFleeTroop
     * Response: CommandResponse
     */
    public void disbandFleeTroop(int castleId) {
        disbandFleeTroop(castleId, null);
    }

    /**
     * Command: army.recruitFleeTroop
     * Response: CommandResponse
     */
    public void recruitFleeTroop(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _recruitFleeTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RECRUIT_FLEE_TROOP, aso));
        }

    }

    /**
     * Command: army.recruitFleeTroop
     * Response: CommandResponse
     */
    public void recruitFleeTroop(int castleId) {
        recruitFleeTroop(castleId, null);
    }

    /**
     * Command: army.getTroopParam
     * Response: TroopParamResponse
     */
    public void getTroopParam(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getTroopParam_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_TROOP_PARAM, aso));
        }

    }

    /**
     * Command: army.getTroopParam
     * Response: TroopParamResponse
     */
    public void getTroopParam(int castleId) {
        getTroopParam(castleId, null);
    }

    /**
     * Command: army.exerciseArmy
     * Response: ArmyPracticeResponse
     */
    public void exerciseArmy(int castleId, TroopBean troopParamAttack, TroopBean troopParamDefend, Method callbackMethod) {
        ASObject aso = new ASObject();

        _exerciseArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("troopParamAttack", troopParamAttack);
        aso.put("troopParamDefend", troopParamDefend);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(EXERCISE_ARMY, aso));
        }

    }

    /**
     * Command: army.exerciseArmy
     * Response: ArmyPracticeResponse
     */
    public void exerciseArmy(int castleId, TroopBean troopParamAttack, TroopBean troopParamDefend) {
        exerciseArmy(castleId, troopParamAttack, troopParamDefend, null);
    }

    /**
     * Command: army.getFleeTroop
     * Response: CommandResponse
     */
    public void getFleeTroop(int param1, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getFleeTroop_callback = callbackMethod;

        aso.put("param1", param1);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_FLEE_TROOP, aso));
        }

    }

    /**
     * Command: army.getFleeTroop
     * Response: CommandResponse
     */
    public void getFleeTroop(int param1) {
        getFleeTroop(param1, null);
    }

    /**
     * Command: army.disbandInjuredTroop
     * Response: CommandResponse
     */
    public void disbandInjuredTroop(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _disbandInjuredTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DISBAND_INJURED_TROOP, aso));
        }

    }

    /**
     * Command: army.disbandInjuredTroop
     * Response: CommandResponse
     */
    public void disbandInjuredTroop(int castleId) {
        disbandInjuredTroop(castleId, null);
    }

    /**
     * Command: army.newArmy
     * Response: CommandResponse
     */
    public void newArmy(int castleId, NewArmyParam newArmyBean, Method callbackMethod) {
        ASObject aso = new ASObject();

        _newArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("newArmyBean", newArmyBean);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(NEW_ARMY, aso));
        }

    }

    /**
     * Command: army.newArmy
     * Response: CommandResponse
     */
    public void newArmy(int castleId, NewArmyParam newArmyBean) {
        newArmy(castleId, newArmyBean, null);
    }

    /**
     * Command: army.callBackArmy
     * Response: CommandResponse
     */
    public void callBackArmy(int castleId, int armyId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _callBackArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("armyId", armyId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CALL_BACK_ARMY, aso));
        }

    }

    /**
     * Command: army.callBackArmy
     * Response: CommandResponse
     */
    public void callBackArmy(int castleId, int armyId) {
        callBackArmy(castleId, armyId, null);
    }

    /**
     * Command: army.getInjuredTroop
     * Response: CommandResponse
     */
    public void getInjuredTroop(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getInjuredTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_INJURED_TROOP, aso));
        }

    }

    /**
     * Command: army.getInjuredTroop
     * Response: CommandResponse
     */
    public void getInjuredTroop(int castleId) {
        getInjuredTroop(castleId, null);
    }

    /**
     * Command: army.setAllowAllianceArmy
     * Response: CommandResponse
     */
    public void setAllowAllianceArmy(int castleId, Boolean isAllow, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setAllowAllianceArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("isAllow", isAllow);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_ALLOW_ALLIANCE_ARMY, aso));
        }

    }

    /**
     * Command: army.setAllowAllianceArmy
     * Response: CommandResponse
     */
    public void setAllowAllianceArmy(int castleId, Boolean isAllow) {
        setAllowAllianceArmy(castleId, isAllow, null);
    }

    /**
     * Command: army.setArmyGoOut
     * Response: CommandResponse
     */
    public void setArmyGoOut(int castleId, Boolean isArmyGoOut, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setArmyGoOut_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("isArmyGoOut", isArmyGoOut);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_ARMY_GO_OUT, aso));
        }

    }

    /**
     * Command: army.setArmyGoOut
     * Response: CommandResponse
     */
    public void setArmyGoOut(int castleId, Boolean isArmyGoOut) {
        setArmyGoOut(castleId, isArmyGoOut, null);
    }

    /**
     * Command: army.cureInjuredTroop
     * Response: CommandResponse
     */
    public void cureInjuredTroop(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cureInjuredTroop_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CURE_INJURED_TROOP, aso));
        }

    }

    /**
     * Command: army.cureInjuredTroop
     * Response: CommandResponse
     */
    public void cureInjuredTroop(int castleId) {
        cureInjuredTroop(castleId, null);
    }
}
