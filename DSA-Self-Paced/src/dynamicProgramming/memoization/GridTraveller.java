package dynamicProgramming.memoization;

import java.util.HashMap;

//u have a 2D grid. u start on top left and want to reach bottom right. 
//u can only move down or right.
//In how many ways you can travel to the goal on grid of dimension m * n
public class GridTraveller {

	//using DP
	//we can understand that gridTrav(a ,b) == gridTrav(b ,a)
	int gridTravDP(int m, int n, HashMap<String, Integer> memo){
		String key= m +","+n;
		
		if(memo.containsKey(key))return memo.get(key); //check if you have seen m,n before. If yes, return the val from map
		
		if(m==1 && n==1)return 1; //1 1 means we reached the bottom right corner
		if(m==0 || n==0)return 0;
		
		int val= gridTravDP(m-1, n,memo) //move down a row
				+ gridTravDP(m, n-1, memo); //move to the left
		memo.put(key, val); //store key m,n in map with corresponding val	
		return memo.get(key);
	}	
	
	
	//recursive way without DP
	int gridTrav(int m, int n){
		if(m==1 && n==1)return 1; //1 1 means we reached the bottom right corner
		if(m==0 || n==0)return 0;
		
		return gridTrav(m-1, n) //move down a row
				+ gridTrav(m, n-1); //move to the left
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(new GridTraveller().gridTravDP(18,18, new HashMap<>()));
	}
}
