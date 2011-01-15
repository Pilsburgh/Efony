package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class EquipmentCommands extends AbstractCommand implements IEquipmentCommands {
    public Method _EnhancedByGemStone_callback = null;
    public Method _WearAllEquipmenttech_callback = null;
    public Method _TakeOffEquipmenttech_callback = null;
    public Method _TakeOffAllEquipmenttech_callback = null;
    public Method _WearEquipmenttech_callback = null;

    /**
     * Command: equipment.WearEquipmenttech
     * Response: CommandResponse
     */
    public void WearEquipmenttech(int heroid, String EquipmentTechid, int AddAttributeType, int pos, Method callbackMethod) {
        ASObject aso = new ASObject();

        _WearEquipmenttech_callback = callbackMethod;

        aso.put("heroid", heroid);
        aso.put("EquipmentTechid", EquipmentTechid);
        aso.put("AddAttributeType", AddAttributeType);
        aso.put("pos", pos);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(WEAR_EQUIPMENTTECH, aso));
        }

    }

    /**
     * Command: equipment.WearEquipmenttech
     * Response: CommandResponse
     */
    public void WearEquipmenttech(int heroid, String EquipmentTechid, int AddAttributeType, int pos) {
        WearEquipmenttech(heroid, EquipmentTechid, AddAttributeType, pos, null);
    }

    /**
     * Command: equipment.TakeOffAllEquipmenttech
     * Response: CommandResponse
     */
    public void TakeOffAllEquipmenttech(int heroid, Method callbackMethod) {
        ASObject aso = new ASObject();

        _TakeOffAllEquipmenttech_callback = callbackMethod;

        aso.put("heroid", heroid);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(TAKE_OFF_ALL_EQUIPMENTTECH, aso));
        }

    }

    /**
     * Command: equipment.TakeOffAllEquipmenttech
     * Response: CommandResponse
     */
    public void TakeOffAllEquipmenttech(int heroid) {
        TakeOffAllEquipmenttech(heroid, null);
    }

    /**
     * Command: equipment.WearAllEquipmenttech
     * Response: CommandResponse
     */
    public void WearAllEquipmenttech(int heroid, int AddAttributeType, Method callbackMethod) {
        ASObject aso = new ASObject();

        _WearAllEquipmenttech_callback = callbackMethod;

        aso.put("heroid", heroid);
        aso.put("AddAttributeType", AddAttributeType);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(WEAR_ALL_EQUIPMENTTECH, aso));
        }

    }

    /**
     * Command: equipment.WearAllEquipmenttech
     * Response: CommandResponse
     */
    public void WearAllEquipmenttech(int heroid, int AddAttributeType) {
        WearAllEquipmenttech(heroid, AddAttributeType, null);
    }

    /**
     * Command: equipment.TakeOffEquipmenttech
     * Response: CommandResponse
     */
    public void TakeOffEquipmenttech(int heroid, String EquipmentTechid, int pos, Method callbackMethod) {
        ASObject aso = new ASObject();

        _TakeOffEquipmenttech_callback = callbackMethod;

        aso.put("heroid", heroid);
        aso.put("EquipmentTechid", EquipmentTechid);
        aso.put("pos", pos);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(TAKE_OFF_EQUIPMENTTECH, aso));
        }

    }

    /**
     * Command: equipment.TakeOffEquipmenttech
     * Response: CommandResponse
     */
    public void TakeOffEquipmenttech(int heroid, String EquipmentTechid, int pos) {
        TakeOffEquipmenttech(heroid, EquipmentTechid, pos, null);
    }

    /**
     * Command: equipment.EnhancedByGemStone
     * Response: GemstoneRespone
     */
    public void EnhancedByGemStone(String gemstoneid, int pos, int lv, Method callbackMethod) {
        ASObject aso = new ASObject();

        _EnhancedByGemStone_callback = callbackMethod;

        aso.put("gemstoneid", gemstoneid);
        aso.put("pos", pos);
        aso.put("lv", lv);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ENHANCED_BY_GEM_STONE, aso));
        }

    }

    /**
     * Command: equipment.EnhancedByGemStone
     * Response: GemstoneRespone
     */
    public void EnhancedByGemStone(String gemstoneid, int pos, int lv) {
        EnhancedByGemStone(gemstoneid, pos, lv, null);
    }
}
