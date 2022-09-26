package backTracking;

public class LongestPathWithHurdles {

	int distance = 0;

	// valid path to follow has 1 on the grid
	int longestPath(int[][] grid) {
		// source assumed as 0,0
		// destination is grid[n-1][n-1]
		int x = 0;
		int y = 0;

		boolean[][] visited = new boolean[grid.length][grid[0].length];

		if (grid[x][y] == 0)
			return distance;

		dfs(grid, x, y, visited, 0);

		return distance;
	}

	void dfs(int[][] grid, int x, int y, boolean[][] visited, int levelDistance) {

		if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || visited[x][y] == true || grid[x][y] == 0)
			return;

		if (x == grid.length - 1 && y == grid[0].length - 1) {
			distance = Math.max(distance, levelDistance);
			return;
		}

		// mark as true so we dont get caught in a loop
		visited[x][y] = true;
		dfs(grid, x - 1, y, visited, levelDistance + 1);
		dfs(grid, x, y - 1, visited, levelDistance + 1);
		dfs(grid, x + 1, y, visited, levelDistance + 1);
		dfs(grid, x, y + 1, visited, levelDistance + 1);
		// we comme here when we have reached the destination following one route.
		// make visited as false so for next path this node can be accessible
		visited[x][y] = false;
	}
}
