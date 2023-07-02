package fr.edminecoreteam.edloginaddon;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	private static Main instance;
	
	@Override
	public void onEnable() 
	{
		loadListeners();
	}
	
	private void loadListeners()
	{
		Main.instance = this;
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents((Listener)new Listeners(), (Plugin)this);
	}
	
	public static Main getInstance() { return Main.instance; }
}
