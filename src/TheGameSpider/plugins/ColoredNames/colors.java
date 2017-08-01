package TheGameSpider.plugins.ColoredNames;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class colors implements Listener {

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		if(player.hasPermission("colorednames.black")) {
			player.setDisplayName("§0" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.blue")) {
			player.setDisplayName("§1" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.green")) {
			player.setDisplayName("§2" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.cyan")) {
			player.setDisplayName("§3" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.red")) {
			player.setDisplayName("§4" + player.getName() + "§f");
		}			
		if(player.hasPermission("colorednames.magenta")) {
			player.setDisplayName("§5" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.gold")) {
			player.setDisplayName("§6" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.lightgray")) {
			player.setDisplayName("§7" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.gray")) {
			player.setDisplayName("§8" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.lightblue")) {
			player.setDisplayName("§9" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.lightgreen")) {
			player.setDisplayName("§a" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.lightcyan")) {
			player.setDisplayName("§b" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.lightred")) {
			player.setDisplayName("§c" + player.getName() + "§f");
		}
		if(player.hasPermission("colorednames.pink")) {
			player.setDisplayName("§d" + player.getName() + "§f");
		}
																		
																		
	}
	
	
}
