package LinkedListPackage;

public class LinkedList {

	Node head;
	
	public LinkedList() {
	
	}
	
	public void addFront(int data)
	{
		if(head==null) head = new Node(data, null);
		else {
			Node current = new Node(data, head);
			head = current;
		}
		
	}
	
	public void displayList()
	{
		Node currentNode = head;
		
		while (currentNode.next != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;	

			
		}
		
		System.out.println(currentNode.data);
		
	}
	
	public Node getLastNode(){
		
		Node currentNode = head;
		while (currentNode.next ==null) {
			
			currentNode = currentNode.next;
	}
		
		return currentNode;
	}
	
	public void printHead()
	{
		System.out.println(head.data);
	}
}
