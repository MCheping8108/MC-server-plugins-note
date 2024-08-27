package top.peacefuly.armorstands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class ArmorStandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player){
            Player player = (Player) commandSender;
            ArmorStand armorstand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
            armorstand.setHelmet(new ItemStack(Material.DIAMOND_BLOCK));
            armorstand.setInvisible(true);
            armorstand.setGlowing(true);
            armorstand.setItemInHand(new ItemStack(Material.DIAMOND_SWORD));
            armorstand.setAI(true);
            armorstand.setArms(true);
            armorstand.setBodyPose(new EulerAngle(Math.toRadians(131), Math.toRadians(106), Math.toRadians(79)));
        }


        return true;
    }
}
