package ru.luvas.rmcs.api.inventory;

import java.util.List;
import java.util.stream.Collectors;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author 0xC0deBabe
 */
public class DynamicItem {
    
    private ItemStack icon;
    
    private final ClickAction clickAction;
    
    /**
     * Создать новый DynamicItem с переданными иконкой и действием при клике.
     * @param icon иконка предмета.
     * @param clickAction действие при клике.
     */
    public DynamicItem(ItemStack icon, ClickAction clickAction) {
        this.icon = icon;
        this.clickAction = clickAction;
    }
    
    /**
     * Создать новый DynamicItem указанного материала, с указанным именем, описанием и действием при клике.
     * @param icon материал (тип) иконки.
     * @param name название предмета.
     * @param description описание предмета, каждый новый элемент - новая строка в игре.
     * @param clickAction действие при клике.
     */
    public DynamicItem(Material icon, String name, List<String> description, ClickAction clickAction) {
        this(icon, 0, name, description, clickAction);
    }
    
    /**
     * Создать новый DynamicItem указанного материала и даты, с указанным именем, описанием и действием при клике.
     * @param icon материал (тип) иконки.
     * @param data дата иконки (например, у черной шерсти - 15).
     * @param name название предмета.
     * @param description описание предмета, каждый новый элемент - новая строка в игре.
     * @param clickAction действие при клике.
     */
    public DynamicItem(Material icon, int data, String name, List<String> description, ClickAction clickAction) {
        this.icon = new ItemStack(icon, 1, (short) data);
        ItemMeta im = this.icon.getItemMeta();
        im.setDisplayName(c(name));
        im.setLore(description.stream().map(DynamicItem::c).collect(Collectors.toList()));
        this.icon.setItemMeta(im);
        this.clickAction = clickAction;
    }
    
    private static String c(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
    
    /**
     * Изменяет нынешнюю иконку предмета новой (но не обновляет инвентарь, для этого необходимо использовать метод DynamicInventory.update).
     * @param newIcon новая иконка.
     * @return переданную иконку.
     */
    public ItemStack setIcon(ItemStack newIcon) {
        return this.icon = newIcon;
    }

    /**
     * Получить ItemStack, являющийся иконкой этого предмета в DynamicInventory.
     * @return иконку предмета.
     */
    public ItemStack getIcon() {
        return icon;
    }
    
    /**
     * Получить ClickAction, который выполнится при клике по данному предмету в DynamicInventory.
     * @return ClickAction данного предмета.
     */
    public ClickAction getClickAction() {
        return clickAction;
    }
    
}
