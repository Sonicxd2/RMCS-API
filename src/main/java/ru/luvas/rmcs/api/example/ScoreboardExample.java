package ru.luvas.rmcs.api.example;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.scoreboard.AnimationGamma;
import ru.luvas.rmcs.api.scoreboard.ScoreboardAPI;
import ru.luvas.rmcs.api.util.AutoListener;

/**
 * Created by RINES on 20.02.17.
 */
@Example
public class ScoreboardExample {

    private final static ScoreboardAPI api = RMCSAPI.getScoreboardAPI();

    public static void load() {
        api.prepare();
        api.setDisplayName("Немного инфы о тебе", AnimationGamma.GOLD);
        //Общие для всех строки:
        api.addGlobalScore(7, "&r&r&r");
        api.addGlobalScore(4, "&r&r");
        api.addGlobalScore(2, "&r");
        api.addGlobalScore(1, "&6Наш сайт: &bwww.dms.yt");
        new AutoListener() {

            @EventHandler
            public void onJoin(PlayerJoinEvent e) {
                setup(e.getPlayer());
            }

            @EventHandler
            public void onQuit(PlayerQuitEvent e) {
                api.invalidate(e.getPlayer());
            }

            @EventHandler(priority = EventPriority.MONITOR)
            public void onDamage(EntityDamageEvent e) {
                if(e.getEntity() instanceof Player)
                    api.updateScore((Player) e.getEntity(), 6, "Здоровье: &a%d", (int) (((Player) e.getEntity()).getHealth() - e.getFinalDamage()));
            }

            @EventHandler(priority = EventPriority.MONITOR)
            public void onRegainHealth(EntityRegainHealthEvent e) {
                if(e.getEntity() instanceof Player)
                    api.updateScore((Player) e.getEntity(), 6, "Здоровье: &a%d", (int) (((Player) e.getEntity()).getHealth() - e.getAmount()));
            }

            @EventHandler(priority = EventPriority.MONITOR)
            public void onRespawn(PlayerRespawnEvent e) {
                api.updateScore(e.getPlayer(), 6, "Здоровье: &a%d", (int) e.getPlayer().getMaxHealth());
            }

            @EventHandler(priority = EventPriority.MONITOR)
            public void onFoodLevelChange(FoodLevelChangeEvent e) {
                api.updateScore((Player) e.getEntity(), 5, "Голод: &a%d", e.getFoodLevel());
            }

        };
    }

    private static void setup(Player p) {
        api.addScore(p, 6, "Здоровье: &a%d", (int) p.getHealth());
        api.addScore(p, 5, "Голод: &a%d", p.getFoodLevel());
        api.addScore(p, 3, "Твой ник: &a%s", p.getName());
    }

}
