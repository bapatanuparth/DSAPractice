package dynamicProgramming;

public class NthCatalanNumber {

	int catalanNumber(int n) {

		int res = 0;

		if (n <= 1)
			return n;

		for (int i = 0; i < n; i++) {
			res += catalanNumber(i) * catalanNumber(n - i - 1);
		}

		return res;
	}

}
