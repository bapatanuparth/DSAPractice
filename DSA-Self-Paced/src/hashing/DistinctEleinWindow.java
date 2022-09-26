package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;

//Count Distinct Elements In Every Window of Size K.
public class DistinctEleinWindow {
	
	public static void main(String[] args) {
		countDistincteff(new int [] {10,10,10,10}, 3);
	}

	static void countDistincteff(int arr[],int k) {
		Map<Integer,Integer>map=new HashMap<>();
		Map<Integer,Integer>revmap=new HashMap<>();
		int start=0;
		//add first k elements in the map, print map size
		for (int i=0;i<k;i++) {
			map.put(arr[i],i);
			revmap.put(i, arr[i]);
			System.out.println(map.size());
		}
		start=1;
		//start will move ahead with window on each iteration
		//check if we have an element thats occurred before that of start in map
		//if yes, remove the element and add the next in map
		//print map size
		for(int i=k;i<arr.length;i++) {
			if(map.containsValue(start-1))
				map.remove(revmap.get(start-i));
			map.put(arr[i],i);
			start++;
		}
		System.out.println(map.size());
	}
	
	
	
	//Naive
	//add element in each window in a set
	//print set.size()
	//clear set for next iteration
	static void countDistinct(int arr[], int k) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i=0;i<arr.length-k+1;i++) {
			for(int j=i;j<k+i;j++)
				set.add(arr[j]);
			System.out.println(set.size());
			set.clear();
		}
	}
}
