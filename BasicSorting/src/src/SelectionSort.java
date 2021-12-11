package src;

public class SelectionSort {
	
	/*
	 * Selection Sort: O(n2)
	 * Sorting that moves the smallest element and moves it to the beginning by swapping
	 * 	with the leftmost.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {9, 2, 8, 12, 7};
		for(int i = 0; i<(list.length-1); i++) {
			int minIndex = i;
			for(int j = (i+1); j<list.length; j++) {
				if(list[minIndex]>list[j]) {
					minIndex = j;
				}
			}
			int tmp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = tmp;
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
