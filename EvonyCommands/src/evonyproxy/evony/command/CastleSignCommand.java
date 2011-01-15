package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class CastleSignCommand extends AbstractCommand implements ICastleSignCommand {
    public Method _saveCastleSignList_callback = null;
    public Method _deleteCastleSign_callback = null;

    /**
     * Command: castle.deleteCastleSign
     * Response: CastleSignResponse
     */
    public void deleteCastleSign(int id, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteCastleSign_callback = callbackMethod;

        aso.put("id", id);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_CASTLE_SIGN, aso));
        }

    }

    /**
     * Command: castle.deleteCastleSign
     * Response: CastleSignResponse
     */
    public void deleteCastleSign(int id) {
        deleteCastleSign(id, null);
    }

    /**
     * Command: castle.saveCastleSignList
     * Response: CastleSignResponse
     */
    public void saveCastleSignList(int id, int x, int y, Method callbackMethod) {
        ASObject aso = new ASObject();

        _saveCastleSignList_callback = callbackMethod;

        aso.put("id", id);
        aso.put("x", x);
        aso.put("y", y);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SAVE_CASTLE_SIGN_LIST, aso));
        }

    }

    /**
     * Command: castle.saveCastleSignList
     * Response: CastleSignResponse
     */
    public void saveCastleSignList(int id, int x, int y) {
        saveCastleSignList(id, x, y, null);
    }
}
