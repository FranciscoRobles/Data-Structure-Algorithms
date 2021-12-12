package src;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertAtHead(123);
		list.insertAtHead(4);
		list.insertAtHead(1);
		list.insertAtHead(6789);
		list.insertAtHead(87678);
		list.insertAtHead(20);
		
		System.out.println(list);
	}

}
