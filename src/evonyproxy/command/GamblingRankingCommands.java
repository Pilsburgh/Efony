package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class GamblingRankingCommands extends AbstractCommand implements IGamblingRankingCommands {
    public Method _getGamblingRankingReward_callback = null;
    public Method _getGamblingRankingYesterday_callback = null;
    public Method _getGamblingRankingToday_callback = null;

    /**
     * Command: gamblingranking.getGamblingRankingToday
     * Response: GamblingRankingRespone
     */
    public void getGamblingRankingToday(int pageNo, int pageSize, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getGamblingRankingToday_callback = callbackMethod;

        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_GAMBLING_RANKING_TODAY, aso));
        }

    }

    /**
     * Command: gamblingranking.getGamblingRankingToday
     * Response: GamblingRankingRespone
     */
    public void getGamblingRankingToday(int pageNo, int pageSize) {
        getGamblingRankingToday(pageNo, pageSize, null);
    }

    /**
     * Command: gamblingranking.getGamblingRankingYesterday
     * Response: GamblingRankingRespone
     */
    public void getGamblingRankingYesterday(int pageNo, int pageSize, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getGamblingRankingYesterday_callback = callbackMethod;

        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_GAMBLING_RANKING_YESTERDAY, aso));
        }

    }

    /**
     * Command: gamblingranking.getGamblingRankingYesterday
     * Response: GamblingRankingRespone
     */
    public void getGamblingRankingYesterday(int pageNo, int pageSize) {
        getGamblingRankingYesterday(pageNo, pageSize, null);
    }

    /**
     * Command: gamblingranking.getGamblingRankingReward
     * Response: GamblingRankingRewardRespone
     */
    public void getGamblingRankingReward(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getGamblingRankingReward_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_GAMBLING_RANKING_REWARD, aso));
        }

    }

    /**
     * Command: gamblingranking.getGamblingRankingReward
     * Response: GamblingRankingRewardRespone
     */
    public void getGamblingRankingReward() {
        getGamblingRankingReward(null);
    }
}
