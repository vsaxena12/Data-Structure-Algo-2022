package driver;
import singlyLinkedList.SinglyLinkedList;
import singlyLinkedList.ReverseLinkedList;

class Driver
{
	public static void reverseLinkedList()
	{
		ReverseLinkedList reverse = new ReverseLinkedList(); //reverseLinkedList();
		reverse.reverseLinkedList();

	}

	public static void main(String[] args)
	{
		SinglyLinkedList sLL = new SinglyLinkedList();
		/*
		sLL.insert(10);
		sLL.insert(20);
		sLL.insert(30);
		sLL.insert(40);
		sLL.insert(50);
		*/

		//sLL.findMid();
		//sLL.print();
		/**/


		//Reverse a LinkedList
		reverseLinkedList();
		
		
	}
}