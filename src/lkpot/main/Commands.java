package lkpot.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.*;

public class Commands implements CommandExecutor {
    private HardSex plugin;

    public Commands(HardSex plugin) {
        this.plugin = plugin;
        ArrayList list = new ArrayList();
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            if (List.check((Player) commandSender)) {
                List.remove((Player) commandSender);
                commandSender.sendMessage("You turned off temperatures check");
            } else {
                List.add((Player) commandSender);
                commandSender.sendMessage("You turned on temperatures check");
            }
            return true;
        } else {
            commandSender.sendMessage("This command can executes only by player.");
            return true;
        }
    }
}