package org.cubeville.disableskeletontrap;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableSkeletonTrap extends JavaPlugin implements Listener
{
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void process(CreatureSpawnEvent event) {
        if(event.getEntityType() == EntityType.HORSE && event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.LIGHTNING) {
            event.setCancelled(true);
        }
    }
}
