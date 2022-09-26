package searchSort;

//A step array is an array of integers where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of x if multiple-element exist to return the first occurrence of the key.
//Examples: 
//Input : arr[] = {20, 40, 50, 70, 70, 60}  
//k = 20
//x = 60
//Output : 5
//The index of 60 is 5
public class SearchArrayWhereAdjDifferByK {

	// x is the element to be searched
	// in arr[0..n-1] such that all
	// elements differ by at-most k.
	int search(int[] arr, int k, int x) {
		int n = arr.length;

		int i = 0;
		while (i < n) {

			// if x is found at index i
			if (arr[i] == k)
				return i;

			else {

				// take math.max because we want to ensure that we at least go one step ahead.
				// otherwise we go multiple steps skipping the middle values
				i = i + Math.max(1, Math.abs(x - arr[i]) / k);
			}

		}

		return -1;

	}

}
