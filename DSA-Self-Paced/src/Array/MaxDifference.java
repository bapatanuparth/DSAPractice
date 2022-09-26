package Array;

public class MaxDifference {
	public static void main(String[] args) {
		System.out.println(diff(new int[] {10,20,30}));
		System.out.println(maxDiff(new int[] {2,8,5,6,9}));
	}
	
	//max value of arr[j]- arr[i] where j>i
	//efficient solution
	static int maxDiff(int arr[]) {
		int i,n=arr.length,diff=0;
		int minval=arr[0];
		for(i=1;i<n;i++) {
			if(minval>arr[i])
				minval=arr[i];
			if(arr[i]-minval>diff)
				diff=arr[i]-minval;
			
		}
		return diff;
	}
	
	//naive
	static int diff(int arr[]) {
		int i,j,diff=0;
		for(i=0;i<=arr.length-2;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]>diff)
					diff=arr[j]-arr[i];
			}
		}
		return diff;
	}
}
