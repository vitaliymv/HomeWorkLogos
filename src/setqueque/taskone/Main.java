package setqueque.taskone;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Person person = new Person();
        PersonNameComparator nameCom = new PersonNameComparator();
        PersonAgeComparator ageCom = new PersonAgeComparator();
//        TreeSet<Person> set = new TreeSet<Person>(nameCom);
        TreeSet<Person> set = new TreeSet<Person>(ageCom);
//      set.add(new Person(new String[]{"" + person.getName()[index]}, random.nextInt(40)));
        fillList(set, random);
    }

    private static void fillList(TreeSet<Person> set, Random random) {
        set.add(new Person("Nick", random.nextInt(30) + 20));
        set.add(new Person("Johny", random.nextInt(30) + 20));
        set.add(new Person("Jason", random.nextInt(30) + 20));
        set.add(new Person("Gwen", random.nextInt(30) + 20));
        set.add(new Person("Fury", random.nextInt(30) + 20));
        set.add(new Person("Adrianna", random.nextInt(30) + 20));

        for (Person p : set) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }



}
