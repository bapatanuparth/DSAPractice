package backtracking;


//on given nXn chess board, check if u are able to put n queens without any of them killing each other

public class NQueenProblem {

	int n;
	boolean board[][]= new boolean[n][];
	
	
	boolean nQueen() { //wrapper function for nQueen 
		if(nQueenRec(0))
		{
			//print board matrix if wanted
			return true;
		}
		return false;
		
	}
	
	 boolean nQueenRec(int col) { //pass the column we are putting the queen on
		if(col==n)return true;
		
		for(int i=0;i<n;i++) { //check each row one by one for given column, if we can place a queen safely
			if(isSafe(i,col)) {
				
				board[i][col]=true; //go ahead by putting the queen there if safe
				if(nQueenRec(col+1))return true;
				board[i][col]=false; //if in future calls, the solution is discarded, make the place as false again
			}
		}
		
		return false;
		
	}
	 
	 boolean isSafe(int row, int col) { //function checks if its safe to place the queen at given row and column
		 
		 for(int i=0;i<col;i++) { //check whether a queen is already present in the row we are about to put new queen
			 if(board[row][i])
				 return false;
		 }
		 
		 for(int i=row, j=col; i>=0 && j>=0; i--,j--) { //check if queen already present in one diagonal -- check only on points before current row and col
			 if(board[i][j])
				 return false;
		 }
		 
		 for(int i=row, j=col;j>=0 && i<n; i++,j--) { //check if queen already placed in another diagonal perpendicular to previous
			 if(board[i][j])
				 return false;
		 }
		 
		 return true;
	 }
	
}
