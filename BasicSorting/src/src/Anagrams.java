package src;

public class Anagrams {
	
	public static void sortArray(char[] array) {
		for(int i = 0; i<array.length; i++) {
			int current = (int) array[i];
			int j = i-1;
			while(j >= 0 && (int)array[j] > current) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = (char)current;
		}
	}
	
	public static boolean areAnagrams(String a, String b) {
		char[] firstString = a.toCharArray();
		char[] secondString = b.toCharArray();
		
		if(firstString.length == secondString.length) {
			sortArray(firstString);
			sortArray(secondString);
			for(int i = 0; i<firstString.length;i++) {
				if(firstString[i] != secondString[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "iceman";
		String b = "cinema";
		String c = "twitte";
		
		System.out.println(areAnagrams(a, b));
		System.out.println(areAnagrams(a, c));
		System.out.println(areAnagrams(b, c));
	}

}
