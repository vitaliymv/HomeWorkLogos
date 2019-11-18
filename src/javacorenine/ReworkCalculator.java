package javacorenine;

import javacoreeight.WrongInputConsoleParametersException;

import java.util.Scanner;

public class ReworkCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IllegalAccessException, WrongInputConsoleParametersException {

        int a = getInputData();
        int b = getInputData();
        char operation = getInputOperation();
        int result = calc(a, b, operation);
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        } else if ((a != 0 && b == 0 || a == 0 && b != 0)
                && operation == '/') {
            throw new ArithmeticException("Zero cannot be divided");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException");
        } else if (a > 0 && b > 0) {
            throw new WrongInputConsoleParametersException("Don`t worry, be happy");
        } else {
            System.out.println(result);
        }
    }

    private static int getInputData() {
        System.out.print("Write number: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Incorrect input");
            scanner.next();
            num = getInputData();
        }
        return num;
    }

    private static char getInputOperation() {
        System.out.print("Write operation: ");
        char operation;
        if (scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Incorrect input, available operations: [+, -, *, /]");
            scanner.next();
            operation = getInputOperation();
        }
        return operation;
    }

    private static int calc(int a, int b, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Incorrect input");
                result = calc(a, b, getInputOperation());
        }
        return result;
    }
}
