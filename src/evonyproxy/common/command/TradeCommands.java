package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class TradeCommands extends AbstractCommand implements ITradeCommands {
    public Method _newTrade_callback = null;
    public Method _getMyTradeList_callback = null;
    public Method _searchTrades_callback = null;
    public Method _getTransingTradeList_callback = null;
    public Method _cancelTrade_callback = null;
    public Method _speedUpTrans_callback = null;

    /**
     * Command: trade.getMyTradeList
     * Response: TradeListResponse
     */
    public void getMyTradeList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getMyTradeList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_MY_TRADE_LIST, aso));
        }

    }

    /**
     * Command: trade.getMyTradeList
     * Response: TradeListResponse
     */
    public void getMyTradeList(int castleId) {
        getMyTradeList(castleId, null);
    }

    /**
     * Command: trade.newTrade
     * Response: CommandResponse
     */
    public void newTrade(int castleId, int resType, int tradeType, int amount, String price, Method callbackMethod) {
        ASObject aso = new ASObject();

        _newTrade_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("resType", resType);
        aso.put("tradeType", tradeType);
        aso.put("amount", amount);
        aso.put("price", price);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(NEW_TRADE, aso));
        }

    }

    /**
     * Command: trade.newTrade
     * Response: CommandResponse
     */
    public void newTrade(int castleId, int resType, int tradeType, int amount, String price) {
        newTrade(castleId, resType, tradeType, amount, price, null);
    }

    /**
     * Command: trade.cancelTrade
     * Response: CommandResponse
     */
    public void cancelTrade(int castleId, int tradeId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _cancelTrade_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("tradeId", tradeId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CANCEL_TRADE, aso));
        }

    }

    /**
     * Command: trade.cancelTrade
     * Response: CommandResponse
     */
    public void cancelTrade(int castleId, int tradeId) {
        cancelTrade(castleId, tradeId, null);
    }

    /**
     * Command: trade.speedUpTrans
     * Response: CommandResponse
     */
    public void speedUpTrans(int castleId, int transingTradeId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _speedUpTrans_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("transingTradeId", transingTradeId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SPEED_UP_TRANS, aso));
        }

    }

    /**
     * Command: trade.speedUpTrans
     * Response: CommandResponse
     */
    public void speedUpTrans(int castleId, int transingTradeId, String itemId) {
        speedUpTrans(castleId, transingTradeId, itemId, null);
    }

    /**
     * Command: trade.searchTrades
     * Response: SearchTradesResponse
     */
    public void searchTrades(int resType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _searchTrades_callback = callbackMethod;

        aso.put("resType", resType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SEARCH_TRADES, aso));
        }

    }

    /**
     * Command: trade.searchTrades
     * Response: SearchTradesResponse
     */
    public void searchTrades(int resType) {
        searchTrades(resType, null);
    }

    /**
     * Command: trade.getTransingTradeList
     * Response: TransingTradeListResponse
     */
    public void getTransingTradeList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getTransingTradeList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_TRANSING_TRADE_LIST, aso));
        }

    }

    /**
     * Command: trade.getTransingTradeList
     * Response: TransingTradeListResponse
     */
    public void getTransingTradeList(int castleId) {
        getTransingTradeList(castleId, null);
    }
}
