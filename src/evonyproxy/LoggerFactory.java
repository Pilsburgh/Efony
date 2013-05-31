/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evonyproxy;

import java.util.logging.*;
/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public class LoggerFactory {
    public static Logger newLogger(String callingClassName) {
       Logger instance = Logger.getLogger(callingClassName);
       instance.setLevel(Level.CONFIG);
        Handler handler = new ConsoleHandler();
        instance.addHandler(handler);
        instance.setUseParentHandlers(false);
        return instance;
    }

    public static Logger newLogger(String callingClassName,String level) {
        final String[] LEVELS = {"sever","warning","info","config","fine","finer","finest"};
        Logger instance = newLogger(callingClassName);
        instance.setUseParentHandlers(false);

        int i=-1;
        boolean isValid = false;
        for(String str:LEVELS) {
            i++;
            if(level.equals(str)) {
                isValid = true;
                break;
            }
        }
        if(isValid) {
        switch(i) {
            case 0: instance.setLevel(Level.SEVERE); break;
            case 1: instance.setLevel(Level.WARNING); break;
            case 2: instance.setLevel(Level.INFO); break;
            case 3: instance.setLevel(Level.CONFIG); break;
            case 4: instance.setLevel(Level.FINE); break;
            case 5: instance.setLevel(Level.FINER); break;
            case 6: instance.setLevel(Level.FINEST); break;
            case 7: instance.setLevel(Level.ALL); break;
            default: System.out.println("Invalid level selection"); return null;}
        }
        return instance;
    }
//    /** @deprecated */
//    public static Logger newLogger(String callingClassName,String level,String handlerType) {
//        final String[] HANDLERS = {"ConsoleHandler","FileHandler","MemoryHandler","StreamHandler","SocketHandler"};
//        Logger instance = newLogger(callingClassName,level);
//
//        int i = -1;
//        boolean isValid=false;
//        for(String str: HANDLERS) {
//            i++;
//            if(handlerType.equals(str)) {
//                isValid = true;
//                break;
//            }
//        }
//
//        if(isValid) {
//            Handler handler;
//            switch(i) {
//                case 0:
//                    handler = new ConsoleHandler();
//                    instance.addHandler(handler);
//                    break;
//                case 1:
//
//                    try{
//                    handler = new FileHandler();
//                    instance.addHandler(handler);
//                    }
//
//                    break;
//                case 2:
//
//            }
//
//        }
//
//        return instance;
//    }
    /** @deprecated */
    public static Logger newLogger(String callingClassName,String level,String[] handler) {
        Logger instance = newLogger(callingClassName,level);
        instance.setUseParentHandlers(false);

        return instance;
    }
}
