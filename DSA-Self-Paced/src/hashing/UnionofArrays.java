package hashing;

import java.util.HashSet;
import java.util.Set;

//Count of unique elements
public class UnionofArrays {
	
	static public int unionArray(int a[],int b[]) {
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		for(int i=0;i<b.length;i++)
			set.add(b[i]);
		return set.size();
	}

}
