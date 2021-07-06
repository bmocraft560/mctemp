package lkpot.main;

import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class List {
    static Set<UUID> players = new HashSet<>();

    public static boolean check (Player p) {
        return players.contains(p.getUniqueId());
    }

    public static void add (Player p) {
        players.add(p.getUniqueId());
    }

    public static void remove (Player p) {
        players.remove(p.getUniqueId());
    }
}
