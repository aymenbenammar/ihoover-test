package aymen_ben_ammar.ihoover.entities;



import aymen_ben_ammar.ihoover.ihoover.interfaces.Guard;
import aymen_ben_ammar.ihoover.ihoover.interfaces.Movable;

import java.util.List;

public class Simulation {
    private Limits limits;
    private Movable vaccum;
    private List<Command> commands;
    private Guard guard;

    public Simulation(Limits limits, Movable vaccum, List<Command> commands, Guard guard) {
        this.limits = limits;
        this.vaccum = vaccum;
        this.commands = commands;
        this.guard = guard;
    }

    public void simulate() {
        for (Command command : commands) {
            if (command instanceof Advance) {
                vaccum.advance((Advance) command);
            } else
                vaccum.pivot((Swing) command);

            if (!guard.isAccessible(limits,  vaccum.getCoordinate())) {
                throw new RuntimeException("Commande inaccessible");
            }
        }
    }

    public String getPosition() {
        return  vaccum.getCoordinate().toString() + " " +  vaccum.getOrientation();
    }
}
