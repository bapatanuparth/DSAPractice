package Array;

public class SlidingWindow {
	public static void main(String[] args) {
	System.out.println(slidingWindow(new int[] {1,8,30,-5,20,7}, 3));	
	}
	
	//vvimp
	//max sum of K consecutive values
	static int slidingWindow(int arr[], int k) {
		int sum=0,count=0,res=0;
		for(int i=0;i<arr.length;i++) {
			if(count<k) {
				sum=sum+arr[i];
				count++;
			}
			else {
				sum=sum+arr[i]-arr[i-k];
			}
			res=Math.max(sum, res);
		}
	return res;
	}
}
