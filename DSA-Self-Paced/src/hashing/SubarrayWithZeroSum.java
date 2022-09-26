package hashing;

import java.util.HashSet;
import java.util.Set;

//check if subarray with sum=0 present
public class SubarrayWithZeroSum {

//prefix sum method
	//calculate prefix sum with each iteration
	//add these sums in hashset
	// if prefix sum a[i:j]==0 means that sum has to be already present in set
	static public boolean isSubarrayZero(int arr[]) {
		Set<Integer>set=new HashSet<>();
		int curr=0;
		for(int i=0;i<arr.length;i++) {
			curr=curr+arr[i];
			if(set.contains(curr))
				return true;
			else if(curr==0) //for cases like [-3,2,1]
				return true;
			else
				set.add(curr);
		}
		return false;
		
	}
}
