package singlyLinkedList;

public class Driver {
	public static void main(String[] args)
	{
		LinkedListPattern list = new LinkedListPattern();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.print();

		System.out.println("\n");
		System.out.println("Search: "+list.search(70));
		System.out.println("\n");
		
		list.insertAtHead(60);
		System.out.println("Insert At Head: ");
		list.print();
		System.out.println("\n");
		
		list.insertAfter(3, 35);
		System.out.println("Insert At Node: "+3);
		list.print();
		System.out.println("\n");
		
		list.delete(60);
		System.out.println("Deleting the Node");
		list.print();
		System.out.println("\n");
		
		
		
	}

}
