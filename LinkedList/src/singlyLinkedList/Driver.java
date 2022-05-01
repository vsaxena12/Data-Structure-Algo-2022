package singlyLinkedList;

public class Driver {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
		sll.print();
		sll.insertNode("is");
		sll.insertNode("a");
		sll.insertNode("list");
		sll.insertNode("10");
		sll.print();
		
		sll.delete("list");
		
		sll.print();
		
	}
}
