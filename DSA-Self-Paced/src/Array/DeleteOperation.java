package Array;

import java.util.Arrays;

public class DeleteOperation {
	public static void main(String[] args) {
		int arr[]= {3,8,12,5,6};
		System.out.println(Arrays.toString(deleteVal(6,arr )));
	}
	
	static int[] deleteVal(int n, int[] arr) {
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==n)
				break;
		}
		if(i==arr.length)
			return arr;
		while(i<arr.length-1) {
			arr[i]=arr[i+1];
			i++;
		}
		arr[i]=0;
		return arr;
		
		
	}

}
