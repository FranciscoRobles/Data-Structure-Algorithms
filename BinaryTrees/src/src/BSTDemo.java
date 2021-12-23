package src;

public class BSTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(50);
		bst.insertNode(30);
		bst.insertNode(78);
		bst.insertNode(60);
		System.out.println();
		bst.findNode(20);
		bst.findNode(60);

	}

}
