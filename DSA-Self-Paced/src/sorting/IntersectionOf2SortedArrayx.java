package sorting;

//print only common elements from both arrays
//if elements are repeating, print only one occurrence
public class IntersectionOf2SortedArrayx {

	public static void intersectionOfSortedArr(int [] arr1, int [] arr2) {
		int n1=arr1.length,n2=arr2.length;
		int a=0,b=0;
		while(a<n1 && b<n2){
			if(arr1[a]==arr2[b]) {
				if(a!=0 && arr1[a]==arr1[a-1]) {
					a++;b++;continue;
				}
				System.out.print(arr1[a]+" ");a++;b++;
			}
			else if(arr1[a]<arr2[b])a++;
			else b++;
		}
	}
	
	public static void main(String[] args) {
		intersectionOfSortedArr(new int [] {1,2,3},new int[] {3,4,4,4,6,8,9});
	}
}
