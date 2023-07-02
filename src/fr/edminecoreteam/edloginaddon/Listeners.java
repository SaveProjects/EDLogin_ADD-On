package fr.edminecoreteam.edloginaddon;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.minecraft.server.v1_8_R3.Entity;

@SuppressWarnings("deprecation")
public class Listeners implements Listener
{
	
	@EventHandler
	private void onJoin(PlayerJoinEvent e) 
	{
		Player p = e.getPlayer();
		Location spawn = new Location(Bukkit.getWorld("Login"), 0.5, 1, 0.5);
		p.teleport(spawn);
		p.setGameMode(GameMode.ADVENTURE);
		((Entity) (((CraftPlayer)p).getHandle())).setInvisible(true);
		e.setJoinMessage(null);
	}
	
	@EventHandler
	private void onDamage(EntityDamageEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	private void onChat(PlayerChatEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	private void onLeave(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}
	
	
	
}
