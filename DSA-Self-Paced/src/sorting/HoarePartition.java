package sorting;

public class HoarePartition {

	public static int HoarePartition(int arr[], int low, int high) {
		//consider 1st element as pivot element
		int pivot=arr[low];
		int i=low-1, j=high+1;
		//in this we maintain i and j such that
		//all elements before i are < pivot and
		//all elements above j are >pivot
		//when i and j cross or meet, that means we have all elements such that
		//< pivot | pivot| > pivot
		//position of j will be the point of this partition
		while(true) {
			//move i till all ele below i< pivot
			do {
				i++;
			}while(arr[i]<pivot);
			//move j till all ele above j are > pivot
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j)return j;//this position is S.T. elements before j <=elements after j
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
