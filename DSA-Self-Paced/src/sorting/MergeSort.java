package sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[], int l, int r) {
		//check if arr size at least 2
		if(r>l) {
			int m= l+ (r-l)/2; // similar as (l+r)/2 but written like this to 
								//avoid overflow
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr,l,m,r);
		}
	}
	
	

	public static void merge(int[] arr, int low, int mid, int high) {
		//form 2 separate arrays as in merge 2 diff arrays problem
		int n1=mid-low+1, n2=high-mid;
		int left[]=new int[n1];
		int right[]=new int [n2];
		for(int i=0;i<n1;i++) {
			left[i]=arr[low+i];
		}
		for(int i=0;i<n2;i++) {
			right[i]=arr[mid+1+i];
		}
		
		//use same logic as merging 2 diff arrays
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;k++;
			}else {
				arr[k]=right[j];
				j++;k++;
			}
		}
			while(j<right.length) {
				arr[k]=right[j];j++;k++;
			}
			while(i<left.length) {
				arr[k]=left[i];
				i++;k++;
			}	
	}
}
