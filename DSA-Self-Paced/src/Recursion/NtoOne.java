package Recursion;

public class NtoOne {
	public static void main(String[] args) {
		ntoOne(10);
	}
	
	static void ntoOne(int n) {
		System.out.print(n+" ");
		if (n==1) {
			return;
		}
		ntoOne(n-1);
	}

}
