package backTracking;

import java.util.ArrayList;
import java.util.List;

//The problem is to print all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down.

public class PrintAllPossiblePaths {

	void printPaths(int[][] grid) {
		boolean[][] vis = new boolean[grid.length][grid[0].length];
		dfs(grid, new ArrayList<Integer>(), 0, 0);
	}

	void dfs(int[][] grid, List<Integer> list, int i, int j) {
		if (i >= grid.length || j >= grid[0].length)
			return;

		list.add(grid[i][j]);

		if (i == grid.length - 1 && j == grid[0].length - 1) {
			System.out.println(list);
		}

		dfs(grid, list, i + 1, j);
		dfs(grid, list, i, j + 1);

		list.remove(list.size() - 1);
	}
}
