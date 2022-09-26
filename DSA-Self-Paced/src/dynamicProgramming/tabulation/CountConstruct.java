package dynamicProgramming.tabulation;
//count how many ways we can construct the given string from the list of input strings
public class CountConstruct {

	int count(String[] arr, String str) {
		int table[] = new int [str.length()+1];
		
		table[0]=1; //we can construct empty string in one way
		for(int i=0;i<table.length;i++) {
			
			
			for(String word:arr) {
				if(str.substring(i, word.length()).equals(word)) {
					table[i+word.length()]=table[i]+table[i+word.length()];
					}
				}
			
		}
		return table[table.length-1];
	}
}
