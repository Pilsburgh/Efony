package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class ShopCommands extends AbstractCommand implements IShopCommands {
    public Method _useTrickItem_callback = null;
    public Method _useCastleGoods_callback = null;
    public Method _buyResource_callback = null;
    public Method _getBuyResourceInfo_callback = null;
    public Method _Gem_Smelting_callback = null;
    public Method _useGoods_callback = null;
    public Method _buy_callback = null;

    /**
     * Command: shop.buy
     * Response: CommandResponse
     */
    public void buy(String itemId, int amount, Method callbackMethod) {
        ASObject aso = new ASObject();

        _buy_callback = callbackMethod;

        aso.put("itemId", itemId);
        aso.put("amount", amount);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(BUY, aso));
        }

    }

    /**
     * Command: shop.buy
     * Response: CommandResponse
     */
    public void buy(String itemId, int amount) {
        buy(itemId, amount, null);
    }

    /**
     * Command: shop.getBuyResourceInfo
     * Response: BuyResourceInfoResponse
     */
    public void getBuyResourceInfo(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getBuyResourceInfo_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_BUY_RESOURCE_INFO, aso));
        }

    }

    /**
     * Command: shop.getBuyResourceInfo
     * Response: BuyResourceInfoResponse
     */
    public void getBuyResourceInfo(int castleId) {
        getBuyResourceInfo(castleId, null);
    }

    /**
     * Command: shop.useGoods
     * Response: UseItemResultResponse
     */
    public void useGoods(int castleId, String itemId, int num, Method callbackMethod) {
        ASObject aso = new ASObject();

        _useGoods_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("itemId", itemId);
        aso.put("num", num);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(USE_GOODS, aso));
        }

    }

    /**
     * Command: shop.useGoods
     * Response: UseItemResultResponse
     */
    public void useGoods(int castleId, String itemId, int num) {
        useGoods(castleId, itemId, num, null);
    }

    /**
     * Command: shop.Gem_Smelting
     * Response: CommandResponse
     */
    public void Gem_Smelting(String itemId, String bookitemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _Gem_Smelting_callback = callbackMethod;

        aso.put("itemId", itemId);
        aso.put("bookitemId", bookitemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GEM__SMELTING, aso));
        }

    }

    /**
     * Command: shop.Gem_Smelting
     * Response: CommandResponse
     */
    public void Gem_Smelting(String itemId, String bookitemId) {
        Gem_Smelting(itemId, bookitemId, null);
    }

    /**
     * Command: shop.buyResource
     * Response: CommandResponse
     */
    public void buyResource(int castleId, int foodUse, int woodUse, int ironUse, int stoneUse, Method callbackMethod) {
        ASObject aso = new ASObject();

        _buyResource_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("foodUse", foodUse);
        aso.put("woodUse", woodUse);
        aso.put("ironUse", ironUse);
        aso.put("stoneUse", stoneUse);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(BUY_RESOURCE, aso));
        }

    }

    /**
     * Command: shop.buyResource
     * Response: CommandResponse
     */
    public void buyResource(int castleId, int foodUse, int woodUse, int ironUse, int stoneUse) {
        buyResource(castleId, foodUse, woodUse, ironUse, stoneUse, null);
    }

    /**
     * Command: shop.useCastleGoods
     * Response: CommandResponse
     */
    public void useCastleGoods(int castleId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _useCastleGoods_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(USE_CASTLE_GOODS, aso));
        }

    }

    /**
     * Command: shop.useCastleGoods
     * Response: CommandResponse
     */
    public void useCastleGoods(int castleId, String itemId) {
        useCastleGoods(castleId, itemId, null);
    }

    /**
     * Command: shop.useTrickItem
     * Response: CommandResponse
     */
    public void useTrickItem(int castleId, int armyid, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _useTrickItem_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("armyid", armyid);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(USE_TRICK_ITEM, aso));
        }

    }

    /**
     * Command: shop.useTrickItem
     * Response: CommandResponse
     */
    public void useTrickItem(int castleId, int armyid, String itemId) {
        useTrickItem(castleId, armyid, itemId, null);
    }
}
