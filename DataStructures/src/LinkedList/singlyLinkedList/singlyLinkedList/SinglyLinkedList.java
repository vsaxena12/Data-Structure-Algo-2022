package singlyLinkedList;
import node.Node;

public class SinglyLinkedList
{
	Node head = null;
	public void insert(int num)
	{

		Node list = new Node();
		list.data = num;

		if(head == null)
		{
			head = list;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = list;
		}
	}

	

	
	public void print()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}




}