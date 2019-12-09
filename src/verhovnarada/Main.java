package verhovnarada;

import setqueque.InputParameters;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        Deputy deputy = new Deputy();
        int number = InputParameters.getInt();
        String name;
        String lastName;
        int age;
        boolean isBribeTaker;
        List<Deputy> list = new ArrayList<>();
        deputy = new Deputy("Vita", "Cher", 25, false);
        list.add(deputy);
            switch (number) {
                case 1:
                    System.out.print("Enter the name deputy: ");
                    name = InputParameters.getString();
                    System.out.print("Enter the last name deputy: ");
                    lastName = InputParameters.getString();
                    System.out.print("Enter the age deputy: ");
                    age = InputParameters.getInt();
                    System.out.print("Enter take deputy bribe or no (true or false): ");
                    isBribeTaker = InputParameters.getBoolean();
                    deputy = new Deputy(name, lastName, age, isBribeTaker);
                    list.add(deputy);
                    menu();
                    break;

                case 2:
                    System.out.println(list);
                    break;

                case 3:
                    deputy.addBribe();
                    break;
                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

                case 9:

                case 0:


        }
    }
}

