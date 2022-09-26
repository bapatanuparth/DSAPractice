package searching;
//popular interview problems

//homework -- check if there is pythagorean triplet in the array
public class TwoPointerApproach {
	//if array is unsorted, use hashing to get the sum of 2 elements.
	//Two sum problem.
	//Time  and space O(n)
	
	//in sorted array and number x, find if there is a pair of values whose sum 
	//is equal to x
	//Time - O(n) , space -O(1)
	public static boolean pairSum(int[] arr, int x) {
		int low=0, high=arr.length-1;
		int sum;
		while(low<=high) {
			sum=arr[low]+arr[high];
			if(sum==x)return true;
			if(sum>x)high=high-1;
			else low=low+1;
		}
		return false;
	}
	
	//Triplet Problem -- find 3 elements in array such that a+b+c=x
	//O(n2) 
	//Sorted Array --> in sorted array, go from each element one by one take it as a,
	//call pairSum() function sending x-a as new x and search for b and c the same way 
	//low --> index(a)+1, high=n-1;
	
	//triplet problem
	//unsorted array --> if array is unsorted, sort the array 1st, --> O(nlogn)
	//follow the sorted approach above --> O(n2)
	//overall - O(nlogn) +O(n2) = O(n2)
}
