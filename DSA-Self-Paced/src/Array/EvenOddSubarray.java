package Array;

public class EvenOddSubarray {
	public static void main(String[] args) {
		System.out.println(maxLength(new int[] {7,10,13,14}));
	}
	
	static int maxLength(int arr[]) {
		int res=1;
		int count=1;
		if(arr.length==1) return 1;
		for(int i=1;i<arr.length;i++) {
			if(isEven(arr[i]) && !isEven(arr[i-1]))
			{
				count++;
				res=Math.max(res, count);
				
			}
			else if(!isEven(arr[i]) && isEven(arr[i-1]))
			{
				count++;
				res=Math.max(res, count);
			}
			else count=1;
		}
		return res;
	}
	
	static boolean isEven(int a) {
		if(a%2==0)return true;
		else return false;
	}

}

