package MathematicsProb;

public class ModInverse {
	public static void main(String[] args) {
		System.out.println(modInverse(6, 34));
	}
	  static public int modInverse(int a, int m)
	    {
	      //Your code here
		  for(int i=1;i<m;i++) {
			  if((a*i)%m==1)
				  return i;
		  }
		  return -1;
	    }

}
