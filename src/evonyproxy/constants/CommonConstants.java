/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.constants;

/**
 * @version .02
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public interface CommonConstants {

    /**
     * cmd
     */
    public static final String PARAM_COMMAND = "cmd";

    /**
     * login
     */
    public static final String LOGIN_CMD = "login";

    /**
     * pwd
     */
    public static final String LOGIN_PARAM_PASSWORD = "pwd";

    /**
     * email
     */
    public static final String LOGIN_PARAM_EMAIL = "email";

    /**
     * user
     */
    public static final String LOGIN_PARAM_USER = "user";

    /**
     * login.sso
     */
    public static final String LOGIN_SSO_CMD = "login.sso";

    /**
     * username
     */
    public static final String LOGIN_SSO_PARAM_USER = "username";

    /**
     * subtime
     */
    public static final String LOGIN_SSO_PARAM_TIMESTAMP = "subtime";

    /**
     * login.sso.param
     */
    public static final String LOGIN_SSO_PARAM = "login.sso.param";

    /**
     * sex
     */
    public static final String LOGIN_SSO_PARAM_SEX = "sex";

    /**
     * email
     */
    public static final String LOGIN_SSO_PARAM_EMAIL = "email";

    /**
     * king
     */
    public static final String LOGIN_SSO_PARAM_KING = "king";

    /**
     * pwd
     */
    public static final String LOGIN_SSO_PARAM_PASSWORD = "pwd";

    /**
     * 60000
     */
    public static final Number LOGIN_SSO_TIMEOUT = 60000;

    /**
     * ??
     */
    public static final String ITEM_TYPE_PACKET = "??";

    /**
     * ??
     */
    public static final String ITEM_TYPE_RESOURCE = "??";

    /**
     * food
     */
    public static final String ITEM_FOOD_ID = "food";

    /**
     * wood
     */
    public static final String ITEM_WOOD_ID = "wood";

    /**
     * stone
     */
    public static final String ITEM_STONE_ID = "stone";

    /**
     * iron
     */
    public static final String ITEM_IRON_ID = "iron";

    /**
     * gold
     */
    public static final String ITEM_GOLD_ID = "gold";

    /**
     * money
     */
    public static final String ITEM_MEDAL_ID = "money";

    /**
     * player.box.troop.1
     */
    public static final String ITEM_BOX_TROOP_100W = "player.box.troop.1";

    /**
     * player.box.gambling
     */
    public static final String ITEM_FOR_GAMBLING_BOX = "player.box.gambling.";

    /**
     * player.box.resource.1
     */
    public static final String ITEM_BOX_RESOURCE_100W = "player.box.resource.1";

    /**
     * ??
     */
    public static final String ITEM_TYPE_MEDAL = "??";

    /**
     * hero.reset.1
     */
    public static final String ITEM_FOR_RESET_HERO_POINT = "hero.reset.1";

    /**
     * ??
     */
    public static final String ITEM_TYPE_TREASURE = "??";

    /**
     * ??
     */
    public static final String ITEM_TYPE_SPEEDUP = "??";

    /**
     * zone
     */
    public static final String CHAT_CHANNEL_ZONE = "zone";

    /**
     * alliance
     */
    public static final String CHAT_CHANNEL_ALLIANCE = "alliance";

    /**
     * beginner
     */
    public static final String CHAT_CHANNEL_BEGINNER = "beginner";

    /**
     * trade
     */
    public static final String CHAT_CHANNEL_TRADE = "trade";

    /**
     * world
     */
    public static final String CHAT_CHANNEL_WORLD = "world";

    /**
     * 500
     */
    public static final int MAX_CHAT_MSG_LENGTH = 500;

    /**
     * consume.1.a
     */
    public static final String WORLD_CHAT_NEET_ITEM = "consume.1.a";

    /**
     * coins.speed
     */
    public static final String COINS_SPEED_ITEM_ID = "coins.speed";

    /**
     * free.speed
     */
    public static final String FREE_SPEED_ITEM_ID = "free.speed";

    /**
     * 300
     */
    public static final int FREE_SPEED_TIME_LIMIT = 300;

    /**
     * 10
     */
    public static final int MAX_TITLE_LEVEL = 10;

    /**
     * 150
     */
    public static final int CIVONY_NO_SENDER_MSG_MIN_VALUE = 150;

    /**
     * 60000
     */
    public static final int UNIT_DISTANCE = 60000;

    /**
     * 150
     */
    public static final int CIVONY_TV_MSG_MIN_VALUE = 150;

    /**
     * 24
     */
    public static final int CIVONY_TV_MSG_MAX_LIVE_HOUR = 24;

    /**
     * player.destroy.1.a
     */
    public static final String DESTROY_BUILDING_ITEM_IMMEDIATELY = "player.destroy.1.a";

    /**
     * 0
     */
    public static final int UPDATE_TYPE_ADD = 0;

    /**
     * 1
     */
    public static final int UPDATE_TYPE_DELETE = 1;

    /**
     * 7
     */
    public static final int FRESH_PLAYER_DAY_MAX = 7;

    /**
     * 2
     */
    public static final int UPDATE_TYPE_UPDATE = 2;

    /**
     * 2
     */
    public static final int MEDAL_CHANGED_REASON_BUY_RES = 2;

    /**
     * 5
     */
    public static final int MEDAL_CHANGED_REASON_BECOMERICH = 5;

    /**
     * 6
     */
    public static final int MEDAL_CHANGED_REASON_USE_ITEM = 6;

    /**
     * 9
     */
    public static final int MEDAL_CHANGED_REASON_OTHER = 9;

    /**
     * 1
     */
    public static final int MEDAL_CHANGED_REASON_INTIT = 1;

    /**
     * 3
     */
    public static final int MEDAL_CHANGED_REASON_BUY_ITEM = 3;

    /**
     * 4
     */
    public static final int MEDAL_CHANGED_REASON_BECOMEPOOR = 4;

    /**
     * 7
     */
    public static final int MEDAL_CHANGED_REASON_SEND_MEDAL = 7;

    /**
     * 8
     */
    public static final int MEDAL_CHANGED_REASON_AWARD_MEDAL = 8;

    /**
     * register
     */
    public static final String REGISTER = "register";

    /**
     * king
     */
    public static final String REGIST_KING_NAME = "king";
}
