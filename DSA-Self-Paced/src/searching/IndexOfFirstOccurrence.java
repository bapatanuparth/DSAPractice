package searching;

//binary search



//return index of first occurrence of a sorted array
public class IndexOfFirstOccurrence {
	
	//binary search based recursive code
	public static int firstOccur(int [] arr, int low, int high, int num) {
		if(low>high)return -1;
		int mid=(low+high)/2;
		//only change than binary search
		if(arr[mid]==num) {
			//if element found is not 1st occurrence, change high to mid-1
			if(mid!=0 && arr[mid-1]==num) {
				return firstOccur(arr,low, mid-1,num);
			}
			//return mid when first occurrence is found
			else return mid;
		}
		else if(arr[mid]<num)
			return firstOccur(arr,mid+1,high,num);
		else return firstOccur(arr, low, mid-1, num);
	}
	
	//iterative solution 
	//does not have extra function call overheads
	public static int firstOcurIter(int [] arr, int num) {
		int low=0; int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(num<arr[mid]) {
				high=mid-1;
			}else if(num > arr[mid]) {
				low=mid+1;
			}
			else if(num==arr[mid]) {
				if(mid ==0 || arr[mid-1]!=num)return mid;
				else high=mid-1;
			}
		}
		return -1;
	}

}
