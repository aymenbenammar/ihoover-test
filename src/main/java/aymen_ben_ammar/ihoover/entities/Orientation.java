package aymen_ben_ammar.ihoover.entities;

public enum Orientation {
    N(0), E(90), S(180), W(270);

    private int angle;

    Orientation(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }
}
