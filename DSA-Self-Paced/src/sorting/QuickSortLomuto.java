package sorting;

//lomuto partition ensures that pivot is fixed at its right position
//and then it calls for elements below and above
public class QuickSortLomuto {
	//considering Lomuto Partition
	
	public static void quickSort(int []arr, int l, int h) {
		if(l<h) {
			//lomuto partition will re-arrange array and give final pos of the last element
			int p=lomutoPartition(arr,l,h);
			//call quicksort and sort array similarly finalizing positions of p-1 elements
			quickSort(arr,l,p-1);
			//call quicksort and sort array for elements above that position in same way
			quickSort(arr, p+1, h);
		}
	}
	public static int lomutoPartition(int arr[], int low, int high) {
		//we are assuming that pivot is the last element of the array
		//if pivot is not the last element -->
		int pivot=arr[high];
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
