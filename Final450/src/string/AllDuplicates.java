package string;
import java.util.*;
import java.util.Map.Entry;

public class AllDuplicates {

	//find all the duplicates in a string
	void duplicates(String s) {
		
		Map<Character, Integer> map= new HashMap<>();
		
		char [] c= s.toCharArray();
		for(char ch:c) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}
}
