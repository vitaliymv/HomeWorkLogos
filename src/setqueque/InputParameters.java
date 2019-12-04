package setqueque;

import javax.print.AttributeException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputParameters {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        int temp = 0;
        try {
            temp = scanner.nextInt();

            scanner.nextLine();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        return temp;
    }

    public static float getFloat(){
        float temp = 0;
        try {
            temp = scanner.nextFloat();
        }catch (InputMismatchException e){
            scanner.nextLine();
            e.printStackTrace();
        }
        return temp;
    }

    public static boolean getBoolean() {
        boolean temp = false;
        try {
            temp = scanner.nextBoolean();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            e.printStackTrace();
        }
        return temp;
    }

    public static String getString(){
        return scanner.nextLine();
    }
}
