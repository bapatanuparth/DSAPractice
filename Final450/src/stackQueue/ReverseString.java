package stackQueue;

import java.util.Stack;

public class ReverseString {

	public String reverse(String S) {
		// code here
		Stack<Character> st = new Stack<>();

		for (char ch : S.toCharArray()) {
			st.add(ch);
		}

		String str = "";
		while (!st.isEmpty()) {
			str = str + st.pop();
		}

		return str;
	}
}
