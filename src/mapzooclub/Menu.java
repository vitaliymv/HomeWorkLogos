package mapzooclub;

import setqueque.InputParameters;

import java.util.*;

class Menu {

    void menu() {
        ZooClub zooClub = new ZooClub();
        Set<Person> keySet = zooClub.getMap().keySet();
        Person person;
        boolean isRun = true;
        String name;
        int age;
        String nickname;
        String type;

        while (isRun) {
            hint();
            int number = InputParameters.getInt();
            switch (number) {
                case 1:
                    System.out.println("Enter the name participant`s: ");
                    name = InputParameters.getString();
                    System.out.println("Enter the age participant`s: ");
                    age = InputParameters.getInt();
                    if (zooClub.getMap().containsKey(new Person(name, age))) {
                        System.out.println("This participant already exists");
                    } else {
                        zooClub.getMap().put(new Person(name, age), new ArrayList<>());
                    }
                    break;

                case 2:
                    System.out.println("Enter the name participant`s: ");
                    name = InputParameters.getString();
                    System.out.println("Enter the age participant`s: ");
                    age = InputParameters.getInt();
                    person = new Person(name, age);
                    if (zooClub.getMap().containsKey(person)) {
                        System.out.println("Enter the name pet`s: ");
                        nickname= InputParameters.getString();
                        System.out.println("Enter the type pet`s: ");
                        type = InputParameters.getString();
                        zooClub.getMap().get(person).add(new Pet(nickname, type));
                    } else {
                        System.out.println("This participant not exist!!");
                    }
                    break;

                case 3:
                    System.out.println("Enter the name participant`s: ");
                    name = InputParameters.getString();
                    System.out.println("Enter the age participant`s: ");
                    age = InputParameters.getInt();
                    person = new Person(name, age);
                    if (zooClub.getMap().containsKey(person)) {
                        System.out.println("Enter the name pet`s: ");
                        nickname = InputParameters.getString();
                        System.out.println("Enter the type pet`s: ");
                        type = InputParameters.getString();
                        Pet pet = new Pet(nickname, type);
                        zooClub.getMap().get(person).remove(pet);
                    } else {
                        System.out.println("Pet not found!! ");
                    }
                    break;

                case 4:
                    System.out.println("Enter the name participant`s: ");
                    name = InputParameters.getString();
                    System.out.println("Enter the age participant`s: ");
                    age = InputParameters.getInt();
                    person = new Person(name, age);
                    if (zooClub.getMap().containsKey(person)) {
                        zooClub.getMap().remove(person);
                    } else {
                        System.out.println("Participant not found!");
                    }
                    break;

                case 5:
                    System.out.println("Enter the type pet`s: ");
                    type = InputParameters.getString();

                    for (Person key : keySet) {
                        ListIterator<Pet> iter = zooClub.getMap().get(key).listIterator();
                        while (iter.hasNext()) {
                            Pet pet = iter.next();
                            if (pet.getType().equals(type)) {
                                iter.remove();
                            }
                        }
                    }
                    break;

                case 6:
                    for (Person key : keySet) {
                        for (Pet pet : zooClub.getMap().get(key)) {
                            System.out.println(key + " " + pet);
                        }
                        if (zooClub.getMap().get(key).isEmpty()) {
                            System.out.println(key);
                        }
                    }
                    if (zooClub.getMap().isEmpty()) {
                        System.out.println("Participants not found!!");
                    }
                    break;

                case 0:
                    isRun = false;
                    break;

                default:
                    System.out.println("Wrong input");
                    break;
            }

        }

    }
    private static void hint() {
        System.out.println("Enter 1 - 6 for navigate the program\n" +
                "Enter 0 for exit the program\n" +
                "1 - add new participant club`s\n" +
                "2 - add pet to the participant club`s\n" +
                "3 - remove a pet participant`s\n" +
                "4 - remove a participant club`s\n" +
                "5 - remove a specific pet from all participants club`s\n" +
                "6 - print zoo club\n" +
                "0 - exit the program\n");
    }
}
