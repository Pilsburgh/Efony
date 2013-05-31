package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class NpcHeroCommand extends AbstractCommand implements INpcHeroCommand {
    public Method _getNpcHerosList_callback = null;
    public Method _getNpcHerosListByMoney_callback = null;
    public Method _getNpcHerosListByFilter_callback = null;
    public Method _getNpcHeroInfroByID_callback = null;

    /**
     * Command: npchero.getNpcHeroInfroByID
     * Response: NpcHeroListResponse
     */
    public void getNpcHeroInfroByID(int npcid, int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getNpcHeroInfroByID_callback = callbackMethod;

        aso.put("npcid", npcid);
        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_NPC_HERO_INFRO_BY_ID, aso));
        }

    }

    /**
     * Command: npchero.getNpcHeroInfroByID
     * Response: NpcHeroListResponse
     */
    public void getNpcHeroInfroByID(int npcid, int castleId) {
        getNpcHeroInfroByID(npcid, castleId, null);
    }

    /**
     * Command: npchero.getNpcHerosList
     * Response: NpcHeroListResponse
     */
    public void getNpcHerosList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getNpcHerosList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_NPC_HEROS_LIST, aso));
        }

    }

    /**
     * Command: npchero.getNpcHerosList
     * Response: NpcHeroListResponse
     */
    public void getNpcHerosList(int castleId) {
        getNpcHerosList(castleId, null);
    }

    /**
     * Command: npchero.getNpcHerosListByFilter
     * Response: NpcHeroListResponse
     */
    public void getNpcHerosListByFilter(String filter, int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getNpcHerosListByFilter_callback = callbackMethod;

        aso.put("filter", filter);
        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_NPC_HEROS_LIST_BY_FILTER, aso));
        }

    }

    /**
     * Command: npchero.getNpcHerosListByFilter
     * Response: NpcHeroListResponse
     */
    public void getNpcHerosListByFilter(String filter, int castleId) {
        getNpcHerosListByFilter(filter, castleId, null);
    }

    /**
     * Command: npchero.getNpcHerosListByMoney
     * Response: NpcHeroListResponse
     */
    public void getNpcHerosListByMoney(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getNpcHerosListByMoney_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_NPC_HEROS_LIST_BY_MONEY, aso));
        }

    }

    /**
     * Command: npchero.getNpcHerosListByMoney
     * Response: NpcHeroListResponse
     */
    public void getNpcHerosListByMoney(int castleId) {
        getNpcHerosListByMoney(castleId, null);
    }
}
