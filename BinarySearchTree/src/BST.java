class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BST {
    // Root of Binary Tree
    Node root;
 
    BST() { 
    	
    	root = null; 
    	
    }
 
    // Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node == null)
        	 return;
        
       
        printInorder(node.left);
 
        
        System.out.print(node.key + " ");
 
     
        printInorder(node.right);
    }
 
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        /* first print data of node */
        System.out.print(node.key + " ");
 
        /* then recur on left subtree */
        printPreorder(node.left);
 
        /* now recur on right subtree */
        printPreorder(node.right);
    }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        printPostorder(node.left);
 
        // then recur on right subtree
        printPostorder(node.right);
 
        // now deal with the node
        System.out.print(node.key + " ");
    }
    
 
    // Driver code
    public static void main(String[] args)
    { 
    BST tree = new BST();
    tree.root = new Node(5);
    tree.root.left = new Node(2);
    tree.root.left.left = new Node(1);
    tree.root.left.right = new Node(3);
    
    tree.root.right = new Node(6);

      // Function call
    
    System.out.println("\nPreorder traversal of binary tree is ");
    tree.printPreorder(tree.root);
    System.out.println("\nInorder traversal of binary tree is ");
    tree.printInorder(tree.root);
    
    System.out.println("\nPostorder traversal of binary tree is ");
    tree.printPostorder(tree.root);
}
}
