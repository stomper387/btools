package me.stomper.btools;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class broadcast implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (!(player.hasPermission("btools.broadcast"))) {
			player.sendMessage(ChatColor.DARK_RED + "You do not have the sufficient permissions");
			return true;
		}
		if (label.equalsIgnoreCase("broadcast")) {
			if (args.length == 1) {
				Bukkit.broadcastMessage(ChatColor.DARK_RED + "[Broadcast] " + ChatColor.BOLD + args[0]);
			}
			if (args.length == 0) {
				player.sendMessage(ChatColor.DARK_RED + "/broadcast <message>");
			}
		}
		return false;
	}
}
