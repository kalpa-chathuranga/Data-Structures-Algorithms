package BinaryTreePackage;

public class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int data) {

		this.data = data;
	}
	
	// Add Node ------------------------------------------------
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


	// Search for items 
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
	
	
}

