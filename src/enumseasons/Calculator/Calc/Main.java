package enumseasons.Calculator.Calc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(myCalculator.add(a, b));
        System.out.println(myCalculator.div(a, b));
        System.out.println(myCalculator.multi(a, b));
        System.out.println(myCalculator.subtract(a, b));
        scanner.close();
    }
}
