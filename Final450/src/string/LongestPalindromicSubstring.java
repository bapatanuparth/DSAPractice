package string;


//Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 <=i<=j< len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index).
public class LongestPalindromicSubstring {

	  static String longestPalin(String s){
	        // code here
	        
	        String res="";
	        
	        //keping only 1 character at center and expanding the substring to see if its palindrome
	        for(int i=0;i<s.length();i++){
	            
	            int j=i, k=i;
	            String temp="";
	            while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
	                j--;
	                k++;
	            }
	           // if(s.charAt(j+1)!=s.charAt(k-1))continue;
	        
	            temp=s.substring(j+1, k);
	        
	            if(temp.length()>res.length())
	                res=temp;
	        }
	        
	        //keeping 2 characters in the center and expanding to see if its a palindrome
	        for(int i=0;i<s.length();i++){
	            
	            int j=i, k=i+1;
	            String temp="";
	            while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
	                j--;
	                k++;
	            }
	           // if(s.charAt(j+1)!=s.charAt(k-1))continue;
	        
	            temp=s.substring(j+1, k);
	        
	            if(temp.length()>res.length())
	                res=temp;
	        }
	        
	        return res;
	        
	    }
}
