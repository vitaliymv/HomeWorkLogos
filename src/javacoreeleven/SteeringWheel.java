package javacoreeleven;

import java.util.Arrays;
import java.util.Random;

public class SteeringWheel {
    private int diameter;
    private String[] material;

    public SteeringWheel(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String[] getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", material=" + Arrays.toString(material) +
                '}';
    }
}
