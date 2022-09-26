package greedy;

import java.util.PriorityQueue;
import java.util.Queue;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

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
}
