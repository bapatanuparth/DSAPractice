package Array;

import java.util.HashMap;

public class FreqSorted {
	public static void main(String[] args) {
		maxFreq(new int [] {10,10,10,20,30,30,40});
	}
	
	static void maxFreq2(int arr[]) {
		int count=1;
		if(arr.length==1)
			System.out.println(arr[0]+" "+1);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1])
				{
				System.out.println(arr[i]+ " "+count);
				count=1;
				}
			else 
				count++;
		}
		//code not complete
	}
	
	
	//frequencies of each element in sorted array
	static void maxFreq(int arr[]) {
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				temp=map.get(arr[i]);
				map.replace(arr[i], temp+1);
			}
		}
		for(Integer val:map.keySet()) {
			System.out.println(val);
		}
	}
}
