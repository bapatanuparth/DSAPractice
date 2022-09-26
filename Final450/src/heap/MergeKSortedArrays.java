package heap;
import java.util.*;

//Given K sorted arrays arranged in the form of a matrix of size K*K. The task is to merge them into one sorted array.
public class MergeKSortedArrays {

	  public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
	    {
	        // Write your code here.
	        
		  //create a minheap
	        Queue<Integer> q= new PriorityQueue<>((a,b)->a-b);
	        
	        //add all the elements to the minheap
	        for(int i=0;i<arr.length;i++){
	            
	            for(int j=0;j<arr[0].length;j++){
	                q.add(arr[i][j]);
	            }
	        }
	        
	        //remove all the elements from minheap and give output
	        ArrayList<Integer> res= new ArrayList<>();
	        while(!q.isEmpty()){
	            res.add(q.poll());
	        }
	        
	        return res;
	    }
}
