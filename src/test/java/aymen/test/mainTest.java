package aymen.test;

import aymen_ben_ammar.ihoover.ihoover.BasicGuard;
import aymen_ben_ammar.ihoover.ihoover.inputParser;
import aymen_ben_ammar.ihoover.entities.*;
import aymen_ben_ammar.ihoover.ihoover.interfaces.Guard;
import aymen_ben_ammar.ihoover.ihoover.interfaces.InputParserInterface;
import aymen_ben_ammar.ihoover.ihoover.interfaces.Movable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VaccumTest {

    private testCase test ;
    @BeforeEach
    public void setUp() {
      test =new testCase();
    }

    @Test
    public void testVaccumSimulation() throws IOException {

        InputParserInterface inputParser = new inputParser();

        Limits limits = new Limits(test.getUSER_INPUT_DATA().getLimitX(), test.getUSER_INPUT_DATA().getLimitY());

        Movable vaccum = new Vaccum(
                new Coordinate(test.getUSER_INPUT_DATA().getPositionInitialVaccumX(), test.getUSER_INPUT_DATA().getPositionInitialVaccumY()),
                Orientation.valueOf(test.getUSER_INPUT_DATA().getOrientationVaccum().toUpperCase()));

        Guard guard = new BasicGuard();
        List<Command> commands = inputParser.readCommand(test.getUSER_INPUT_DATA().getInstructions());

        Simulation simulation = new Simulation(limits, vaccum, commands, guard);

        simulation.simulate();

        assertEquals(test.getEXPECTED_PATH(), simulation.getPosition());

    }

}

