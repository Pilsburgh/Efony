package evonyproxy.common.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class FriendCommands extends AbstractCommand implements IFriendCommands {
    public Method _deleteBlock_callback = null;
    public Method _addFriend_callback = null;
    public Method _isBlockMailPlayer_callback = null;
    public Method _addBlock_callback = null;
    public Method _deleteFriend_callback = null;

    /**
     * Command: friend.deleteBlock
     * Response: FriendResponse
     */
    public void deleteBlock(String player, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteBlock_callback = callbackMethod;

        aso.put("player", player);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_BLOCK, aso));
        }

    }

    /**
     * Command: friend.deleteBlock
     * Response: FriendResponse
     */
    public void deleteBlock(String player) {
        deleteBlock(player, null);
    }

    /**
     * Command: friend.deleteFriend
     * Response: FriendResponse
     */
    public void deleteFriend(String player, Method callbackMethod) {
        ASObject aso = new ASObject();

        _deleteFriend_callback = callbackMethod;

        aso.put("player", player);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(DELETE_FRIEND, aso));
        }

    }

    /**
     * Command: friend.deleteFriend
     * Response: FriendResponse
     */
    public void deleteFriend(String player) {
        deleteFriend(player, null);
    }

    /**
     * Command: friend.addBlock
     * Response: FriendResponse
     */
    public void addBlock(String player, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addBlock_callback = callbackMethod;

        aso.put("player", player);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_BLOCK, aso));
        }

    }

    /**
     * Command: friend.addBlock
     * Response: FriendResponse
     */
    public void addBlock(String player) {
        addBlock(player, null);
    }

    /**
     * Command: friend.isBlockMailPlayer
     * Response: FriendResponse
     */
    public void isBlockMailPlayer(int mailId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _isBlockMailPlayer_callback = callbackMethod;

        aso.put("mailId", mailId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(IS_BLOCK_MAIL_PLAYER, aso));
        }

    }

    /**
     * Command: friend.isBlockMailPlayer
     * Response: FriendResponse
     */
    public void isBlockMailPlayer(int mailId) {
        isBlockMailPlayer(mailId, null);
    }

    /**
     * Command: friend.addFriend
     * Response: FriendResponse
     */
    public void addFriend(String player, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addFriend_callback = callbackMethod;

        aso.put("player", player);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_FRIEND, aso));
        }

    }

    /**
     * Command: friend.addFriend
     * Response: FriendResponse
     */
    public void addFriend(String player) {
        addFriend(player, null);
    }
}
