package de.snx.statsapi.addon.topwall.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        event.getClickedBlock().getLocation().getDirection();








    }
}
