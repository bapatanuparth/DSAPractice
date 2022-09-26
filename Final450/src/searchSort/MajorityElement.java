package searchSort;

public class MajorityElement {
	// moores voting algorithm

	static int majorityElement(int a[], int size) {
		// your code here

		// traverse

		int count = 1;
		int res = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[res] == a[i]) {
				count++;
			} else
				count--;
			if (count == 0) {
				res = i;
				count = 1;
			}
		}

		// check if the candidate is majority element or not
		count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[res])
				count++;
		}
		if (count > (size / 2))
			return a[res];
		return -1;
	}

}
