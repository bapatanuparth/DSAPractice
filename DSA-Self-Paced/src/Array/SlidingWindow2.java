package Array;

public class SlidingWindow2 {
	public static void main(String[] args) {
		System.out.println(slidingWindow2(new int[] {35,4,20,3,10,5}, 33));
	}
	
	//check if any sub array present with sum as given
	//return true if find any sub array with sum as given i/p
	static boolean slidingWindow2(int arr[], int sum) {
		int currsum=0;
		int start=0;
		for (int i=0;i<arr.length;) {
			if(currsum<sum) {
				currsum=currsum+arr[i];
				i++;
			}
			else if(currsum>sum) {
				currsum=currsum-arr[start];
				start++;
			}
			else if(currsum==sum) {
				return true;
			}
		}
		return false;
	}
}
