package evonyproxy.common.command;

import evonyproxy.common.beans.TroopBean;
import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class ColonyCommands extends AbstractCommand implements IColonyCommands {
    public Method _uprise_callback = null;
    public Method _levyArmy_callback = null;
    public Method _getDeployTroopsInfo_callback = null;
    public Method _reduceArmaments_callback = null;
    public Method _levyPopulation_callback = null;
    public Method _speedUpAbandonColony_callback = null;
    public Method _getColonialArmyInfo_callback = null;
    public Method _getSuzerainColonialCastlesInfo_callback = null;
    public Method _addDeployTroops_callback = null;
    public Method _abandonColony_callback = null;
    public Method _overviewColonialCastle_callback = null;
    public Method _levyTaxes_callback = null;
    public Method _getColonialCastlesInfo_callback = null;
    public Method _levyFood_callback = null;
    public Method _reduceDeployTroops_callback = null;
    public Method _sowDiscord_callback = null;

    /**
     * Command: colony.sowDiscord
     * Response: CommandResponse
     */
    public void sowDiscord(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _sowDiscord_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SOW_DISCORD, aso));
        }

    }

    /**
     * Command: colony.sowDiscord
     * Response: CommandResponse
     */
    public void sowDiscord(int castleId, int targetCastleId) {
        sowDiscord(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.getColonialArmyInfo
     * Response: ColonialArmyResponse
     */
    public void getColonialArmyInfo(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getColonialArmyInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_COLONIAL_ARMY_INFO, aso));
        }

    }

    /**
     * Command: colony.getColonialArmyInfo
     * Response: ColonialArmyResponse
     */
    public void getColonialArmyInfo(int castleId, int targetCastleId) {
        getColonialArmyInfo(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.reduceArmaments
     * Response: ColonyLevyeRespone
     */
    public void reduceArmaments(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _reduceArmaments_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REDUCE_ARMAMENTS, aso));
        }

    }

    /**
     * Command: colony.reduceArmaments
     * Response: ColonyLevyeRespone
     */
    public void reduceArmaments(int castleId, int targetCastleId) {
        reduceArmaments(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.reduceDeployTroops
     * Response: CommandResponse
     */
    public void reduceDeployTroops(int castleId, int targetCastleId, TroopBean troopBean, Method callbackMethod) {
        ASObject aso = new ASObject();

        _reduceDeployTroops_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        aso.put("troopBean", troopBean);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REDUCE_DEPLOY_TROOPS, aso));
        }

    }

    /**
     * Command: colony.reduceDeployTroops
     * Response: CommandResponse
     */
    public void reduceDeployTroops(int castleId, int targetCastleId, TroopBean troopBean) {
        reduceDeployTroops(castleId, targetCastleId, troopBean, null);
    }

    /**
     * Command: colony.speedUpAbandonColony
     * Response: CommandResponse
     */
    public void speedUpAbandonColony(int castleId, int targetCastleId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _speedUpAbandonColony_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SPEED_UP_ABANDON_COLONY, aso));
        }

    }

    /**
     * Command: colony.speedUpAbandonColony
     * Response: CommandResponse
     */
    public void speedUpAbandonColony(int castleId, int targetCastleId, String itemId) {
        speedUpAbandonColony(castleId, targetCastleId, itemId, null);
    }

    /**
     * Command: colony.levyArmy
     * Response: ColonyLevyeRespone
     */
    public void levyArmy(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_ARMY, aso));
        }

    }

    /**
     * Command: colony.levyArmy
     * Response: ColonyLevyeRespone
     */
    public void levyArmy(int castleId, int targetCastleId) {
        levyArmy(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.getColonialCastlesInfo
     * Response: ColonialCastlesRespone
     */
    public void getColonialCastlesInfo(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getColonialCastlesInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_COLONIAL_CASTLES_INFO, aso));
        }

    }

    /**
     * Command: colony.getColonialCastlesInfo
     * Response: ColonialCastlesRespone
     */
    public void getColonialCastlesInfo(int castleId) {
        getColonialCastlesInfo(castleId, null);
    }

    /**
     * Command: colony.overviewColonialCastle
     * Response: OverviewColonyCastleRespone
     */
    public void overviewColonialCastle(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _overviewColonialCastle_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(OVERVIEW_COLONIAL_CASTLE, aso));
        }

    }

    /**
     * Command: colony.overviewColonialCastle
     * Response: OverviewColonyCastleRespone
     */
    public void overviewColonialCastle(int castleId, int targetCastleId) {
        overviewColonialCastle(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.abandonColony
     * Response: CommandResponse
     */
    public void abandonColony(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _abandonColony_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ABANDON_COLONY, aso));
        }

    }

    /**
     * Command: colony.abandonColony
     * Response: CommandResponse
     */
    public void abandonColony(int castleId, int targetCastleId) {
        abandonColony(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.getSuzerainColonialCastlesInfo
     * Response: ColonialCastlesRespone
     */
    public void getSuzerainColonialCastlesInfo(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getSuzerainColonialCastlesInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_SUZERAIN_COLONIAL_CASTLES_INFO, aso));
        }

    }

    /**
     * Command: colony.getSuzerainColonialCastlesInfo
     * Response: ColonialCastlesRespone
     */
    public void getSuzerainColonialCastlesInfo(int castleId) {
        getSuzerainColonialCastlesInfo(castleId, null);
    }

    /**
     * Command: colony.uprise
     * Response: CommandResponse
     */
    public void uprise(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _uprise_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(UPRISE, aso));
        }

    }

    /**
     * Command: colony.uprise
     * Response: CommandResponse
     */
    public void uprise(int castleId) {
        uprise(castleId, null);
    }

    /**
     * Command: colony.levyPopulation
     * Response: ColonyLevyeRespone
     */
    public void levyPopulation(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyPopulation_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_POPULATION, aso));
        }

    }

    /**
     * Command: colony.levyPopulation
     * Response: ColonyLevyeRespone
     */
    public void levyPopulation(int castleId, int targetCastleId) {
        levyPopulation(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.getDeployTroopsInfo
     * Response: ColonialDeployResponse
     */
    public void getDeployTroopsInfo(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getDeployTroopsInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_DEPLOY_TROOPS_INFO, aso));
        }

    }

    /**
     * Command: colony.getDeployTroopsInfo
     * Response: ColonialDeployResponse
     */
    public void getDeployTroopsInfo(int castleId, int targetCastleId) {
        getDeployTroopsInfo(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.addDeployTroops
     * Response: CommandResponse
     */
    public void addDeployTroops(int castleId, int targetCastleId, TroopBean troopBean, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addDeployTroops_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        aso.put("troopBean", troopBean);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_DEPLOY_TROOPS, aso));
        }

    }

    /**
     * Command: colony.addDeployTroops
     * Response: CommandResponse
     */
    public void addDeployTroops(int castleId, int targetCastleId, TroopBean troopBean) {
        addDeployTroops(castleId, targetCastleId, troopBean, null);
    }

    /**
     * Command: colony.levyFood
     * Response: ColonyLevyeRespone
     */
    public void levyFood(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyFood_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_FOOD, aso));
        }

    }

    /**
     * Command: colony.levyFood
     * Response: ColonyLevyeRespone
     */
    public void levyFood(int castleId, int targetCastleId) {
        levyFood(castleId, targetCastleId, null);
    }

    /**
     * Command: colony.levyTaxes
     * Response: ColonyLevyeRespone
     */
    public void levyTaxes(int castleId, int targetCastleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyTaxes_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetCastleId", targetCastleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_TAXES, aso));
        }

    }

    /**
     * Command: colony.levyTaxes
     * Response: ColonyLevyeRespone
     */
    public void levyTaxes(int castleId, int targetCastleId) {
        levyTaxes(castleId, targetCastleId, null);
    }
}
