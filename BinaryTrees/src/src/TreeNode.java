package src;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	//We use Soft Delete for the Case 3 of Delete
	private boolean isDeleted = false;
	
	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public TreeNode find(int data) {
		if(this.data == data && !this.isDeleted) {
			return this;
		}
		if(data > this.data && this.rightChild != null) {
			return this.rightChild.find(data);
		}
		if(this.leftChild != null){
			return this.leftChild.find(data);
		}
		System.out.println("Element not found in Tree");
		return null;
	}
	
	public void insert(int data) {
		if(data >= this.data) {
			if(this.rightChild == null) {
				this.setRightChild(new TreeNode(data));
			}
			else {
				this.rightChild.insert(data);
			}
		}
		else {
			if(this.leftChild == null) {
				this.setLeftChild(new TreeNode(data));
			}
			else {
				this.leftChild.insert(data);
			}
		}
	}
	
	public void delete() {
		this.isDeleted = true;
	}
	
	public boolean isDeleted() {
		return this.isDeleted;
	}
	
	public int smallest() {
		if(this.leftChild == null) {
			return this.data;
		}
		return this.leftChild.smallest();
	}
	
	public int largest() {
		if(this.rightChild == null) {
			return this.data;
		}
		return this.rightChild.largest();
	}

	public void inOrderTraverse() {
		if(this.leftChild != null) {
			this.leftChild.inOrderTraverse();
		}
		System.out.print(this.getData()+"-");
		if(this.rightChild != null) {
			this.rightChild.inOrderTraverse();
		}
	}
	
	public void preOrderTraverse() {
		System.out.print(this.getData()+"-");
		if(this.leftChild != null) {
			this.leftChild.preOrderTraverse();
		}
		if(this.rightChild != null) {
			this.rightChild.preOrderTraverse();
		}
	}
	
	public void postOrderTraverse() {
		if(this.leftChild != null) {
			this.leftChild.postOrderTraverse();
		}
		if(this.rightChild != null) {
			this.rightChild.postOrderTraverse();
		}
		System.out.print(this.getData()+"-");
	}
}
