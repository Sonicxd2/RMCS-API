package ru.luvas.rmcs.api.kits;

import org.bukkit.entity.Player;

/**
 * Интерфейс, характеризующий то, что может находиться в наборе.
 * Created by RINES on 08.02.17.
 */
public interface KitItem {

    /**
     * Метод, исполняемый при получении игроком набора, в котором находится данный KitItem.
     * @param player игрок, получивший набор.
     */
    void onAccept(Player player);

}
