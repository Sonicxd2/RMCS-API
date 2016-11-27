package ru.luvas.rmcs.api.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

/**
 *
 * @author 0xC0deBabe
 */
public interface ClickAction {

    /**
     * Метод, который будет вызван при клике по DynamicItem в DynamicInventory.
     * @param p игрок.
     * @param clickType тип клика.
     * @param slot идентификатор слота в инвентаре.
     */
    void onClick(Player p, ClickType clickType, int slot);
    
}
