package backtracking;

public class SudokuProblem {

	int n;
	int [][]grid;
	
	boolean sudokuRec(int [][]sudoku) {
		
		int i;
		int j = 0;
		for(i=0;i<n;i++) { //find the empty box in the grid
			for(j=0;j<n;j++) {
				if(sudoku[i][j]==0)
					break;
			}
			
		}
		
		if(i==n && j==n)return true; //means we have reached the end of the grid sudoku
		
		for(int a=1;a<=n;a++) { //check from 1 to 9 which number we can put here
			
			if(isSafe(sudoku, i, j, a)) { //check if a is already present in row, column or the smaller inner boxes of 3X3 or any mXm
				sudoku[i][j]=a; //if its okay to put a, try put a and recursively call for next box
				if(sudokuRec(sudoku))return true;
				sudoku[i][j]=0; //if later on fails, backtrack all the changed positions to zero to start new for new number
			}
		}
		
		return false;
	}
	
	boolean isSafe(int [][] sudoku, int i, int j, int a) {
		
		for(int k=0;k<n;k++) {
			if(sudoku[k][j]==a || sudoku[i][k]==a) //check if number 'a' is present in row or column already
				return false;
		}
		
		//to check in 2X2 or mXm grid
		int s=(int) Math.sqrt(n);
		int rs= i-i%s;
		int cs= j-j%s;
		
		for(i=0;i<s;i++) {
			for(j=0;j<s;j++) {
				if(sudoku[i+rs][j+cs]==a) //check if in grid it is  repeated or not
					return false;
			}
		}
		
		return true;
	}
	
	
}
