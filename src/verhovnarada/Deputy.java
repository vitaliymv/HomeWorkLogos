package verhovnarada;

import setqueque.InputParameters;

class Deputy extends Person{
    private String name;
    private String lastName;
    private int age;
    private boolean bribeTaker;
    private int bribe;

    public Deputy() {
    }

    public Deputy(String name, String lastName, int age, boolean bribeTaker) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.bribeTaker = bribeTaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", bribeTaker=" + bribeTaker +
                '}';
    }
}
