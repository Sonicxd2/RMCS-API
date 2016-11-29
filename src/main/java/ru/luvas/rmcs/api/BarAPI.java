package ru.luvas.rmcs.api;

import java.util.Collection;
import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
public interface BarAPI {

    public final static float DEFAULT_WIDTH = 0.33f;

    public final static int WAITING_R = 250, WAITING_G = 250, WAITING_B = 100;

    /**
     * Отправить конкретному игроку вечный прогресс-бар стандартной ширины.
     * @param p игрок.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     */
    public void send(Player p, String text, int r, int g, int b);

    /**
     * Отправить конкретному игроку прогресс-бар, который просуществует seconds секунд.
     * @param p игрок.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds время существования прогресс-бара.
     */
    public void send(Player p, String text, int r, int g, int b, int seconds);

    /**
     * Отправить конкретному игроку вечный прогресс-бар заданной ширины.
     * @param p игрок.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param width ширина прогресс-бара.
     */
    public void send(Player p, String text, int r, int g, int b, float width);

    /**
     * Отправить конкретному игроку прогресс-бар, который просуществует seconds секунд, заданной ширины.
     * @param p игрок.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds время существования прогресс-бара.
     * @param width ширина прогресс-бара.
     */
    public void send(Player p, String text, int r, int g, int b, int seconds, float width);

    /**
     * Отправить конкретному игроку прогресс-бар, который просуществует seconds-launchedSecondsAgo секунд,
     * но полная заполненность которого будет соответствовать seconds секундам времени.
     * @param p игрок.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds полное время существования прогресс-бара.
     * @param launchedSecondsAgo сколько секунд назад начался отсчет времени для данного прогресс-бара.
     */
    public void send(Player p, String text, int r, int g, int b, int seconds, int launchedSecondsAgo);

    /**
     * Отправить конкретному игроку прогресс-бар с заданным прогрессом и заданной ширины.
     * Этот метод не рекомендуется к использованию, так как заполненность прогресс-бара изменится уже через секунду.
     * Рекомендуется использование других методов данного интерфейса.
     * @param p игрок.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param progress заполненность прогресс-бара в долях (от 0 до 1).
     * @param width ширина прогресс-бара (базовое значение - DEFAULT_WIDTH).
     */
    @Deprecated
    public void send(Player p, String text, int r, int g, int b, float progress, float width);

    /**
     * Отправить конкретному игроку прогресс-бар, который просуществует seconds-launchedSecondsAgo секунд,
     * но полная заполненность которого будет соответствовать seconds секундам времени, заданной ширины.
     * @param p игрок.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds полное время существования прогресс-бара.
     * @param launchedSecondsAgo сколько секунд назад начался отсчет времени для данного прогресс-бара.
     * @param width ширина прогресс-бара.
     */
    public void send(Player p, String text, int r, int g, int b, int seconds, int launchedSecondsAgo, float width);

    /**
     * Отправить всем игрокам указанной коллекции вечный прогресс-бар стандартной ширины.
     * @param players игроки.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     */
    public void send(Collection<Player> players, String text, int r, int g, int b);

    /**
     * Отправить всем игрокам заданной коллекции прогресс-бар, который просуществует seconds секунд.
     * @param players игроки.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds время существования прогресс-бара.
     */
    public void send(Collection<Player> players, String text, int r, int g, int b, int seconds);

    /**
     * Отправить всем игрокам заданной коллекции вечный прогресс-бар заданной ширины.
     * @param players игроки.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param width ширина прогресс-бара.
     */
    public void send(Collection<Player> players, String text, int r, int g, int b, float width);

    /**
     * Отправить всем игрокам заданной коллекции прогресс-бар, который просуществует seconds секунд, заданной ширины.
     * @param players игроки.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds время существования прогресс-бара.
     * @param width ширина прогресс-бара.
     */
    public void send(Collection<Player> players, String text, int r, int g, int b, int seconds, float width);

    /**
     * Отправить всем игрокам заданной коллекции прогресс-бар, который просуществует seconds-launchedSecondsAgo секунд,
     * но полная заполненность которого будет соответствовать seconds секундам времени.
     * @param players игроки.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds полное время существования прогресс-бара.
     * @param launchedSecondsAgo сколько секунд назад начался отсчет времени для данного прогресс-бара.
     */
    public void send(Collection<Player> players, String text, int r, int g, int b, int seconds, int launchedSecondsAgo);

    /**
     * Отправить всем игрокам заданной коллекции прогресс-бар с заданным прогрессом и заданной ширины.
     * Этот метод не рекомендуется к использованию, так как заполненность прогресс-бара изменится уже через секунду.
     * Рекомендуется использование других методов данного интерфейса.
     * @param players игроки.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param progress заполненность прогресс-бара в долях (от 0 до 1).
     * @param width ширина прогресс-бара (базовое значение - DEFAULT_WIDTH).
     */
    @Deprecated
    public void send(Collection<Player> players, String text, int r, int g, int b, float progress, float width);

    /**
     * Отправить всем игрокам заданной коллекции прогресс-бар, который просуществует seconds-launchedSecondsAgo секунд,
     * но полная заполненность которого будет соответствовать seconds секундам времени, заданной ширины.
     * @param players игроки.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds полное время существования прогресс-бара.
     * @param launchedSecondsAgo сколько секунд назад начался отсчет времени для данного прогресс-бара.
     * @param width ширина прогресс-бара.
     */
    public void send(Collection<Player> players, String text, int r, int g, int b, int seconds, int launchedSecondsAgo, float width);

    /**
     * Отправить всем игрокам вечный прогресс-бар стандартной ширины.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     */
    public void broadcast(String text, int r, int g, int b);

    /**
     * Отправить всем игрокам прогресс-бар, который просуществует seconds секунд.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds время существования прогресс-бара.
     */
    public void broadcast(String text, int r, int g, int b, int seconds);

    /**
     * Отправить всем игрокам вечный прогресс-бар заданной ширины.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param width ширина прогресс-бара.
     */
    public void broadcast(String text, int r, int g, int b, float width);

    /**
     * Отправить всем игрокам прогресс-бар, который просуществует seconds секунд, заданной ширины.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds время существования прогресс-бара.
     * @param width ширина прогресс-бара.
     */
    public void broadcast(String text, int r, int g, int b, int seconds, float width);

    /**
     * Отправить всем игрокам прогресс-бар, который просуществует seconds-launchedSecondsAgo секунд,
     * но полная заполненность которого будет соответствовать seconds секундам времени.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds полное время существования прогресс-бара.
     * @param launchedSecondsAgo сколько секунд назад начался отсчет времени для данного прогресс-бара.
     */
    public void broadcast(String text, int r, int g, int b, int seconds, int launchedSecondsAgo);

    /**
     * Отправить всем игрокам прогресс-бар с заданным прогрессом и заданной ширины.
     * Этот метод не рекомендуется к использованию, так как заполненность прогресс-бара изменится уже через секунду.
     * Рекомендуется использование других методов данного интерфейса.
     * @param text текст прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param progress заполненность прогресс-бара в долях (от 0 до 1).
     * @param width ширина прогресс-бара (базовое значение - DEFAULT_WIDTH).
     */
    @Deprecated
    public void broadcast(String text, int r, int g, int b, float progress, float width);

    /**
     * Отправить всем игрокам прогресс-бар, который просуществует seconds-launchedSecondsAgo секунд,
     * но полная заполненность которого будет соответствовать seconds секундам времени, заданной ширины.
     * @param text текст прогресс-бара. %time% заменится на кол-во оставшегося времени существования прогресс-бара.
     * @param r красная составляющая цвета.
     * @param g зеленая составляющая цвета.
     * @param b синяя составляющая цвета.
     * @param seconds полное время существования прогресс-бара.
     * @param launchedSecondsAgo сколько секунд назад начался отсчет времени для данного прогресс-бара.
     * @param width ширина прогресс-бара.
     */
    public void broadcast(String text, int r, int g, int b, int seconds, int launchedSecondsAgo, float width);

    /**
     * Убрать прогресс-бар для конкретного игрока.
     * @param p игрок.
     */
    public void clear(Player p);

    /**
     * Убрать прогресс-бар для всех игроков.
     */
    public void clearForAll();

}
