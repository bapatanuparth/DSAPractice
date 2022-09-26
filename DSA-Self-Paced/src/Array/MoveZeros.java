package Array;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		moveZeros(new int []{10,0,0,0,3,4});
		moveZeros(new int[] {10,20});
	}
	
	static void moveZeros(int arr[]) {
		int res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[res]=arr[i];
				res++;
			}
		}
		System.out.println(res);
		for(int i=res;i<arr.length;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
