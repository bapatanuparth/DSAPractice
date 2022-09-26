package searching;

public class FindPeakElement {

	//Naive approach
	public int peakElement(int arr[]) {
		int n=arr.length;
		if(arr.length==1)return arr[0];
		if(arr[0]>=arr[1])return arr[0];
		if(arr[n-2]<=arr[n-1])return arr[n-1];
		for(int i=1;i<n-1;i++) {
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
				return arr[i];
		}
		//will never reach here as in any array there is always a peak element
		return -1;
	}
	
	//use binary search
	//find mid, if mid is not peak then any side where ele>mid, there has to be a peak
	public static int peakElementEff(int arr[]) {
		int low=0,high=arr.length-1;
		int n=arr.length;
		while(low<=high) {
			int mid=(low+high)/2;
			//if mid is peak|| mid is start || mid id end, return mid
			if(mid==0 || arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1] || mid==(n-1)) {
				return mid;
			}
			//if large element is on LHS of mid, go to lower half array
			if(mid>0 && arr[mid-1]>=arr[mid])
				high=mid-1;
			else//go to upper half of array
				low=mid+1;
		}
		return -1;
		
	}
}
