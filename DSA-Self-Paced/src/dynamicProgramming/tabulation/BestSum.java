package dynamicProgramming.tabulation;

import java.util.ArrayList;
import java.util.List;

//given a targetsum and array, return an array containing the shortest combination of numbers that add up to the 
//target sum.
//if there is a tie, return any combination of t
public class BestSum {

	
	//ex - ([2,3,5], 8)
	//possible --> 2,2,2,2 || 2,3,3 || 3,5
	//output -- 3,5
	List<Integer> bestSum(int [] arr, int target){
	
		//create a table of length target + 1 and initialize all with null
		//table[0] == [] as we can get sum 0 with empty list i.e. no elements
		List<List<Integer>> table = new ArrayList<>(target+1);
		
		for(int i=0;i<table.size();i++) {
			table.add(null);
		} //setting up the table
		
		table.set(0, new ArrayList<>()); //table[0] = []
		
		for(int i=0;i<=target;i++) {
			if(table.get(i)!=null) { //modify only if element!= null,
				
				for(int num:arr) { //iterate through each num from input arr
					
					if(i+num < table.size()) { //to check thar we dont go out of bounds
						List<Integer> temp= new ArrayList<>(num);
						temp.addAll(table.get(i));
						
						if(table.get(i+num)==null) { //if there is no value previously present, set that sum at i+ num position == temp
							table.set(i+num, temp);
						}
						else { //if there is already an array present at the i+num, check whether temp.size is smaller. 
							//if temp smaller, replace the value with temp, otherwise keep the previous value
							if(table.get(i+num).size()>temp.size())
								table.set(i+num, temp);
						}
					}
				}
			}
		}
		//here each element of the table t[i] will have the best possible combination of elements to reach there i.e. minimum numbers from input to be added to reach that number
		
		return table.get(target);
		
	}
	
}
