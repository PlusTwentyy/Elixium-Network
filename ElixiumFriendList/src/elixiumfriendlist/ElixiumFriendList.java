package elixiumfriendlist;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ElixiumFriendList extends JavaPlugin {

	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender,
			Command command,
			String label,
			String[] args) {
		if (command.getName().equalsIgnoreCase("mycommand")) {
			sender.sendMessage("you ran /mycommand!");
			return true;
		}
		return false;
	}
	
}