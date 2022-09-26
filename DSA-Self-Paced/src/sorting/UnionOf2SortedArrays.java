package sorting;

//print the union of 2 sorted arrays
//if elements are repeating, print the element only once
public class UnionOf2SortedArrays {
	public static void unionOfArrays(int[] a, int[] b) {
		int i=0,j=0;
		while(i<a.length && j<b.length) {
			if(i>0 && a[i]==a[i-1]) {
				i++;continue;
			}
			if(j>0 && b[j]==b[j-1]) {
				j++;continue;
			}
			if(a[i]<b[j]) {
				System.out.print(a[i] + " ");
				i++;
			}
			else if(a[i]==b[j]) {
				System.out.print(a[i]+" ");
				i++;j++;
			}
			else {
				System.out.print(b[j]+ " ");
				j++;	
			}
			
		}
		while(i<a.length)
			{
			System.out.print(a[i]+ " ");i++;
			}
		while(j<b.length)
			{
			System.out.print(b[j]+ " ");j++;
			}
	}
	
	public static void main(String[] args) {
		unionOfArrays(new int[] {2, 3,4,4,5,6,7},new int[] {4,5,8,9,12});
	}

}
