package me.lordmefloun.grapplinghook2;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {


    @EventHandler
    public void onFish(PlayerFishEvent e){
        if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(Item.getHook().getItemMeta().getDisplayName())) {
            if (e.getState().equals(PlayerFishEvent.State.IN_GROUND)) {
                Location playerLocation = e.getPlayer().getLocation();
                Location hookingLocation = e.getHook().getLocation();
                Location change = hookingLocation.subtract(playerLocation);
                e.getPlayer().setVelocity(change.toVector().multiply(0.3));
            }
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.getPlayer().getInventory().addItem(Item.getHook());
    }
}
