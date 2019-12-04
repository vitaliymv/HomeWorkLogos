package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Cat cat = new Cat();
        cat.setAge(3);
        cat.setCatBreed("Australian smoky");
        cat.setName("Garfield");
        Class <? extends Cat> catClazz = cat.getClass();
        System.out.println(cat);
        System.out.println(cat.getCatBreed());
        System.out.println(cat.getName());
        System.out.println();

        minimum(cat);
        maximum(catClazz);
    }

    private static void minimum(Cat cat) {
        System.out.println("------------------------------------------------\nMinimum: \n");
        Class <? extends Cat> catClazz = cat.getClass();
        System.out.println("Class name and place: \n" + catClazz.getName());
        System.out.println();

        Constructor<?>[] constructor = catClazz.getConstructors();
        System.out.println("All constructors, access modifier: \n" + Arrays.toString(constructor));
        System.out.println();;

        System.out.println("Methods to class: \n" + Arrays.toString(catClazz.getDeclaredMethods()));

        System.out.println("Package: \n" + catClazz.getPackage());
        System.out.println();

        System.out.println(Arrays.toString(catClazz.getDeclaredMethods()));

        System.out.println("Name interface: " + Arrays.toString(catClazz.getInterfaces()));

        System.out.println(Arrays.toString(catClazz.getDeclaredFields()));

        System.out.println();
        MyMethods myMethods = new MyMethods();
        Class c = myMethods.getClass();
        Method[] methods = c.getMethods();
        for(Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
        }
    }

    private static void maximum(Class<? extends Cat> catClazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("------------------------------------------------\nMaximum: \n");
        Constructor<? extends Cat> constructor = catClazz.getConstructor();

        Cat catReflect = constructor.newInstance();
        catReflect.setName("Tomas");
        System.out.println("Reflect name: " + catReflect.getName() + "\n" + catReflect);
    }

}
