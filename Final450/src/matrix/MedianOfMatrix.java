package matrix;
import java.util.*;

//Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.
//R = 3, C = 3
//M = [[1, 3, 5], 
//     [2, 6, 9], 
//     [3, 6, 9]]
//
//Output: 5

public class MedianOfMatrix {

	 int median(int matrix[][], int r, int c) {
	        // code here    
	        
		 //as all rows are sorted, we need to merge these sorted rows into one and then find the median of the whole merged array
		 //use the heap logic for merging multiple arrays
	        Queue<Integer> q= new PriorityQueue<>((a,b)->b-a); //this will merge all the array values into a sorted heap
	        int lim= (r*c)/2+1; //we are interested in lim position of the merged array
	        
	        for(int arr[]:matrix){
	            
	            for(int i:arr){
	                q.add(i);
	                
	                if(q.size()>lim){
	                    q.poll();
	                }
	            }
	        }
	        
	            return q.peek();
	    }
}
