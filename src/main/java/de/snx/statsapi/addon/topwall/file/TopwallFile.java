package de.snx.statsapi.addon.topwall.file;

import de.snx.statsapi.file.FileBase;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.meta.SkullMeta;

public class TopwallFile extends FileBase {

    public TopwallFile(){
        super("", "");
        writeDefaults();
        loadSkulls();
    }

    public void writeDefaults(){
        FileConfiguration cfg = getConfig();
        cfg.addDefault("TOPWALL.SETTINGS.ISPLAYERS", 3);
        cfg.addDefault("TOPWALL.SETTINGS.SIGN.LINE.1", "#%RANK#");
        cfg.addDefault("TOPWALL.SETTINGS.SIGN.LINE.2", "&7%PLAYERNAME%");
        cfg.addDefault("TOPWALL.SETTINGS.SIGN.LINE.3", "&7KILLS");
        cfg.addDefault("TOPWALL.SETTINGS.SIGN.LINE.4", "&b%KILLS%");
        cfg.options().copyDefaults(true);
        saveConfig();
    }

    public void loadSkulls(){
        for(int i = 0; i < 10; i++){
            //SETPLAYERSKULLS!
        }
    }

    public Location getLocation(Integer skull, boolean direction){
        Location loc = null;
        String path = "TOPWALL.LOCATION.TOP." + skull + ".LOCATION";
        if (getConfig().contains(path)){
            String w = getConfig().getString(path + ".WORLD");
            double x = getConfig().getDouble(path + ".X");
            double y = getConfig().getDouble(path + ".Y");
            double z = getConfig().getDouble(path + ".Z");
            double yaw = 0.0D;
            double pitch = 0.0D;
            if (getConfig().contains(path + ".YAW")){
                yaw = getConfig().getDouble(path + ".YAW");
                pitch = getConfig().getDouble(path + ".PITCH");
            }
            loc = new Location(Bukkit.getWorld(w), x, y, z);
            if (direction){
                loc.setYaw((float)yaw);
                loc.setPitch((float)pitch);
            }
        }else{
            return null;
        }
        return loc;
    }

    public void setLocation(Integer skull, Location loc, boolean direction){
        FileConfiguration cfg = getConfig();
        String path = "TOPWALL.LOCATION.TOP." + skull + ".LOCATION";
        cfg.set(path + ".WORLD", loc.getWorld().getName());
        cfg.set(path + ".X", Double.valueOf(loc.getX()));
        cfg.set(path + ".Y", Double.valueOf(loc.getY()));
        cfg.set(path + ".Z", Double.valueOf(loc.getZ()));
        if (direction){
            cfg.set(path + ".YAW", Float.valueOf(loc.getYaw()));
            cfg.set(path + ".PITCH", Float.valueOf(loc.getPitch()));
        }
        saveConfig();
    }
}