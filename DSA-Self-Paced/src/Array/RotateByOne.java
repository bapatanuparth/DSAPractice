package Array;

import java.util.Arrays;

public class RotateByOne {
	public static void main(String[] args) {
		moveLeft(new int[] {2,4,6,8});
	}
	
	static void moveLeft(int arr[]) {
		int temp=arr[0];
		int i;
		for(i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		System.out.println(Arrays.toString(arr));
	}
}
