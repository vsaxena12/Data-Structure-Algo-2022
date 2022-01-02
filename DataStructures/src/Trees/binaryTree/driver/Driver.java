package driver;
import java.util.*;
import binarySearch.BST_Iteration;
import binarySearch.BST;
import binaryNode.Node;
import binarySearch.SameTree;


public class Driver
{
	public static void main(String[] args)
	{
		//System.out.println("Testing...");
		//IdenticalTrees identical = new IdenticalTrees();
		//identical.isIdenticalTest();
		Scanner scanner = new Scanner(System.in);
		Node root1 = null;
		Node root2 = null;
		BST_Iteration bst1 = new BST_Iteration();
		bst1.insert(10);
		bst1.insert(5);
		bst1.insert(20);
		bst1.insert(8);
		bst1.insert(30);
		bst1.insert(1);
		bst1.insert(30);
		
		bst1.inOrder(bst1.root);
		System.out.print("\n");
		bst1.preOrder(bst1.root);
		System.out.print("\n");
		bst1.postOrder(bst1.root);

		//bst.search();
		System.out.println(bst1.search(44));
		//System.out.println("Element: "+root);
		
		BST_Iteration bst2 = new BST_Iteration();
		bst2.insert(10);
		bst2.insert(5);
		bst2.insert(20);
		bst2.insert(8);
		//bst2.insert(30);
		//bst2.insert(1);
		//bst2.insert(30);
		
		bst2.inOrder(bst2.root);
		System.out.print("\n");
		bst2.preOrder(bst2.root);
		System.out.print("\n");
		bst2.postOrder(bst2.root);
		
		SameTree tree = new SameTree();
		if (SameTree.areIdentical(root1, root2)) {
		      System.out.println("The trees are identical");
		} 
		else {
		      System.out.println("The trees are not identical");
		}
			
	}
}