package ru.luvas.rmcs.api;

import org.bukkit.plugin.java.JavaPlugin;
import ru.luvas.rmcs.api.inventory.InventoryAPI;
import ru.luvas.rmcs.api.party.PartyAPI;
import ru.luvas.rmcs.api.player.RMCSPlayerManager;
import ru.luvas.rmcs.api.scoreboard.ScoreboardAPI;
import ru.luvas.rmcs.api.sql.SqlManager;

/**
 *
 * @author 0xC0deBabe
 */
public class RMCSAPI extends JavaPlugin {
    
    private static boolean loaded = false;
    
    private static BarAPI barAPI;
    
    private static TitleAPI titleAPI;
    
    private static RMCSPlayerManager playerManager;
    
    private static QueueAPI queueAPI;
    
    private static PartyAPI partyAPI;
    
    private static ScoreboardAPI scoreboardAPI;
    
    private static InventoryAPI inventoryAPI;
    
    private static ConfigurationAPI configurationAPI;
    
    private static SqlManager sqlManager;
    
    /**
     * Проверка, инициализировано ли API.
     * @return true, если API загружено, и его можно использовать.
     */
    public static boolean isLoaded() {
        return loaded;
    }
    
    /**
     * Получение BarAPI, с помощью которого можно работать с прогресс-барами.
     * @return реализацию класса BarAPI.
     */
    public static BarAPI getBarAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return barAPI;
    }
    
    /**
     * Получение TitleAPI, с помощью которого можно работать с тайтлами и табом.
     * @return реализацию класса TitleAPI.
     */
    public static TitleAPI getTitleAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return titleAPI;
    }
    
    /**
     * Получение менеджера игроков, с помощью которого можно получить для конкретного игрока класс
     * RMCSPlayer, содержащий полезную информацию о данном игроке и методы для работы с ней.
     * @return реализацию класса RMCSPlayerManager.
     */
    public static RMCSPlayerManager getPlayerManager() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return playerManager;
    }
    
    /**
     * Получение QueueAPI, с помощью которого можно работать с очередями (добавлять/удалять из них сервер).
     * @return реализацию класса QueueAPI.
     */
    public static QueueAPI getQueueAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return queueAPI;
    }
    
    /**
     * Получение PartyAPI, с помощью которого можно работать с группами.
     * @return реализацию класса PartyAPI.
     */
    public static PartyAPI getPartyAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return partyAPI;
    }
    
    /**
     * Получение ScoreboardAPI, с помощью которого можно создавать
     * ненагрущающие скорборды, работающие на пакетах, для игроков.
     * @return реализацию класса ScoreboardAPI.
     */
    public static ScoreboardAPI getScoreboardAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return scoreboardAPI;
    }
    
    /**
     * Получение InventoryAPI, с помощью которого можно создавать инвентари
     * с кликабельными слотами.
     * @return реализацию класса InventoryAPI.
     */
    public static InventoryAPI getInventoryAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return inventoryAPI;
    }
    
    /**
     * Получение ConfigurationAPI, которое упрощает работу с файлами конфигурации.
     * @return реализацию класса ConfigurationAPI.
     */
    public static ConfigurationAPI getConfigurationAPI() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return configurationAPI;
    }
    
    /**
     * Получение SqlManager, через который можно получить SqlConnector для
     * работы с базой данных.
     * @return реализацию класса SqlManager.
     */
    public static SqlManager getSqlManager() {
        if(!isLoaded())
            throw new ApiNotLoadedException();
        return sqlManager;
    }
    
}
