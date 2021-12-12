package src;

public class InsertionSort {

	/*
	 * Insertion Sort: O(n2)
	 * Sorting applied when adding/accessing new values to/of the structure; 
	 * 	the structure is already sorted, so we just compare with the next/top most element.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {5, 2, 8, 12, 7};
		for(int i = 0; i<list.length; i++) {
			int current = list[i];
			int j = i-1;
			//This is Stable sort because we don't change the elements even if they are equal.
			while(j >= 0 && list[j]>current) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = current;
		}
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
