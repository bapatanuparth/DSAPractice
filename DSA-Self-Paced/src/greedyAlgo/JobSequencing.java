package greedyAlgo;

import java.util.*;

class Job implements Comparable<Job>{
	int deadline;
	int profit;
	
	public Job(int d, int p) {
		// TODO Auto-generated constructor stub
		deadline=d;
		profit=p;
	}
	
	@Override
	public int compareTo(Job o) {
		// TODO Auto-generated method stub
		if(this.deadline==o.deadline) //if 2 deadlines same, keep the job with more profit before the job with less profit
			return o.profit- this.profit;
		return this.deadline- o.deadline;
	}
}

//given an array of jobs, with deadline time ex- 1pm 4pm etc and profit earned from each job
//maximise the profit such that we choose the job that provides max profit before its deadline

//there can be multiple jobs with same deadline, we need to choose the max profitable job out of those jobs
public class JobSequencing {
	
	//fully working code
	 int[] JobScheduling(Job arr[], int n)
	    {
	        // Your code here
		 //get the jobs in descending order of their profits
	        Queue<Job> q= new PriorityQueue<>((a,b)->b.profit-a.profit);
	        
	        //find what is the maximum deadline of jobs
	        int max=Integer.MIN_VALUE;
	        for(Job j:arr){
	            q.add(j);
	            if(j.deadline>max)max=j.deadline;
	        }
	        
	        //create a check array to check whether a job can be added or not
	        int check[]= new int[max+1];
	        
	        int totalProfit=0;
	        int count=0;
	        while(!q.isEmpty()){
	            
	            Job j= q.poll();
	            
	            //for each deadline, add a job if check [i] == 0 i,e, the slot before the deadline is empty
	            //once added a job, mark that spot to be taken and add the count and total profit
	            for(int i=j.deadline;i>0;i--){
	                
	                if(check[i]==0){
	                    check[i]=1;
	                    totalProfit+=j.profit;
	                    count++;
	                    break;
	                }
	            }
	        }
	        
	        return new int[]{count, totalProfit};
	        
	    }
	
	//code from video
	public int maxProfitEff(Job arr[]) {
		
		//SORT JOBS BASED ON DESCENDING PROFIT. MY CODE SORTS ON ASCENDING DEADLINE
		//ASSUME THIS HAS SORTED BASED ON DESECENDING DEADLINE
		Arrays.sort(arr);
		
		int max=0;
		int res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].deadline>max)
				max=arr[i].deadline;
		}
		//pic the first job and assign to latest possible slot amongst all slots till max deadline
		//for remaining job, check whether job can be added. if not then ignore
		return res;
	}
	
	
	
	//my code
	public int maxProfit(Job arr[]) {
		
		int res=0;
		Arrays.sort(arr); //sort array in ascending order of their deadline times, if 2 deadline times are same keep the job with maximum profit in the beginning
		
		int curr=0; //start current time at 0
		int i=0;
		while(i<arr.length) {
			int j=i;
			int pr=0;
			while(j<arr.length && arr[j].deadline>curr) { //till our deadline of task is > current time, we can keep on taking tasks and update current time by one hour after each task
			 //if there are multiple jobs sharing the same deadline, then choose the one which is most profitable
				//for cases where 3 jobs have deadline as 2pm. we can pick top 2 out of those. one that runs between time 0-1pm and another 1-2pm
					pr=arr[j].profit;
					j++;
					curr++;
					res+=pr;
			}
			 //update the profit and start i from the job of next deadline

			while(arr[i].deadline==arr[j].deadline)
				j++;
			i=j;
		}
		
		return res;
		
		
	}

}
