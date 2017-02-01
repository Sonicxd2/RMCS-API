package ru.luvas.rmcs.api;

import java.util.Collection;
import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
public interface BungeeAPI {

    /**
     * Получить название данного сервера.
     * @return название данного сервера.
     */
    String getServerName();
    
    /**
     * Получить название лобби для данного сервера.
     * @return название лобби для данного сервера.
     */
    String getLobbyName();
    
    /**
     * Отправить указанного игрока на лобби-сервер.
     * @param p игрок.
     */
    void sendToLobbyServer(Player p);
    
    /**
     * Отправить указанных игроков на лобби-сервер.
     * @param players игроки.
     */
    void sendToLobbyServer(Collection<Player> players);
    
    /**
     * Отправить всех онлайн-игроков на лобби-сервер.
     */
    void sendAllPlayersToLobbyServer();
    
}
