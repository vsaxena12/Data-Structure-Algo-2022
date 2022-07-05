package Lists.linkedList;

import Lists.node.Node;

public class ReverseLinkedList {
    Node head;

    public void reverseList() {
        Node previousNode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }
}
