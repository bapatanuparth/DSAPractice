package array;

public class ReverseArray {

	void revArr(int []arr) {
		int st=0, end=arr.length-1;
		
		while(st<end) {
			int temp=arr[end];
			arr[end]=arr[st];
			arr[st]=temp;
			st++;end--;
		}
	}
}
