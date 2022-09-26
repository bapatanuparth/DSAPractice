package sorting;

public class LomutoPartition {

	public static int lomutoPartition(int arr[], int low, int high, int pivot) {
		//we are assuming that pivot is the last element of the array
		//if pivot is not the last element -->
		swap(arr,pivot,high);
		//after this swap, pivot will be at the end.
		int i=low-1;
		//maintain i so that all elements below i will be <pivot
		//all elements between i and j will be >pivot
		//if an element is <pivot, ++i and swap that element with element at i
		for(int j=low;j<high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		//bring pivot between i and j so that partition will be complete
		arr[i+1]=arr[high];
		//return new pos of pivot
		return i+1;
		
	}
	public static void swap(int []arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}