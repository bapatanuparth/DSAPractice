package sorting;

//Hoares partition return index where elements are divided
//hence we make a call including that index unlike lomuto
public class QuickSortHoares {

	public static void quickSort(int []arr, int l, int h) {
		if(l<h) {
			int p=hoarePartition(arr,l,h);
			//partition return p which means elements from 0 to p <= p+1 to high
			quickSort(arr, l, p);
			quickSort(arr, p+1, h);
		}
	}
	
	public static int hoarePartition(int arr[], int low, int high) {
		//consider 1st element as pivot element
		int pivot=arr[low];
		int i=low-1, j=high+1;
		while(true) {
			//move i till all ele below i< pivot
			do {
				i++;
			}while(arr[i]<pivot);
			//move j till all ele above j are > pivot
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j)return j;
			//swap the elements to maintain the order 
			swap(arr,i,j);
		}
	}	
	public static void swap(int []arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}

