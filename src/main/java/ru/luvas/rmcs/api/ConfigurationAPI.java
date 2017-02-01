package ru.luvas.rmcs.api;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author 0xC0deBabe
 */
public interface ConfigurationAPI {

    /**
     * Получить файл конфигурации определенного плагина с заданным именем.
     * @param plugin плагин.
     * @param name название файла конфигурации (без .yml).
     * @return файл конфигурации.
     */
    FileConfiguration getConfig(JavaPlugin plugin, String name);
    
    /**
     * Сохранить файл конфигурации определенного плагина с заданным именем.
     * @param plugin плагин.
     * @param name название файла конфигурации (без .yml).
     */
    void saveConfig(JavaPlugin plugin, String name);
    
    /**
     * Перезагрузить файл конфигурации определенного плагина с заданным именем.
     * @param plugin плагин.
     * @param name название файла конфигурации (без .yml).
     */
    void reloadConfig(JavaPlugin plugin, String name);
    
}
