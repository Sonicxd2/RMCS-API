package ru.luvas.rmcs.api;

import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
 public interface TitleAPI {
    
    /**
     * Отправить большой тайтл указанному игроку.
     * @param p игрок.
     * @param msg сообщение тайтла.
     */
     void sendTitle(Player p, String msg);

    /**
     * Отправить большой тайтл указанному игроку с отформатированным текстом (String.format(msg, args)).
     * @param p игрок.
     * @param msg сообщение тайтла.
     * @param args аргументы формативарования.
     */
     void sendTitle(Player p, String msg, Object... args);
    
    /**
     * Отправить маленький тайтл указанному игроку.
     * @param p игрок.
     * @param msg сообщение тайтла.
     */
     void sendSubtitle(Player p, String msg);

    /**
     * Отправить маленький тайтл указанному игроку с отформатированным текстом (String.format(msg, args)).
     * @param p игрок.
     * @param msg сообщение тайтла.
     * @param args аргументы формативарования.
     */
     void sendSubtitle(Player p, String msg, Object... args);
    
    /**
     * Отправить сообщение немногим выше полоски опыта указанному игроку.
     * @param p игрок.
     * @param msg сообщение.
     */
     void sendSmallestTitle(Player p, String msg);
    
    /**
     * Отправить сообщение немногим выше полоски опыта указанному игроку с отформатированным текстом (String.format(msg, args)).
     * @param p игрок.
     * @param msg сообщение тайтла.
     * @param args аргументы формативарования.
     */
     void sendSmallestTitle(Player p, String msg, Object... args);
    
    /**
     * Отправить всем игрокам сервера верхнее и нижнее сообщения в табе.
     * @param header верхнее сообщение.
     * @param footer нижнее сообщение.
     */
     void broadcastTabHeaderAndFooter(String header, String footer);
    
    /**
     * Отправить указанному игроку верхнее сообщение в табе.
     * @param p игрок.
     * @param msg сообщение.
     */
     void sendTabHeader(Player p, String msg);
    
    /**
     * Отправить указанному игроку нижнее сообщение в табе.
     * @param p игрок.
     * @param msg сообщение.
     */
     void sendTabFooter(Player p, String msg);
    
    /**
     * Отправить указанному игроку верхнее и нижнее сообщения в табе.
     * @param p игрок.
     * @param header верхнее сообщение.
     * @param footer нижнее сообщение.
     */
     void sendTabHeaderAndFooter(Player p, String header, String footer);

}
