package greedy;
import java.util.*;


class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
public class FractionalKnapsack {

	 double fractionalKnapsack(int w, Item arr[], int n) 
	    {
	        // Your code here
	        Queue<Item> q= new PriorityQueue<>((a,b)->(a.weight*b.value)-(a.value*b.weight)); //do this because division in int can cause flooring which will cause issues
	    
	        for(Item i:arr){
	            q.add(i);
	        }
	        
	       // 
	        double sum=0;
	        while(!q.isEmpty()){
	            
	            Item i=q.poll(); //u get elements on descending order of their value/ weight

	            if(w>=i.weight){ //if we can take the whole item, take the whole item
	                sum+=(double)i.value;
	                w-=i.weight;
	            }
	            else if(w<i.weight){ //when we reach a point to take fractional value, take it and break out of loop as now w will become == 0
	          
	                sum+=i.value*((double)w/(double)i.weight);
	                break;
	            }
	        }
	        
	        return sum;
	        
	    }
}
