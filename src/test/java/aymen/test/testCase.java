package aymen.test;

import aymen_ben_ammar.ihoover.entities.Orientation;
import aymen_ben_ammar.ihoover.ihoover.UserInputData;

public class testCase {
    private String EXPECTED_PATH;
    private  UserInputData USER_INPUT_DATA;

    public testCase() {
        EXPECTED_PATH= "x=5 y=6 N";
        USER_INPUT_DATA=new UserInputData(10, 10, 5, 5,
                "N", "DADADADAA");
    }

    public testCase(int expectedX , int expectedY , String expectedOrientation, int limitX, int limitY , int initialPositionX,
                    int intialPositionY, String intitialOrientation, String instructions ) {
        this.EXPECTED_PATH = "x=" + expectedX + " y="+ expectedY+ " " + expectedOrientation;
        this.USER_INPUT_DATA = new UserInputData(limitX,limitY, initialPositionX,intialPositionY,intitialOrientation,instructions);
    }

    public UserInputData getUSER_INPUT_DATA() {
        return USER_INPUT_DATA;
    }

    public String getEXPECTED_PATH() {
        return EXPECTED_PATH;
    }

}
