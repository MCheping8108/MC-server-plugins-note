package top.peacefuly.teleportbow.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import top.peacefuly.teleportbow.TeleportBow;
import top.peacefuly.teleportbow.utility.BowUtils;


public class GiveCommand implements CommandExecutor {

    private final TeleportBow plugin;
    private final BowUtils bowUtils;

    public GiveCommand(TeleportBow plugin) {
        this.plugin = plugin;
        this.bowUtils = new BowUtils(plugin);
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player p){
            if(p.hasPermission("tpbow.givebow")){
                if (strings.length == 0){
                    ItemStack bow = bowUtils.createTeleportBow();
                    p.getInventory().addItem(bow);
                    p.getInventory().addItem(new ItemStack(Material.ARROW, 1));

                    p.sendMessage(ChatColor.GREEN+"You have been given yourself a teleport bow");
                }else {
                    Player target = Bukkit.getPlayerExact(strings[0]);

                    if (target == null){
                        p.sendMessage(ChatColor.RED + "This player does not exist.");
                        return true;
                    }

                    ItemStack bow = bowUtils.createTeleportBow();
                    target.getInventory().addItem(bow);
                    target.getInventory().addItem(new ItemStack(Material.ARROW, 1));

                    target.sendMessage(ChatColor.GREEN+"You have been given a teleport bow");
                }
            }
        }
        return true;
    }
}
