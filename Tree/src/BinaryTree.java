import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	static class Node{
		int data;
		Node right;
		Node left;
		public Node(int data) {
			
			this.data = data;
			this.right = null;
			this.left = null;
		}
	  
	}
	static class BT{
		static int ind=-1;
		public static Node buildTree(int nodes[]) {
			ind++;
			if(nodes[ind]==-1)
				return null;
			else {
			
			Node newNode=new Node(nodes[ind]);
				newNode.left=buildTree(nodes);
				newNode.right=buildTree(nodes);
			
			return newNode;
			}
		}
	}
	//count of nodes
	public static int countOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int leftNodes= countOfNodes(root.left);
		int rightNodes= countOfNodes(root.right);
		
		return leftNodes+rightNodes+1;
		
	}
	//Number of leaves
	 public static int getLeafCount(Node node) 
	    {
	        if (node == null)
	            return 0;
	        if (node.left == null && node.right == null)
	            return 1;
	        else
	            return getLeafCount(node.left) + getLeafCount(node.right);
	    }
	 
	 public static int size(Node root)
	    {
	        if (root == null)
	            return 0;
	          
	        // Using level order Traversal.
	        Queue<Node> q = new LinkedList<Node>();
	        q.offer(root);
	          
	        int count = 1; 
	        while (!q.isEmpty())
	        {
	            Node tmp = q.poll();
	            if (tmp != null)
	            {
	                if (tmp.left != null)
	                {
	                  count++;
	                q.offer(tmp.left);
	                }
	                if (tmp.right != null)
	                {
	                  count++;
	                  q.offer(tmp.right);
	                }
	            }
	        }
	          
	        return count;
	    }
	 // maximum value in tree
	 static int maxValue(Node node)
	 {
	     if (node.right == null)
	         return node.data;
	     return maxValue(node.right);
	 }
	 
	 //check two values are siblings or not 
	 static boolean CheckIfNodesAreSiblings(Node root,
             int data_one,
             int data_two)
        {
        if (root == null)
                return false;


             if (root.left != null && root.right != null)
			{
			int left = root.left.data;
			int right = root.right.data;
			
			if (left == data_one &&
			right == data_two)
			return true;
			else if (left == data_two &&
			right == data_one)
			return true;
			}

			// Check for left subtree
			          if (root.left != null)
			CheckIfNodesAreSiblings(root.left,
			      data_one,
			      data_two);
			
			// Check for right subtree
			if (root.right != null)
			CheckIfNodesAreSiblings(root.right,
			      data_one,
			      data_two);
			return true;
	}
	 
	public static boolean printAncestors(Node node, int target)
	    {
	         /* base cases */
	        if (node == null)
	            return false;
	  
	        if (node.data == target)
	            return true;
	  
	        /* If target is present in either left or right subtree
	           of this node, then print this node */
	        if (printAncestors(node.left, target)
	                || printAncestors(node.right, target))
	        {
	            System.out.print(node.data + " ");
	            return true;
	        }
	  
	        /* Else return false */
	        return false;
	    }
	 
	public static void main(String[] args) {
		int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BT tree=new BT();
		Node root=tree.buildTree(node);
		//System.out.println(root.data);
		System.out.println(countOfNodes(root));
		System.out.println(getLeafCount(root));
		System.out.println(size(root));
		System.out.println(maxValue(root));
		System.out.println(CheckIfNodesAreSiblings(root,2,4));
		System.out.println(printAncestors(root,4));
	}
}
