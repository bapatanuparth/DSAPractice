package string;

public class StringRotationCheck {

	boolean checkRotation(String str1, String str2) {
		
		String temp=str1+str1; //ABCDABCD should have any rotation of ABCD
		return ((str1.length()==str2.length()) && temp.indexOf(str2)!=-1); //indexOf will give index of the substring str2 in the concatenation
	}
}
