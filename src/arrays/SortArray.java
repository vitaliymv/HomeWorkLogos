package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortArray {

    public static void main(String[] args) {

        Integer[] array = new Integer[20];

        fillArray(array);
        sortArrayInDecreasingOrder(array);
        sortArrayInIncreasingOrder(array);
    }

    private static void sortArrayInIncreasingOrder(Integer[] array) {
        System.out.println("\nSort increasing: ");
        Arrays.sort(array);
        for (Integer integer : array) {
            System.out.print(integer + "\t");
        }
    }

    private static void sortArrayInDecreasingOrder(Integer[] array) {
        System.out.println("\nSort decreasing: ");
        Arrays.sort(array, Comparator.reverseOrder());
        for (Integer integer : array) {
            System.out.print(integer + "\t");
        }
    }

    private static void fillArray(Integer[] array) {
        Random random = new Random();
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "\t");
        }
    }
}
