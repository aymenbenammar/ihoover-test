package aymen_ben_ammar.ihoover.ihoover.interfaces;

import aymen_ben_ammar.ihoover.entities.Command;

import java.util.List;

public interface InputParserInterface {
    List<Command> readCommand(String userInstructions);
}
