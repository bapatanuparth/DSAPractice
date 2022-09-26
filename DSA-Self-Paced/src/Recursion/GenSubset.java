package Recursion;

public class GenSubset {
	public static void main(String[] args) {
		sub("ABC","",0);
		
	}
	static void sub(String str, String curr, int index) {
		if(index==(str.length()))
			{
			System.out.println(curr);
			return;
			}
		
		sub(str,curr,index+1);
		sub(str,curr+str.charAt(index),index+1);
	}
}
