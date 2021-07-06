package lkpot.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HardSex extends JavaPlugin {
    public void onEnable () {
        Bukkit.getPluginManager().registerEvents(new Handler(),this);
        getCommand("temp").setExecutor(new Commands(this));
        getLogger().info("Plugin was enabled.");
    }

    public void onDisable () {
        getLogger().info("Plugin was disabled.");
    }
}
