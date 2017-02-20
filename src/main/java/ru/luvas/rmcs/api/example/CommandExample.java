package ru.luvas.rmcs.api.example;

import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.player.RMCSPlayer;

/**
 * Created by RINES on 20.02.17.
 */
@Example
public class CommandExample {

    public static void load() {
        RMCSAPI.getCommandsAPI().register("testcommand", "/testcommand <id>", RMCSPlayer::isVip, (p, args) -> {
            try {
                p.getPlayer().sendMessage("Ты написал " + Integer.parseInt(args[0]) + ", и это число!");
            }catch(NumberFormatException ex) {
                p.getPlayer().sendMessage("Ты написал не целое число!");
            }
        }, "tc");
    }

}
