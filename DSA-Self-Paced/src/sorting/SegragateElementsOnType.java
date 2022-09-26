package sorting;

//can be asked in 3 types
//1. segragate elements based on if they are positive or negative
//2. segregate even and odd elements
//3. sort binary array
public class SegragateElementsOnType {

	//segragate positive and negative terms in an array
	//same algo can be used for other 2 types of problems as well
	public static void positiveNegative(int arr[]) {
		int right=arr.length, left=-1;
		while(true) {
			do{left++;}while(arr[left]<0);
			do{right--;}while(arr[right]>0);
			if(left>=right)return ;
			swap(arr,left,right);
		}	
	}
	
	public static void swap(int []arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
