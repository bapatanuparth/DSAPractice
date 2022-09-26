package backTracking;

//Given a path in the form of a rectangular matrix having few landmines arbitrarily placed
//(marked as 0), calculate length of the shortest safe route possible from any cell in the first column 
//to any cell in the last column of the matrix. We have to avoid landmines and their four adjacent cells 
//(left, right, above and below) as they are also unsafe. We are allowed to move to only adjacent cells which 
//are not landmines. i.e. the route cannot contains any diagonal moves.

public class ShortestSafeRouteInMines {

	// init distance to max value
	int distance = Integer.MAX_VALUE;

	int shortestPath(int[][] field) {
		if (field == null)
			return -1;

		boolean[][] visited = new boolean[field.length][field[0].length];

		for (int i = 0; i < field.length; i++) // we need to check min distance from any point in 1st column to any
												// point in last column
			dfs(field, visited, i, 0, 0);

		return distance;

	}

	void dfs(int[][] field, boolean[][] visited, int i, int j, int levelDistance) {
		if (i < 0 || i > field.length || j < 0 || j > field[0].length || field[i][j] == 0 || isAdjBomb(field, i, j))
			return;

		if (j == field[0].length) { // if we are at any cell in the last column
			distance = Math.min(distance, levelDistance); // save the minimum distance
			return;
		}

		// mark visited so we dont come back here in loop
		visited[i][j] = true;
		dfs(field, visited, i - 1, j, levelDistance + 1);
		dfs(field, visited, i, j - 1, levelDistance + 1);
		dfs(field, visited, i + 1, j, levelDistance + 1);
		dfs(field, visited, i, j + 1, levelDistance + 1);
		visited[i][j] = false; // mark false so that for next path trial the cell remains open to visit
	}

	// check whether the current cell has any adjacent bomb
	boolean isAdjBomb(int[][] field, int i, int j) {

		if (i > 0 && field[i - 1][j] == 0)
			return true;
		if (i < field.length - 1 && field[i + 1][j] == 0)
			return true;
		if (j > 0 && field[i][j - 1] == 0)
			return true;
		if (j < field[0].length - 1 && field[i][j + 1] == 0)
			return true;

		return false;
	}

}
