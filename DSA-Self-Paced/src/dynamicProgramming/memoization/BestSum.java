package dynamicProgramming.memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//given a targetsum and array, return an array containing the shortest combination of numbers that add up to the 
//target sum.
//if there is a tie, return any combination
public class BestSum {

	List<Integer> res;
	void bestSumDP(List<Integer> temp,Map<Integer, List<Integer>> memo, int [] nums, int target, int i) {
		//need to write memoization condition
		
		if(target==0) {
			if(res==null)
				res= new ArrayList<>(temp);
			else if(temp.size()<res.size())
				res=new ArrayList<>(temp);
			return;
		}
		
		if(target<0)return;
		
		
		for(;i<nums.length;i++) {
			int remainder= target- nums[i];
			temp.add(nums[i]);
			bestSumDP(temp, memo, nums, remainder, i);
			remainder+=nums[i];
			temp.remove(temp.size()-1);
		}
		
		if(res!=null)memo.put(target, res);
		return;
	}
	
	
	//this is brute force solution
	//need to do memoization	
	//List<Integer> res;
	void bestSum(List<Integer> temp,Map<Integer, List<Integer>> memo, int [] nums, int target, int i) {
		
		if(target==0) {
			if(res==null)
				res= new ArrayList<>(temp);
			else if(temp.size()<res.size())
				res=new ArrayList<>(temp);
			return;
		}
		
		if(target<0)return;
		
		
		for(;i<nums.length;i++) {
			int remainder= target- nums[i];
			temp.add(nums[i]);
			bestSum(temp, memo, nums, remainder, i);
			remainder+=nums[i];
			temp.remove(temp.size()-1);
		}
		
		return;
	}
	
	void print() {
		System.out.println(res);
	}
	public static void main(String[] args) {
		int[] nums= new int[] {5,3,4,7,14};
		List<Integer> out=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		
		Map<Integer, List<Integer>> memo= new HashMap<>();
		BestSum b= new BestSum();
		b.bestSumDP(temp,memo,nums ,121, 0);
		b.print();
	}
}
