package top.peacefuly.teleportbow.utility;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import top.peacefuly.teleportbow.TeleportBow;

import java.util.ArrayList;
import java.util.List;

public class BowUtils {
    private final TeleportBow plugin;
//    private final BowUtils bowUtils;

    public BowUtils(TeleportBow plugin) {
        this.plugin = plugin;
//        this.bowUtils = new BowUtils(plugin);
    }

    public ItemStack createTeleportBow(){
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-name")));
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-description")));
        bowMeta.setLore(lore);
        bowMeta.addEnchant(Enchantment.INFINITY, 1, false);
        bow.setItemMeta(bowMeta);

        return bow;
    }
}
