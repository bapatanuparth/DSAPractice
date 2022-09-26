package leetcodeDynamicProgramming;
import java.util.*;

//Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

//Input: nums = [1,5,11,5]
//Output: true

public class PartitionEqualSubset {
	
	//tabulation solution easy
	public boolean canPartitionTab(int[] nums) {
		int sum = 0;
		for(int i:nums){
		sum+=i;
		}
		if(sum%2 != 0) return false; //if total sum is false, we cannot have 2 subsets with equal sum
		int subsetSum = sum/2;
		Boolean[][] dp = new Boolean[subsetSum+1][nums.length];
		return isEqualSum(nums, dp, nums.length-1, subsetSum);
		}

		public Boolean isEqualSum(int[] nums, Boolean[][] dp, int i, int sum){
		    if(sum == 0){
		        return true;
		    }
		    
		    if(i < 0 || sum < 0){
		        return false;
		    }
		    if(dp[sum][i] != null) return dp[sum][i];
		    Boolean result = isEqualSum(nums, dp, i-1, sum-nums[i]) || isEqualSum(nums, dp, i-1, sum);
		    dp[sum][i] = result;
		    return result;
	}
		
	
	
	//solution with memoization using set
	//we calculate the total sum of all the elements
	//then we one by one using backtracking approach, recursively check for each and every combination 
	//if the sum of combination == total sum- sum of combination, we have 2 different subsets with equal sum
	 public boolean canPartitionMemo(int[] nums) {
	     
	        int sum= 0;
	        for(int i:nums)
	            sum+=i;
	        
	        Set<Integer> memo= new HashSet<>();
	        return canSum(nums, sum, 0,0, memo);
	        
	    }
	    
	    boolean canSum(int []nums, int sum, int curr, int i, Set<Integer> memo){
	     
	        if(sum==curr)return true;
	        if(memo.contains(sum))return false;
	        
	        if(sum==0)return false;
	        for(;i<nums.length;i++){
	            sum=sum-nums[i];
	            curr+=nums[i];
	            if(!canSum(nums, sum, curr, i+1, memo))memo.add(sum);
	            else return true;
	            curr-=nums[i];
	            sum=sum+nums[i];
	        }
	        
	        return memo.contains(sum);
	    }

	//solution without memoization
	 public boolean canPartition(int[] nums) {
	     
	        int sum= 0;
	        for(int i:nums)
	            sum+=i;
	        
	        return canSum(nums, sum, 0,0);
	        
	    }
	    boolean canSum(int []nums, int sum, int curr, int i){
	     
	        if(sum==curr)return true;
	        
	        if(sum==0)return false;
	        for(;i<nums.length;i++){
	            sum=sum-nums[i];
	            curr+=nums[i];
	            if(canSum(nums, sum, curr, i+1))return true;
	            curr-=nums[i];
	            sum=sum+nums[i];
	        }
	        
	        return false;
	    }
}
