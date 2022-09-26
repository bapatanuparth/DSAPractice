package dynamicProgramming.memoization;

import java.util.*;

//return boolean if we can get target sum using numbers of the array
//can use one element as many times as needed
//assume all numbers are non negative
public class TargetSum {

	
	//with memoization
	boolean target(int []nums, int k, Map<Integer, Boolean> memo) {
		if(memo.containsKey(k))return memo.get(k); //check if we have already occurred this smaller sum value, and check if we know its solution
		if(k<0)return false;
		if(k==0)return true;
		
		for(int i=0;i<nums.length;i++) {
			if(target(nums, k-nums[i], memo))
				{
				memo.put(k,true); // if anywhere we find true, we update in memo and return true
				return true;
				}
			}
		
		memo.put(k, false); //if we dont get sum == target sum for chosen numbers
		return memo.get(k);
	}
	
	//recursive without DP
	boolean target(int []nums, int k) {
		if(k<0)return false;
		if(k==0)return true;
		
		for(int i=0;i<nums.length;i++) {
			if(target(nums, k-nums[i]))return true;
			}
		
		return false;
	}
}
