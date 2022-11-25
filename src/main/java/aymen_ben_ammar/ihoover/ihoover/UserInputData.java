package aymen_ben_ammar.ihoover.ihoover;

public class UserInputData  {
    private int limitX;
    private int limitY;

    private int positionInitialVaccumX;
    private int positionInitialVaccumY;
    private String orientationVaccum;
    private String instructions;

    public UserInputData(int limitX, int limitY, int positionInitialVaccumX, int positionInitialVaccumY, String orientationVaccum, String instructions) {
        this.limitX = limitX;
        this.limitY = limitY;
        this.positionInitialVaccumX = positionInitialVaccumX;
        this.positionInitialVaccumY = positionInitialVaccumY;
        this.orientationVaccum = orientationVaccum;
        this.instructions = instructions;
    }

    public int getLimitX() {
        return limitX;
    }

    public int getLimitY() {
        return limitY;
    }

    public int getPositionInitialVaccumX() {
        return positionInitialVaccumX;
    }

    public int getPositionInitialVaccumY() {
        return positionInitialVaccumY;
    }

    public String getOrientationVaccum() {
        return orientationVaccum;
    }

    public String getInstructions() {
        return instructions;
    }
}
