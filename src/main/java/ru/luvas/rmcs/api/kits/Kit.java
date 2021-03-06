package ru.luvas.rmcs.api.kits;

import org.bukkit.entity.Player;

import java.util.List;

/**
 * Интерфейс, представляющий набор, который может быть получен игроком.
 * Created by RINES on 08.02.17.
 */
public interface Kit {

    /**
     * Метод, возвращающий название набора. Набор доступен по команде /kit name.
     * @return название набора.
     */
    String getName();

    /**
     * Метод, возвращающий время перезарядки набора в минутах.
     * @return время перезарядки набора в минутах.
     */
    int getCooldown();

    /**
     * Метод, возвращающий оставшееся для данного игрока время перезарядки в секундах.
     * @param player игрок, для которого мы хотим узнать оставшееся время перезарядки.
     * @return оставшееся для данного игрока время перезарядки набора в секундах.
     */
    int getCooldownFor(Player player);

    /**
     * Метод, проверяющий, что для данного игрока набор находится в стадии перезарядки. Использование метода
     * эквивалентно использованию <code>getCooldownFor(player) > 0</code>
     * @param player игрок, для которого мы хотим узнать, перезаряжается ли для него данный набор.
     * @return true, если набор перезаряжается для данного игрока, false иначе.
     */
    default boolean isCoolingDownFor(Player player) {
        return getCooldownFor(player) > 0;
    }

    /**
     * Метод, проверяющий, доступен ли данный игрок указанному игроку.
     * @param player игрок, для которого мы хотим узнать, доступен ли ему данный набор.
     * @return true, если набор доступен игроку (но, возможно, находится в перезарядке), false иначе.
     */
    boolean isAvailableFor(Player player);

    /**
     * Выдать набор указанному игроку, если это возможно (если набор ему доступен и не находится на перезарядке).
     * @param player игрок, которому мы хотим попытаться выдать данный набор.
     */
    void giveTo(Player player);

    /**
     * Метод, возвращающий список KitItem, состоящих в этом наборе, то есть список команд, которые будут исполнены
     * при получении набора игроком, и список предметов, которые будут добавлены к нему в инвентарь.
     * Изменение возвращаемой коллекции ни к чему не приведет, т.к. возвращается лишь копия оригинального списка.
     * @return список KitItem, находящихся в данном наборе.
     */
    List<KitItem> getItems();

}
