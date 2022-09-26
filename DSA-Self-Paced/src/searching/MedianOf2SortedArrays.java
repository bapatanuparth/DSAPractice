package searching;

//get median of 2 sorted arrays
public class MedianOf2SortedArrays {

	//straightforward solution--> merge 2 sorted arrays in result array.
	//merge such that result is sorted.
	//get median
	//time -O(n1+n2)

	//optimize the solution to make it O(Logn)
	public static double getMedian(int [] arr1, int [] arr2) {
		int[] a1,a2;
		if(arr1.length<=arr2.length) {
			a1=arr1;a2=arr2;
		}else {
			a1=arr2;a2=arr1;
		}
		int n1=a1.length, n2=a2.length;
		int low=0, high=a1.length-1;
		while(low<=high) {
			int i1=(low+high)/2;
			int i2=(n1+n2+1)/2-i1;
			
			//min1 ==minimum element in right side of a1
			//max1== max element in left side of a1
			//min2 ==minimum element in right side of a2
			//max2== max element in left side of a2
			//these elements are boundary elements of getting 2 sets of equal sizes from the combined arrays
			int min1=(i1==n1)?Integer.MAX_VALUE:a1[i1];
			int max1=(i1==0)?Integer.MIN_VALUE:a1[i1-1];
			int min2=(i2==n2)?Integer.MAX_VALUE:a2[i2];
			int max2=(i2==0)?Integer.MIN_VALUE:a2[i2-1];
			
			if(max1<=min2 && max2<=min1) {
				if((n1+n2)%2==0) {
					return ((double)Math.max(max1, max2)+Math.min(min1, min2))/2;
				}
				else return (double)Math.max(max1, max2);
			}
			else if(max1>min2)high=i1-1;
			else low=i1+1;
			
		}
		//unreachable
		return -1;
		
	}
	
}
