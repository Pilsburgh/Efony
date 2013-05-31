/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.common;

import evonyproxy.common.custom.LoginRequest;
import evonyproxy.connectors.EvonyClient;
import evonyproxy.connectors.EvonyPolicy;
import evonyproxy.connectors.EvonyServer;
import evonyproxy.evony.common.server.events.LoginResponse;
import evonyproxy.connectors.event.PolicyObserver;

/**
 * Interface for a data handler.
 * Represents a class that can delegate data between clients and a server.
 * @version .01
 * @author Michael Archibald
 */
public interface Sender {

    void addClient(EvonyClient c);

    PolicyObserver getDat();

    LoginRequest getLoginRequest();

    LoginResponse getLoginResponse();

    String getPolicyRequest();

    byte[] getPolicyRequestBytes();

    String getPolicyResponse();

    byte[] getPolicyResponseBytes();

    EvonyPolicy getPolicyServer();

    EvonyServer getServer();

    String getVersionRequest();

    boolean hasLoginRequest();

    boolean hasLoginResponse();

    boolean hasPolicyRequest();

    boolean hasPolicyResponse();

    void passDataToClients(byte[] data);

    void passDataToServer(byte[] data);

    void removeClient(EvonyClient c);

    void setServer(EvonyServer server);
    void setPolicyServer(EvonyPolicy policy);

}
