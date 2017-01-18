package com.frostcraft.silentjoin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		if (event.getPlayer().hasPermission("silentjoin")) {
			event.setJoinMessage(null);
		}
	}
	
}