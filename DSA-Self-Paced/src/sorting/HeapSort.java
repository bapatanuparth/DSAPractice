package sorting;


//works like selection sort, but uses maximum heap data structure to get the maximum element of the array
public class HeapSort {
		
	
		public static void heapSort(int arr[],int n) {
			buildHeap(arr);
			for(int i=n-1;i>=1;i--) {
				//arr[0] will have the largest element after buildHeap and maxHeapify
				int temp=arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
				
				//call again as the above swap can disturb the max heap 
				maxHeapify(arr, i, 0);
			}
		}
		
		//this function builds a max heap from the given arr elements
		//every array can be imagined as a binary tree and this tree can be converted to max heap
		//works in O(n)
		public static void buildHeap(int arr[]) {
			//we first find the last internal node of the binary tree by formula
			//parent of any i = i-1/2;
			//parent of n-1 = n-1-1/2== n-2/2;
			int n=arr.length;
			for(int i=(n-2)/2;i>=0;i--) {
				//skip the already swapped elements as they are in right place
				maxHeapify(arr,n,i);
			}
			
		}
		
		//maxHeapify finds the largest of 3 things--> 
		//node passed ->i and its 2 children if present
		//then swaps the largest value to the parent if its not already the largest
		//this way, recursive calls from n to 0 of array ensure that array is max heapified
		public static void maxHeapify(int arr[],int n,int i) {
			//below 3 lines find the largest of 1 parent and 2 children
			int largest=i,left=2*i+1,right=2*i+2;
			if(left<n && arr[left]>arr[largest])largest=left;
			if(right<n && arr[right]>arr[largest])largest=right;
			
			//below condition brings largest as the parent
			if(largest!=i) {
				//swap
				int temp=arr[largest];
				arr[largest]=arr[i];
				arr[i]=temp;
				
				//this recursion calls goes treats previous largest child as the new parent because we have swapped 
				//its value.
				//hence this recursive call again reaches till end of the binary tree to ensure after every swap that
				//tree stays max-heapified 
				maxHeapify(arr,n,largest);
			}
			
		}
	

}
