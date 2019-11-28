package arraylinkedlist;

import java.util.Arrays;

public class MyArrayList<T> {
    private final int INIT_SIZE = 10;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;


//    Adds a new item to the list.
    void add(T item) {
        if (pointer == array.length - 1)
            resize(array.length * 2); // Increase 2 times, if reached the borders
        array[pointer++] = item;
    }

    /*
    Remove list item by index, all item move one step to he left.
    If after remove the item, amount elements became in CUT_RATE times smaller then size array halved
    */
    void remove(int index) {
        if (pointer - index >= 0)
            System.arraycopy(array, index + 1, array, index,
                    pointer - index);
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);
    }


//   Scaling
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
