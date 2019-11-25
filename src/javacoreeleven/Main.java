package javacoreeleven;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(100);
        int n = random.nextInt(100);
        String[][] array = new String[m][n];

        Car car = new Car(random.nextInt(300) + 100,
                            random.nextInt(29) + 1990);

        Engine engine = new Engine(random.nextInt(12) + 4);

        SteeringWheel steeringWheel = new SteeringWheel(random.nextInt(15) + 30,  "Leather");

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                array[i][j] = car.toString() + "\n" + engine.toString() + "\n" + steeringWheel.toString();
                System.out.println(array[i][j] + "");
            }
        }


    }

    private static void test() {


    }
}
