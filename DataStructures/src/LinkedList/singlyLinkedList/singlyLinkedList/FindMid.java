package singlyLinkedList;
import node.Node;

//Finding middle element in a linked list
public class FindMid
{
	public Node findMid(Node head)
	{
		Node hare = head;
        Node tortoise = head;
        
        while(hare != null && hare.next != null)
        {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise;
	}
}