package Array;

public class MaxSumSubarray {
	public static void main(String[] args) {
		calcSub(new int[] {1, 2,3,4},0);
	}
	//calculate sum O(n) 
	//kadane's algorithm *****
	// take maximums of each sub array while moving forward
	static int maxSum2(int arr[]) {
		int res=arr[0];
		int curr_max=arr[0];
		for(int i=1;i<arr.length;i++) {
			//take sum for latest element only if sum is greater than previous
			//ex. if next ele is negative, curr_max will hold max possible value 
			curr_max=Math.max(curr_max+arr[i], arr[i]);
			//make it result only if the sum is max
			res=Math.max(res, curr_max);
		}
		return res;
	}
	
	
	//calculate sum naive O{n2)
	static int maxSum(int arr[]) {
		int res=arr[0];
		for(int i=0;i<arr.length;i++) {
			int curr=0;
			for(int j=i;j<arr.length;j++) {
				curr=curr+arr[j];
				res=Math.max(curr, res);
			}
		}
		return res;
	}
	
	
	/////////// printing all sub arrays
	static void printSub(int arr[],int start,int end) {
		if(end==arr.length)
			return;
		printSub(arr,start,end+1);
		for(int i=start;i<=end;i++)
			System.out.print(arr[i]);
			//only printing not sum
	}
	
	static void calcSub(int arr[],int start) {
		for(int i=0;i<arr.length;i++) {
			printSub (arr,i,i);
		}
	}
}
