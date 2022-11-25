package aymen_ben_ammar.ihoover.ihoover;

import aymen_ben_ammar.ihoover.entities.*;

import aymen_ben_ammar.ihoover.ihoover.interfaces.InputParserInterface;

import java.util.ArrayList;
import java.util.List;

public class inputParser implements InputParserInterface {
    public inputParser() {
    }

    public List<Command> readCommand(String userInstructions) {
        List<Command> commandes = new ArrayList<>();
        for (char c : userInstructions.toCharArray()) {
            switch (c) {
                case 'A':
                    commandes.add(new Advance(Advancement.A));
                    break;
                case 'D':
                    commandes.add(new Swing(Pivot.D));
                    break;
                case 'G':
                    commandes.add(new Swing(Pivot.G));
                    break;
                default:
                    throw new RuntimeException("Character error");
            }
        }
        return commandes;
    }
}
