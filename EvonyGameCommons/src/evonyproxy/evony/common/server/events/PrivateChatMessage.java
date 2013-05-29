package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;

/**
 * @version .02
 * @author Michael Archibald
 */
public class PrivateChatMessage implements EvonyPacket {

    public static final int NORMAL_CHAT = 0;
    public static final int GM_CHAT = 1;
    public String msg = null;
    public Integer chatType = null;
    public String fromUser = null;

    public PrivateChatMessage(ASObject aso) {

        if (aso.get("msg") != null) {
            this.msg = (String) aso.get("msg");
        }

        if (aso.get("chatType") != null) {
            this.chatType = (Integer) aso.get("chatType");
        }

        if (aso.get("fromUser") != null) {
            this.fromUser = (String) aso.get("fromUser");
        }
    }

    public PrivateChatMessage() {
    }

    @Override
    public PrivateChatMessage clone() {
        PrivateChatMessage clone = new PrivateChatMessage();

        if (this.msg != null) {
            clone.setMsg(this.msg);
        }

        if (this.chatType != null) {
            clone.setChatType(this.chatType);
        }

        if (this.fromUser != null) {
            clone.setFromUser(this.fromUser);
        }

        return clone;
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if (this.msg != null) {
            aso.put("msg", msg);
        }

        if (this.chatType != null) {
            aso.put("chatType", chatType);
        }

        if (this.fromUser != null) {
            aso.put("fromUser", fromUser);
        }

        return aso;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getChatType() {
        return chatType;
    }

    public void setChatType(Integer chatType) {
        this.chatType = chatType;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }
}
