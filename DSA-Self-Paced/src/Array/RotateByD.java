package Array;

import java.util.Arrays;

public class RotateByD {
	public static void main(String[] args) {
		moveByD(new int [] {1,2,3,4,5}, 2);
	}
	
	static void moveByD(int arr[],int n) {
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=arr[i];
		}
		int res=0;
		for(int i=n;i<arr.length;i++) {
			arr[res]=arr[i];
			res++;
		}
		for(int i=res,k=0;i<arr.length;i++) {
			arr[i]=temp[k];
			k++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
