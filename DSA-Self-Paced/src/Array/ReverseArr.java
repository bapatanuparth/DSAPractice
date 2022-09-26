package Array;

import java.util.Arrays;

public class ReverseArr {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(revArr(new int[] {3,4,5,8})));
	}
	
	//reverse contents of array
	static int[] revArr(int arr[]){
		int i=0,len=arr.length-1;
		int temp;
		while(i<=len) {
			temp=arr[i];
			arr[i]=arr[len];
			arr[len]=temp;
			i++;
			len--;
		}
		return arr;
	}

}
