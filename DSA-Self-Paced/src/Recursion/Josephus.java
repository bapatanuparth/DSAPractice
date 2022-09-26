package Recursion;

import java.util.ArrayList;

//proud of myself for solving this !!
public class Josephus {
	public static void main(String[] args) {
	ArrayList<Integer> alist=new ArrayList<Integer>();
	int n=8;
	for(int i=0;i<n;i++)
	{
		alist.add(i);
	}
		//boolean bool[]=new boolean[7];
	alist=josephus(n,n,2,0,alist,0);
	System.out.println(alist.get(0));
	}
	
	static ArrayList<Integer> josephus(int con,int n, int k, int start, ArrayList<Integer>bool, int count) {
		if(count==(con-1))
			return bool;
		if(start>=n)
			start=start-n;
		int temp=start+(k-1);
		if(temp>=n)
			temp=temp-n;
		start=temp;
		bool.remove(temp);
		System.out.println(bool);
		return josephus(con,bool.size(),k,start,bool,count+1);

	}
}
