package de.snx.statsapi.addon.topwall.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSetwall implements CommandExecutor {

    //setwall <RANK> <SIGN/SKULL>


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)){
            return true;
        }

        Player player = (Player) sender;
        Location location = player.getLocation();

        if(args.length == 0){
            //setwall <RANK> <Sign/Skull> or righclick?
        }
        if(args.length == 2){
            //setwall
        }
        return true;
    }
}