package matrix;

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.

//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
public class SearchInMatrix {

	//
	 public boolean searchMatrix(int[][] matrix, int target) {
	     
	        int m=matrix.length;
	        int n=matrix[0].length;
	        
	        for(int [] arr:matrix){
	            if(arr[0]>target) //if we reach a row whos beginning > target, return false
	                return false;
	            if(target<=arr[n-1]) //if we find a row whos end <=target
	                return binarySearch(arr, target);  //as row is sorted perform binary search in the row
	        }
	        
	        return false;
	        
	    }
	    
	    boolean binarySearch(int [] arr, int target){
	        
	        int low=0, high=arr.length-1;
	        
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(arr[mid]==target)
	                return true;
	            else if(arr[mid]>target)
	                high=mid-1;
	            else
	                low=mid+1;
	        }
	        
	        return false;
	    }
}
