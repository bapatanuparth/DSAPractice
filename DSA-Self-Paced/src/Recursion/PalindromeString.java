package Recursion;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.println(palindrome("parth",4));
	}
	
	//logic--
	//check first and last character
	//if same -- call the same function -- till it reaches only 0 or 1 characters in word
	// if not same return false
	static boolean palindrome(String s, int n) {
		boolean bool=false;
		if(n==0||n==1)
			return true;
		if(s.charAt(0)==(s.charAt(s.length()-1)))
			 bool=palindrome(s.substring(1,s.length()-1),s.length()-2);
		if(bool==true)
			return true;
		else
			return false;
	}
	
	//shorthand syntax
	static boolean palindrome2(String s, int start, int end) {
		if(start>=end)
			return true;
		return (s.charAt(start)==s.charAt(end)&&palindrome2(s, start+1,end-1));
	}

}
