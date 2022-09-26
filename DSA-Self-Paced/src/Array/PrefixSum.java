package Array;

public class PrefixSum {
	public static void main(String[] args) {
		
	}
	
	//perform operation like getSum(0,2) getSum(1,3) in O(1)
	//take prefix sum array
	//\getsum(L,R)
	//subtract pre_sum[R]- pre_sum[L-1]
	static int getSum(int pre_sum[], int l,int r) {
		if(l!=0) {
		 return pre_sum[r]-pre_sum[l-1];
		}
		else 
			return pre_sum[r];
	}
	
	//take prefix_sum array
	static int [] prefixSum(int arr[]) {
		int pre_sum[]=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			pre_sum[i]=sum;
		}
		return pre_sum;
	}
}
