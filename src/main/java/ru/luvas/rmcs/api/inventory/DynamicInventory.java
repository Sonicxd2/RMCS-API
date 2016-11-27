package ru.luvas.rmcs.api.inventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 *
 * @author 0xC0deBabe
 */
public interface DynamicInventory {

    /**
     * Получить bukkit-инвентарь, ассоциированный с данным инвентарем.
     * @return bukkit-инвентарь.
     */
    public Inventory getBukkitInventory();
    
    /**
     * Получить размер данного инвентаря.
     * @return разер данного инвентаря.
     */
    public int getSize();
    
    /**
     * Получить название данного инвентаря.
     * @return название данного инвентаря.
     */
    public String getName();
    
    /**
     * Добавить новый предмет в слот с указанным идентификатором.
     * @param slot идентификатор слота в инвентаре (начиная с 0).
     * @param item предмет.
     * @return переданный предмет.
     */
    public DynamicItem addItem(int slot, DynamicItem item);
    
    /**
     * Добавить новый предмет в указанный строку и столбец в инвентаре.
     * @param row номер строки (начиная с 1).
     * @param column номер столбца (начиная с 1).
     * @param item предмет.
     * @return переданный предмет.
     */
    public DynamicItem addItem(int row, int column, DynamicItem item);
    
    /**
     * Добавить новый предмет в инвентарь на первый свободный слот.
     * @param item предмет.
     * @return переданный предмет.
     */
    public DynamicItem addItem(DynamicItem item);
    
    /**
     * Обновляет иконку предмета на переданном слоту. Используется при изменении иконки через DynamicItem.setIcon.
     * @param slot идентификатор слота (начиная с 0).
     * @return null, если в данном слоте ничего не было, иначе - предмет из данного слота.
     */
    public DynamicItem update(int slot);
    
    /**
     * Обновляет иконку предмета в переданной строке и столбце. Используется при изменении иконки через DynamicItem.setIcon.
     * @param row номер строки (с 1).
     * @param column номер столбца (с 1).
     * @return null, если в данном слоте ничего не было, иначе - предмет из данного слота.
     */
    public DynamicItem update(int row, int column);
    
    /**
     * Получить предмет из конкретного слота инвентаря.
     * @param slot номер слота (начиная с 0).
     * @return null, если в данном слоте ничего не было, иначе - предмет из данного слота.
     */
    public DynamicItem getItem(int slot);
    
    /**
     * Получить предмет из конкретной строчки и столбца инвентаря.
     * @param row номер строки (с 1).
     * @param column номер столбца (с 1).
     * @return null, если в данном слоте ничего не было, иначе - предмет из данного слота.
     */
    public DynamicItem getItem(int row, int column);
    
    /**
     * Открыть инвентарь для указанного игрока.
     * @param p игрок.
     */
    public void open(Player p);
    
}
