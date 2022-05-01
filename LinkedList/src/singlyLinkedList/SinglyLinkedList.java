package singlyLinkedList;

public class SinglyLinkedList<T> {
	Node<T> head;
	
	private int size = 0;
	
	public void insertNode(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node<T> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			
		}
		this.size++;
		
	}

	public void delete(T data) {
		Node<T> currentNode = head;
		Node<T> previousNode = null;
		while(currentNode != null && currentNode.data != data) {	
				previousNode = currentNode;
				currentNode = currentNode.next;
		}
		previousNode.next = currentNode.next;
		this.size--;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("NULL");
		
		System.out.println("Size: "+this.size);
	}
}
