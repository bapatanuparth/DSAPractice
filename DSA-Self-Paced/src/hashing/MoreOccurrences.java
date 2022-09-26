package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//print elements occurring more than n/k times
public class MoreOccurrences {

	static void moreOccurrences(int arr[],int k) {
		Map<Integer,Integer>map=new HashMap<>();
		//save frequency of each element in map
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])==false)
				map.put(arr[i], 1);
			else
				map.replace(arr[i], map.get(arr[i])+1);
		}
		int ratio=arr.length/k;
		//look for values with frequency more than n/k
		//print only those values
		for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
			if(entry.getValue()>ratio)
				System.out.print(entry.getKey()+" ");
		}
	}
}
