package string;

public class PalindromeString {

	 int isPalindrome(String S) {
	        // code here
	    char [] s= S.toCharArray();
	    int left=0, right=s.length-1;
	    
	    while(left<=right){
	        if(s[left]!=s[right]){
	            return 0;
	        }
	        left++;right--;
	    }
	    return 1;
	    }
}
