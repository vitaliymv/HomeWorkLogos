package gladiator;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Gladiator goplomakh = new Goplomakh(600, 55, 35);
        Gladiator sagittarius = new Sagittarius(400, 85, 15);
        int lifeGoplomakh = goplomakh.getLife();
        int lifeSagittarius = sagittarius.getLife();
        int attackGoplomakh = goplomakh.getAttackPower();
        int attackSagittarius = sagittarius.getAttackPower();
        int protectGoplomakh = goplomakh.getProtection();
        int protectSagittarius = sagittarius.getProtection();
        int round = 0;
        printStatisticGladiators(goplomakh, sagittarius);

        for (; ;) {
            if (lifeGoplomakh > 0 || lifeSagittarius > 0) {
                goplomakh.setLife(lifeGoplomakh = lifeGoplomakh - (attackSagittarius - protectGoplomakh));;
                sagittarius.setLife(lifeSagittarius = lifeSagittarius - (attackGoplomakh - protectSagittarius));;
                round++;
                System.out.println("ROUND " + round);
                System.out.println(goplomakh.toString());
                System.out.println(sagittarius.toString());
            } else {
                break;
            }
        }



    }

    private static void printStatisticGladiators(Gladiator goplomakh, Gladiator sagittarius) {

        System.out.println("|-------------------------------------------------------------------|");
        System.out.print("| Goplomakh: ");
        System.out.println(goplomakh.toString() + "\t\t|");
        System.out.println("| \t\t\t\t\t\t\t\tVS\t\t\t\t\t\t\t\t\t|");

        System.out.print("| Sagittarius: ");
        System.out.println(sagittarius.toString() + "\t|");
        System.out.println("|-------------------------------------------------------------------|");
    }
}
