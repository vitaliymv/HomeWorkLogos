package javacoreseven;

import java.util.Random;

public class Control {

    Random random = new Random();

    void motionUp() {
        int distance = random.nextInt(9) + 1;
        System.out.println("The plane flew " + distance + " kilometers to the up");
    }

    void motionDown() {
        int distance = random.nextInt(9) + 1;
        System.out.println("The plane flew " + distance + " kilometers to the down");
    }

    void motionLeft() {
        int distance = random.nextInt(9) + 1;
        System.out.println("The plane flew " + distance + " kilometers to the left");
    }

    void motionRight() {
        int distance = random.nextInt(9) + 1;
        System.out.println("The plane flew " + distance + " kilometers to the right");
    }

}
