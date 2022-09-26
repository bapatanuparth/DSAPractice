package graphs;

public class LongestPossibleRouteWithHurdles {

	int distance = 0;

	int longestPossible(int[][] matrix, int[] src, int[] dest) {
		int x = src[0];
		int y = src[1];
		boolean[][] vis = new boolean[matrix.length][matrix[0].length];
		dfs(matrix, vis, x, y, 0, dest);
		return distance;
	}

	void dfs(int[][] matrix, boolean[][] vis, int i, int j, int levelDistance, int[] des) {
		if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || vis[i][j] || matrix[i][j] == 0)
			return;

		if (i == des[0] && j == des[1]) {
			distance = Math.max(distance, levelDistance);
			return;
		}

		vis[i][j] = true;
		dfs(matrix, vis, i - 1, j, levelDistance + 1, des);
		dfs(matrix, vis, i, j - 1, levelDistance + 1, des);
		dfs(matrix, vis, i + 1, j, levelDistance + 1, des);
		dfs(matrix, vis, i, j + 1, levelDistance + 1, des);
		vis[i][j] = false;

	}
}
