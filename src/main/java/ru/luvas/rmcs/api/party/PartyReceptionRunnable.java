package ru.luvas.rmcs.api.party;

import java.util.List;
import ru.luvas.rmcs.api.player.RMCSPlayer;

/**
 *
 * @author 0xC0deBabe
 */
public interface PartyReceptionRunnable {

    /**
     * Действие, которое будет выполнено, когда получена информация о группе игрока.
     * @param partyMembers список членов группы игрока. Если игрок не состоит в группе, этот список будет пуст (но не null).
     */
    void onReceive(List<RMCSPlayer> partyMembers);
    
}
