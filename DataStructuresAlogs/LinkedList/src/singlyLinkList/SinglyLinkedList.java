package singlyLinkList;

public class SinglyLinkedList {

    Node headNode;
    int size;

    public SinglyLinkedList(){
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(headNode == null)
            return true;
        return false;
    }

    public void insert(int data){
        Node node = new Node();
        node.data = data;

        node.next = headNode;
        headNode = node;
        size++;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

}
