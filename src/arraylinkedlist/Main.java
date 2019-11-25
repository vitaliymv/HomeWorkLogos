package arraylinkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(4);
        myArrayList.add(3);
        myArrayList.add(7);
        myArrayList.add(9);
        myArrayList.add(3);

        myArrayList.remove(4);

        System.out.println(myArrayList);
        System.out.println("--------------------------------------");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addLast(35);
        myLinkedList.addFirst(4);
        myLinkedList.addLast(54);
        myLinkedList.print();


    }
}
