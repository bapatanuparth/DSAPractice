package dynamicProgramming.tabulation;

//u have a 2D grid. u start on top left and want to reach bottom right. 
//u can only move down or right.
//In how many ways you can travel to the goal on grid of dimension m * n
public class GridTraveller {

	//suppose u have a grid m X n 
	int gridTrav(int [][] grid){
		int [][] table= new int[grid.length+1][grid[0].length+1]; //create table of m+1 X n+1 
		table[1][1]=1; //because if m and n are 1, i.e. grid is 1 X 1, we can travel the whole grid on only 1 way. 
		//this is also the base case of our recursive approach
		
		for(int i=0;i<table.length;i++) {
			
			for(int j=0;j<table[0].length;j++) {
				if(j<table[0].length-1)
					table[i][j+1]+=table[i][j]; //move to right
				if(i<table.length-1)
					table[i+1][j]+=table[i][j]; //move below, go on adding the number of ways we can move to reach the given cell i, j	
				
			}
		}
		
		return table[grid.length][grid[0].length]; //return the value at (m,n) location as our result will be accumulated there
	}
	
}
