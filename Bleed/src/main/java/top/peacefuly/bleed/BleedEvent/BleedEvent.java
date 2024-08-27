package top.peacefuly.bleed.BleedEvent;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
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
            if (damage.getEntity() instanceof Player){
                Player player = (Player) damage.getEntity();
                if (damage.getDamager() instanceof Zombie){
                    ItemStack itemStack = player.getInventory().getItemInOffHand();
                    if (damage.getDamager() instanceof Zombie && itemStack.getType() == Material.SHIELD){
                        e.setDamage(3.0);
                    } else if (damage.getDamager() instanceof Zombie){
                        player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 128, 1));
                    }
                }
            }
        }
    }
}
