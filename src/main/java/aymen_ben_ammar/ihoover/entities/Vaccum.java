package aymen_ben_ammar.ihoover.entities;

import aymen_ben_ammar.ihoover.ihoover.interfaces.Movable;

public class Vaccum implements Movable {
    private Coordinate coordinate;
    private Orientation orientation;

    public Vaccum(Coordinate coordinate, Orientation orientation) {
        this.coordinate = coordinate;
        this.orientation = orientation;
    }


    public Coordinate getCoordinate() {
        return coordinate;
    }


    public Orientation getOrientation() {
        return orientation;
    }

     public void pivot(Swing swing) {
        Pivot pivot = swing.getPivot();
        int angle = orientation.getAngle();

        int resultAngle = switch (pivot) {
            case G -> angle - 90 % 360;
            case D -> angle + 90 % 360;
        };

        this.orientation = switch (resultAngle) {
            case 0, 360 -> Orientation.N;
            case 90 -> Orientation.E;
            case 180 -> Orientation.S;
            case 270 -> Orientation.W;
            default -> throw new IllegalStateException("Unexpected value: " + resultAngle);
        };
    }

    public void advance(Advance advance) {
        switch (this.orientation) {
            case N:
                this.coordinate.move(0, 1);
                break;
            case S:
                this.coordinate.move(0, -1);
                break;
            case E:
                this.coordinate.move(1, 0);
                break;
            case W:
                this.coordinate.move(-1, 0);
                break;
        }
    }
}
