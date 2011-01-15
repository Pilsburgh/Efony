package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class StratagemCommands extends AbstractCommand implements IStratagemCommands {
    public Method _useStratagem_callback = null;

    /**
     * Command: stratagem.useStratagem
     * Response: CommandResponse
     */
    public void useStratagem(int castleId, int heroId, String straId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _useStratagem_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        aso.put("straId", straId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(USE_STRATAGEM, aso));
        }

    }

    /**
     * Command: stratagem.useStratagem
     * Response: CommandResponse
     */
    public void useStratagem(int castleId, int heroId, String straId) {
        useStratagem(castleId, heroId, straId, null);
    }
}
