package backtracking;

public class AllPermutations {

	void permute(String str, int left, int right) {
		if(left==right)
		{
			System.out.println(str);
			return;
		}
		
		for(int i=left;i<=right;i++) {
			 str=new String(swap(str, i, left));
             
             permute(str,left+1,right);
             
             str=new String(swap(str, i, left));
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
