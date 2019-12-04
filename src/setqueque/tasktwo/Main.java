package setqueque.tasktwo;

import setqueque.InputParameters;

public class Main {

    public static void main(String[] args) {
        Commodity commodity = new Commodity("Notebook", 2, 40, 24);
        instructions();
        userChoice(commodity);

    }

    private static void userChoice(Commodity commodity) {
        int number = InputParameters.getInt();

        while (true) {
            switch (number) {
                case 1:
                    commodity.addCommodity();
                    break;
                case 2:
                    commodity.deleteCommodity();
                    break;
                case 3:
                    commodity.replaceCommodity();
                    break;
                case 4:
                    commodity.sortName();
                    break;
                case 5:
                    commodity.sortLength();
                    break;
                case 6:
                    commodity.sortWeight();
                    break;
                case 7:
                    commodity.sortWidth();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Wrong input");
            }
        }
    }

    private static void instructions() {
        System.out.print("1 - Add commodity.\n" +
                "2 - Delete commodity.\n" +
                "3 - Replace commodity.\n" +
                "4 - Sort by name.\n" +
                "5 - Sort by length.\n" +
                "6 - Sort by weight.\n" +
                "7 - Sort by width.\n" +
                "0 - For exit program\n" +
                "Print 1 - 7: ");
    }
}
