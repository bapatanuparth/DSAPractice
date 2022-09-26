package Recursion;

public class AllPermutation {
	public static void main(String[] args) {
		permutation("ABCD",0);
	}
	
// tough program
	static void permutation(String str,int i) {
		if(i==str.length()) {
			System.out.println(str);
		}
		for(int j=i;j<str.length();j++) {
			str=swap(str,j,i);
			permutation(str,i+1);
			//str=swap(str,i,j);
		}
		
	}
	
	static String swap(String s, int i, int j) {
		StringBuilder sb=new StringBuilder(s);
		sb.setCharAt(i, s.charAt(j));
		sb.setCharAt(j, s.charAt(i));
		return sb.toString();
	}

}
