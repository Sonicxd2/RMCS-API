package ru.luvas.rmcs.api;

import java.util.Collection;
import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe <iam@kostya.sexy>
 */
public interface BungeeAPI {

    /**
     * Получить название данного сервера.
     * @return название данного сервера.
     */
    public String getServerName();
    
    /**
     * Получить название лобби для данного сервера.
     * @return название лобби для данного сервера.
     */
    public String getLobbyName();
    
    /**
     * Отправить указанного игрока на лобби-сервер.
     * @param p игрок.
     */
    public void sendToLobbyServer(Player p);
    
    /**
     * Отправить указанных игроков на лобби-сервер.
     * @param players игроки.
     */
    public void sendToLobbyServer(Collection<Player> players);
    
    /**
     * Отправить всех онлайн-игроков на лобби-сервер.
     */
    public void sendAllPlayersToLobbyServer();
    
}
