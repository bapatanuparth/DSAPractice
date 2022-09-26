package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//give how many distinct elements are present in intersection of 2 unsorted arrays
public class IntersectionofArrays {
	public static void main(String[] args) {
		intersection(new int[] {10,15,5,30}, new int [] {5,5,5});
	}

	//efficient way using only 1 set
	static public int intersection2(int a[], int b[]) {
		Set<Integer> set1=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
			set1.add(a[i]);
		int count=0;
		for(int i=0;i<b.length;i++)
			if(set1.contains(b[i]))
				{
				set1.remove(b[i]);
				count++; 
				}
		System.out.println(count);
		return count;
	}
	
	
	static public int intersection(int a[], int b[]) {
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
			set1.add(a[i]);
		for(int i=0;i<b.length;i++)
			set2.add(b[i]);
		int count=0;
		
		for(Integer i:set1) {
			if(set2.contains(i))
				count++;
		}
		System.out.println(count);
		return count;
	}
}
