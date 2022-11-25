package aymen_ben_ammar.ihoover.entities;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x=" + this.x + " y=" + this.y;
    }
}
