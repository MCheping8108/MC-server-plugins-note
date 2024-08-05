package top.peacefuly.teleportbow.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import top.peacefuly.teleportbow.TeleportBow;
import top.peacefuly.teleportbow.utility.BowUtils;

public class TeleportBowListener implements Listener {

    private final TeleportBow plugin;
    private final BowUtils bowUtils;

    public TeleportBowListener(TeleportBow plugin) {
        this.plugin = plugin;
        this.bowUtils = new BowUtils(plugin);
    }

    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {

        if (e.getEntity().getShooter() instanceof Player p) {
            ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-name")))){
                Location location = e.getEntity().getLocation();
                p.teleport(location);
                e.getEntity().remove();
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("teleported-message")));
            }
        }

    }

    @EventHandler
    public void onPlayedJoinEvent(PlayerJoinEvent e){
        if (plugin.getConfig().getBoolean("give-on-join")){
            Player p = e.getPlayer();
            p.getInventory().addItem(bowUtils.createTeleportBow());
            p.getInventory().addItem(new ItemStack(Material.ARROW, 1));

        }
    }
}
