package sorting;

//can be asked in multiple ways-->

//sort arrays containing 0s, 1s and 2s
//three way partitioning --> [elements less than pivot, pivot element multiple times, elements greater than pvot] 
//partition around a range --> [elements less than lower bound, elements within range, elements >upper bound]
public class SortArrayWIth3TypesOfElements {

	//Dutch National Flag Algorithm
	//variation of hoare's partition
	
	//segragate 0s 1s 2s consider 1 as pivot
	//modify same algo for other problems
	public static void sortWith3Types(int arr[], int pivot) {
		int lo=0, h=arr.length-1,mid=0;
		//during this algorithm,
		// 0s will be till lo, 1s will be till mid-1, middle elements will be treated as unknowns till h
		//elements from h+1 to end will be 2s
		while(mid<=h) {
			if(arr[mid]==0) {
				swap(arr,mid,lo);
				lo++;
				mid++;
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else {
				swap(arr,mid,h);
				//as we dont know the value thats in h at this point, we do not increment mid
				//after swapping h and mid, mid will have the unknown element that was in h
				//this element will be handled in next iteration separately
				h--;
			}
		}
		
	}
	
	public static void swap(int []arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
