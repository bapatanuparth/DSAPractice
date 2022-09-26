package greedyAlgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//given start and end time of the activities, choose the activities such that we are able to perform maximum no of 
//activities.
//you cannot pick activities that overlap


class Activity implements Comparable<Activity>{
	int start;
	int finish;
	
	Activity(int s, int f){
		start=s;
		finish=f;
	}
	public int compareTo(Activity o) {
		return this.finish-o.finish;
	}
}

public class ActivitySelectionProblem {

	public int activitySelect(Activity arr[]) {
		int n=arr.length;
		if(n==0)return 0;
		
		Arrays.sort(arr); //sort array in increasing order of finish time
		int res=1; //by default, first activity with the least finish time will be chosen first 
		int temp=arr[0].finish; //to keep track of finish time of previous activity that was selected in output
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i].start<=temp) { //check if there is an overlap between 2 activities
				temp=arr[i].finish;
				res=res+1;
			}
		}
		
		return res;	
	}
	
}
