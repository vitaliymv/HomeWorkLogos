package arraylinkedlist;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add("a");
        myArrayList.add(1);
        myArrayList.add("test");
        myArrayList.remove(5);




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
