package gladiator;

import java.util.Random;

public class Goplomakh extends Gladiator implements Weapon {





    @Override
    public void weaponForSagittarius() {

    }

    @Override
    public void weaponForGoplomakh() {
        Random randomGop = new Random();
        int changeGop = randomGop.nextInt(1) + 1;
        switch (changeGop) {
            case 1:
                System.out.println("Goplomakh take crossbow and arrow");
                setAttackPower(80);
                setLife(600);
                setProtection(20);
                break;
            case 2:
                System.out.println("Sagittarius take field and axe");
                setAttackPower(60);
                setLife(700);
                setProtection(30);
                break;

        }
    }
}
