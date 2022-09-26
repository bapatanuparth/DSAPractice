package Array;

public class PrefixSum2 {
	public static void main(String[] args) {
		
	}
	
	//find if an array has an equilibrium point
	
	static boolean isEquil(int arr[]) {
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		int pre=0;
		int post=0;
		if(total-arr[0]==0)return true;
		if(total-arr[arr.length-1]==0)return true;
		for(int i=1;i<arr.length;i++) {
			pre=pre+arr[i-1];
			post=total-pre-arr[i];
			if(post==pre)
				return true;
		}
		return false;
	}
}
