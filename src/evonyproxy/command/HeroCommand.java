package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class HeroCommand extends AbstractCommand implements IHeroCommand {
    public Method _releaseHero_callback = null;
    public Method _awardGold_callback = null;
    public Method _useItem_callback = null;
    public Method _ShowPlayerHerosByUserName_callback = null;
    public Method _callBackHero_callback = null;
    public Method _tryGetSeizedHero_callback = null;
    public Method _addPoint_callback = null;
    public Method _dischargeChief_callback = null;
    public Method _levelUp_callback = null;
    public Method _resetPoint_callback = null;
    public Method _getHerosListFromTavern_callback = null;
    public Method _setHeroFacebookId_callback = null;
    public Method _refreshHerosListFromTavern_callback = null;
    public Method _fireHero_callback = null;
    public Method _getFleeHeroList_callback = null;
    public Method _hireHero_callback = null;
    public Method _SetShowHeroId_callback = null;
    public Method _recruitFleeHero_callback = null;
    public Method _changeName_callback = null;
    public Method _promoteToChief_callback = null;

    /**
     * Command: hero.refreshHerosListFromTavern
     * Response: HeroListResponse
     */
    public void refreshHerosListFromTavern(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _refreshHerosListFromTavern_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REFRESH_HEROS_LIST_FROM_TAVERN, aso));
        }

    }

    /**
     * Command: hero.refreshHerosListFromTavern
     * Response: HeroListResponse
     */
    public void refreshHerosListFromTavern(int castleId) {
        refreshHerosListFromTavern(castleId, null);
    }

    /**
     * Command: hero.resetPoint
     * Response: CommandResponse
     */
    public void resetPoint(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _resetPoint_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RESET_POINT, aso));
        }

    }

    /**
     * Command: hero.resetPoint
     * Response: CommandResponse
     */
    public void resetPoint(int castleId, int heroId) {
        resetPoint(castleId, heroId, null);
    }

    /**
     * Command: hero.getHerosListFromTavern
     * Response: HeroListResponse
     */
    public void getHerosListFromTavern(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getHerosListFromTavern_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_HEROS_LIST_FROM_TAVERN, aso));
        }

    }

    /**
     * Command: hero.getHerosListFromTavern
     * Response: HeroListResponse
     */
    public void getHerosListFromTavern(int castleId) {
        getHerosListFromTavern(castleId, null);
    }

    /**
     * Command: hero.hireHero
     * Response: CommandResponse
     */
    public void hireHero(int castleId, String heroName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _hireHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroName", heroName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(HIRE_HERO, aso));
        }

    }

    /**
     * Command: hero.hireHero
     * Response: CommandResponse
     */
    public void hireHero(int castleId, String heroName) {
        hireHero(castleId, heroName, null);
    }

    /**
     * Command: hero.releaseHero
     * Response: CommandResponse
     */
    public void releaseHero(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _releaseHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RELEASE_HERO, aso));
        }

    }

    /**
     * Command: hero.releaseHero
     * Response: CommandResponse
     */
    public void releaseHero(int castleId, int heroId) {
        releaseHero(castleId, heroId, null);
    }

    /**
     * Command: hero.dischargeChief
     * Response: CommandResponse
     */
    public void dischargeChief(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _dischargeChief_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DISCHARGE_CHIEF, aso));
        }

    }

    /**
     * Command: hero.dischargeChief
     * Response: CommandResponse
     */
    public void dischargeChief(int castleId) {
        dischargeChief(castleId, null);
    }

    /**
     * Command: hero.promoteToChief
     * Response: CommandResponse
     */
    public void promoteToChief(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _promoteToChief_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(PROMOTE_TO_CHIEF, aso));
        }

    }

    /**
     * Command: hero.promoteToChief
     * Response: CommandResponse
     */
    public void promoteToChief(int castleId, int heroId) {
        promoteToChief(castleId, heroId, null);
    }

    /**
     * Command: hero.getFleeHeroList
     * Response: HeroListResponse
     */
    public void getFleeHeroList(int castleId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getFleeHeroList_callback = callbackMethod;

        aso.put("castleId", castleId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_FLEE_HERO_LIST, aso));
        }

    }

    /**
     * Command: hero.getFleeHeroList
     * Response: HeroListResponse
     */
    public void getFleeHeroList(int castleId) {
        getFleeHeroList(castleId, null);
    }

    /**
     * Command: hero.useItem
     * Response: CommandResponse
     */
    public void useItem(int castleId, int heroId, String itemId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _useItem_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        aso.put("itemId", itemId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(USE_ITEM, aso));
        }

    }

    /**
     * Command: hero.useItem
     * Response: CommandResponse
     */
    public void useItem(int castleId, int heroId, String itemId) {
        useItem(castleId, heroId, itemId, null);
    }

    /**
     * Command: hero.levelUp
     * Response: CommandResponse
     */
    public void levelUp(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _levelUp_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(LEVEL_UP, aso));
        }

    }

    /**
     * Command: hero.levelUp
     * Response: CommandResponse
     */
    public void levelUp(int castleId, int heroId) {
        levelUp(castleId, heroId, null);
    }

    /**
     * Command: hero.ShowPlayerHerosByUserName
     * Response: HeroListResponse
     */
    public void ShowPlayerHerosByUserName(String UserName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _ShowPlayerHerosByUserName_callback = callbackMethod;

        aso.put("UserName", UserName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SHOW_PLAYER_HEROS_BY_USER_NAME, aso));
        }

    }

    /**
     * Command: hero.ShowPlayerHerosByUserName
     * Response: HeroListResponse
     */
    public void ShowPlayerHerosByUserName(String UserName) {
        ShowPlayerHerosByUserName(UserName, null);
    }

    /**
     * Command: hero.fireHero
     * Response: CommandResponse
     */
    public void fireHero(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _fireHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(FIRE_HERO, aso));
        }

    }

    /**
     * Command: hero.fireHero
     * Response: CommandResponse
     */
    public void fireHero(int castleId, int heroId) {
        fireHero(castleId, heroId, null);
    }

    /**
     * Command: hero.changeName
     * Response: CommandResponse
     */
    public void changeName(int castleId, int heroId, String newName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _changeName_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        aso.put("newName", newName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CHANGE_NAME, aso));
        }

    }

    /**
     * Command: hero.changeName
     * Response: CommandResponse
     */
    public void changeName(int castleId, int heroId, String newName) {
        changeName(castleId, heroId, newName, null);
    }

    /**
     * Command: hero.awardGold
     * Response: CommandResponse
     */
    public void awardGold(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _awardGold_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(AWARD_GOLD, aso));
        }

    }

    /**
     * Command: hero.awardGold
     * Response: CommandResponse
     */
    public void awardGold(int castleId, int heroId) {
        awardGold(castleId, heroId, null);
    }

    /**
     * Command: hero.setHeroFacebookId
     * Response: CommandResponse
     */
    public void setHeroFacebookId(int param1, int heroId, String facebookId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setHeroFacebookId_callback = callbackMethod;

        aso.put("param1", param1);
        aso.put("heroId", heroId);
        aso.put("facebookId", facebookId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_HERO_FACEBOOK_ID, aso));
        }

    }

    /**
     * Command: hero.setHeroFacebookId
     * Response: CommandResponse
     */
    public void setHeroFacebookId(int param1, int heroId, String facebookId) {
        setHeroFacebookId(param1, heroId, facebookId, null);
    }

    /**
     * Command: hero.recruitFleeHero
     * Response: CommandResponse
     */
    public void recruitFleeHero(int castleId, String heroName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _recruitFleeHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroName", heroName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RECRUIT_FLEE_HERO, aso));
        }

    }

    /**
     * Command: hero.recruitFleeHero
     * Response: CommandResponse
     */
    public void recruitFleeHero(int castleId, String heroName) {
        recruitFleeHero(castleId, heroName, null);
    }

    /**
     * Command: hero.addPoint
     * Response: CommandResponse
     */
    public void addPoint(int castleId, int heroId, int management, int power, int stratagem, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addPoint_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        aso.put("management", management);
        aso.put("power", power);
        aso.put("stratagem", stratagem);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_POINT, aso));
        }

    }

    /**
     * Command: hero.addPoint
     * Response: CommandResponse
     */
    public void addPoint(int castleId, int heroId, int management, int power, int stratagem) {
        addPoint(castleId, heroId, management, power, stratagem, null);
    }

    /**
     * Command: hero.SetShowHeroId
     * Response: SetShowInfroResponse
     */
    public void SetShowHeroId(int heroid, Boolean bAddOrDel, Method callbackMethod) {
        ASObject aso = new ASObject();

        _SetShowHeroId_callback = callbackMethod;

        aso.put("heroid", heroid);
        aso.put("bAddOrDel", bAddOrDel);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_SHOW_HERO_ID, aso));
        }

    }

    /**
     * Command: hero.SetShowHeroId
     * Response: SetShowInfroResponse
     */
    public void SetShowHeroId(int heroid, Boolean bAddOrDel) {
        SetShowHeroId(heroid, bAddOrDel, null);
    }

    /**
     * Command: hero.tryGetSeizedHero
     * Response: CommandResponse
     */
    public void tryGetSeizedHero(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _tryGetSeizedHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(TRY_GET_SEIZED_HERO, aso));
        }

    }

    /**
     * Command: hero.tryGetSeizedHero
     * Response: CommandResponse
     */
    public void tryGetSeizedHero(int castleId, int heroId) {
        tryGetSeizedHero(castleId, heroId, null);
    }

    /**
     * Command: hero.callBackHero
     * Response: CommandResponse
     */
    public void callBackHero(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _callBackHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(CALL_BACK_HERO, aso));
        }

    }

    /**
     * Command: hero.callBackHero
     * Response: CommandResponse
     */
    public void callBackHero(int castleId, int heroId) {
        callBackHero(castleId, heroId, null);
    }
}
