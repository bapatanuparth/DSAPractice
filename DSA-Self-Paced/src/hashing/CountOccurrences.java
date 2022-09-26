package hashing;

import java.util.HashMap;
import java.util.Map;

//Count occurrence of each element in an array
public class CountOccurrences {
	
	public static void main(String[] args) {
		countOccurrence(new int[] {10,10,20,30,30,40,50});
	}

	static void countOccurrence(int arr[]) {
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		int val;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				{
				val=map.get(arr[i]);
				map.replace(arr[i], ++val);
				}
			else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}
}
