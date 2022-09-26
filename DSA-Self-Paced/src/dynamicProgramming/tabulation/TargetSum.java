package dynamicProgramming.tabulation;

//return a boolean whether we can get target sum using the numbers of the array or not
//assume all the numbers are non-negative
public class TargetSum {

	boolean canSum(int target, int [] arr) {
		boolean [] table= new boolean[target+1]; //create a boolean table of size target + 1
		//we will be saving boolean values in these indexes and after ll iterations return the value at the target index, that will be our answer
		//we check for each number from 0 to target sum whether that number can be obtained by adding any of numbers of array?
		
		//our base case is that if target == 0 it means we can always return true, as empty array will have sum ==0
		//hence, make table[0] = true;
		
		table[0]= true; //this means we can get sum ==0 from this array
		
		for(int i=0;i<=target;i++) {
			
			if(table[i]==true) {
				
				//if ith element is true, then add each and every element of input array to i and mark (arr[j] + i )th element to true. as this sum is also possible if the previous was possible
				for(int j=0;j<arr.length;j++) { //this means we can get each and every sum == number already present in the array and also all the inter number additions
					if(i+arr[j] < table.length)
						table[i+arr[j]]=true;
				}
			}
		}
		return table[target];
	}
}
