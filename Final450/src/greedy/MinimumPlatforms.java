package greedy;

import java.util.Arrays;

//Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
//Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.

public class MinimumPlatforms {

	  static int findPlatform(int arr[], int dep[], int n)
	    {
	        // add your code here
	        
		  //sort arrival and departure times in ascending order
	      Arrays.sort(arr);
	      Arrays.sort(dep);
	      
	      int count=1, j=0, i=1;
	      
	      while(i<n){
	          if(arr[i]<=dep[j]) //if next train arrives before departure of prev
	            count++;
	          
	        else j++; //else check the next train's departure in sorted order
	          
	        i++; //keep looking for arrival of new train in every iteration
	      }
	      
	      return count;
	    }
}
