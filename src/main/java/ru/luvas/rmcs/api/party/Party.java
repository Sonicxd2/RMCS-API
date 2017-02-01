package ru.luvas.rmcs.api.party;

import org.bukkit.entity.Player;
import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.player.RMCSPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, описывающий группу игроков.
 * Содержимое класса не обновляется с течением времени, посему для проверки любых изменений необходимо
 * запрашивать новый экземпляр данного класса в менеджере групп.
 * @author RINES
 */
public final class Party {

    private final PartyMember leader;
    private final List<PartyMember> members;
    private final List<PartyMember> allMembers;

    public Party(PartyMember leader, List<PartyMember> members) {
        this.leader = leader;
        this.members = members;
        this.allMembers = new ArrayList<>();
        this.allMembers.add(leader);
        this.allMembers.addAll(members);
    }

    /**
     * Метод, возвращающий лидер данной группы.
     * @return лидера группы.
     */
    public PartyMember getLeader() {
        return this.leader;
    }

    /**
     * Метод, возвращающий список членов данной группы (без лидера).
     * @return список членов группы, исключая лидера.
     */
    public List<PartyMember> getMembers() {
        return this.members;
    }

    /**
     * Метод, возвращающий список членов данной группы (включая лидера, он на первой позиции списка).
     * @return список всех членов группы, включая лидера.
     */
    public List<PartyMember> getAllMembers() {
        return this.allMembers;
    }

    /**
     * Метод, возвращающий список членов данной группы, находящихся на данном сервере.
     * Лидер будет включен в возвращаемый список, если он находится на данном сервере (и будет на первой позиции).
     * @return список всех членов группы, находящихся на данном сервере, включая лидера.
     */
    public List<PartyMember> getThisServerPlayers() {
        String serverName = RMCSAPI.getBungeeAPI().getServerName();
        return getAllMembers().stream().filter(pm -> pm.getServer().equals(serverName))
                .collect(Collectors.toList());
    }

    /**
     * Метод, проверяющий, является ли указанный игрок лидером данной группы.
     * @param player ник игрока.
     * @return true, если является, и false иначе.
     */
    public boolean isLeader(String player) {
        return this.leader.getNickname().equalsIgnoreCase(player);
    }

    /**
     * Метод, проверяющий, является ли указанный игрок лидером данной группы.
     * @param player bukkit-экземпляр игрока.
     * @return true, если является, и false иначе.
     */
    public boolean isLeader(Player player) {
        return isLeader(player.getName());
    }

    /**
     * Метод, проверяющий, является ли указанный игрок лидером данной группы.
     * @param player rmcs-экземпляр игрока.
     * @return true, если является, и false иначе.
     */
    public boolean isLeader(RMCSPlayer player) {
        return isLeader(player.getName());
    }

    /**
     * Метод, проверяющий, является ли указанный игрок членом данной группы (лидер не считается за члена группы).
     * @param player ник игрока.
     * @return true, если является, и false иначе.
     */
    public boolean isMember(String player) {
        return this.members.stream().map(PartyMember::getNickname).anyMatch(p -> p.equalsIgnoreCase(player));
    }

    /**
     * Метод, проверяющий, является ли указанный игрок членом данной группы (лидер не считается за члена группы).
     * @param player bukkit-экземпляр игрока.
     * @return true, если является, и false иначе.
     */
    public boolean isMember(Player player) {
        return isMember(player.getName());
    }

    /**
     * Метод, проверяющий, является ли указанный игрок членом данной группы (лидер не считается за члена группы).
     * @param player rmcs-экземпляр игрока.
     * @return true, если является, и false иначе.
     */
    public boolean isMember(RMCSPlayer player) {
        return isMember(player.getName());
    }

    /**
     * Метод, проверяющий, состоит ли указанный игрок в данной группе (то есть является ли он лидером или участником).
     * @param player ник игрока.
     * @return true, если состоит, и false иначе.
     */
    public boolean isInParty(String player) {
        return isLeader(player) || isMember(player);
    }

    /**
     * Метод, проверяющий, состоит ли указанный игрок в данной группе (то есть является ли он лидером или участником).
     * @param player bukkit-экземпляр игрока.
     * @return true, если состоит, и false иначе.
     */
    public boolean isInParty(Player player) {
        return isInParty(player.getName());
    }

    /**
     * Метод, проверяющий, состоит ли указанный игрок в данной группе (то есть является ли он лидером или участником).
     * @param player rmcs-экземпляр игрока.
     * @return true, если состоит, и false иначе.
     */
    public boolean isInParty(RMCSPlayer player) {
        return isInParty(player.getName());
    }

}
