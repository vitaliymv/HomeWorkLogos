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
        myLinkedList.add(5);
        myLinkedList.add("test");
        myLinkedList.add(234);
        myLinkedList.remove(5);
        System.out.println(myLinkedList);


    }
}
