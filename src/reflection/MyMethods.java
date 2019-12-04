package reflection;

import java.util.Arrays;

public class MyMethods {

    public void myMethods(String a, int ... args) {
        System.out.println("Method with 2 parameters");
    }

    public String myMethods(String ... args) {
        args = new String[]{"Method", "with", "1", "parameter"};
        System.out.println(Arrays.toString(args));
        return Arrays.toString(args);
    }
}
