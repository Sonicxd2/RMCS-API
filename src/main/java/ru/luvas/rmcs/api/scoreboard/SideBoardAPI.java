package ru.luvas.rmcs.api.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Created by RINES on 04.09.17.
 */
public interface SideBoardAPI {

    /**
     * Отправить строку сайдборда.
     * @param player игрок, которому отправить.
     * @param priority приоритет: чем он выше, тем выше будет строка. Строка с максимальным приоритетом является
     *                 заголовком сайдборда. Если отправляется строка с приоритетом, уже установленным у одной из строк,
     *                 предыдущая строка с указанным приоритетом будет заменена данной строкой (таким образом,
     *                 в сайдборде не может быть несколько строк с одним приоритетом).
     * @param key ключ (левая часть) строки.
     * @param value значение (правая часть) строки.
     */
    void send(Player player, int priority, String key, String value);

    /**
     * Отправить анимированную строку сайдборда. Имейте ввиду, что анимация работает только на заголовке сайдборда.
     * @param player игрок, которому отправить.
     * @param priority {@link SideBoardAPI#send(Player, int, String, String)}
     * @param key текст строки.
     * @param animationGamma цветовая гамма для анимации.
     */
    void send(Player player, int priority, String key, AnimationGamma animationGamma);

    /**
     * Убрать из сайдборда игрока строку с заданным приоритетом.
     * @param player игрок, у которого нужно удалить строку.
     * @param priority приоритет строки.
     */
    void remove(Player player, int priority);

    /**
     * Отправить всем игрокам строку сайдборда.
     * @param priority {@link SideBoardAPI#send(Player, int, String, String)}
     * @param key ключ (левая часть) строки.
     * @param value значение (правая часть) строки.
     */
    default void sendAll(int priority, String key, String value) {
        Bukkit.getOnlinePlayers().forEach(p -> send(p, priority, key, value));
    }

    /**
     * Отправить анимированную строку сайдборда всем игрокам сервера. Имейте ввиду, что анимация работает только на заголовке сайдборда.
     * @param priority {@link SideBoardAPI#send(Player, int, String, String)}
     * @param key текст строки.
     * @param animationGamma цветовая гамма для анимации.
     */
    default void sendAll(int priority, String key, AnimationGamma animationGamma) {
        Bukkit.getOnlinePlayers().forEach(p -> send(p, priority, key, animationGamma));
    }

    /**
     * Убрать из сайдборда всех игроков строку с заданным приоритетом.
     * @param priority приоритет строки.
     */
    default void removeAll(int priority) {
        Bukkit.getOnlinePlayers().forEach(p -> remove(p, priority));
    }

}
