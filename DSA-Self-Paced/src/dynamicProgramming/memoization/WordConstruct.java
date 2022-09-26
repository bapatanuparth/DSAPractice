package dynamicProgramming.memoization;

import java.util.HashSet;
import java.util.Set;

//check if u can form a given word by concatenating a set of other words given in array
//algo -->
//check one by one if given word has any prefix from the current array
//if the prefix is there, make a recursive call with the substring of word removing the prefix word
//if you encounter "" i.e. empty string word at any point, it means the word can be formed as all the prefixes exist

public class WordConstruct {

	//check if the word from the array is prefix of the input word
	boolean isPrefix(String word, String check) {
		if(check.length()>word.length())
			return false;
		
		for(int i=0;i<check.length();i++) {
			if(check.charAt(i)!=word.charAt(i))
				return false;
		}
		return true;
	}
	
	boolean wordConstruct(String [] arr, String word, Set<String> memo) {
		if(word.equals(""))
			return true;
		if(memo.contains(word))return false; //if set contains a word, it means the word was seen before and has output as false
		//hence return false directly before making any further calls
		
		for(int i=0;i<arr.length;i++) {
			if(isPrefix(word, arr[i])) //can even use the inbuilt indexOf method to check whether index of substring is 0 i.e. it is in the starting 
				 {
					boolean temp=wordConstruct(arr,word.substring(arr[i].length(), word.length()), memo);
					if(temp)return true;
					memo.add(word);
				 }
		}
		return false;
	}
	
	public static void main(String[] args) {
		String [] str= new String[] {"ab", "abc", "cd", "def", "abcd"};
		Set<String> memo= new HashSet<>();
		WordConstruct w= new WordConstruct();
		System.out.println(w.wordConstruct(str, "acdef", memo));
	}
}
