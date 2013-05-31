package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Implements all commands that can be used on a field (non castle.)
 * **** Might not be correct ****
 */
public class FieldCommand extends AbstractCommand implements IFieldCommand {
    public Method _getCastleFieldInfo_callback = null;
    public Method _giveUpField_callback = null;
    public Method _getOtherFieldInfo_callback = null;

    /**
     * Command: field.giveUpField
     * Response: CommandResponse
     */
    public void giveUpField(int fieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _giveUpField_callback = callbackMethod;

        aso.put("fieldId", fieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GIVE_UP_FIELD, aso));
        }

    }

    /**
     * Command: field.giveUpField
     * Response: CommandResponse
     */
    public void giveUpField(int fieldId) {
        giveUpField(fieldId, null);
    }

    /**
     * Command: field.getCastleFieldInfo
     * Response: CastleFieldInfoResponse
     */
    public void getCastleFieldInfo(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCastleFieldInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_CASTLE_FIELD_INFO, aso));
        }

    }

    /**
     * Command: field.getCastleFieldInfo
     * Response: CastleFieldInfoResponse
     */
    public void getCastleFieldInfo(int castleId) {
        getCastleFieldInfo(castleId, null);
    }

    /**
     * Command: field.getOtherFieldInfo
     * Response: OtherFieldInfoResponse
     */
    public void getOtherFieldInfo(int castleId, int fieldId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getOtherFieldInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("fieldId", fieldId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_OTHER_FIELD_INFO, aso));
        }

    }

    /**
     * Command: field.getOtherFieldInfo
     * Response: OtherFieldInfoResponse
     */
    public void getOtherFieldInfo(int castleId, int fieldId) {
        getOtherFieldInfo(castleId, fieldId, null);
    }
}
