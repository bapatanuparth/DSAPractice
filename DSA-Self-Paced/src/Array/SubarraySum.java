package Array;

import java.util.ArrayList;

public class SubarraySum {

//	Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
//
//	In case of multiple subarrays, return the subarray which comes first on moving from left to right.
	
//	Input:
//		N = 5, S = 12
//		A[] = {1,2,3,7,5}
//		Output: 2 4
	  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        // Your code here
	        ArrayList<Integer> al=new ArrayList<>();
	        int sum=0;
	        int i=0,j=0;
	        while(i<n && j<n){
	            sum+=arr[j];
	            if(sum==s){
	                al.add(i+1);
	                al.add(j+1);
	                return al;
	            }
	            else if(sum<s){
	                j++;
	            }
	            /////////////// take a look. this is not just removing one element from left
	            else if(sum >s){
	                i++;
	                j=i;
	                sum=0;
	            }
	        }
	        al.add(-1);
	        return al;
	    }
}
