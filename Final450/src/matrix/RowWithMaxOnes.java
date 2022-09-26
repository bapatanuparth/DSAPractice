package matrix;

public class RowWithMaxOnes {

	int rowWithMax1s(int arr[][], int n, int m) {
		// code here

		int res = 0;
		int imax = -1;
		int j;
		for (int i = 0; i < n; i++) {

			int count = 0;

			for (j = 0; j < m; j++) {
				if (arr[i][j] == 1)
					count++;
			}

			if (count > res) {
				res = count;
				imax = i;
			}
		}
		return imax;

	}
}
