package array;


//An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

//Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//Output: -12 -13 -5 -7 -3 -6 11 6 5
public class MoveNegativesToOneSide {

	void moveNegatives(int arr[]) {
		
		int neg=-1, pos=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				swap(i, ++neg, arr);
		}
		
	}
	
	void swap(int i, int j, int arr[]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
