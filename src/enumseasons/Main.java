package enumseasons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongInputConsoleParametersException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String scanData = scanner.nextLine();
        if (isNumber(scanData)) {
            throw new WrongInputConsoleParametersException("Incorrect input");
        } else {
            printStatistics(scanData);
        }
        scanner.close();

            scanner.close();
    }

    private static void printStatistics(String scanData) {
        for (Month m : Month.values()) {
            if (scanData.equalsIgnoreCase(m.name())) {
                System.out.println("SUCCESS");
                monthsWithSameSeasons(m);
                monthsWithSameDays(m);
                monthsWithFewerDays(m);
                monthsWithMoreDays(m);
                nextSeason(m);
                previousSeason(m);
                monthsWithEvenNumberDays();
                monthsWithOddNumberDays();
                evenOddDaysMonth(m);
            }
        }
    }

    private static void monthsWithSameSeasons(Month m) {
        System.out.print("Months with the same seasons: ");
        for(Month month : Month.values()) {
            if(m.getSeason().equals(month.getSeason())){
                System.out.print(month + " ");
            }
        }
        System.out.println();
    }
    private static void monthsWithSameDays(Month m) {
        System.out.print("Month with the same days: ");
        for(Month month : Month.values()) {
            if(m.getDays() == month.getDays()) {
                System.out.print(month + " ");
            }
        }
        System.out.println();
    }
    private static void monthsWithFewerDays(Month m) {
        System.out.print("Month with fewer number days: ");
        for(Month month : Month.values()) {
            if(month.getDays() < m.getDays()) {
                System.out.print(month + " ");
            }
        }
        System.out.println();
    }
    private static void monthsWithMoreDays(Month m) {
        System.out.print("Month with more number days: ");
        for(Month month : Month.values()) {
            if(month.getDays() > m.getDays()) {
                System.out.print(month + " ");
            }
        }
        System.out.println();
    }
    private static void nextSeason(Month m) {
        System.out.println("Next season: ");
        int ordinal = m.getSeason().ordinal();
        Season[] season = Season.values();
        if(ordinal == season.length - 1) {
            System.out.println(season[0]);
        } else {
            System.out.println(season[ordinal + 1]);
        }
    }
    private static void previousSeason(Month m) {
        System.out.print("Previous season: ");
        int ordinal = m.getSeason().ordinal();
        Season[] season = Season.values();
        if(ordinal == season.length - 4) {
            System.out.println(season[3]);
        } else {
            System.out.println(season[ordinal - 1]);
        }
    }
    private static void monthsWithEvenNumberDays() {
        System.out.print("Months with an even number days: ");
        for(Month m : Month.values()) {
            if(m.getDays() % 2 == 0) {
                System.out.print(m + " ");
            }
        }
        System.out.println();
    }
    private static void monthsWithOddNumberDays() {
        System.out.print("Months with an odd number days: ");
        for(Month m : Month.values()) {
            if(m.getDays() % 2 != 0) {
                System.out.print(m + " ");
            }
        }
        System.out.println();
    }
    private static void evenOddDaysMonth(Month m) {
        int countDays = m.getDays();
        if(countDays % 2 == 0) {
            System.out.println(countDays + " day Even");
        } else {
            System.out.println(countDays + " day: Odd");
        }
        System.out.println();
    }

    private static boolean isNumber(String scanData) {
        if (scanData == null || scanData.isEmpty()) return false;
        for (int i = 0; i < scanData.length(); i++) {
            if (!Character.isDigit(scanData.charAt(i))) return false;
        }
        return true;
    }
}
