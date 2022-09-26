package RecursionProb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PowerSet {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		System.out.println(set("ABC","",list,0));
	}
	
	static ArrayList<String> set(String str,String curr, ArrayList<String> list, int n){
		if(n==str.length())
			{
			list.add(curr);
			return list;
			}
		
		list=set(str,curr,list,n+1);
		list=set(str,curr+str.charAt(n),list,n+1);
		Collections.sort(list);
		return list;
	}

}
