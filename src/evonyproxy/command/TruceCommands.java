package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class TruceCommands extends AbstractCommand implements ITruceCommands {
    public Method _setDreamTruce_callback = null;
    public Method _changeDreamTruceTime_callback = null;
    public Method _cancelDreamTruce_callback = null;

    /**
     * Command: truce.cancelDreamTruce
     * Response: CommandResponse
     */
    public void cancelDreamTruce(String password, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelDreamTruce_callback = callbackMethod;

        aso.put("password", password);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_DREAM_TRUCE, aso));
        }

    }

    /**
     * Command: truce.cancelDreamTruce
     * Response: CommandResponse
     */
    public void cancelDreamTruce(String password) {
        cancelDreamTruce(password, null);
    }

    /**
     * Command: truce.changeDreamTruceTime
     * Response: CommandResponse
     */
    public void changeDreamTruceTime(int hour, int minute, int second, String password, Method callbackMethod) {
        ASObject aso = new ASObject();

        _changeDreamTruceTime_callback = callbackMethod;

        aso.put("hour", hour);
        aso.put("minute", minute);
        aso.put("second", second);
        aso.put("password", password);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHANGE_DREAM_TRUCE_TIME, aso));
        }

    }

    /**
     * Command: truce.changeDreamTruceTime
     * Response: CommandResponse
     */
    public void changeDreamTruceTime(int hour, int minute, int second, String password) {
        changeDreamTruceTime(hour, minute, second, password, null);
    }

    /**
     * Command: truce.setDreamTruce
     * Response: CommandResponse
     */
    public void setDreamTruce(int hour, int minute, int second, String password, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setDreamTruce_callback = callbackMethod;

        aso.put("hour", hour);
        aso.put("minute", minute);
        aso.put("second", second);
        aso.put("password", password);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_DREAM_TRUCE, aso));
        }

    }

    /**
     * Command: truce.setDreamTruce
     * Response: CommandResponse
     */
    public void setDreamTruce(int hour, int minute, int second, String password) {
        setDreamTruce(hour, minute, second, password, null);
    }
}
