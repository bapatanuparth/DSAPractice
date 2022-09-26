package sorting;

import java.util.Arrays;

public class InsertionSort {

	//maintain sorted array from left side
	//start from second index and scan from beginning
	//insert the element in the right index to maintain the array as sorted
	public static void insertionSort(int [] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					while(i>j) {
						arr[i]=arr[i-1];
						i--;
					}
					arr[j]=temp;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort2(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		insertionSort(new int[] {4,2,1,3,3,3,0,1,1,2});
	}
}
