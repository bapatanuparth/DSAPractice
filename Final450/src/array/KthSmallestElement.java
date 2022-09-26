package array;


//this can be solved using priorityQueue in O(n log k) time
//quickselect solves in O(n) average time if elements are distinct
public class KthSmallestElement {

	//quickselect using lomuto partition
	//refer to quicksort code to understand the logic of lomuto partition
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 

        while(l<=r){
            
            int p=lomuto(arr, l, r);
            if(p==k-1)
            return arr[p];
            else if(p>k-1){
                r=p-1;
            }
            else{
                l=p+1;
            }
        }
        
        return -1;
    } 
    
    public static int lomuto(int[] arr, int low, int high){
        
        int pivot=arr[high];
       
        
        int i=low-1;
        
        for(int j=low;j<=high-1;j++){ //3 10 4 7 15 20
            if(arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr,i+1, high);
        return i+1;
    }
    
    public static void swap(int []arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
