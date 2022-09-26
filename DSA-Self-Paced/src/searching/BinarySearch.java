package searching;

public class BinarySearch {
	
	//Binary search Iterative
	//O(Log n) time
	public static int binarySearchIter(int [] arr, int num) {
		int mid=arr.length/2;
		int left=0; int right=arr.length-1;
		while(left<=right) {
			if(num<arr[mid]) {
				right=mid-1;
				mid=(left +right)/2;
			}else if(num > arr[mid]) {
				left=mid+1;
				mid=(left+right)/2;
			}
			else if(num==arr[mid])return mid;
		}
		return -1;
	}

	//binary search recursive
	//involves function call overhead and extra log n space for recursive calls
	//O(logn) time
	public static int binarySearchRec(int[] arr, int num, int low, int high) {
		if(low>high)return -1;
		int mid=(low+high)/2;
		if(arr[mid]==num)return mid;
		
		else if(num<arr[mid])
			return binarySearchRec(arr, num,low,mid-1);
		else 
			return binarySearchRec(arr, num,mid+1,high);
	}
}
