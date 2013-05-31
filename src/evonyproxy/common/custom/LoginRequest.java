/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy.common.custom;

import evonyproxy.common.ASObjectable;
import flex.messaging.io.amf.ASObject;

/**
 * @version .01
 * @author Michael Archibald
 */
public class LoginRequest implements ASObjectable {
    public static final String CMD = "login";
    String pwd = null;
    String user = null;

    public LoginRequest(ASObject aso) {
        if(aso.get("pwd") != null) {
            this.pwd = (String) aso.get("pwd");
        }

        if(aso.get("user") != null) {
            this.user = (String) aso.get("user");
        }
    }

    public LoginRequest() {
    }

    public ASObject toASObject() {
        ASObject aso = new ASObject();

        if(this.pwd != null) {
            aso.put("pwd", pwd);
        }

        if(this.user != null) {
            aso.put("user", user);
        }

        return aso;
    }

    @Override
    public LoginRequest clone() {
        LoginRequest clone = new LoginRequest();

        if(this.pwd != null) {
            clone.setPwd(pwd);
        }

        if(this.user != null) {
            clone.setUser(user);
        }

        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj.getClass().getName()).equals(this.getClass().getName())) {
            return false;
        }

        if(!((LoginRequest) obj).getPwd().equals(this.getPwd())) {
            return false;
        }

        if(!((LoginRequest) obj).getUser().equals(this.getUser())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.pwd != null ? this.pwd.hashCode() : 0);
        hash = 67 * hash + (this.user != null ? this.user.hashCode() : 0);
        return hash;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
