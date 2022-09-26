package RecursionProb;

public class LuckyNumbers {
	public static void main(String[] args) {
		System.out.println(isLucky(19,2));
	}
	
	static boolean isLucky(int pos,int count) {
		if(pos<count)
			return true;
		if(pos % count==0)
			return false;
		pos=pos-pos/count;
		return isLucky(pos,count+1);
	}
}
