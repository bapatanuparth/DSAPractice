package hashing;

import java.util.HashMap;
import java.util.Map;

//check if array has 2 elements that add up to given sum

public class PairWithSum {
	//can also be done using hashSet
	//add elements in set only if pair not found. Look up in hashset if it contains element
	static public boolean isSumPresent(int arr[],int sum) {
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsValue(sum-arr[i]))
				return true;
			else
				map.put(arr[i], sum-arr[i]);
		}
		return false;
	}
}
