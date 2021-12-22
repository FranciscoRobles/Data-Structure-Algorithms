package src;

public class Factorial {
	
	//We have an accumulator (result) which holde the result of the previous calculation, avoiding Stack Overflow
	public static int tailFactorial(int n, int result) {
		if(n == 0) return result;
		return tailFactorial(n-1, n*result);
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));
		System.out.println(tailFactorial(4, 1));

	}

}
