package dynamicProgramming.tabulation;

import java.util.ArrayList;
import java.util.List;

public class AllConstruct {

	List<List<String>> allConstruct(String[] arr, String str) {
		List<List<List<String>>> table= new ArrayList<>(str.length()+1); //table will be an array of 2D arrays
		for(int i=0;i<table.size();i++) { //initialize table with empty 2D arrays
			table.add(new ArrayList<>());
		}
		
		table.get(0).add(new ArrayList<>()); // for empty string, it will have an empty string in a 2D arrays
		
		for(int i=0;i<table.size();i++) {
			
			for(String word:arr) {
				if(str.substring(i, i+word.length()).equals(word)) { //if the word is matching with the desired substring of given string
					
					for(List<String> list:table.get(i)) { //fetch each lost at that index i
						
						List<String> temp= new ArrayList<>(list); //create new list with all the records of the imdex at i + add new record == word
						temp.add(word);
						table.get(word.length()).add(temp); //add this new list at the word.length() position as this temp holds one way pf creating the string at table[word.length]
					}
				}
			}
		}
		
		return table.get(table.size()-1);
	}
}
