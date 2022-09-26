package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChainingImplementation {
	static ArrayList<LinkedList<Integer>>alist;
	
	//create an ArrayList of empty LinkedList objects as structure of hash table
	static void hashTable(int b) {
		alist=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++) {
			alist.add(new LinkedList<>());
		}
		System.out.println(alist);
	}
	
	static void insert(int key) {
		int temp=key%7;
		alist.get(temp).add(key);
	}
	
	static boolean search(int key) {
		int temp=key%7;
		return alist.get(temp).contains(key);
	}
	
	static void delete(int key) {
		int temp=key%7;
		alist.get(temp).remove(key);
	}
	public static void main(String[] args) {
		hashTable(5);
		insert(70);
		insert(72);
		System.out.println(alist);
		System.out.println(search(74));
	}
}
