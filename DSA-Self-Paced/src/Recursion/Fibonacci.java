package Recursion;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
	//1 1 2 3 5 8
	static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fib(n-1)+fib(n-2);
	}
}
