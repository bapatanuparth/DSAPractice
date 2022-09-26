package Recursion;

public class SumofDigits {
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	//add all digits of a number
	
	static int sum(int n) {
		if(n==0)
			return 0;
		return (n%10)+sum(n/10);
	}
}
