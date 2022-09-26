package dynamicProgramming.memoization;

import java.util.Set;

//total number of ways in which the target word can be constructed from the given set of words in array
public class CountConstruct {
	
	int count=0;
	boolean wordConstruct(String [] arr, String word, Set<String> memo) {
		if(word.equals("")) {
			count++;
			return true;
		}
			
		if(memo.contains(word))return false; //if set contains a word, it means the word was seen before and has output as false
		//hence return false directly before making any further calls
		
		for(int i=0;i<arr.length;i++) {
			if(word.indexOf(arr[i])==0) //can even use the inbuilt indexOf method to check whether index of substring is 0 i.e. it is in the starting 
				 {
					boolean temp=wordConstruct(arr,word.substring(arr[i].length(), word.length()), memo);
					//if(temp)return true;
					if(!temp)
						memo.add(word);
				 }
		}
		return false;
	}

}
