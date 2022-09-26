package Array;


//to find if array sorted or not
public class SortedArray {
	public static void main(String[] args) {
		System.out.println(isSorted(new int[] {8,10,1,15}));
	}
	
	static boolean isSorted(int arr[]) {
		if(arr.length==1)
			return true;
		for(int i=0,j=1;j<arr.length;i++,j++) {
			if(arr[i]>arr[j])
				return false;
		}
		return true;
	}
}
