package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class FurloughCommands extends AbstractCommand implements IFurloughCommands {
    public Method _cancelFurlought_callback = null;
    public Method _isFurlought_callback = null;

    /**
     * Command: furlough.isFurlought
     * Response: FurloughResponse
     */
    public void isFurlought(int playerId, int day, String password, Boolean isAutoFurlough, Method callbackMethod) {
        ASObject aso = new ASObject();

        _isFurlought_callback = callbackMethod;

        aso.put("playerId", playerId);
        aso.put("day", day);
        aso.put("password", password);
        aso.put("isAutoFurlough", isAutoFurlough);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(IS_FURLOUGHT, aso));
        }

    }

    /**
     * Command: furlough.isFurlought
     * Response: FurloughResponse
     */
    public void isFurlought(int playerId, int day, String password, Boolean isAutoFurlough) {
        isFurlought(playerId, day, password, isAutoFurlough, null);
    }

    /**
     * Command: furlough.cancelFurlought
     * Response: FurloughResponse
     */
    public void cancelFurlought(int playerId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelFurlought_callback = callbackMethod;

        aso.put("playerId", playerId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_FURLOUGHT, aso));
        }

    }

    /**
     * Command: furlough.cancelFurlought
     * Response: FurloughResponse
     */
    public void cancelFurlought(int playerId) {
        cancelFurlought(playerId, null);
    }
}
