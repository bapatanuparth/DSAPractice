package sorting;

import java.util.Arrays;

public class BubbleSort {

	//O(n2)
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		boolean swapped;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			//if no swap happened during whole iteration, loop is already sorted
			//optimizes solution time for almost sorted or half sorted arrays
			if(swapped==false)break;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		bubbleSort(new int[] {4,5,7,2,3,9,1,0});
	}
}
