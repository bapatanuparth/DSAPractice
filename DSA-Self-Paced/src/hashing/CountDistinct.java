package hashing;

import java.util.HashSet;


//count distinct elements in an array
public class CountDistinct {
	
	public static void main(String[] args) {
		countElement(new int [] {15,12,13,15,12,13,13});
	}
	
	//short one liner -->
	//HashSet<Integer> set=new HashSet<Integer>(Arrays.asList(arr));
	//return set.size();
	
	static int countElement(int arr[]) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
				set.add(arr[i]); //inserts only if item not present
		}
		
		return set.size();		
	}
}
