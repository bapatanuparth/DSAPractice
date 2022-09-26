package string;

public class AllSubsequencesOfString {

	void callPrint() {
		String s = "abc";
		StringBuilder sb = new StringBuilder();
		printSubseq(s, sb, 0);
	}

	void printSubseq(String s, StringBuilder temp, int i) {
		if (temp.length() == s.length())
			return;

		for (; i < s.length(); i++) {
			temp.append(s.charAt(i));
			System.out.println(temp.toString());
			printSubseq(s, temp, i + 1);
			temp.deleteCharAt(temp.length() - 1);
		}
	}
}
