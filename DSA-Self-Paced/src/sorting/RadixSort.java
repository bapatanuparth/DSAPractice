package sorting;

import java.util.Arrays;

public class RadixSort {

	public static void radixSort(int arr[], int n) {
		int mx=arr[0];
		//finding the maximum elemnt of the array
		for(int i=1;i<=n;i++) {
			if(arr[i]>mx)mx=arr[i];
		}
		//find out the number of digits in the largest element
		//for each time call the counting sort function to sort arrays based on their digit place
		for(int exp=1;mx/exp>0;exp=exp*10) {
			countingSort(arr,n,exp);
		}
	}
	
	static void countingSort(int arr[],int n, int exp) {
		//count has 10 elements because digit can be only 0-9
		int[] count=new int [10];
		int output[]=new int [n];
		Arrays.fill(count, 0);
		
		//below for loops allows the arrays to sort based on their units, 10s, 100s,.. places
		//when exp==1, picks up units place of arr[i]
		//when exp=10, picks up 10s place of arr[i]
		for(int i=0;i<n;i++)count[arr[i]/exp%10]++;
		//continuous addition with prev elements to know how many elements <i
		for(int i=0;i<10;i++)count[i]=count[i]+count[i-1];
		//similar to counting sort
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]/exp%10]-1]=arr[i];
			count[arr[i]/exp%10]--;
		}
		//copy to OG array
		for(int i=0;i<n;i++)arr[i]=output[i];
		
	}
}
