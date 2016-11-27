package ru.luvas.rmcs.api.player;

import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
public interface RMCSPlayerManager {

    /**
     * Получить класс RMCSPlayer по нику игрока, регистр неважен.
     * @param name ник игрока.
     * @return RMCS-игрока с данным ником или null, если он не в сети.
     */
    public RMCSPlayer getPlayer(String name);
    
    /**
     * Получить класс RMCSPlayer по объекту игрока.
     * @param player объект игрока.
     * @return RMCS-игрока с ником, как у переданного, или null, если переданный игрок не в сети.
     */
    public RMCSPlayer getPlayer(Player player);
    
}
