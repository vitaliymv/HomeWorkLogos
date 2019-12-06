package nestedlocalinner;

import java.util.Random;

public class Collection {

    private static Number[] array;
    private Random random = new Random();
    Collection() {
        array = new Integer[10];
    }

    void createCollection() {
//        System.out.println("Default array: ");
//        array = new Number[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(array));
        System.out.println("Default array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
            System.out.print(array[i] + " ");
        }
    }

    public Number[] getArray() {
        return array;
    }

    public void setArray(Number[] array) {
        Collection.array = array;
    }

    public static class InClassFirst implements Iterator {

        @Override
        public boolean hasNext() {
            int i = 0;
            while (i++ < array.length) {
                return true;
            }
            return false;
        }

        @Override
        public void next() {
            System.out.println("\nArray with replace odd number to 0: ");
            for (int i = 0; i < array.length; i++) {
                if ((int)array[i] % 2 != 0) {
                    array[i] = 0;
                }
                System.out.print(array[i] + " ");
            }
        }

    }

    public static class InClassSecond implements Iterator {

        @Override
        public boolean hasNext() {
            int i = array.length;
            while (i-- > 0) {
                return true;
            }
            return false;
        }

        @Override
        public void next() {
            System.out.println("Array from last to first through one: ");
            int i = array.length;
            while (i-- > 0) {
                if (i % 2 != 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }


}

