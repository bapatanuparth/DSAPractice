package arrayProb;

public class MinAdjDiff {
	
	
	 public static int minAdjDiff(int arr[], int n) {
		 int res=Integer.MAX_VALUE,diff;
	        for(int i=1;i<arr.length;i++) {
	        	diff=Math.abs(arr[i]-arr[i-1]);
	        	res=Math.min(res, diff);
	        }
	        res=Math.min(res, arr[0]-arr[n-1]);
	        return res;
	        
	    }
}
