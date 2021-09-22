package me.lordmefloun.grapplinghook2;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {


    @EventHandler
    public void onFish(PlayerFishEvent e){
        if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(Item.getHook().getItemMeta().getDisplayName())) {
            if (e.getState() == PlayerFishEvent.State.IN_GROUND  || e.getState() == PlayerFishEvent.State.FAILED_ATTEMPT) {
                if (NotInAir( e.getHook().getLocation())) {
                    Location playerLocation = e.getPlayer().getLocation();
                    Location hookingLocation = e.getHook().getLocation();
                    Location change = hookingLocation.subtract(playerLocation);
                    e.getPlayer().setVelocity(change.toVector().multiply(0.3));
                }
            }
        }

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.getPlayer().getInventory().addItem(Item.getHook());
    }

    public boolean NotInAir(Location loc){
        loc = loc.subtract(0, 1, 0);
        if (loc.getBlock().getType() != Material.AIR){
            return true;
        }
        return false;
    }
}
