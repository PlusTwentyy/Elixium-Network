package elixiumfriendlist;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ElixiumFriendList extends JavaPlugin {
	
	// Fired when plugin is first enabled
	
	@Override
	public void onEnable() {
		
	}
	
	// Fired when plugin is disabled
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender,
			Command command,
			String label,
			String[] args) {
		if (command.getName().equalsIgnoreCase("friend")) {
			sender.sendMessage("you ran /friend!");
			return true;
		}
			return false;
	}
	public boolean onCommand(CommandSender sender,
			Command command,
			String[] args) {
		if (command.getName().equalsIgnoreCase("friendremove")) {
			sender.sendMessage("you ran /friendremove");
			return true;	
		}
			return false;
	}
}