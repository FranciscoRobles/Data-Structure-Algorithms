package src;

public class QuickSort {
	static int[] array = {12, 9, 7, 15, 10};
	
	public static void quickSort(int[] array, int start, int end) {
		if(start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot-1);
			quickSort(array, pivot+1, end);return;
		}
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]+"-");
		}
		System.out.println();
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start;
		for(int j = start; j<end-1; j++) {
			if(array[j] <= pivot) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(array, 0, array.length-1);
	}

}
