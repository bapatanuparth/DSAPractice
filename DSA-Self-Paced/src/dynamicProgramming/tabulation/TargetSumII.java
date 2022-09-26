package dynamicProgramming.tabulation;

import java.util.ArrayList;
import java.util.List;

//return an array of combination of the elements that add up to the target sum
//return null if its not possible to return the array, i.e. sum not present
public class TargetSumII {

	//initialize an array of number of values == target +1
	//put all the values of array as null
	
	//ex ([5,3,4], 7)
	List<Integer> targetSumII(int [] arr, int target){
		
		List<List<Integer>> table = new ArrayList<>(target+1); //(null(0), null,.. null(7))
		
		for(int i=0;i<table.size();i++) {
			table.add(null);
		} //initialize the table with all null values
		
		table.set(0, new ArrayList<>()); //if target == 0, we can say that the sum 0 is present and return an empty array as the number of elements adding to 0
		
		for(int i=0;i<=target;i++) {
			
			if(table.get(i)!=null) {
				
				for(int num:arr) {
					if(i+num<table.size())
						{
						List<Integer> temp = new ArrayList<>(num); //create new arraylist with the value == val of j th element
						temp.addAll(table.get(i)); //add all the elements of the ith position list to the new list at arr[j] th position
						table.set(i+num, temp); //replace null with the new list at this index == i + arr[j]
						}
				}
			}
			
		}
		
		return table.get(target);
		
		
	}
	

}

