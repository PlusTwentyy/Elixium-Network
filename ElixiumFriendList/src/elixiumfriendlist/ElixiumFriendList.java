package elixiumfriendlist;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ElixiumFriendList extends JavaPlugin {
	
	// Fired when JavaPlugin is first enabled
	
	@Override
	
	public void onEnable() {
		
	}
	
	// Fired when JavaPlugin is disabled
	
	@Override
	
	public void onDisable() {
		
	}
	// Fired when Command is used
	
	@Override
	
	public boolean onCommand(CommandSender sender,
			Command command,
			String label,
			String[] args) {
		if (command.getName().equalsIgnoreCase("friendlist")) {
			sender.sendMessage("you ran /friendlist!");
			return true;
		}
			return false;
	}
	
	public boolean onCommand2(CommandSender sender,
			Command command,
			String[] args) {
		if (command.getName().equalsIgnoreCase("friendadd")) {
			sender.sendMessage("you ran /friendadd");
			return true;	
		}
			return false;
	}
	
	public boolean onCommand3(CommandSender sender,
			Command command,
			String[] args) {
		if (command.getName().equalsIgnoreCase("friendremove")) {
			sender.sendMessage("you ran /friendremove");
			return true;
		}
			return false;
	}
	
	public boolean onCommand4(CommandSender sender,
			Command command,
			String[] args) {
		if (command.getName().equalsIgnoreCase("friend")) {
			sender.sendMessage("you ran /friend");
			return true;
		}
			return false;
	}
}