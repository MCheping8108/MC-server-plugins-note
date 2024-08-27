package top.peacefuly.armorStand01;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import top.peacefuly.armorStand01.commands.ArmorStandCommand;
import top.peacefuly.armorStand01.events.MenuHandler;

import java.util.ArrayList;

public final class ArmorStand01 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("enabled");
        getCommand("armorstand").setExecutor(new ArmorStandCommand(this));
        getServer().getPluginManager().registerEvents(new MenuHandler(this), this);
    }
    public void openMainMenu(Player player){
        Inventory main_menu = Bukkit.createInventory(player, 9, ChatColor.BLUE + "ArmorStand GUI");

        ItemStack create = new ItemStack(Material.ARMOR_STAND);
        ItemMeta create_meta = create.getItemMeta();
        create_meta.setDisplayName(ChatColor.GREEN + "Create");
        ArrayList<String> create_lore = new ArrayList<>();
        create_lore.add(ChatColor.DARK_PURPLE + "Create a new armor stand");
        create_meta.setLore(create_lore);
        create.setItemMeta(create_meta);

        ItemStack close = new ItemStack(Material.BARRIER);
        ItemMeta close_meta = close.getItemMeta();
        close_meta.setDisplayName(ChatColor.RED + "Close");
        close.setItemMeta(close_meta);

        main_menu.setItem(0, create);
        main_menu.setItem(8, close);
        player.openInventory(main_menu);
    }
    public void openCreateMenu(Player player){
        Inventory create_menu = Bukkit.createInventory(player, 9, ChatColor.GREEN + "Create a Armor Stand");

        ItemStack arms = new ItemStack(Material.ARMOR_STAND);
        ItemStack glow = new ItemStack(Material.BEACON);
        ItemStack armor = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack base = new ItemStack(Material.STONE_SLAB);
        ItemStack complete = new ItemStack(Material.GREEN_WOOL);
        ItemStack cancel = new ItemStack(Material.RED_WOOL);

        ItemMeta arms_meta = arms.getItemMeta();
        ItemMeta glow_meta = glow.getItemMeta();
        ItemMeta armor_meta = armor.getItemMeta();
        ItemMeta base_meta = base.getItemMeta();
        ItemMeta complete_meta = complete.getItemMeta();
        ItemMeta cancel_meta = cancel.getItemMeta();

        arms_meta.setDisplayName(ChatColor.GREEN+"arms");
        glow_meta.setDisplayName(ChatColor.AQUA +"glow");
        armor_meta.setDisplayName(ChatColor.YELLOW +"armor");
        base_meta.setDisplayName(ChatColor.LIGHT_PURPLE +"base");
        complete_meta.setDisplayName(ChatColor.GREEN+"complete");
        cancel_meta.setDisplayName(ChatColor.RED +"cancel");

        arms.setItemMeta(arms_meta);
        glow.setItemMeta(glow_meta);
        armor.setItemMeta(armor_meta);
        base.setItemMeta(base_meta);
        complete.setItemMeta(complete_meta);
        cancel.setItemMeta(cancel_meta);



        create_menu.setItem(0, arms);
        create_menu.setItem(1, glow);
        create_menu.setItem(2, armor);
        create_menu.setItem(3, base);
        create_menu.setItem(6, complete);
        create_menu.setItem(7, cancel);
        player.openInventory(create_menu);
    }

    public void openConfirmMenu(Player player, Material option){
        Inventory confirm_menu = Bukkit.createInventory(player, 36, ChatColor.GREEN+"Confirm Option");
        ItemStack option_item = new ItemStack(option);
        ItemMeta option_meta = option_item.getItemMeta();
        if (option == Material.ARMOR_STAND){
            option_meta.setDisplayName(ChatColor.YELLOW + "Give Arms?");
            option_item.setItemMeta(option_meta);
        }else if (option == Material.BEACON){
            option_meta.setDisplayName(ChatColor.AQUA + "Add glow?");
            option_item.setItemMeta(option_meta);
        }
        ItemStack yes = new ItemStack(Material.GREEN_WOOL);
        ItemMeta yes_meta = yes.getItemMeta();
        yes_meta.setDisplayName(ChatColor.GREEN+"YES");
        ItemStack no = new ItemStack(Material.RED_WOOL);
        ItemMeta no_meta = no.getItemMeta();
        no_meta.setDisplayName(ChatColor.GREEN+"NO");
        yes.setItemMeta(yes_meta);
        no.setItemMeta(no_meta);

        confirm_menu.setItem(13, option_item);
        confirm_menu.setItem(21, yes);
        confirm_menu.setItem(23, no);

        player.openInventory(confirm_menu);
    }


}
