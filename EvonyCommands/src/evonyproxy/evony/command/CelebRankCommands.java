package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Implements all commands used to query a players rank.
 */
public class CelebRankCommands extends AbstractCommand implements ICelebRankCommands {
    public Method _findPlayerByPrestige_callback = null;
    public Method _findAllianceByPrestige_callback = null;
    public Method _findPlayerByTitle_callback = null;

    /**
     * Command: celeb.findPlayerByTitle
     * Response: CelebResponse
     */
    public void findPlayerByTitle(String title, Method callbackMethod) {
        ASObject aso = new ASObject();

        _findPlayerByTitle_callback = callbackMethod;

        aso.put("title", title);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(FIND_PLAYER_BY_TITLE, aso));
        }

    }

    /**
     * Command: celeb.findPlayerByTitle
     * Response: CelebResponse
     */
    public void findPlayerByTitle(String title) {
        findPlayerByTitle(title, null);
    }

    /**
     * Command: celeb.findAllianceByPrestige
     * Response: CelebResponse
     */
    public void findAllianceByPrestige(String prestige, Method callbackMethod) {
        ASObject aso = new ASObject();

        _findAllianceByPrestige_callback = callbackMethod;

        aso.put("prestige", prestige);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(FIND_ALLIANCE_BY_PRESTIGE, aso));
        }

    }

    /**
     * Command: celeb.findAllianceByPrestige
     * Response: CelebResponse
     */
    public void findAllianceByPrestige(String prestige) {
        findAllianceByPrestige(prestige, null);
    }

    /**
     * Command: celeb.findPlayerByPrestige
     * Response: CelebResponse
     */
    public void findPlayerByPrestige(String prestige, Method callbackMethod) {
        ASObject aso = new ASObject();

        _findPlayerByPrestige_callback = callbackMethod;

        aso.put("prestige", prestige);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(FIND_PLAYER_BY_PRESTIGE, aso));
        }

    }

    /**
     * Command: celeb.findPlayerByPrestige
     * Response: CelebResponse
     */
    public void findPlayerByPrestige(String prestige) {
        findPlayerByPrestige(prestige, null);
    }
}
