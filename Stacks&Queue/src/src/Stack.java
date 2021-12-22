package src;

public class Stack {
	private static int top = -1;
	static int maxSize = 9;
	static int[] array = new int[maxSize];
	
	public static void push(int number) {
		top++;
		array[top] = number;
	}
	
	public static int peek() {
		return array[top];
	}
	
	public static int pop() {
		int popped = array[top];
		top--;
		return popped;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(12);
		push(5);
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();
		System.out.println("Peek: " + peek());
		System.out.println("Pop:" + pop());
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

}
