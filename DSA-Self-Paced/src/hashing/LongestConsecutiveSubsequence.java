package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//find the longest subsequence that has consecutive elements. 
//These consecutive elements may appear in any order in the subsequence.
public class LongestConsecutiveSubsequence {
	
	static int longestSubseq(int arr[]) {
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);
		int curr=1,res=1;
		for(Integer i:set) {
			//check if this i is the starting point of a consecutive sub sequence
			if(set.contains(i-1)==false) {
				curr=1;
				//check for all consecutive elements and count
				while(set.contains(i+1)==true)
					curr++;
				res=Math.max(res,curr);
			}
		}
		return res;			
	}
}

