package lkpot.main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Handler implements Listener
{
    @EventHandler
    public void join (PlayerJoinEvent e) {
        Player p = e.getPlayer();
    }

    @EventHandler
    public void interact(PlayerInteractEvent e) {
        Action a = e.getAction();
        if (a == Action.RIGHT_CLICK_BLOCK) {
            Block b = e.getClickedBlock();
            Player p = e.getPlayer();
            if (p.getInventory().getItemInMainHand().getType() == Material.STICK) {
                p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, 1, 1);
                p.sendMessage(ChatColor.YELLOW + "Minecraft block temperature you clicked on: " + ChatColor.RED + b.getTemperature());
            }
        }
    }
}
