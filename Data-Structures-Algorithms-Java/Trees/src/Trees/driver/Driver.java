package Trees.driver;

import Trees.binaryTree.BinaryTree;
import Trees.binaryTree.Node;

public class Driver {
    public static void main(String args[]) {
        int arrayListTree[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildBinaryTree(arrayListTree);
        System.out.println(root.data);
        binaryTree.preOrder(root);
    }
}