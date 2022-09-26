package sorting;

import java.util.Arrays;

//less memory write
//in case of EEPROM -- memory write can be costly and can reduce the age of the memory
//here we can use selection sort
//even when writing data to files , memory writing can be costly
//heap sort is based on selection sort. it just uses heap data structure to optimize
		
public class SelectionSort {

	//in each pass find the minimum element of array 
	//swap this element with element at the beginning
	//this way build up the whole array by finding out the min element of the whole array
	//one by one
	public static void selectionSort(int arr[]) {
		int n=arr.length;
		int temp=Integer.MAX_VALUE, min=0;
		int swap;
		for(int i=0;i<n-1;i++) {
			temp=Integer.MAX_VALUE;
			for(int j=i;j<n;j++) {
				if(arr[j]<temp) {
					temp=arr[j];
					min=j;
				}
			}
			swap=arr[i];
			arr[i]=temp;
			arr[min]=swap;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		selectionSort(new int[] {5,6,7,9,2,4,5,1,0});
	}
}
