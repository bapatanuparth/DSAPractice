package matrix;

import java.util.PriorityQueue;
import java.util.Queue;

public class Sorted2DMatrix {

	int[][] sortedMatrix(int N, int Mat[][]) {
		// code here
		Queue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				q.add(Mat[i][j]);
			}
		}

		int[][] op = new int[N][N];

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {

				op[i][j] = q.poll();
			}
		}

		return op;

	}
}
