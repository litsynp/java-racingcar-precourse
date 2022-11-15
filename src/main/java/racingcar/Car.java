package racingcar;

public class Car {

    public static final int MAX_CAR_NAME_LENGTH = 5;
    private static final int VELOCITY = 1;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward() {
        this.position += VELOCITY;
    }

    public void stop() {
    }
}
