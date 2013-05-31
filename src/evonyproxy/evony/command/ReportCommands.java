package evonyproxy.evony.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class ReportCommands extends AbstractCommand implements IReportCommands {
    public Method _deleteReport_callback = null;
    public Method _readOverReport_callback = null;
    public Method _receiveReportList_callback = null;
    public Method _markAsRead_callback = null;
    public Method _deleteAllReports_callback = null;

    /**
     * Command: report.markAsRead
     * Response: ReportResponse
     */
    public void markAsRead(int reportId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _markAsRead_callback = callbackMethod;

        aso.put("reportId", reportId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(MARK_AS_READ, aso));
        }

    }

    /**
     * Command: report.markAsRead
     * Response: ReportResponse
     */
    public void markAsRead(int reportId) {
        markAsRead(reportId, null);
    }

    /**
     * Command: report.deleteAllReports
     * Response: CommandResponse
     */
    public void deleteAllReports(int reportType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteAllReports_callback = callbackMethod;

        aso.put("reportType", reportType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_ALL_REPORTS, aso));
        }

    }

    /**
     * Command: report.deleteAllReports
     * Response: CommandResponse
     */
    public void deleteAllReports(int reportType) {
        deleteAllReports(reportType, null);
    }

    /**
     * Command: report.receiveReportList
     * Response: ReportListResponse
     */
    public void receiveReportList(int pageNo, int pageSize, int reportType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _receiveReportList_callback = callbackMethod;

        aso.put("pageNo", pageNo);
        aso.put("pageSize", pageSize);
        aso.put("reportType", reportType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RECEIVE_REPORT_LIST, aso));
        }

    }

    /**
     * Command: report.receiveReportList
     * Response: ReportListResponse
     */
    public void receiveReportList(int pageNo, int pageSize, int reportType) {
        receiveReportList(pageNo, pageSize, reportType, null);
    }

    /**
     * Command: report.readOverReport
     * Response: ReportResponse
     */
    public void readOverReport(String reportIds, Method callbackMethod) {
        ASObject aso = new ASObject();

        _readOverReport_callback = callbackMethod;

        aso.put("reportIds", reportIds);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(READ_OVER_REPORT, aso));
        }

    }

    /**
     * Command: report.readOverReport
     * Response: ReportResponse
     */
    public void readOverReport(String reportIds) {
        readOverReport(reportIds, null);
    }

    /**
     * Command: report.deleteReport
     * Response: CommandResponse
     */
    public void deleteReport(String idStr, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteReport_callback = callbackMethod;

        aso.put("idStr", idStr);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_REPORT, aso));
        }

    }

    /**
     * Command: report.deleteReport
     * Response: CommandResponse
     */
    public void deleteReport(String idStr) {
        deleteReport(idStr, null);
    }
}
