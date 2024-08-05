package top.peacefuly.teleportbow;

import org.bukkit.plugin.java.JavaPlugin;
import top.peacefuly.teleportbow.commands.GiveCommand;
import top.peacefuly.teleportbow.listeners.TeleportBowListener;

public final class TeleportBow extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("tpbow").setExecutor(new GiveCommand(this));
        getServer().getPluginManager().registerEvents(new TeleportBowListener(this), this);
//        getServer().getPluginManager(new TeleportBow(), this);
    }


}
