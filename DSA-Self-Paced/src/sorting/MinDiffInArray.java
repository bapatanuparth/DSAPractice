package sorting;

import java.util.Arrays;

public class MinDiffInArray {
	
	//efficient solution
	public static int getMinDiffEff(int arr[]) {
		Arrays.sort(arr);
		int res=Integer.MAX_VALUE;
		for(int j=1;j<=arr.length;j++) {
			res=Math.min(res, Math.abs(arr[j]-arr[j-1]));
		}
		return res;
		
		
	}
	
	//Naive solution
	public static int getMinDiff(int arr[]) {
		int res=Integer.MAX_VALUE;
		
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<i;j++) {
				res=Math.min(res, Math.abs(arr[i]-arr[j]));
			}
		}
		return res;	
	}

}
