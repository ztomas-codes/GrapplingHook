package me.lordmefloun.grapplinghook2;

import org.bukkit.plugin.java.JavaPlugin;

public final class GrapplingHook2 extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
