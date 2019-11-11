package javacoreseven;

import java.util.Random;

public class Su27 extends Plane implements SpecialFeatures {
    private int maxSpeed;
    private String color;

    public Su27(int length, int width, int weight, int maxSpeed, String color) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Random random = new Random();

    @Override
    public void turboAcceleration() {
        int speed = 3000 + random.nextInt(1000) + 1;
        System.out.println("The plane accelerated to " + speed + " km / h");
    }

    @Override
    public void stealthTechnology() {
        int time = random.nextInt(9) + 1;
        System.out.println("The plane went into stealth mode for " + time + " minutes");
    }

    @Override
    public void nuclearStrike() {
        int count = random.nextInt(9) + 1;
        System.out.println(count + " warheads will be released\n");
    }
}
