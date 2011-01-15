package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class MailCommands extends AbstractCommand implements IMailCommands {
    public Method _receiveMailList_callback = null;
    public Method _reportPlayer_callback = null;
    public Method _readMail_callback = null;
    public Method _deleteMail_callback = null;
    public Method _readOverMailList_callback = null;
    public Method _sendMail_callback = null;
    public Method _getAllTVMsg_callback = null;
    public Method _reportBug_callback = null;

    /**
     * Command: mail.deleteMail
     * Response: CommandResponse
     */
    public void deleteMail(String str_mailid, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteMail_callback = callbackMethod;

        aso.put("str_mailid", str_mailid);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_MAIL, aso));
        }

    }

    /**
     * Command: mail.deleteMail
     * Response: CommandResponse
     */
    public void deleteMail(String str_mailid) {
        deleteMail(str_mailid, null);
    }

    /**
     * Command: mail.getAllTVMsg
     * Response: TVResponse
     */
    public void getAllTVMsg(Method callbackMethod) {
        ASObject aso = new ASObject();

        _getAllTVMsg_callback = callbackMethod;

        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(GET_ALL_T_V_MSG, aso));
        }

    }

    /**
     * Command: mail.getAllTVMsg
     * Response: TVResponse
     */
    public void getAllTVMsg() {
        getAllTVMsg(null);
    }

    /**
     * Command: mail.readOverMailList
     * Response: MailResponse
     */
    public void readOverMailList(String mailIds, Method callbackMethod) {
        ASObject aso = new ASObject();

        _readOverMailList_callback = callbackMethod;

        aso.put("mailIds", mailIds);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(READ_OVER_MAIL_LIST, aso));
        }

    }

    /**
     * Command: mail.readOverMailList
     * Response: MailResponse
     */
    public void readOverMailList(String mailIds) {
        readOverMailList(mailIds, null);
    }

    /**
     * Command: mail.reportBug
     * Response: CommandResponse
     */
    public void reportBug(String subject, String content, Method callbackMethod) {
        ASObject aso = new ASObject();

        _reportBug_callback = callbackMethod;

        aso.put("subject", subject);
        aso.put("content", content);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REPORT_BUG, aso));
        }

    }

    /**
     * Command: mail.reportBug
     * Response: CommandResponse
     */
    public void reportBug(String subject, String content) {
        reportBug(subject, content, null);
    }

    /**
     * Command: mail.sendMail
     * Response: CommandResponse
     */
    public void sendMail(String username, String title, String content, Method callbackMethod) {
        ASObject aso = new ASObject();

        _sendMail_callback = callbackMethod;

        aso.put("username", username);
        aso.put("title", title);
        aso.put("content", content);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SEND_MAIL, aso));
        }

    }

    /**
     * Command: mail.sendMail
     * Response: CommandResponse
     */
    public void sendMail(String username, String title, String content) {
        sendMail(username, title, content, null);
    }

    /**
     * Command: mail.readMail
     * Response: MailResponse
     */
    public void readMail(int mailId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _readMail_callback = callbackMethod;

        aso.put("mailId", mailId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(READ_MAIL, aso));
        }

    }

    /**
     * Command: mail.readMail
     * Response: MailResponse
     */
    public void readMail(int mailId) {
        readMail(mailId, null);
    }

    /**
     * Command: mail.receiveMailList
     * Response: MailListResponse
     */
    public void receiveMailList(int pageNo, int type, int pageSize, Method callbackMethod) {
        ASObject aso = new ASObject();

        _receiveMailList_callback = callbackMethod;

        aso.put("pageNo", pageNo);
        aso.put("type", type);
        aso.put("pageSize", pageSize);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(RECEIVE_MAIL_LIST, aso));
        }

    }

    /**
     * Command: mail.receiveMailList
     * Response: MailListResponse
     */
    public void receiveMailList(int pageNo, int type, int pageSize) {
        receiveMailList(pageNo, type, pageSize, null);
    }

    /**
     * Command: mail.reportPlayer
     * Response: CommandResponse
     */
    public void reportPlayer(String subject, String content, Method callbackMethod) {
        ASObject aso = new ASObject();

        _reportPlayer_callback = callbackMethod;

        aso.put("subject", subject);
        aso.put("content", content);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REPORT_PLAYER, aso));
        }

    }

    /**
     * Command: mail.reportPlayer
     * Response: CommandResponse
     */
    public void reportPlayer(String subject, String content) {
        reportPlayer(subject, content, null);
    }
}
