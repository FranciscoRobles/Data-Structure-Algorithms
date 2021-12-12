package src;

public class DuplicatedStrings {
	
	//We use an algorithm similar to Selection Sort = O(n2)
	public static boolean hasDuplicateChars(String s) {
		char[] characters = s.toCharArray();
		for(int i = 0; i<characters.length; i++) {
			for(int j = 1+i; j<characters.length; j++) {
				if(characters[i] == characters[j]) {
					System.out.println("Repeated char " + characters[i]);
					return true;
				}
			}
		}
		System.out.println("No repeated chars");
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "anaconda";
		String b = "great";
		hasDuplicateChars(a);
		hasDuplicateChars(b);
	}

}
