package src;

public class Queue {
	static int head = -1; 
	static int tail = -1;
	static int maxSize = 9;
	static int[] queue = new int[maxSize];

	public static void enqueue(int number) {
		int space = tail - head;
		if(head == -1) {
			head++;
			tail++;
			queue[head] = number;
		}
		else if(queue.length > space) {
			if(tail == queue.length - 1) {
				tail = -1;
			}
			tail++;
			queue[tail] = number;
		}
		else {
			tail++;
			queue[tail] = number;
		}
	}
	
	public static int dequeue() {
		int dequeued = queue[head];
		head++;
		return dequeued;
	}
	
	public static int peek() {
		return queue[head];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enqueue(12);
		enqueue(5);
		for(int i = 0; i<queue.length; i++) {
			System.out.print(queue[i] + ",");
		}
		System.out.println();
		System.out.println("Head: " + head + ", Tail: " + tail);
		System.out.println("Dequeue: " + dequeue());
		System.out.println("Peek: " + peek());
		enqueue(27);
		for(int i = 0; i<queue.length; i++) {
			System.out.print(queue[i] + ",");
		}
	}

}
