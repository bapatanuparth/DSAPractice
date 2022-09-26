package stackQueue;

import java.util.Stack;

//Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
//For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

//Input:
//{([])}
//Output: 
//true
public class CheckParantheses {

	static boolean ispar(String x) { // add your code here

		Stack<Character> st = new Stack<>();

		char[] ch = x.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (st.isEmpty() && ch[i] == ')')
				return false;
			if (st.isEmpty() && ch[i] == ']')
				return false;
			if (st.isEmpty() && ch[i] == '}')
				return false;
			if (ch[i] == '(')
				st.push(')');
			else if (ch[i] == '[')
				st.push(']');
			else if (ch[i] == '{')
				st.push('}');
			else if (st.peek() != ch[i])
				return false;
			else if (st.peek() == ch[i])
				st.pop();
		}

		if (!st.isEmpty())
			return false;
		return true;
	}
}
