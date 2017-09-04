package ru.luvas.rmcs.api.example;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.player.RMCSPlayer;
import ru.luvas.rmcs.api.table.Table;

/**
 * Created by RINES on 04.09.17.
 */
@Example
public class TableExample {

    public static void load() {
        Location spawn = new Location(Bukkit.getWorlds().get(0), 10, 120, 15);
        spawn.setYaw(90F);
        Table table = new Table(0)
                .location(spawn)
                .column("§6#", 15)
                .column("Ник игрока", 125)
                .column("Рейтинг", 40)
                .row("§61", getPlayerName("RINES"), String.valueOf(4000))
                .row("§62", getPlayerName("Darkness091"), String.valueOf(3876))
                .row("§63", getPlayerName("GoldMorphiN"), String.valueOf(3600))
                .row("§64", getPlayerName("Legosky007"), String.valueOf(3500))
                .row("§65", getPlayerName("kasdo"), String.valueOf(3449));
        for(int i = 6; i <= 20; ++i)
            table.row("§6" + i, "§7Tester" + i, String.valueOf(3500 - (i - 5) * 100));
        table.create();
    }

    private static String getPlayerName(String nickname) {
        RMCSPlayer player = RMCSAPI.getPlayerManager().getPlayer(nickname);
        return ChatColor.translateAlternateColorCodes('&', player == null ? "&7" + nickname : player.getLongPrefix() + player.getName());
    }

}
