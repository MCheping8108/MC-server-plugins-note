package top.peacefuly.custominventories.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class PlayerMenuCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player){
            Inventory menu = Bukkit.createInventory(player,9, ChatColor.AQUA + "Custom GUI");
            ItemStack feed = new ItemStack(Material.BREAD);
            ItemStack death = new ItemStack(Material.TNT);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);

            ItemMeta feedMeta = feed.getItemMeta();
            feedMeta.setDisplayName(ChatColor.GREEN + "feed");
            feedMeta.setLore(List.of(ChatColor.GOLD + "Hunger no more"));
            feed.setItemMeta(feedMeta);

            ItemMeta deathMeta = death.getItemMeta();
            deathMeta.setDisplayName(ChatColor.RED + "kill");
            deathMeta.setLore(List.of(ChatColor.GOLD + "Death is inevitable."));
            death.setItemMeta(deathMeta);

            ItemMeta swordMeta = sword.getItemMeta();
            swordMeta.setDisplayName(ChatColor.GOLD + "King sword");
            swordMeta.setLore(List.of(ChatColor.GOLD + "give a weapon."));
            sword.setItemMeta(swordMeta);

            menu.setItem(0,feed);
            menu.setItem(4,death);
            menu.setItem(8,sword);

            player.openInventory(menu);

        } else {
            commandSender.sendMessage("无效");
        }

        return true;
    }
}
