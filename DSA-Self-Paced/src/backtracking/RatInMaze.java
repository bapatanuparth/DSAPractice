package backtracking;

//rat always starts at top left -- cheese always at bottom right
//rat can only move from (i,j) either to (i+1, j) or(i, j+1)

//allowed blocks of grid maze are marked as 1, blocks which cannot be visited are marked as 0
public class RatInMaze {

	//code from video
	int [][]sol; //solution matrix -- path will be printed
	boolean solveMaze(int [][]maze, int n) {
		if(solveMazeRec(maze, 0,0, n)==false) //start from the top left, i.e. rats starting position
			return false;
		else
		{
			//print solution  matrix sol[][]
			return true;
		}
	}
	
	boolean solveMazeRec(int [][]maze,int i, int j, int n) {
		if(i ==n-1 && j==n-1)return true; //if reached bottom right--return true
		
		if(isSafe(maze,i, j,n)) { //check if the block is allowed for rat to visit or not
			sol[i][j]=1; //mark it as one i.e. mark as the path chosen by rat
			if(solveMazeRec(maze, i,j+1,n)==true)return true; //check if rat should go straight to right
			else if(solveMazeRec(maze, i+1,j,n)==true)return true; //or check if rat next should go below
			
			sol[i][j]=0; //if none of the above 2 condition returns true, which means the current block i, j was chosen by rat and it was wrong.
			//hence mark it as 0,0 to indicate that rat cannot move ahead with this path
		}
		return false;
	}
	
	boolean isSafe(int [][]maze,int i, int j, int n) {
		if(i<n && j<n && maze[i][j]==1) //check if current block of rat is allowed or blocked
			return true;
		return false;
	}
	
	
	
	//my code
	//same as the code from video
	//to print the output binary tree need to do a slight modification
	boolean findPath(int maze[][], int i, int j, int n) {
		if(i ==n-1 && j==n-1)return true;
		
		if(i<n && j<n-1 && maze[i][j+1]==1) {
			if(findPath(maze, i, j+1,n))
				return true;
		}
		if(i<n-1 && j<n && maze[i+1][j]==1) {
			if(findPath(maze, i+1, j,n))
				return true;
		}
		return false;
	}
}
