package searching;

public class SearchInfiniteSortedArray {

	//Naive solution
	//time --> O( position) space-O(1)
	public int searchInfinite(int arr[], int x) {
		int i=0;
		while(arr[i]<=x) {
			if(arr[i]==x)return i;
			i++;
		}
		return -1;
	}
	
	//unbounded binary search
	//efficient solution
	//logarithmic time complexity is obtained when we divide by 2 or multiply a num by 2 to reach 
	//the desired result
	public int searchInfiEff(int arr[], int x) {
		if(arr[0]==x)return 0;
		int i=1;
		//double the indices and reach till the upper bound quickly
		//we will take O(log position) to reach this upper bound
		while(arr[i]<x) {
			i=i*2;
			if(arr[i]==x)return i;
		}
		//binary search the element between i/2 to i
		//binary search wil take O(log position)
		return BinarySearch.binarySearchRec(arr, x, i/2+1, i);
	}
}
