package sorting;

//return the kth smallest element from the array 

//input: [10,2,40,30] k=2
//output:10
public class KthSmallestElement {
	//naive way is to sort the array and return element at k-1 index
	
	//efficient way--> use lomuto partition
	//it will return the position of an element in the sorted array
	
	//QuickSelect Algorithm
	public static int getKthSmallest(int arr[], int k) {
		
		int l=0, h=arr.length-1; 
		
		
		while(l<=h) {
			int p=partition(arr,l,h);
			if(p==k-1)return p;
			if(p>k-1) {
				h=p-1;
			}else {
				l=p+1;
			}
		}
		return -1;
	
	}
	
	
	
	public static int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=0;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		arr[i+1]=arr[high];
		return i+1;
		
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

	
}
