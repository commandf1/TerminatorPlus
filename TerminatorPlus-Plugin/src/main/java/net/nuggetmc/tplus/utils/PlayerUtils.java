package net.nuggetmc.tplus.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * @author commandf1
 */
public class PlayerUtils {
    public static Player[] getNearbyPlayers(Location location, int radius) {
        var list = new ArrayList<Player>();
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.getLocation().distanceSquared(location) <= radius) {
                list.add(player);
            }
        }

        return list.toArray(new Player[0]);
    }
}
