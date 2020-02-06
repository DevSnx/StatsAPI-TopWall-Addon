package de.snx.statsapi.addon.topwall;

import de.snx.statsapi.StatsAPI;
import de.snx.statsapi.addon.topwall.manager.FileManager;
import org.bukkit.plugin.java.JavaPlugin;

public class StatsAPIAddon extends JavaPlugin {

    public static StatsAPIAddon instance;
    public static StatsAPI statsAPI;
    public static FileManager fileManager;

    @Override
    public void onEnable() {
        instance = this;
        fileManager = new FileManager();






    }

    @Override
    public void onDisable() {
    }

    public static StatsAPIAddon getInstance() {
        return instance;
    }

    public static StatsAPI getStatsAPI() {
        return statsAPI;
    }
}