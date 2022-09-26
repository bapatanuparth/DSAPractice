package sorting;

public class Merge2SortedArrays {

	public static void mergeSorted(int [] arr1, int[] arr2) {
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				System.out.println(arr1[i]);
				i++;
			}else {
				System.out.println(arr2[j]);
				j++;
			}
		}
			while(j<arr2.length) {
				System.out.println(arr2[j]);j++;
			}
			while(i<arr1.length) {
				System.out.println(arr1[i]);
				i++;
			}
		
	}
	
	public static void main(String[] args) {
		mergeSorted(new int [] {1,3,5,6,6,8}, new int[] {2,3,5,5,6,8,9});
	}
}

