package jack.hardcore;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.print.Paper;

public final class Hardcore extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {

        String Player = event.getPlayer().getName().toString();
        System.out.println(Player);

        //Put your name in the place of the "xxx"
        if (Player.equals("xxx")) {
            event.getPlayer().banPlayer("You died");
        }
    }
}