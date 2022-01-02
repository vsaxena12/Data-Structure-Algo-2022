//Reverse a LinkedList
package singlyLinkedList;
import node.Node;

public class ReverseLinkedList 
{
	public static Node reverse(Node head) 
	{
    	// TODO: Write your code here
    	Node current = head;
      Node previous = null;
      Node next = null;

      System.out.print("Nodes of the LinkedList are: ");
      while(current != null)
      {
        System.out.print(current.data+" ");
        current = current.next;
      }

      //System.out.println();
      while(current != null)
      {
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
      }
      return previous;
  }

  public void reverseLinkedList()
  {
      Node head = new Node(2);
      head.next = new Node(4);
      head.next.next = new Node(6);
      head.next.next.next = new Node(8);
      head.next.next.next.next = new Node(10);

      Node result = ReverseLinkedList.reverse(head);
      System.out.print("Nodes of the reversed LinkedList are: ");
      while (result != null) 
      {
          System.out.print(result.data + " ");
          result = result.next;
      }
  }
}