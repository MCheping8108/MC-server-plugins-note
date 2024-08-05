package top.peacefuly.bleed;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import top.peacefuly.bleed.BleedEvent.BleedEvent;

public final class Bleed extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Bleed has enabled");
        getServer().getPluginManager().registerEvents(new BleedEvent(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Bleed has disabled");
    }
}
