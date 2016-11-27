package ru.luvas.rmcs.api.party;

import ru.luvas.rmcs.api.player.RMCSPlayer;

/**
 *
 * @author 0xC0deBabe
 */
public interface PartyAPI {

    /**
     * Метод, запрашивающий информацию о группе игрока и исполняющий переданный runnable,
     * когда будет получена информация о группе.
     * Следует учитывать, что переданный runnable будет выполнен в асинхронном потоке.
     * @param partyMember игрок, информацию о группе которого мы хотим узнать (не обязательно лидер).
     * @param runnable действие, которое должно быть выполнено, когда информация о группе будет получена.
     */
    public void processPartyReception(RMCSPlayer partyMember, PartyReceptionRunnable runnable);
    
}
