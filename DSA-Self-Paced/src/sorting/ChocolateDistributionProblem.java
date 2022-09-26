package sorting;

import java.util.Arrays;

//each element of the array shows the no.of chocolates in a packet
//you want to distribute chocolates to m children such that the
//difference between max and min amount of chocolates present among these packets is minimized
public class ChocolateDistributionProblem {
	
	public static int minDiff(int arr[], int m) {
		int n=arr.length;
		Arrays.sort(arr);
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n-m+1;i++) {
			ans=Math.min(ans, arr[i+m-1]-arr[i]);
		}
		return ans;
	}

}
