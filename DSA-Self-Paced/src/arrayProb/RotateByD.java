package arrayProb;

import java.util.Arrays;
import java.util.Collections;

public class RotateByD {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		//reverse(arr,0,2);
		rotateArr(arr, 2, 5);
		for(int i:arr)
			System.out.println(i);
	}
	 static void rotateArr(int arr[], int d, int n)
	    {
	        // add your code here
		 reverse(arr,0,d);
		 reverse(arr,d,n);
		 reverse(arr,0,n);
		 
		 
	    }
	 static void reverse(int a[],int start,int n) {
	      int i, k, t;
	        for (i = 0; i < n / 2; i++) {
	            t = a[i+start];
	            a[i+start] = a[n - i - 1];
	            a[n - i - 1] = t;
	        }
		 for(int x:a)
			 System.out.print(x+" ");
	 }
	 
}
