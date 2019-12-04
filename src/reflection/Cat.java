package reflection;

import java.util.Objects;

public class Cat implements Other{

    private void mew() {}
    private void mrr() {}

    private String catBreed;
    private String name;
    private Integer age;

    public Cat(String catBreed) {
        this.catBreed = catBreed;
    }

    public Cat() {
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void sprintTrash() {

    }

    @Override
    public void bringDownAll() {

    }


}
