package ru.luvas.rmcs.api.util;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

/**
 * Created by RINES on 20.02.17.
 */
public class AutoListener implements Listener {

    public AutoListener() {
        Bukkit.getPluginManager().registerEvents(this, Bukkit.getPluginManager().getPlugin("RMCS-API"));
    }

}
