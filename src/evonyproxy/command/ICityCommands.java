package evonyproxy.command;

/**
 * @version .01
 * @author Michael Archibald
 */
public interface ICityCommands {
    /**
     * city.getStoreList
     */
    public static final String GET_STORE_LIST = "city.getStoreList";
    /**
     * city.advMoveCastle
     */
    public static final String ADV_MOVE_CASTLE = "city.advMoveCastle";
    /**
     * city.constructCastle
     */
    public static final String CONSTRUCT_CASTLE = "city.constructCastle";
    /**
     * city.setStopWarState
     */
    public static final String SET_STOP_WAR_STATE = "city.setStopWarState";
    /**
     * city.modifyUserName
     */
    public static final String MODIFY_USER_NAME = "city.modifyUserName";
    /**
     * city.modifyFlag
     */
    public static final String MODIFY_FLAG = "city.modifyFlag";
    /**
     * city.moveCastle
     */
    public static final String MOVE_CASTLE = "city.moveCastle";
    /**
     * city.modifyCastleIcon
     */
    public static final String MODIFY_CASTLE_ICON = "city.modifyCastleIcon";
    /**
     * city.uniteAdvMoveCastle
     */
    public static final String UNITE_ADV_MOVE_CASTLE = "city.uniteAdvMoveCastle";
    /**
     * city.modifyStorePercent
     */
    public static final String MODIFY_STORE_PERCENT = "city.modifyStorePercent";
    /**
     * city.modifyCastleName
     */
    public static final String MODIFY_CASTLE_NAME = "city.modifyCastleName";
    /**
     * city.giveupCastle
     */
    public static final String GIVEUP_CASTLE = "city.giveupCastle";
}
