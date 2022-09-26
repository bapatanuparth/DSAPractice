package array;
import java.util.*;

public class MinMaxInArray {

	//efficient way using minimum comparisons
	//compare 2 elements at a time
	
	void minMax(int [] arr){
		//if the array has odd number of elements, assign min and max to 1st element
		//else find min and max from 1st 2 elements
		int n=arr.length;
		int min, max;
		if(n%2==0) { //[2,3,5,1]
			if(arr[0]>arr[1]) {
				min=arr[1];
				max=arr[0];
			}
			else {
				min=arr[0];
				max=arr[1];
			}
		}
		else { //[2,3,5]
			min=arr[0];
			max=arr[0];
		}
		
		//
		for(int i=2;i<n-1;i+=2) {
			if(arr[i]>arr[i+1]) {
				if(arr[i]>max)
					max=arr[i];
				if(arr[i+1]<min)
					min=arr[i+1];
			}
			
			else {
				if(arr[i]<min)
					min=arr[i];
				if(arr[i+1]>max)
					max=arr[i+1];
			}
		}
		
		//you have min and max here
	}
}
