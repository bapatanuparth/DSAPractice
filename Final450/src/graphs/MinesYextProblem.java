package graphs;

//if u click on mine, explode all adjacent 4 and if there are other mines adjacent to that, explode their adjacent
//if u click on non-mine, explode only that
//return count of cells destroyed
public class MinesYextProblem {

	int count = 0;

	int explode(int[][] minefield, int x, int y) {

		if (minefield[x][y] == 0) // if no mine was there at x,y
			return 1;

		// if there was mine at x, y
		boolean[][] vis = new boolean[minefield.length][minefield[0].length];
		dfs(minefield, vis, x, y);
		return count;

	}

	boolean isMineAdj(int x, int y, int[][] minefield) {

		if (x > 0 && minefield[x - 1][y] == 1)
			return true;
		if (x < minefield.length - 1 && minefield[x + 1][y] == 1)
			return true;
		if (y > 0 && minefield[x][y - 1] == 1)
			return true;
		if (y < minefield[0].length - 1 && minefield[x][y + 1] == 1)
			return true;

		return false;

	}

	int countAdj(int x, int y, int[][] minefield, boolean[][] vis) {

		int count = 0;
		if (x > 0 && vis[x - 1][y] == false && minefield[x - 1][y] == 0) {
			count++;
			vis[x - 1][y] = true;
		}
		if (y > 0 && vis[x][y - 1] == false && minefield[x][y - 1] == 0) {
			count++;
			vis[x][y - 1] = true;
		}
		if (x < minefield.length - 1 && vis[x + 1][y] == false && minefield[x + 1][y] == 0) {
			count++;
			vis[x + 1][y] = true;
		}
		if (y < minefield[0].length - 1 && vis[x][y + 1] == false && minefield[x][y + 1] == 0) {
			count++;
			vis[x][y + 1] = true;
		}

		return count;

	}

	void dfs(int[][] minefield, boolean[][] vis, int x, int y) {
		if (x < 0 || x >= minefield.length || y < 0 || y > minefield[0].length || vis[x][y] == true)
			return;

		if (!isMineAdj(x, y, minefield)) {
			count += countAdj(x, y, minefield, vis); // count all the adjacents that do not have bomb
			return;
		}

		count += countAdj(x, y, minefield, vis) + 1;// counting self bomb,and adjacent non-bombs to be exploded by x,y
		vis[x][y] = true;
		dfs(minefield, vis, x - 1, y);
		dfs(minefield, vis, x, y - 1);
		dfs(minefield, vis, x + 1, y);
		dfs(minefield, vis, x, y + 1);
	}
}
