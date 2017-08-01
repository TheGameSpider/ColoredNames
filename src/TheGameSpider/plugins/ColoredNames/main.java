package TheGameSpider.plugins.ColoredNames;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new colors(), this);
		System.out.println("Custom colors enabled");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Custom colors disabled");
	}
		
}
