package Recursion;

public class OnetoN {
	public static void main(String[] args) {
		onetoN(6);
	}
	static void onetoN(int n) {
		if(n==0) {
			return;
		}
		onetoN(n-1);
		System.out.print(n+" ");
	}
}
