package evonyproxy.command;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;

/**
 * @version .01
 * @author Michael Archibald
 */
public class ModifyCommands extends AbstractCommand implements IModifyCommands {
    public Method _removeHero_callback = null;
    public Method _removeBuilding_callback = null;
    public Method _removeItem_callback = null;
    public Method _setTechnology_callback = null;
    public Method _setResources_callback = null;
    public Method _addItems_callback = null;
    public Method _addHero_callback = null;
    public Method _addBuilding_callback = null;

    /**
     * Command: gamemaster.removeBuilding
     * Response: CommandResponse
     */
    public void removeBuilding(int castleId, int position, Method callbackMethod) {
        ASObject aso = new ASObject();

        _removeBuilding_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("position", position);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REMOVE_BUILDING, aso));
        }

    }

    /**
     * Command: gamemaster.removeBuilding
     * Response: CommandResponse
     */
    public void removeBuilding(int castleId, int position) {
        removeBuilding(castleId, position, null);
    }

    /**
     * Command: gamemaster.setTechnology
     * Response: CommandResponse
     */
    public void setTechnology(int technologyType, int level, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setTechnology_callback = callbackMethod;

        aso.put("technologyType", technologyType);
        aso.put("level", level);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_TECHNOLOGY, aso));
        }

    }

    /**
     * Command: gamemaster.setTechnology
     * Response: CommandResponse
     */
    public void setTechnology(int technologyType, int level) {
        setTechnology(technologyType, level, null);
    }

    /**
     * Command: gamemaster.removeHero
     * Response: CommandResponse
     */
    public void removeHero(int castleId, int heroId, Method callbackMethod) {
        ASObject aso = new ASObject();

        _removeHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("heroId", heroId);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REMOVE_HERO, aso));
        }

    }

    /**
     * Command: gamemaster.removeHero
     * Response: CommandResponse
     */
    public void removeHero(int castleId, int heroId) {
        removeHero(castleId, heroId, null);
    }

    /**
     * Command: gamemaster.addItems
     * Response: CommandResponse
     */
    public void addItems(String type, int amount, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addItems_callback = callbackMethod;

        aso.put("type", type);
        aso.put("amount", amount);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_ITEMS, aso));
        }

    }

    /**
     * Command: gamemaster.addItems
     * Response: CommandResponse
     */
    public void addItems(String type, int amount) {
        addItems(type, amount, null);
    }

    /**
     * Command: gamemaster.setResources
     * Response: CommandResponse
     */
    public void setResources(int castleId, int wood, int iron, int stone, int food, int gold, int population, Method callbackMethod) {
        ASObject aso = new ASObject();

        _setResources_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("wood", wood);
        aso.put("iron", iron);
        aso.put("stone", stone);
        aso.put("food", food);
        aso.put("gold", gold);
        aso.put("population", population);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(SET_RESOURCES, aso));
        }

    }

    /**
     * Command: gamemaster.setResources
     * Response: CommandResponse
     */
    public void setResources(int castleId, int wood, int iron, int stone, int food, int gold, int population) {
        setResources(castleId, wood, iron, stone, food, gold, population, null);
    }

    /**
     * Command: gamemaster.addBuilding
     * Response: CommandResponse
     */
    public void addBuilding(int castleId, int buildingType, int position, int level, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addBuilding_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("buildingType", buildingType);
        aso.put("position", position);
        aso.put("level", level);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_BUILDING, aso));
        }

    }

    /**
     * Command: gamemaster.addBuilding
     * Response: CommandResponse
     */
    public void addBuilding(int castleId, int buildingType, int position, int level) {
        addBuilding(castleId, buildingType, position, level, null);
    }

    /**
     * Command: gamemaster.removeItem
     * Response: CommandResponse
     */
    public void removeItem(String type, Method callbackMethod) {
        ASObject aso = new ASObject();

        _removeItem_callback = callbackMethod;

        aso.put("type", type);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(REMOVE_ITEM, aso));
        }

    }

    /**
     * Command: gamemaster.removeItem
     * Response: CommandResponse
     */
    public void removeItem(String type) {
        removeItem(type, null);
    }

    /**
     * Command: gamemaster.addHero
     * Response: CreateHeroResponse
     */
    public void addHero(int castleId, String name, int level, int experience, int loyalty, int status, int management, int power, int stratagem, int remain, Method callbackMethod) {
        ASObject aso = new ASObject();

        _addHero_callback = callbackMethod;

        aso.put("castleId", castleId);
        aso.put("name", name);
        aso.put("level", level);
        aso.put("experience", experience);
        aso.put("loyalty", loyalty);
        aso.put("status", status);
        aso.put("management", management);
        aso.put("power", power);
        aso.put("stratagem", stratagem);
        aso.put("remain", remain);
        if(sender != null && serializer != null) {
            sender.passDataToServer(serializer.serialize(ADD_HERO, aso));
        }

    }

    /**
     * Command: gamemaster.addHero
     * Response: CreateHeroResponse
     */
    public void addHero(int castleId, String name, int level, int experience, int loyalty, int status, int management, int power, int stratagem, int remain) {
        addHero(castleId, name, level, experience, loyalty, status, management, power, stratagem, remain, null);
    }
}
