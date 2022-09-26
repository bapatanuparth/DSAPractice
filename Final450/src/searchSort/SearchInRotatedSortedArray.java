package searchSort;


//There is an integer array nums sorted in ascending order (with distinct values).
//
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//
//Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//
//You must write an algorithm with O(log n) runtime complexity.
public class SearchInRotatedSortedArray {

	 public int search(int[] arr, int target) {
	        
	        int low=0, high=arr.length-1;
	        
	        while(low<=high){
	        	//for each midpoint figure out whether the number will lie on LHS of mid or RHS
	            int mid=(low+high)/2;
	            
	            if(arr[mid]==target) return mid;
	            
	            if(low==mid){low++;continue;}
	            if(arr[low]< arr[mid]){ //check whether the LHS of mid is in sorted shape
	                
	                if(target>=arr[low] && target<arr[mid]) //check whether no lies in the left half of the array
	                    high=mid-1;
	                else 
	                    low=mid+1; //else move to the right half
	            }
	            else { //if arr[low] > arr[mid] it means array is rotated by some  numbers. and RHS of mid has to be sorted
	                
	                if(target> arr[mid] && target<=arr[high]) //check whether number is between upper half of the mid
	                    low=mid+1;
	                else
	                    high=mid-1;
	            }
	            
	        }
	        
	        return -1;
	    }
}
