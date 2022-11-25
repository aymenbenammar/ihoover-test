package aymen_ben_ammar.ihoover.ihoover.interfaces;

import aymen_ben_ammar.ihoover.entities.Coordinate;
import aymen_ben_ammar.ihoover.entities.Limits;

public interface Guard {
    boolean isAccessible(Limits grille, Coordinate coordonnee);

}
