import java.util.Arrays;

import BinaryTreePackage.BinaryTree;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] unsortedArray = { 105, 85, 24, 14, 32, 45, 75,15 };
		System.out.println(Arrays.toString(unsortedArray));

		
		BinaryTree BT = new BinaryTree();
		BT.addNode(10);
		BT.addNode(12);
		BT.addNode(5);
		BT.addNode(3);
		BT.addNode(15);
		BT.addNode(8);
		BT.addNode(16);
		BT.addNode(5);
		
		
		BT.search(3214);
		
		System.out.println("Done");
	}

}
