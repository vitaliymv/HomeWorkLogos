package gladiator;

import java.util.Random;

public class Sagittarius extends Gladiator implements Weapon{



    @Override
    public void weaponForSagittarius() {
        Random randomSag = new Random();
        int changeSag = randomSag.nextInt(1) + 1;
        switch (changeSag) {
            case 1:
                System.out.println("Sagittarius take bow and arrow");
                setAttackPower(70);
                setLife(600);
                setProtection(10);
                break;
            case 2:
                System.out.println("Sagittarius take field and sword");
                setAttackPower(40);
                setLife(650);
                setProtection(30);
                break;
        }
    }

    @Override
    public void weaponForGoplomakh() {

    }
}
