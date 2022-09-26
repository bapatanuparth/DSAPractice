package binarySearchTree;

import java.util.TreeSet;

//find the element with value >= the value in present
public class CeilingOnLeftSide {

	void printCeil(int arr[]) {
		int n= arr.length;
		//ceiling if first element will be -1
		System.out.println(-1);
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(arr[0]);
		for(int i=1;i<n;i++) {
			if(set.ceiling(arr[i])!=null)
				System.out.println(set.ceiling(arr[i]));
			else 
				System.out.println(-1);
			set.add(arr[i]);
		}
		
	}
}
