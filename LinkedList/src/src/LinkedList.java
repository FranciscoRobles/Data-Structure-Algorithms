package src;

public class LinkedList {
	
	private Node head;
	
	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	//O(1) to delete the Head
	public void deleteHead() {
		this.head = this.head.getNextNode();
	}
	
	public int length() {
		Node current = this.head;
		int counter = 0;
		//O(n) to know the length of the Linked List.
		while(current != null) {
			current = current.getNextNode();
			counter++;
		}
		return counter;
	}
	
	//O(n)
	public Node search(int data) {
		Node current = this.head;
		while(current != null) {
			if(current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "{";
		Node current = this.head;
		while(current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
}
