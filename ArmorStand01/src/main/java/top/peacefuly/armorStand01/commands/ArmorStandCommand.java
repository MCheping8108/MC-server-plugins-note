package top.peacefuly.armorStand01.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import top.peacefuly.armorStand01.ArmorStand01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArmorStandCommand implements CommandExecutor {
    ArmorStand01 plugin;
    public ArmorStandCommand(ArmorStand01 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            plugin.openMainMenu(player);
        }

        return true;
    }
}
