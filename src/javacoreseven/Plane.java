package javacoreseven;

import java.util.Random;

abstract class Plane {

    private int length;
    private int width;
    private int weight;

    public Plane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    Random random = new Random();

    void launchEnginePlane() {
        int ready = random.nextInt(68) + 1;
        System.out.println(ready + " seconds to take off");
    }

    void takeOffPlane() {
        double distance = 0 + 1000 * random.nextDouble();
        distance = Math.ceil(distance * 100) / 100;
        System.out.println("On the full tank of fuel, the plane will fly " + distance + " kilometers" );
    }

    void landingPlane() {
        System.out.println("The plane lands\n");
    }



}
