package singlyLinkList;

public class Driver {
    public static void main(String args[]){
        System.out.println("Singly Linked List ");
        SinglyLinkedList sll = new SinglyLinkedList();
        System.out.println(sll.isEmpty());
        for (int i = 1; i <= 10; i++) {
			sll.insert(i);
			sll.print();
        }
    }
}
