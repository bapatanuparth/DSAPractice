package dynamicProgramming.memoization;

//calculate the nth fibonacci number
public class Fibonacci {

	
	//fibonacci without memoization
	int fibRecursive(int n) {
		if(n==0 || n==1)
			return n;
		else
			return fibRecursive(n-1)+fibRecursive(n-2);
	}
	
	//fibonacci with memoization
	
	int k=0;
	int [] memo= new int[k+1]; //memo has all elements as -1 in the beginning
	
	int fibMemo(int n) { // we avoid making recursive calls for the number for which we already have the answer
		
		if(memo[n]==-1) { //if the fib for nth number is not calculated yet, then only process recursion
			int res;
			
			if(n==0 || n==1)
				res=n;
			else
				res= fibMemo(n-1) + fibMemo(n-2);
			
			memo[n]=res; //store the result of fibonacci for nth number to be used later
		}
		return memo[n];
	}
}
