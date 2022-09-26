package Array;

public class LargestEle {
	public static void main(String[] args) {
		System.out.println(largest(new int[] {10,5,20,8}));
	}
	
	static int largest(int arr[]) {
		int max=0,val=0;
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max)
				{
				max=arr[i];
				val=i;
				}
		}
		return val;
	}
}
