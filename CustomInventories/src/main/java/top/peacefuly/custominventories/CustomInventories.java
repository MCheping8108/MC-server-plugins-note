package top.peacefuly.custominventories;

import org.bukkit.plugin.java.JavaPlugin;
import top.peacefuly.custominventories.Listener.MenuListener;
import top.peacefuly.custominventories.commands.PlayerMenuCommand;

public final class CustomInventories extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("menu").setExecutor(new PlayerMenuCommand());
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
