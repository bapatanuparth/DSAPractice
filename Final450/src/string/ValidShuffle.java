package string;
import java.util.*;

public class ValidShuffle {

	boolean shuffleCheck(String first, String second, String check) {
		
		Map<Character, Integer> firstmap= new HashMap<>(); 
		Map<Character, Integer> secmap= new HashMap<>();
		Map<Character, Integer> checkmap= new HashMap<>();
		
		//get freq of all characters from each string
		for(int i=0;i<first.length();i++)
			firstmap.put(first.charAt(i), firstmap.getOrDefault(first.charAt(i), 0)+1);
		
		for(int i=0;i<second.length();i++)
			secmap.put(second.charAt(i),secmap.getOrDefault(second.charAt(i), 0)+1);
		
		for(int i=0;i<check.length();i++)
			checkmap.put(check.charAt(i), checkmap.getOrDefault(check.charAt(i), 0)+1);
		
		for(char ch:checkmap.keySet()) {
			//check whether freq in result == freq in 1st + freq in second
			int freq= checkmap.get(ch);
			
			if(firstmap.getOrDefault(ch, 0)+ secmap.getOrDefault(ch, 0)!= freq)return false;
		}
		
		return true;
	}
}
