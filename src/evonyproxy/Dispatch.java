/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy;

import evonyproxy.constants.EConst;
import evonyproxy.constants.ResponseConstants;
import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @version .01
 * @author Michael Archibald
 */
public class Dispatch implements EConst {

    AMF amf;
    /**
     * bleh
     */
    HashMap hMap = new HashMap();
    Method tempMeth, defaultMeth;

    Dispatch(AMF amf) {
        this.amf = amf;

    }

    protected void commonConstruction() {
        hMap.put(Common.LOGIN_CMD, getMethod(amf.getClass().getName(), "onLoginRequest"));
        hMap.put(Response.SERVER_LOGIN_RESPONSE, amf);
//        hMap.put(Common., amf)
    }

    public void dispatch(Object key, Object value) {
        try {
            Object[] valArr = new Object[]{value};
            tempMeth = (Method) hMap.get(key);
            tempMeth.invoke(amf, valArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Method getMethod(String clsName, String mthName) {
        try {
            Method metRet;
//            Class[] parm = new Class[]{Class.forName("java.lang.Object")};
            Class[] parm = new Class[]{Class.forName("flex.messaging.io.amf.ASObject")};
            Class cls = Class.forName(clsName);
            metRet = cls.getMethod(mthName, parm);
            return metRet;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println(e.getCause() + "\n" + e.getClass() + "\n" + e.getStackTrace().toString() + "\n");
        } catch (NoSuchMethodException e) {
            System.out.println(e);
            System.out.println(e.getCause() + "\n" + e.getClass() + "\n" + e.getStackTrace().toString() + "\n");
        }
        return null;
    }

    public Method getDefaultMeth() {
        return defaultMeth;
    }

    public void setDefaultMeth(Method defaultMeth) {
        this.defaultMeth = defaultMeth;
    }
}
