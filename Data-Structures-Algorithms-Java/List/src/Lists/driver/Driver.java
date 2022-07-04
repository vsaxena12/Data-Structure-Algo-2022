package Lists.driver;

import Lists.linkedList.LinkedList;

public class Driver {

    public static void linkedList() {
        System.out.println("Test");
        System.out.println("\nAdding new element from the front");
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(55);
        list.addFirst(30);
        list.print();
        System.out.println("Get Size: " + list.getSize());

        System.out.println("\nAdding new element from last");
        list.addLast(100);
        list.addLast(200);
        list.print();
        System.out.println("Get Size: " + list.getSize());

        System.out.println("\nDelete First element from last");
        list.deleteFirst();
        list.print();
        System.out.println("Get Size: " + list.getSize());
        System.out.println("\nDelete last element from last");
        list.deleteLast();
        list.print();
        System.out.println("Get Size: " + list.getSize());
    }

    public static void reverseLinkedList() {

    }

    public static void main(String[] args) {
        linkedList();
    }

}
