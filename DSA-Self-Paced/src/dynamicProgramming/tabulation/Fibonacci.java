package dynamicProgramming.tabulation;

import java.util.Arrays;

public class Fibonacci {

	
	//find nth fibonacci number
	static int fib(int n) {
		int [] table = new int[n+1]; //create a table and iteratively store the fibonacci numbers
		table[1]=1;
		
		for(int i=0;i<=n;i++) {
			if(i<n)
				table[i+1]+=table[i];
			if(i<n-1)
				table[i+2]+=table[i];
		}
		System.out.println(table[n]);
		return table[n];
		
		
	}
	public static void main(String[] args) {
		int [] table = new int[5];
		
		fib(6);
		System.out.println(Arrays.toString(table));
	}
}
