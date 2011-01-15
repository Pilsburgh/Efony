/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.common.custom;

/**
 * All implementing classes should contain {@code Integer updateType} field.
 * Contains Static Integers that are possible values of updateType field.
 * Statics were copied from CommonConstants.
 *
 * This class should be implemented by {@link evonyproxy.common.server.events.CastleFieldUpdate CastleFieldUpdate}, {@link evonyproxy.common.server.events.CastleUpdate CastleUpdate},
 * {@link evonyproxy.common.server.events.HeroUpdate HeroUpdate},{@link evonyproxy.common.server.events.PlayerBuffUpdate PlayerBuffUpdate}, {@link evonyproxy.common.server.events.TradesUpdate TradesUpdate}, {@link evonyproxy.common.server.events.TransingTradesUpdate TransingTradeUpdate}.
 * @version .01
 * @author Michael Archibald
 */
public class EnumerableUpdater {

    /**
     * 0
     */
    public static final int UPDATE_TYPE_ADD = 0;

    /**
     * 1
     */
    public static final int UPDATE_TYPE_DELETE = 1;

    /**
     * 2
     */
    public static final int UPDATE_TYPE_UPDATE = 2;
}
