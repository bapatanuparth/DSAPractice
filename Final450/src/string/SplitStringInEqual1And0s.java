package string;

//Given a binary string str of length N, the task is to find the maximum count of consecutive substrings str can be divided into such that all the substrings are balanced i.e. they have equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then print -1.

public class SplitStringInEqual1And0s {

	int splitString(String str) {

		int ones = 0, zeros = 0;
		int res = -1;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '1') {
				ones++;
			} else if (ch == '0')
				zeros++;
			if (ones == zeros) {
				res++;
				ones = 0;
				zeros = 0;
			}
		}

		if (res != -1)
			res++;
		return res;
	}
}
