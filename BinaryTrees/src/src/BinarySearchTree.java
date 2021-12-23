package src;

public class BinarySearchTree {
	private TreeNode rootNode;
	
	public void insertNode(int data) {
		TreeNode node = new TreeNode(data);
		if(rootNode == null) {
			this.rootNode = node;
		}
		else {
			rootNode.insert(data);
		}
	}
	
	public TreeNode findNode(int data) {
		if(this.rootNode != null)
			return this.rootNode.find(data);
		System.out.println("Element not found in Tree");
		return null;
	}
	
	public void deleteNode(int data) {
		TreeNode current = this.rootNode;
		TreeNode parent = this.rootNode;
		boolean isLeftChild = false;
		
		if(current == null) {
			return;
		}
		while(current != null && current.getData() != data) {
			parent = current;
			if(data > current.getData()) {
				current = current.getRightChild();
				isLeftChild = false;
			}
			else {
				current = current.getLeftChild();
				isLeftChild = true;
			}
		}
		
		if(current == null) {
			return;
		}
		if(current.getLeftChild() == null && current.getRightChild() == null) {
			if(current == this.rootNode) {
				this.rootNode = null;
			}
			else {
				if(isLeftChild) {
					parent.setLeftChild(null);
				}
				else {
					parent.setRightChild(null);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("The element doesn't exist");
	}

}
