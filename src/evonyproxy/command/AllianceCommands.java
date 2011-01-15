package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 * Implements all commands used for the Alliance menu.
 */
public class AllianceCommands extends AbstractCommand implements IAllianceCommands {
    public Method _getAllianceArmyReport_callback = null;
    public Method _getAllianceInfo_callback = null;
    public Method _getMilitarySituationList_callback = null;
    public Method _getAllianceList_callback = null;
    public Method _getAllianceMembers_callback = null;
    public Method _getAllianceEventList_callback = null;

    /**
     * Command: alliance.getMilitarySituationList
     * Response: MilitarySituationListResponse
     */
    public void getMilitarySituationList(int pageNo, int pageSize, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getMilitarySituationList_callback = callbackMethod;

        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_MILITARY_SITUATION_LIST, aso));
        }

    }

    /**
     * Command: alliance.getMilitarySituationList
     * Response: MilitarySituationListResponse
     */
    public void getMilitarySituationList(int pageNo, int pageSize) {
        getMilitarySituationList(pageNo, pageSize, null);
    }

    /**
     * Command: alliance.getAllianceList
     * Response: AllianceListResponse
     */
    public void getAllianceList(int pageSize, int pageNum, int ranking, String name, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceList_callback = callbackMethod;

        aso.put("pageSize", pageSize);
        aso.put("pageNum", pageNum);
        aso.put("ranking", ranking);
        aso.put("name", name);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_LIST, aso));
        }

    }

    /**
     * Command: alliance.getAllianceList
     * Response: AllianceListResponse
     */
    public void getAllianceList(int pageSize, int pageNum, int ranking, String name) {
        getAllianceList(pageSize, pageNum, ranking, name, null);
    }

    /**
     * Command: alliance.getAllianceEventList
     * Response: AllianceEventListResponse
     */
    public void getAllianceEventList(int pageNo, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceEventList_callback = callbackMethod;

        aso.put("pageNo", pageNo);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_EVENT_LIST, aso));
        }

    }

    /**
     * Command: alliance.getAllianceEventList
     * Response: AllianceEventListResponse
     */
    public void getAllianceEventList(int pageNo) {
        getAllianceEventList(pageNo, null);
    }

    /**
     * Command: alliance.getAllianceArmyReport
     * Response: AllianceArmyResponse
     */
    public void getAllianceArmyReport(int armyId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceArmyReport_callback = callbackMethod;

        aso.put("armyId", armyId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_ARMY_REPORT, aso));
        }

    }

    /**
     * Command: alliance.getAllianceArmyReport
     * Response: AllianceArmyResponse
     */
    public void getAllianceArmyReport(int armyId) {
        getAllianceArmyReport(armyId, null);
    }

    /**
     * Command: alliance.getAllianceMembers
     * Response: AllianceMembersResponse
     */
    public void getAllianceMembers(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceMembers_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_MEMBERS, aso));
        }

    }

    /**
     * Command: alliance.getAllianceMembers
     * Response: AllianceMembersResponse
     */
    public void getAllianceMembers() {
        getAllianceMembers(null);
    }

    /**
     * Command: alliance.getAllianceInfo
     * Response: AllianceInfoResponse
     */
    public void getAllianceInfo(String allianceName, Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllianceInfo_callback = callbackMethod;

        aso.put("allianceName", allianceName);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALLIANCE_INFO, aso));
        }

    }

    /**
     * Command: alliance.getAllianceInfo
     * Response: AllianceInfoResponse
     */
    public void getAllianceInfo(String allianceName) {
        getAllianceInfo(allianceName, null);
    }
}
