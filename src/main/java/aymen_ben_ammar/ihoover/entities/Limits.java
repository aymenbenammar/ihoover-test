package aymen_ben_ammar.ihoover.entities;

public class Limits {
    private final Integer dimensionX;
    private final Integer dimensionY;

    public Limits(Integer dimensionX, Integer dimensionY) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    public Integer getDimensionX() {
        return dimensionX;
    }

    public Integer getDimensionY() {
        return dimensionY;
    }
}
