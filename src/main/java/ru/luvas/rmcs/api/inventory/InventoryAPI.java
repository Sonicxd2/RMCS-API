package ru.luvas.rmcs.api.inventory;

import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
public interface InventoryAPI {

    /**
     * Создать новый DynamicInventory с заданным названием и заданного размера.
     * @param name название инвентаря.
     * @param sizeInLines размер инвентаря в линиях (например, 4 соответствует 36-слотовому инвентарю).
     * @return созданный инвентарь.
     */
    DynamicInventory createNewInventory(String name, int sizeInLines);
    
    /**
     * Открывает переданный инвентарь указанному игроку. Метод не отличается от DynamicInventory.open.
     * @param p игрок.
     * @param inventory инвентарь.
     * @return переданный инвентарь.
     */
    DynamicInventory open(Player p, DynamicInventory inventory);
    
}
