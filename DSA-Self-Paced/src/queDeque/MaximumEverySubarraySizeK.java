package queDeque;

import java.util.*;

public class MaximumEverySubarraySizeK {

	//Efficient solution
	//use deque to maintain track of maximum element of the subarray
	public static void printMaxEff(int arr[], int k) {
		Deque<Integer> ad= new ArrayDeque<>();
		int i=0;
		ad.addLast(arr[0]);
		while(i<k) {
			while(!ad.isEmpty() && arr[i]>=arr[ad.peekFirst()])
				ad.removeLast();
			ad.addLast(i);
			i++;
		}
		
		i=k;
		while(i<arr.length) {
			System.out.println(arr[ad.peek()]);
			
			while(!ad.isEmpty() && ad.peek()<=i-k)
				ad.removeFirst();
			while(!ad.isEmpty() && arr[i]>=ad.peekLast())
				ad.removeLast();
			ad.addLast(i);
			i++;
		}
		
		System.out.println(arr[ad.peek()]);
	}
	
	
	//Naive solution
	public static void printMaxK(int arr[], int k) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			
			int mx=arr[i];
			
			for(int j=i+1;j<i+k;j++) {
				mx=Math.max(arr[i], arr[j]);
			}
			
			System.out.println(mx);
		}
	}
}

