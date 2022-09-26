package heap;

public class Heapify {

	void buildHeap(int arr[]) {
		int n=arr.length;
		
		//index of the last non-leaf node
		int start=(n/2)-1;
		
		//reverse level order traversal and heapify from the last non-leaf node
		for(int i=start;i>=0;i--) {
			heapify(arr,n,i);
		}
	}
	
	// To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
	void heapify(int arr[], int n, int i) {
		int largest=i; //initialize largest as root
		int l=2*i+1; //left node will be 2*i+1
		int r=2*i+2; //right == 2*i+2
		
		//if left child is larger than root, make left as largest
		if(l<n && arr[largest]<arr[l])
			largest=l;
		
		//if right child > root, make right as the largest
		if(r<n && arr[largest]<arr[r])
			largest=r;
		
		//if largest value has changed, swap the value with root and recursively call to heapify the lower subtrees with this new swapped value as root
		if(largest!=i) {
			int swap=arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			
			//recursively heapify the affected subtree
			heapify(arr,n,largest);
		}
	}
}
