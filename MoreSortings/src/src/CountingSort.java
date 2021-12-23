package src;

public class CountingSort {

	static int [] array = {9,11,19,5,3,4,5,3,1,1,11,12,8};
	static int highestRange = 20;
	
	public static void countingSort() {
		int [] tempArray = new int[highestRange];
		for(int i = 0; i<array.length;i++) {
			int value = array[i];
			int counter = tempArray[value-1];
			counter++;
			tempArray[value-1] = counter; 
		}
		
		//Traverse temp array to sort original array
		int currentAtArray = 0;
		for(int i = 0; i<tempArray.length;i++) {
			int valueToSave = i+1;
			if(tempArray[i] != 0) {
				for(int j = 0; j < tempArray[i]; j++) {
					array[currentAtArray] = valueToSave;
					currentAtArray++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+"-");
		}
		System.out.println();
		countingSort();
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+"-");
		}
	}

}
