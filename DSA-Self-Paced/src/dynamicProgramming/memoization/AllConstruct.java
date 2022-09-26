package dynamicProgramming.memoization;
import java.util.*;
//find out all the ways in which we can construct a target word from the set of small words

public class AllConstruct {
	
	//memoized solution
	List<List<String>> out= new ArrayList<>();
	boolean allConstruct(String [] arr, List<String> temp, String word, Map<String, List<String>> memo){

		if(memo.containsKey(word)) {
			List<String> x= new ArrayList<>(temp);
			x.add(word);
			out.add(x);
			System.out.println(out);
			return true;
		}
		if(word.equals(""))
		{
			//System.out.println(temp);
			out.add(new ArrayList<>(temp));
			return true;
		}
			
		for(int i=0;i<arr.length;i++) {
			if(word.indexOf(arr[i])==0)
			{
				//System.out.println(arr[i]);
				temp.add(arr[i]);
				boolean t=allConstruct(arr, temp, word.substring(arr[i].length(), word.length()),memo);
				if(t)memo.put(word, new ArrayList<>(temp)); //memoize the solution if the word is present
				temp.remove(temp.size()-1);
			}
		}
		
		//memo.put(word, new ArrayList<>(temp));
		return false;
	}
	
	//solution without memoizing
	//simple recursive approach
	boolean allConstructSimple(String [] arr, List<String> temp, String word, Map<String, List<String>> memo){

		
		if(word.equals(""))
		{
			//System.out.println(temp);
			out.add(new ArrayList<>(temp));
			return true;
		}
			
		for(int i=0;i<arr.length;i++) {
			if(word.indexOf(arr[i])==0)
			{
				//System.out.println(arr[i]);
				temp.add(arr[i]);
				allConstruct(arr, temp, word.substring(arr[i].length(), word.length()),memo);
				temp.remove(temp.size()-1);
			}
		}
		
		return false;
	}

	
	public static void main(String[] args) {
		String [] str= new String[] {"ab", "abc", "cd", "def", "abcd","ef","c"};
		String [] str1= new String[] {"purp", "p", "ur", "le","purpl"};
		List<String> temp= new ArrayList<>();
		Map<String, List<String>> memo= new HashMap<>();
		AllConstruct w= new AllConstruct();
		w.allConstruct(str, temp, "abcdef", memo);
	}
}
