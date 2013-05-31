/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evonyproxy.constants;

/**
 * @version .01
 * @author Michael Archibald
 * @deprecated
 * This only exists for reverse compatability. Use the modularized version of
 * this class instead.
 */
public interface EConst {

    public class Alliance implements AllianceConstants {}
    public class Army implements ArmyConstants {}
    public class Building implements BuildingConstants {}
    public class City implements CityConstants {}
    public class Common implements CommonConstants {}
    public class ErrorCode implements ErrorCodeConstants {}
    public class Field implements FieldConstants {}
    public class Hero implements HeroConstants {}
    public class Mail implements MailConstants {}
    public class Obj implements ObjConstants {}
    public class Response implements ResponseConstants {}
    public class TF implements TFConstants {}
    public class Tech implements TechConstants {}
    public class Trade implements TradeConstants {}
}

