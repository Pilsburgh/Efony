package evonyproxy.common.command;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface INpcHeroCommand {
    /**
     * npchero.getNpcHeroInfroByID
     */
    public static final String GET_NPC_HERO_INFRO_BY_ID = "npchero.getNpcHeroInfroByID";
    /**
     * npchero.getNpcHerosListByMoney
     */
    public static final String GET_NPC_HEROS_LIST_BY_MONEY = "npchero.getNpcHerosListByMoney";
    /**
     * npchero.getNpcHerosList
     */
    public static final String GET_NPC_HEROS_LIST = "npchero.getNpcHerosList";
    /**
     * npchero.getNpcHerosListByFilter
     */
    public static final String GET_NPC_HEROS_LIST_BY_FILTER = "npchero.getNpcHerosListByFilter";
}
