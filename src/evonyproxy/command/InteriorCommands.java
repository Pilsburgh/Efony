package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class InteriorCommands extends AbstractCommand implements IInteriorCommands {
    public Method _pacifyPeople_callback = null;
    public Method _modifyTaxRate_callback = null;
    public Method _modifyCommenceRate_callback = null;
    public Method _taxation_callback = null;
    public Method _getResourceProduceData_callback = null;

    /**
     * Command: interior.modifyTaxRate
     * Response: CommandResponse
     */
    public void modifyTaxRate(int castleId, int tax, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyTaxRate_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("tax", tax);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_TAX_RATE, aso));
        }

    }

    /**
     * Command: interior.modifyTaxRate
     * Response: CommandResponse
     */
    public void modifyTaxRate(int castleId, int tax) {
        modifyTaxRate(castleId, tax, null);
    }

    /**
     * Command: interior.taxation
     * Response: CommandResponse
     */
    public void taxation(int castleId, int typeId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _taxation_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("typeId", typeId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(TAXATION, aso));
        }

    }

    /**
     * Command: interior.taxation
     * Response: CommandResponse
     */
    public void taxation(int castleId, int typeId) {
        taxation(castleId, typeId, null);
    }

    /**
     * Command: interior.getResourceProduceData
     * Response: ResourceProduceDataResponse
     */
    public void getResourceProduceData(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getResourceProduceData_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_RESOURCE_PRODUCE_DATA, aso));
        }

    }

    /**
     * Command: interior.getResourceProduceData
     * Response: ResourceProduceDataResponse
     */
    public void getResourceProduceData(int castleId) {
        getResourceProduceData(castleId, null);
    }

    /**
     * Command: interior.modifyCommenceRate
     * Response: CommandResponse
     */
    public void modifyCommenceRate(int castleId, int foodrate, int woodrate, int stonerate, int ironrate, Method callbackMethod) {
        ASObject aso = new ASObject();

        _modifyCommenceRate_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("foodrate", foodrate);
        aso.put("woodrate", woodrate);
        aso.put("stonerate", stonerate);
        aso.put("ironrate", ironrate);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MODIFY_COMMENCE_RATE, aso));
        }

    }

    /**
     * Command: interior.modifyCommenceRate
     * Response: CommandResponse
     */
    public void modifyCommenceRate(int castleId, int foodrate, int woodrate, int stonerate, int ironrate) {
        modifyCommenceRate(castleId, foodrate, woodrate, stonerate, ironrate, null);
    }

    /**
     * Command: interior.pacifyPeople
     * Response: CommandResponse
     */
    public void pacifyPeople(int castleId, int typeId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _pacifyPeople_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("typeId", typeId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(PACIFY_PEOPLE, aso));
        }

    }

    /**
     * Command: interior.pacifyPeople
     * Response: CommandResponse
     */
    public void pacifyPeople(int castleId, int typeId) {
        pacifyPeople(castleId, typeId, null);
    }
}
