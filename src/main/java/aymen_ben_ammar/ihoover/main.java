package aymen_ben_ammar.ihoover;


import aymen_ben_ammar.ihoover.ihoover.BasicGuard;
import aymen_ben_ammar.ihoover.ihoover.inputParser;
import aymen_ben_ammar.ihoover.ihoover.ConsoleUserInterface;
import aymen_ben_ammar.ihoover.ihoover.UserInputData;

import aymen_ben_ammar.ihoover.entities.*;
import aymen_ben_ammar.ihoover.ihoover.interfaces.Guard;
import aymen_ben_ammar.ihoover.ihoover.interfaces.Movable;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        ConsoleUserInterface userInterface = new ConsoleUserInterface();
        UserInputData userInputData = userInterface.getUserInput();
        inputParser inputParser = new inputParser();

        Limits limits = new Limits(userInputData.getLimitX(), userInputData.getLimitY());

        Movable vaccum = new Vaccum(
                new Coordinate(userInputData.getPositionInitialVaccumX(), userInputData.getPositionInitialVaccumY()),
                Orientation.valueOf(userInputData.getOrientationVaccum().toUpperCase()));

        Guard guard = new BasicGuard();
        List<Command> commands = inputParser.readCommand(userInputData.getInstructions());

        Simulation simulation = new Simulation(limits, vaccum, commands, guard);

        simulation.simulate();

        System.err.println(simulation.getPosition());
    }
}
