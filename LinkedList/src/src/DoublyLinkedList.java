package src;

public class DoublyLinkedList {
	
	private DoublyLinkedNode head;
	
	public <T> void insertAtHead(T data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNext(this.head);
		if(this.head != null) {
			this.head.setPrevious(newNode);
		}
		this.head = newNode;
	}
	
	public int length() {
		if(this.head == null) {
			return 0;
		}
		int length = 0;
		DoublyLinkedNode current = this.head;
		while(current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "{";
		DoublyLinkedNode current = this.head;
		while(current != null) {
			result += current.toString() + ",";
			current = current.getNext();
		}
		result += "}";
		return result;
	}

}
