package greedy;
import java.util.*;

//You are given a string s of lower case english alphabets. You can choose any two characters in the string and 
//replace all the occurences of the first character with the second character and replace all the occurences of 
//the second character with the first character. Your aim is to find the lexicographically smallest string that 
//can be obtained by doing this operation at most once.

//A = "ccad"
//Output: "aacd"
public class ChooseAndSwap {

	 String chooseandswap(String s){
	        // Code Here
	        Queue<Character> q= new PriorityQueue<>();
	        for(int i=0;i<s.length();i++){
	            if(!q.contains(s.charAt(i))) //to ensure that we have no duplicates
	                q.add(s.charAt(i));
	        }
	        
	        for(int i=0;i<s.length();i++){
	            char ch= s.charAt(i); //get every character of the string
	            q.remove(ch); //remove it from heap because in the next iteration, if it is at peek, we keep getting same character 
	            //this we do not want. when peek() and ch matches, we want to consider the lexicographically next character for next itertion
	          
	            if(!q.isEmpty() && Character.compare(ch, q.peek())>0){ //if ch > q.peek()
	            //i.e. if ch=='c' and q.peek()=='a'; c > a
	                s=s.replace(ch, '*'); //make note of all places of 'c'
	                s=s.replace(q.peek(), ch); //replace 'a' with 'c'
	                s=s.replace('*', q.peek()); // replace 'c' with 'a'
	                break;
	            }
	        }
	        
	        return s;
	        
	    }
}
