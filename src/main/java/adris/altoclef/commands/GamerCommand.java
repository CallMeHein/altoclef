package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;
import adris.altoclef.tasks.speedrun.beatgame.BeatMinecraftTask;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.world.Nuker;

public class GamerCommand extends Command {
    public GamerCommand() {
        super("gamer", "Beats the game (Miran version)");
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser) {
        Module module = Modules.get().get(Nuker.class);
        module.toggle();
        mod.runUserTask(new BeatMinecraftTask(mod), this::finish);
    }
}