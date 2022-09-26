package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSubset {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		  
        // Initialize an ArrayList with add()
        a.add(1);
        a.add(2);
        a.add(3);
		subsets(a, new ArrayList<>(), 0);
		
	}
	
	static void subsets(ArrayList<Integer>alist, ArrayList<Integer> b, int n) {
		if(n==alist.size())
			{
			System.out.println(b);
			return;
			}
		subsets(alist,b,n+1);
		b.add(alist.get(n));
		subsets(alist,b,n+1);
	}
	
}
