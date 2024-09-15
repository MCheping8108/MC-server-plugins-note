package top.peacefuly.holograms;

import org.bukkit.plugin.java.JavaPlugin;
import top.peacefuly.holograms.command.HologramsCommand;

public final class Holograms extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("holograms").setExecutor(new HologramsCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
