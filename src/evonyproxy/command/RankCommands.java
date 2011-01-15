package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class RankCommands extends AbstractCommand implements IRankCommands {
    public Method _getPlayerRank_callback = null;
    public Method _getHeroRank_callback = null;
    public Method _getCastleRank_callback = null;
    public Method _getAllianceRank_callback = null;

    /**
     * Command: rank.getPlayerRank
     * Response: RankPlayerResponse
     */
    public void getPlayerRank(String key, int pageNo, int pageSize, int sortType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getPlayerRank_callback = callbackMethod;

        aso.put("key", key);
        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        aso.put("sortType", sortType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_PLAYER_RANK, aso));
        }

    }

    /**
     * Command: rank.getPlayerRank
     * Response: RankPlayerResponse
     */
    public void getPlayerRank(String key, int pageNo, int pageSize, int sortType) {
        getPlayerRank(key, pageNo, pageSize, sortType, null);
    }

    /**
     * Command: rank.getAllianceRank
     * Response: RankAllianceResponse
     */
    public void getAllianceRank(String key, int pageNo, int pageSize, int sortType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceRank_callback = callbackMethod;

        aso.put("key", key);
        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        aso.put("sortType", sortType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_RANK, aso));
        }

    }

    /**
     * Command: rank.getAllianceRank
     * Response: RankAllianceResponse
     */
    public void getAllianceRank(String key, int pageNo, int pageSize, int sortType) {
        getAllianceRank(key, pageNo, pageSize, sortType, null);
    }

    /**
     * Command: rank.getCastleRank
     * Response: RankCastleResponse
     */
    public void getCastleRank(String key, int pageNo, int pageSize, int sortType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getCastleRank_callback = callbackMethod;

        aso.put("key", key);
        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        aso.put("sortType", sortType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_CASTLE_RANK, aso));
        }

    }

    /**
     * Command: rank.getCastleRank
     * Response: RankCastleResponse
     */
    public void getCastleRank(String key, int pageNo, int pageSize, int sortType) {
        getCastleRank(key, pageNo, pageSize, sortType, null);
    }

    /**
     * Command: rank.getHeroRank
     * Response: RankHeroResponse
     */
    public void getHeroRank(String key, int pageNo, int pageSize, int sortType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getHeroRank_callback = callbackMethod;

        aso.put("key", key);
        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        aso.put("sortType", sortType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_HERO_RANK, aso));
        }

    }

    /**
     * Command: rank.getHeroRank
     * Response: RankHeroResponse
     */
    public void getHeroRank(String key, int pageNo, int pageSize, int sortType) {
        getHeroRank(key, pageNo, pageSize, sortType, null);
    }
}
