package ru.luvas.rmcs.api.util;

import ru.luvas.rmcs.api.player.RMCSPlayer;

/**
 * Created by RINES on 20.02.17.
 */
public interface PlayerPredicate {

    boolean check(RMCSPlayer player);

}
