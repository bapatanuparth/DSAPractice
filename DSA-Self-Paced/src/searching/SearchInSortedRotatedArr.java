package searching;

//search an element in sorted and rotated array
//the array can be rotated by 1, 2 or any number of places

public class SearchInSortedRotatedArr {
	
	//efficient way-->
	//use binary search
	//at any given state either left half or right half of the array will be completely sorted
	//this is depending on the number of places the array is rotated by
	//compare middle element with corner elements and decide where is the array sorted
	//now check for element in one half of the array
	public static int searchInRotated(int arr[], int x, int low, int high) {
		if(low>high)return -1;
		int mid=(low+high)/2;
		if(arr[mid]==x)return mid;
		if(arr[low]<arr[mid]) {
			if(x>=arr[low] && x<arr[mid]) {
				return searchInRotated(arr,x,low,mid-1);
			}else return searchInRotated(arr,x,mid+1,high);
		}else {
			if(x>arr[mid] && x<=arr[high]) {
				return searchInRotated(arr, x, mid+1, high);
			}else 
				return searchInRotated(arr, x, low, mid-1);
		}
	}
	
	//iterative approach
	public static int searchInRotatedIter(int arr[], int x) {
		int low=0, high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x)return mid;
			if(low==mid) {low++; continue;} //edge case {3,1}
			if(arr[low]<arr[mid]) {
				if(x>=arr[low] && x<arr[mid]) {
					high=mid-1;
				}
				else low=mid+1;
			}
			else
			{
				if(x>arr[mid] && x<=arr[high]) {
					low=mid+1;
				}	
				else 
				 high=mid-1;
		}
	}
		return -1;
	}

}
