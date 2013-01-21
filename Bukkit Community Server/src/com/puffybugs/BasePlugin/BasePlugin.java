package com.puffybugs.baseplugin;

import com.puffybugs.baseplugin.listeners.PlayerJoinListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BasePlugin extends JavaPlugin implements Listener {
    
    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
    }
}
