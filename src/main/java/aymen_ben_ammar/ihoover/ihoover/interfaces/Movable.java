package aymen_ben_ammar.ihoover.ihoover.interfaces;

import aymen_ben_ammar.ihoover.entities.Advance;
import aymen_ben_ammar.ihoover.entities.Swing;
import aymen_ben_ammar.ihoover.entities.Coordinate;
import aymen_ben_ammar.ihoover.entities.Orientation;

public interface Movable {
    Coordinate getCoordinate();
    Orientation getOrientation();
    void pivot(Swing commandePivot);
    void advance(Advance commandAdvance);

}
