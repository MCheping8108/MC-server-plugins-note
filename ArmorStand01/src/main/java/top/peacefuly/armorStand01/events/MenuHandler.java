package top.peacefuly.armorStand01.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import top.peacefuly.armorStand01.ArmorStand01;

import java.util.Objects;

public class MenuHandler implements Listener {
    public MenuHandler(ArmorStand01 plugin) {
        this.plugin = plugin;
    }

    ArmorStand01 plugin;

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player player = (Player) e.getWhoClicked();

        final String MAIN_MENU = ChatColor.BLUE + "ArmorStand GUI";
        final String CREATE_MENU = ChatColor.GREEN + "Create a Armor Stand";

        if (e.getView().getTitle().equalsIgnoreCase(MAIN_MENU)){
            switch (Objects.requireNonNull(e.getCurrentItem()).getType()){
                case ARMOR_STAND -> {
                    player.sendMessage("opened armor stand create menu");
                    plugin.openCreateMenu(player);
                }
                case BARRIER -> {
                    player.sendMessage("closing main menu");
                    player.closeInventory();
                }
            }
            e.setCancelled(true);
        } else if (e.getView().getTitle().equalsIgnoreCase(CREATE_MENU)) {
            switch (Objects.requireNonNull(e.getCurrentItem()).getType()){
                case ARMOR_STAND -> {
                    player.sendMessage("Add arms?");
                    plugin.openConfirmMenu(player, Material.ARMOR_STAND);
                }
                case BEACON -> {
                    player.sendMessage("Add Glow?");
                    plugin.openConfirmMenu(player, Material.BEACON);
                }

            }
            e.setCancelled(true);
        } else if (e.getView().getTitle().equalsIgnoreCase(ChatColor.GREEN+"Confirm Option")) {
            if (e.getClickedInventory().contains(Material.ARMOR_STAND)) {
                switch (Objects.requireNonNull(e.getCurrentItem()).getType()){
                    case GREEN_WOOL -> {
                        player.sendMessage("Add armor?");
                        plugin.openConfirmMenu(player, Material.GREEN_WOOL);
                    }
                    case RED_WOOL -> {
                        player.sendMessage("Cancelled");
                        player.closeInventory();
                    }
                }
            }
            e.setCancelled(true);
        }
    }
}
