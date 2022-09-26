package sorting;

import java.util.Arrays;

//sort using counting sort
//values of array lie between 0 to k-1
public class CountingSort {
	
	
	//Efficient approach
	//can be used with general purpose objects as well
	public static void countSort(int arr[], int k) {
		int count[]= new int[k];
		Arrays.fill(count, 0);
		
		//now modify input array such that count[i] stores how many elements are <= i
		for(int i=1;i<k;i++) {
			count[i]=count[i-1]+count[i];
		}
		
		int output[]= new int [arr.length];
		//from the end of array-->
		//grab the element at ith position in input array.
		//use this value as index in the counting array and get the count at that index--> this will be the position where 
		//that value should go in the output array;
		//subtract one from this value use it as index and add the arr[i] on the output array 
		for(int i=arr.length-1;i>=0;i--) {
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=output[i];
		}
	}
	
	
	
	//Naive approach
	//this cannot be used to sort custom made objects having multiple fields
	public static void countingSort(int arr[],int k) {
		//create new array of count of size 0 to k-1 and store frequency of occurence of each elements
		int count[]= new int[k];
		Arrays.fill(count, 0);
		//store counts of each element occurence
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		
		int index=0;
		//loop through the count array and write arr again depending on how many times the index element occurs based on its
		//frequency value
		for(int i=0;i<count.length;i++) {
			
			for(int j=0;j<count[i];j++) {
				arr[index]=i;
				index++;
			}
		}
	}

}
