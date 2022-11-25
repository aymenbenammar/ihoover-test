package aymen_ben_ammar.ihoover.ihoover;

import aymen_ben_ammar.ihoover.entities.Coordinate;
import aymen_ben_ammar.ihoover.entities.Limits;
import aymen_ben_ammar.ihoover.ihoover.interfaces.Guard;

public class BasicGuard implements Guard {
    @Override
    public boolean isAccessible(Limits grille, Coordinate coordonnee) {
        return grille.getDimensionX() >= coordonnee.getX() && grille.getDimensionY() >= coordonnee.getY();
    }

}
