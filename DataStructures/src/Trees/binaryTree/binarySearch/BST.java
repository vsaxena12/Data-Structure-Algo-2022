package binarySearch;
import binarySearch.BST_Iteration;
import binaryNode.Node;

public interface BST
{
	public void insert(int data);
	public void inOrder(Node node);
	public void preOrder(Node node);
	public void postOrder(Node node);
}