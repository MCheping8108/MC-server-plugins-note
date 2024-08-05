package top.peacefuly.custominventories.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        if (e.getView().getTitle().equals(ChatColor.AQUA + "Custom GUI")){
            if (e.isRightClick()) return;
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            switch (e.getCurrentItem().getType()) {
                case BREAD -> {
                    player.setFoodLevel(20);
                    player.sendMessage("吃饱啦！");
                }
                case TNT -> {
                    player.setHealth(0);
                    player.sendMessage("你噶啦！");
                }
                case DIAMOND_SWORD -> {
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                    player.sendMessage("你获得了武器");
                }
            }
        }

    }
}
