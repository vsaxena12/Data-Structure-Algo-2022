package binarySearch;
import binaryNode.Node;
import java.util.*;
public class SameTree {
		
	public static boolean areIdentical(Node root1, Node root2) 
	{

	      if (root1 == null && root2 == null) {
	        return true;
	      }
	
	      if (root1 != null && root2 != null) {
	        return ((root1.data == root2.data) &&
	              areIdentical(root1.left, root2.left) &&
	              areIdentical(root1.right, root2.right));
	      }

      return false;
	}
	
	
	
}
