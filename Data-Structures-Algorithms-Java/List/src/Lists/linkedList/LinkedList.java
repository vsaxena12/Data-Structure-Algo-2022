package Lists.linkedList;

import Lists.node.Node;

public class LinkedList {
    Node head;
    int size = 0;

    public void addFirst(int num) {
        Node newNode = new Node(num);
        newNode.data = num;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    public void addLast(int num) {
        Node newNode = new Node(num);
        newNode.data = num;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        size--;
        head = head.next;

    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public void print() {
        Node printNode = head;
        while (printNode != null) {
            System.out.print(printNode.data + " -> ");
            printNode = printNode.next;
        }
        System.out.print("NULL\n");
        // printNode.next = newNode
    }

    public int getSize() {
        return size;
    }

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
