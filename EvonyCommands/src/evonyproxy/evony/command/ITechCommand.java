package evonyproxy.evony.command;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface ITechCommand {
    /**
     * tech.getCoinsNeed
     */
    public static final String GET_COINS_NEED = "tech.getCoinsNeed";
    /**
     * tech.cancelResearch
     */
    public static final String CANCEL_RESEARCH = "tech.cancelResearch";
    /**
     * tech.getResearchList
     */
    public static final String GET_RESEARCH_LIST = "tech.getResearchList";
    /**
     * tech.research
     */
    public static final String RESEARCH = "tech.research";
    /**
     * tech.speedUpResearch
     */
    public static final String SPEED_UP_RESEARCH = "tech.speedUpResearch";
}
