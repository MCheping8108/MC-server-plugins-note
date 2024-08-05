package top.peacefuly.bleed.BleedEvent;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
//import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BleedEvent implements Listener {
    @EventHandler
    public void onPlayerHeart(EntityDamageEvent e){
        if (e instanceof EntityDamageByEntityEvent){
            EntityDamageByEntityEvent damage = (EntityDamageByEntityEvent) e;
            Player player = (Player) damage.getEntity();
            if (damage.getDamager() instanceof Arrow){
                ItemStack itemStack = player.getInventory().getItemInOffHand();
                if (itemStack != null && itemStack.getType() == Material.SHIELD){
                    e.setCancelled(true);
                }
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 128, 1));
            }
        }
    }
}
