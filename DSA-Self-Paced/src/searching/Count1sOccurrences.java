package searching;

public class Count1sOccurrences {

	//count 1s in binary sorted array
	public static int countOnes(int arr[]) {
		int low=0; int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==0) {
				low=mid+1;
			}
			else if(1==arr[mid]) {
				if(mid ==0 || arr[mid-1]!=1)return (arr.length-mid);
				else high=mid-1;
			}
		}
		return -1;
	}
	
}
