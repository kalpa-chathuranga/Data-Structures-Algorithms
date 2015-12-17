package BinaryTreePackage;

public class BinaryTree {

	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void addNode(int value)
	{
		if(root==null){root = new Node(value); }
		else{root.addNode(value);}
	}
	
	
	public void search(int value)
	{
		if (root==null) {System.out.println("No items in BST");		}
		else{root.search(value);}
	}
	
	
	public void levelOrderTraversal()
	{
		if(root==null) return;
		else root.levelOrderTraversal(root);
	}

}




