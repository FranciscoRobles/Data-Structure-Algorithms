package src;

public class BubbleSort {
	
	/*
	 * Bubble Sort: O(n2)
	 * Sorting that moves the highest value to the end by swapping with the next
	 * 	one
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {12, 8, 7, 5, 2};
		int lengthOfSwap = list.length -1;
		for(int i = 0; i<lengthOfSwap; i++) {
			for(int j = 0; j<(lengthOfSwap - i); j++) {
				if(list[j]> list[j+1]) {
					int tmp = list[j+1];
					list[j+1] = list[j];
					list[j] = tmp;
				}
			}
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
