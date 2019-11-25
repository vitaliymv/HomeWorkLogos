package javacoreeleven;

public class Engine {
    private int numberOfCylinders;

    public Engine(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
