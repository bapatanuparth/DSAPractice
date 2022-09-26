package hashing;

import java.util.ArrayList;

public class OpenAddressing {
	public static int size;
	public static ArrayList<Integer>alist;
	public OpenAddressing() {
		// TODO Auto-generated constructor stub
	}
	OpenAddressing(int s){
		size=s;
		alist=new ArrayList<>(7);
		for(int i=0;i<size;i++) {
			alist.add(-1);
		}
	}
	
	 void insert(int n) {
		int mod=n%7;
		for(int i=0;i<alist.size();i++) {
			if(alist.get(mod)==-1)
				{
				alist.set(mod, n);
				break;
				}
			else
				{
				mod++;
				mod=mod%7;
				}
		}
	}
	 
	 boolean search(int n) {
		 int mod=n%7;
		 
		 int i=mod;
		 while(alist.get(i)!=-1) {
			 if(alist.get(i)==n)
				 return true;
			 i=(i+1)%7;
			 if(i==mod)
				 return false;
		 }
		 return false;
	 }
	 
	 void erase(int n) {
		 for(int i=0;i<alist.size();i++) {
			 if(alist.get(i)==n)
				 alist.set(i, -2);	 
		 }
		 System.out.println(alist);
	 }
	
	public static void main(String[] args) {
		OpenAddressing o=new OpenAddressing(7);
		o.insert(49);
		o.insert(56);
		o.insert(72);
		o.erase(56);
	}
}
