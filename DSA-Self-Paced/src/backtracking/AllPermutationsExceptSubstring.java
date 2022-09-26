package backtracking;

//generate all permutations of strng that dont have "AB"
public class AllPermutationsExceptSubstring {
	
	//safety function to check before making any recursion call
	boolean isSafe(String str, int l, int i, int r) {
		if(l!=0 && str.charAt(l-1)=='A' && str.charAt(i)=='B')
			return false;
		if(r==(l+1) && str.charAt(i)=='A' && str.charAt(l)=='B')
            return false;
        return true;
	}
	
	
	//code same as generating all permutations
	void permute(String str, int left, int right) {
		if(left==right)
		{
			System.out.println(str);
			return;
		}
		
		for(int i=left;i<=right;i++) {
			//just add one condition before making the recursive calls to check if its safe to make a call
			if(isSafe(str, left, i, right)) {
				
			 str=new String(swap(str, i, left));
             
             permute(str,left+1,right);
             
             str=new String(swap(str, i, left));
			}
		}
	}
	
	char[] swap(String str,int i, int j) {
		//swap the characters of the string
		char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return ch; 
	}

}
