package net.nuggetmc.tplus.command.commands;

import net.nuggetmc.tplus.TerminatorPlus;
import net.nuggetmc.tplus.api.AIManager;
import net.nuggetmc.tplus.api.Terminator;
import net.nuggetmc.tplus.api.agent.legacyagent.ai.IntelligenceAgent;
import net.nuggetmc.tplus.api.agent.legacyagent.ai.NeuralNetwork;
import net.nuggetmc.tplus.api.utils.ChatUtils;
import net.nuggetmc.tplus.api.utils.MathUtils;
import net.nuggetmc.tplus.bot.BotManagerImpl;
import net.nuggetmc.tplus.command.CommandHandler;
import net.nuggetmc.tplus.command.CommandInstance;
import net.nuggetmc.tplus.command.annotation.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.ArrayList;
import java.util.List;

public class AICommand extends CommandInstance implements AIManager {

    /*
     * ideas
     * ability to export neural network data to a text file, and also
     * load from them
     * maybe also have a custom extension like .tplus and encrypt it in base64
     */

    private final TerminatorPlus plugin;
    private final BotManagerImpl manager;
    private final BukkitScheduler scheduler;

    private IntelligenceAgent agent;

    public AICommand(CommandHandler handler, String name, String description, String... aliases) {
        super(handler, name, description, aliases);

        this.plugin = TerminatorPlus.getInstance();
        this.manager = plugin.getManager();
        this.scheduler = Bukkit.getScheduler();
    }

    @Command
    public void root(CommandSender sender, List<String> args) {
        commandHandler.sendRootInfo(this, sender);
    }

}