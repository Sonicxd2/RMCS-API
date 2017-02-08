package ru.luvas.rmcs.api.kits;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.Map;

/**
 * Класс, представляющий предмет, находящийся в наборе (в отличие от KitItem, который не обязательно является предметом).
 * Created by RINES on 08.02.17.
 */
public class KitItemStack implements KitItem {

    private final ItemStack item;

    public KitItemStack(ItemStack item) {
        this.item = item;
    }

    public ItemStack getItem() {
        return this.item;
    }

    @Override
    public void onAccept(Player player) {
        PlayerInventory inventory = player.getInventory();
        Map<Integer, ItemStack> over = inventory.addItem(item);
        //Если не все предметы добавлены, выбросим те, на которые на хватило места в инвентаре, рядом с игроком.
        if(!over.isEmpty()) {
            Location loc = player.getLocation();
            World w = loc.getWorld();
            over.values().forEach(i -> w.dropItem(loc, i));
        }
    }
}
