package binarySearchTree;

import java.util.TreeMap;

public class TreeMapIntro {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Hi");
		map.put(5, "No");
		map.put(3, "Bye");
		map.put(5, "kk");
		
		map.containsKey(2);
		//prints map in sorted order 
		System.out.println(map);
		
		//return strictly lower or higher
		System.out.println(map.lowerKey(5));
		System.out.println(map.higherKey(5));
		
		//return equal to value also 
		System.out.println(map.floorKey(5));
		System.out.println(map.ceilingKey(5));
		
		
		//returns value corresponding to 3
		System.out.println(map.remove(3));
	}
}
