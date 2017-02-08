package ru.luvas.rmcs.api.kits;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Класс, представляющий команду, исполняемую при получении набора игроком.
 * Created by RINES on 08.02.17.
 */
public class KitCommand implements KitItem {

    private final String command;

    public KitCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return this.command;
    }

    public String getCommand(String player) {
        return this.command.replace("%player%", player);
    }

    @Override
    public void onAccept(Player player) {
        String cmd = getCommand(player.getName());
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd);
    }
}
