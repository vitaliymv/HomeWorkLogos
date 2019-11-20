package javacoreeleven;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(100) + 1;
        int n = random.nextInt(100) + 1;
        String[][] array = new String[m][n];

        Car car = new Car(random.nextInt(300) + 100, random.nextInt(29) + 1990);
        Engine engine = new Engine(random.nextInt(12) + 4);

        SteeringWheel steeringWheel = new SteeringWheel(random.nextInt(15) + 30);String[] material = steeringWheel.getMaterial();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = car.toString() + engine.toString() + steeringWheel.toString();
                System.out.println(array[i][j] + " ");
            }

        }

    }
}
