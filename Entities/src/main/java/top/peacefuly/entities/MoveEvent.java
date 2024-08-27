package top.peacefuly.entities;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEvent implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){
        Player player = e.getPlayer();
        Entity entity = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 72,63,-5), EntityType.SKELETON);
        entity.setGravity(false);
        entity.setGlowing(true);
        entity.setCustomName("不知道");
        entity.setCustomNameVisible(true);
        entity.setInvulnerable(true);

    }
}
