package binarySearchTree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIntro {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<>();
		s.add("parth");
		s.add("bapat");
		s.add("Hello");
		//prints sorted in order
		System.out.println(s);
		System.out.println(s.contains("Hello"));
		//iterate through the treeset
		Iterator<String> i= s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//No duplocates
		TreeSet<Integer> set= new TreeSet<Integer>();
		set.add(2);
		set.add(10);
		set.add(8);
		set.add(5);
		
		//prints the closest lower value of 8
		System.out.println(set.lower(8));
		//prints closest higher value than 8
		System.out.println(set.higher(8));
		//value smaller than or equal to 8
		System.out.println(set.floor(8));
		//value greater than or equal to 8
		System.out.println(set.ceiling(8));
	}
}
