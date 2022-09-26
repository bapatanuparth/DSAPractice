package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithGivenSum {

	
	//calculate prefix sum and store in set with each iteration
	//if prefixsum-sum is already present in set, return true
	static public boolean isGivenSum(int arr[],int sum) {
		Set<Integer>set=new HashSet<>();
		int curr=0;
		for(int i=0;i<arr.length;i++) {
			curr=curr+arr[i];
			if(set.contains(curr-sum))
				return true;
			if(curr==sum)return true; //for cases like [3,2,1], sum=5
			set.add(curr);
		}
		return false;
	}
}
