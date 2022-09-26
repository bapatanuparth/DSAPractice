package greedyAlgo;

import java.util.Arrays;

//given an array of items with their weights and values and also desired knapsack capacity,
//choose the items such that u maximize the sum of values
//u can choose fraction of an item

class Item implements Comparable<Item>{
	int weight;
	int value;
	public Item(int w, int v) {
		weight=w;
		value=v;
	}
	@Override
	public int compareTo(Item o) {
		// sort in decreasing order of value per weight
		
		return this.weight*o.value - this.value*o.weight;
		//similar to -->
		//return  o.value/o.weight - this.value/this.weight ;
		//did not use this cause division can cause discrepancy in int values due to flooring
	}
}


public class FractionalKnapsack {
	
	
	public double sackValue(Item [] arr, int capacity) {
		double res=0;
		Arrays.sort(arr); //sort items in decreasing order of their value per weight
		
		int curr_cap= capacity; //current capacity of the knapsack
		
		//the first element will have the highest value/weight out of all elements
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].weight<=curr_cap) { //if the 
				curr_cap-=arr[i].weight;
				res+=arr[i].value;
			}
			else {
				res+=arr[i].value*((double)curr_cap/(double)arr[i].weight); //if whole number value not remaining, then add the fraction of the value to the result
			}
		}
		
		return res;
	}

	
}
