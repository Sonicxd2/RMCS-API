package ru.luvas.rmcs.api.example;

import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import ru.luvas.rmcs.api.DmsMaterials;
import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.inventory.DynamicInventory;
import ru.luvas.rmcs.api.inventory.DynamicItem;
import ru.luvas.rmcs.api.util.AutoListener;

/**
 * Created by RINES on 20.02.17.
 */
@Example
public class InventoryExample {

    private static DynamicInventory inv;

    public static void load() {
        inv = RMCSAPI.getInventoryAPI().createNewInventory("Тестовый инвентарь", 3);
        inv.addItem(2, 4, new DynamicItem(DmsMaterials.PURPLE_BOOK, "&5Книжечка", Lists.newArrayList(),
                (p, clickType, slot) -> p.sendMessage("Ты нажал на книжечку, что слева!")));
        inv.addItem(2, 6, new DynamicItem(Material.ENCHANTED_BOOK, "&6Другая книжечка", Lists.newArrayList(),
                (p, clickType, slot) -> p.sendMessage("Ты нажал на книжечку, что справа!")));
        new AutoListener() {

            @EventHandler
            public void onJoin(PlayerJoinEvent e) {
                inv.open(e.getPlayer());
            }

        };
    }

}
