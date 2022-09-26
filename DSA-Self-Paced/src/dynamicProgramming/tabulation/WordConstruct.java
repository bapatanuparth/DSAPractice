package dynamicProgramming.tabulation;

//check if u can form a given word by concatenating a set of other words given in array
public class WordConstruct {

	//create a table of size == length of the target word+1
	//the +1 is used to mark the value of empty string
	
	
	//ex -- (abcdef, [ab, abc, cd, def, abcd])
	boolean wordConstruct(String str, String [] arr) {
		//we use the same logic that we did for numbers, here indexes we use to show the length and the char at that index
		
		boolean [] table= new boolean[str.length()+1];
		table[0]= true; // marking this true for base case , i.e. empty string ""
		for(int i=0;i<=str.length();i++) {
			
			//if we can reach to this word from given set of strings -->
			if(table[i]==true) {
				char ch= str.charAt(i);
				for(String word:arr) {
					if(str.substring(i, i+word.length()).equals(word)) { //if arr[j] is a substring of given string and it starts at the i th index, 
						//it means that we can reach up to the index == the length of arr[j].
						//then we cumulatively build on this logic
						//i.e. we check if we can reach next and next characters based on previously known characters that are reachable
						
						table[i+word.length()]=true;//mark i + substring length position  == true as we can create a word up to that position based on the given array of strings
					}
				}
				
				
			}
			
			
		}
		return table[str.length()];
	
	}
}
