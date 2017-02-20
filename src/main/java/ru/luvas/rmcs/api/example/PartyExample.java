package ru.luvas.rmcs.api.example;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import ru.luvas.rmcs.api.RMCSAPI;
import ru.luvas.rmcs.api.party.Party;
import ru.luvas.rmcs.api.util.AutoListener;

/**
 * Created by RINES on 20.02.17.
 */
@Example
public class PartyExample {

    public static void load() {
        new AutoListener() {

            @EventHandler(priority = EventPriority.HIGHEST)
            public void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
                Entity damager = e.getDamager(), victim = e.getEntity();
                if(!(victim instanceof Player))
                    return;
                Player pv = (Player) victim, pd = getPlayerDamager(damager);
                if(pd == null)
                    return;
                Party party = RMCSAPI.getPartyAPI().getParty(pv);
                if(party != null && party.isInParty(pd)) {
                    e.setCancelled(true);
                    pd.sendMessage(ChatColor.RED + "Вы не можете атаковать членов своей группы!");
                }
            }

        };
    }

    private static Player getPlayerDamager(Entity damager) {
        if(damager instanceof Player)
            return (Player) damager;
        if(damager instanceof Projectile) {
            Projectile pj = (Projectile) damager;
            if(pj.getShooter() instanceof Player)
                return (Player) pj.getShooter();
        }
        return null;
    }

}
