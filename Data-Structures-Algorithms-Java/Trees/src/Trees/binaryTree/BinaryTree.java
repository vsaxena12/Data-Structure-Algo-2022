package Trees.binaryTree;

public class BinaryTree {
    int index = -1;

    public Node buildBinaryTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        for (int node : nodes) {
            System.out.println(node);
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildBinaryTree(nodes);
        newNode.right = buildBinaryTree(nodes);
        return newNode;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
}
