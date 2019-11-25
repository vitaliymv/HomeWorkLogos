package arraylinkedlist;

import java.util.Arrays;

class MyArrayList {

    private int[] elements;
    private int size;
    private int index;
    private static final int DEFAULT_CAPACITY = 14;

    MyArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }

    void add(int value) {
        elements[index] = value;
        index++;
        size++;
    }

    boolean remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, this.index - index);
        size--;
        this.index--;
        return true;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
