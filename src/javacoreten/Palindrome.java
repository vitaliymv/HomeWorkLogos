package javacoreten;

import javacoreeight.WrongInputConsoleParametersException;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) throws WrongInputConsoleParametersException {
        System.out.print("Enter a 5-letter word: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        verifyCountLetter(str);
        palindromeCheck(str);
        System.out.println("------------------------------------------------");
        main(args);
    }

    private static void palindromeCheck(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String rev = String.valueOf(stringBuilder.reverse());
        if (rev.equalsIgnoreCase(str)) {
            System.out.println("Word palindrome");
        } else {
            System.err.println("Word not palindrome");
        }
    }

    private static void verifyCountLetter(String str) throws WrongInputConsoleParametersException {
        for (int i = 0; i < str.length(); i++) {
            if (str.length() != 5) {
                throw new WrongInputConsoleParametersException("Incorrect input, please write word with 5 letter");
            }
        }
    }
}
