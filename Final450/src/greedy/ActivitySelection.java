package greedy;
import java.util.*;

//There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i]) where start[i] is start time of meeting i and end[i] is finish time of meeting i.
//What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time?
//
//Note: Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.

//Input:
//N = 6
//start[] = {1,3,0,5,8,5}
//end[] =  {2,4,6,7,9,9}
//Output: 
//4
public class ActivitySelection {

	//sort the array of end time in the ascending order
	//for each next start time, check if it is overlapping with previous end time
	//if start[i+1] > end[i] then result++
	 public static int maxMeetings(int start[], int end[], int n)
	    {
	        // add your code here
	    
	        int [][] arr= new int[n][2];
	        
	        for(int i=0;i<n;i++){
	            arr[i][0]=start[i];
	            arr[i][1]=end[i];
	        }
	        
	        Queue<int[]> q= new PriorityQueue<>((a,b)-> a[1]-b[1]);
	        
	        for(int [] ar:arr){
	            q.add(ar);
	        }
	        
	        int res=1;
	        int val[]=q.poll();
	        while(!q.isEmpty()){
	            int temp[] = q.poll();
	            if(temp[0]>val[1]){
	                res++;
	                val=temp;
	            }
	        }
	        return res;
	    }
}
