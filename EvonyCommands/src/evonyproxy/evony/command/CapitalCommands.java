package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Appears to implement all commands used to levy resources in a city.
 * **** Not sure if this is true ****
 */
public class CapitalCommands extends AbstractCommand implements ICapitalCommands {
    public Method _getUsedPoliciesTimes_callback = null;
    public Method _levyTaxes_callback = null;
    public Method _levyFood_callback = null;
    public Method _levyArmy_callback = null;
    public Method _reduceArmaments_callback = null;
    public Method _levyPopulation_callback = null;

    /**
     * Command: capital.levyArmy
     * Response: CapitalCommandResponse
     */
    public void levyArmy(int castleId, int targetFieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyArmy_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetFieldId", targetFieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_ARMY, aso));
        }

    }

    /**
     * Command: capital.levyArmy
     * Response: CapitalCommandResponse
     */
    public void levyArmy(int castleId, int targetFieldId) {
        levyArmy(castleId, targetFieldId, null);
    }

    /**
     * Command: capital.getUsedPoliciesTimes
     * Response: CapitalCommandResponse
     */
    public void getUsedPoliciesTimes(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getUsedPoliciesTimes_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_USED_POLICIES_TIMES, aso));
        }

    }

    /**
     * Command: capital.getUsedPoliciesTimes
     * Response: CapitalCommandResponse
     */
    public void getUsedPoliciesTimes(int castleId) {
        getUsedPoliciesTimes(castleId, null);
    }

    /**
     * Command: capital.levyPopulation
     * Response: CapitalCommandResponse
     */
    public void levyPopulation(int castleId, int targetFieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyPopulation_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetFieldId", targetFieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_POPULATION, aso));
        }

    }

    /**
     * Command: capital.levyPopulation
     * Response: CapitalCommandResponse
     */
    public void levyPopulation(int castleId, int targetFieldId) {
        levyPopulation(castleId, targetFieldId, null);
    }

    /**
     * Command: capital.reduceArmaments
     * Response: CapitalCommandResponse
     */
    public void reduceArmaments(int castleId, int targetFieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _reduceArmaments_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetFieldId", targetFieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REDUCE_ARMAMENTS, aso));
        }

    }

    /**
     * Command: capital.reduceArmaments
     * Response: CapitalCommandResponse
     */
    public void reduceArmaments(int castleId, int targetFieldId) {
        reduceArmaments(castleId, targetFieldId, null);
    }

    /**
     * Command: capital.levyFood
     * Response: CapitalCommandResponse
     */
    public void levyFood(int castleId, int targetFieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyFood_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetFieldId", targetFieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_FOOD, aso));
        }

    }

    /**
     * Command: capital.levyFood
     * Response: CapitalCommandResponse
     */
    public void levyFood(int castleId, int targetFieldId) {
        levyFood(castleId, targetFieldId, null);
    }

    /**
     * Command: capital.levyTaxes
     * Response: CapitalCommandResponse
     */
    public void levyTaxes(int castleId, int targetFieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levyTaxes_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("targetFieldId", targetFieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVY_TAXES, aso));
        }

    }

    /**
     * Command: capital.levyTaxes
     * Response: CapitalCommandResponse
     */
    public void levyTaxes(int castleId, int targetFieldId) {
        levyTaxes(castleId, targetFieldId, null);
    }
}
