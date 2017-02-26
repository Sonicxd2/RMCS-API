package ru.luvas.rmcs.api;

import ru.luvas.rmcs.api.player.RMCSPlayer;
import ru.luvas.rmcs.api.util.PlayerPredicate;

/**
 * Created by RINES on 20.02.17.
 */
public interface CommandsAPI {

    /**
     * Регистрация новой команды.
     * @param name название команды (без слеша).
     * @param usage подсказка к использованию команды.
     * @param usagePredicate предикат использования: консоль никогда не может использовать команды, зарегистрированные
     *                      данным образом, однако если команду использует игрок, то он будет прогоняться через этот
     *                      предикат, и команда будет допускаться к исполнению только в случае, если предикат вернет true.
     * @param command реализация команды.
     * @param aliases алиасы команды.
     */
    void register(String name, String usage, PlayerPredicate usagePredicate, CommandInterface command, String... aliases);

    interface CommandInterface {

        void execute(RMCSPlayer player, String[] args);

    }

}
