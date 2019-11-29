package setqueque.taskone;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "{name=" + name +
                ", age=" + age +
                        "}";
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(age, getAge());
    }

}
