package BinaryTreePackage;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int data) {

		this.data = data;
	}
	
	//-----------------------------------------
	// Add nodes
	// ----------------------------------------
	public void addNode(int value)
	{
		
		if(value == data){ System.out.println("Similar values!");}
		
		if(value < data)
		{
			if( left==null ){	left = new Node(value);	}
			else{left.addNode(value); System.out.println("added:" + value);}
		}
		else
		{ 
			if( right==null ){	right = new Node(value); 	}
			else{right.addNode(value);System.out.println("added:" + value);}
		}
		
		
	}


	//-----------------------------------------
	// Search nodes
	// ----------------------------------------
	public void search(int value) {
		
		if (data==value) {System.out.println("Item found:"+data); 		}
		else if(data > value)
		{
			if (left==null) {
				 System.out.println("Item not found!");
			} else {
					left.search(value);
			}
		}
		else 
		{
			if (right==null) {
				 System.out.println("Item not found!");
			} else {
					right.search(value);
			}
		}
	}
	
	//-----------------------------------------
	// Depth first (level order traversal)
	// ----------------------------------------
		
	public void levelOrderTraversal(Node root)
	{
		System.err.println("Initiating level order traversal");
		
		if( root==null )System.out.println("No nodes in BST"); 
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
				
			Node current = queue.poll();
			System.out.print("-"+current.data);
			
			if(current.left != null)
			{ queue.add(current.left);}


			if(current.right != null)
			{ queue.add(current.right); }
		}
		
	}

	public void preOrderTraversal(Node current) {

		if (current == null) return;
		System.out.print(current.data+"-");
		
		preOrderTraversal(current.left);
		preOrderTraversal(current.right);

	}

	public void inOrderTraversal(Node current) {
		
		if (current == null) return;
		inOrderTraversal(current.left);
		System.out.print(current.data+"-");
		inOrderTraversal(current.right);

	}

	public void postOrderTraversal(Node current) {
		
		if (current == null) return;
		postOrderTraversal(current.left);
		postOrderTraversal(current.right);
		System.out.print(current.data+"-");
	}
	
	}
