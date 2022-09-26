package Recursion;

public class SumNatural {
	public static void main(String[] args) {
		System.out.println(sumNatural(5));
	}
	
	static int sumNatural(int n) {
		if(n==0)
			return 0;
		return n+sumNatural(n-1);
	}
}
