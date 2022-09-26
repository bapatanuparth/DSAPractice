package hashing;

import java.util.HashMap;

public class LongestSubarraywithSum {

	public static void main(String[] args) {
		longestSum();
	}
	//take prefix sum
	//store each prefix sum in hashmap with index 
	// take max of subtract(new index at which sum occurred-beginning of subarray)
	public static int longestSum() {
		int arr[]= {5,12,-4,-4,5,2,2};
		int sum=4;	
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		int curr=0;
		int res=0;
		for(int i=0;i<arr.length;i++) {
			curr=curr+arr[i];
			if(curr==sum)res=i+1;
			if(map.containsKey(curr)==false)
				map.put(curr, i);
			if(map.containsKey(curr-sum))
				{
					res=Math.max(res,i-map.get(curr-sum));
				}
			
		}
		System.out.println(res);
		return res;
	}
}
