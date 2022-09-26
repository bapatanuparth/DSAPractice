package dynamicProgramming.memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//return the number of elements that add up to the sum in target ow. return null
public class TargetSumII {

	
	//dynamic programming-->
	//if target sum ==0, we return empty array - take this as base case
	//result stored in out
	boolean targetDP(List<Integer> out,Map<Integer, Boolean> memo, int [] nums, int target, int i){
		if(target==0) //base case if target ==0 we found the required sum
			return true;
		if(target<0) return false; //prevent target going to zero
		if(memo.containsKey(target))return false; //if we have seen this sum before and still in function call, it means it must be false
		
		for(;i<nums.length;i++) {
			int remainder= target-nums[i]; //take remainder to be passed on to next call
			out.add(nums[i]); //add current number in the list
			
			boolean temp=targetDP(out,memo, nums, remainder , i); //check whether we are getting the target ==0 in any further calls
			if(temp)return true; //if temp == true, we have found the sum , so return true and print the list formed till now
			
			memo.put(remainder,temp); //put all the values in the map, these map will contain all the remainders that turned out to be false
			
			remainder=remainder+nums[i]; 
			out.remove(out.size()-1); //remove the false elements from your list
		}
	return memo.containsKey(target);
	}
	
	
	
	//backtracking approach -->
	//List<Integer> out= new ArrayList();
	
	boolean target(List<Integer> out, int [] nums, int curr, int target, int i){
		if(curr==target)
			return true;
		
		for(;i<nums.length;i++) {
			curr+=nums[i];
			out.add(nums[i]);
			if(target(out, nums, curr, target, i))return true;
			curr-=nums[i];
			out.remove(out.size()-1);
		}
	return false;
	}
	
	public static void main(String[] args) {
		int[] nums= new int[] {5,3,4,7,14};
		List<Integer> out=new ArrayList<>();
		
		Map<Integer, Boolean> memo= new HashMap<>();
		new TargetSumII().targetDP(out,memo,nums ,21, 0);
		System.out.println(out);
	}
	
}
