package binarySearch;
import binaryNode.Node;

public class BST_Iteration implements BST
{
	
	public Node root = null;
	//public Object data;

	public void insert(int num)
	{
		Node node = new Node();
		node.data = num;

		if(root == null)
		{
			root = node;
			node.left = null;
			node.right = null;
		}
		else
		{
			Node temp = root;
			while(temp != null)
			{
				if(num <= temp.data)
				{
					if(temp.left == null)
					{
						temp.left = node;
						break;
					}
					temp = temp.left;
				}

				if(num > temp.data)
				{
					if(temp.right == null)
					{
						temp.right = node;
						break;
					}
					temp = temp.right;
				}

				else
				{
					return;
				}
			}
		}
	}

	
	public boolean search(int key)  { 
        root = search_Recursive(root, key); 
        if (root!= null)
        {
        	System.out.println("Element Found: "+root.data);
            return true;
        }
        else
            return false;
    } 
   
    //recursive insert function
    Node search_Recursive(Node root, int key)  { 
        if (root==null || root.data==key) 
            return root; 
        if (root.data > key) 
            return search_Recursive(root.left, key); 
        else
        	return search_Recursive(root.right, key); 
    } 


	/*
	 *	In-Order Traversal
	 */
	public void inOrder(Node node)
	{
		if(node !=  null) 
		{
			inOrder(node.left);
			System.out.println("In-Order: "+node.data);
			inOrder(node.right);
		}
	}

	/*
	 *	Pre-Order Traversal
	 */
	public void preOrder(Node node)
	{
		if(node !=  null) 
		{
			System.out.println("Pre-Order: "+node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
		
	}

	/*
	 *	Post-Order Traversal
	 */
	public void postOrder(Node node)
	{
		if(node !=  null) 
		{
			postOrder(node.left);
			postOrder(node.right);
			System.out.println("Post-Order: "+node.data);
		}
		
	}

}