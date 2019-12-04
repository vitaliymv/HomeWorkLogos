package verhovnarada;

import setqueque.InputParameters;

class Deputy extends Person{
    private String name;
    private String lastName;
    private Integer age;
    private Boolean bribeTaker;
    private Integer bribe;

    void addDeputy() {
        System.out.println("Enter name, last name, age, bribe-taker or no(true or false)");
        name = InputParameters.getString();
        lastName = InputParameters.getString();
        age = InputParameters.getInt();
        bribeTaker = InputParameters.getBoolean();
    }
    void addBribe() {
        if (!bribeTaker) {
            System.out.println("This deputy not take bribe");
        } else {
            System.out.println("Enter amount bribe");
            if (InputParameters.getInt() >= 5000) {
                System.out.println("The police drove for the deputy");
            }
        }
    }
}
